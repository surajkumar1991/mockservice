package com.vuclip.ubs.interceptor;


import com.vuclip.ubs.models.ecentric.EcentricMessageHeader;
import org.springframework.stereotype.Component;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MessageHeaderInterceptor implements EndpointInterceptor {

    private static final String MESSAGE_ID = "AAD48E33-2403-491C-ADD8-DB1725B0AD18";

    @Override
    public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {
        return true;
    }


    @Override
    public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {

        SaajSoapMessage soapResponse = (SaajSoapMessage) messageContext.getResponse();
        Document doc = soapResponse.getDocument();
        Element headerElement = null;
        NodeList nodes = doc.getElementsByTagNameNS("http://schemas.xmlsoap.org/soap/envelope/", "Header");
        headerElement = (Element) nodes.item(0);
        Element messageHeader = doc.createElementNS("http://www.ecentricswitch.co.za/paymentgateway/v1", "MessageHeader");
        headerElement.appendChild(messageHeader);
        setMessageHeaders(doc, messageHeader);
        return true;
    }


    @Override
    public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
        return true;
    }


    @Override
    public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {

    }


    private void setMessageHeaders(Document doc, Element messageHeader) {
        Element messageDateTime = doc.createElement("MessageDateTime");
        Element messageId = doc.createElement("MessageID");
        Element channel = doc.createElement("Channel");
        messageHeader.appendChild(messageDateTime);
        messageHeader.appendChild(messageId);
        messageHeader.appendChild(channel);
        Text msgDateTimeValue = doc.createTextNode(setMessageDateTime().getMessageDateTime());
        Text msgIdValue = doc.createTextNode(MESSAGE_ID);
        Text channelValue = doc.createTextNode("true");
        messageDateTime.appendChild(msgDateTimeValue);
        messageId.appendChild(msgIdValue);
        channel.appendChild(channelValue);

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
