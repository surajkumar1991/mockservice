package com.vuclip.ubs.interceptor;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import com.vuclip.ubs.models.ecentric.EcentricMessageHeader;
import org.springframework.stereotype.Component;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.vuclip.ubs.models.ecentric.MessageHeader;

@Component
public class MessageHeaderInterceptor implements EndpointInterceptor {
	
	@Override
	public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {
		return true;
	}



	@Override
	public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {
		
		SaajSoapMessage soapResponse = (SaajSoapMessage) messageContext.getResponse();
       // DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(strMsg);
        Document doc = soapResponse.getDocument();
        // Look for the SOAP header
        Element headerElement = null;
        NodeList nodes = doc.getElementsByTagNameNS("http://schemas.xmlsoap.org/soap/envelope/", "Header");
        if (nodes.getLength() == 0) {
            System.out.println("Adding a SOAP Header Element");
            headerElement = doc.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "Header");
            nodes = doc.getElementsByTagNameNS("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
            if (nodes != null) {
                Element envelopeElement = (Element) nodes.item(0);
                headerElement.setPrefix(envelopeElement.getPrefix());
                envelopeElement.appendChild(headerElement);
            }
        } else {
            System.out.println("Found " + nodes.getLength() + " SOAP Header elements.");
            headerElement = (Element) nodes.item(0);
            Element e = doc.createElementNS("http://schemas.xmlsoap.org/soap/envelope/", "MessageHeader");
            e.setNodeValue("My Message");
            headerElement.appendChild(e);
        }

		javax.xml.namespace.QName name = new javax.xml.namespace.QName( "Message1", "s");
		((SaajSoapMessage) messageContext.getResponse()).getSoapHeader().addHeaderElement(name).setText("value");;

		return true;
	}



	@Override
	public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
	
	private EcentricMessageHeader setMessageDateTime() {
		EcentricMessageHeader messageHeader = new EcentricMessageHeader();
		String pattern = "yyyy-MM-dd'T'HH:mm:ss:SSS";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		messageHeader.setMessageDateTime(simpleDateFormat.format(new Date()));
		messageHeader.setMessageID("1905600A-4E63-476C-90AD-1F717B454F5E");
		messageHeader.setChannel("true");
		return messageHeader;
	}

}
