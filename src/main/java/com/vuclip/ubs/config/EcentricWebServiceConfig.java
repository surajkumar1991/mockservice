package com.vuclip.ubs.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import com.vuclip.ubs.interceptor.MessageHeaderInterceptor;


@EnableWs
@Configuration
public class EcentricWebServiceConfig extends WsConfigurerAdapter {

    @Value("${xsdlocation:classpath:ecentric.xsd}")
    private Resource rs;

    /**
     *
     * @param interceptors
     */
    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        interceptors.add(new MessageHeaderInterceptor());
    }

    /**
     *
     * @param context
     * @return
     */
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
        messageDispatcherServlet.setApplicationContext(context);
        messageDispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(messageDispatcherServlet, "/paymentgateway/v1");
    }


    /**
     * @return
     */
    @Bean
    public XsdSchema ecentricSchema() {
        return new SimpleXsdSchema(rs);
    }


    /**
     *
     * @param addCardSchema
     * @return
     */
    @Bean(name = "AddCardRequest")
    public DefaultWsdl11Definition defaultAddCardRequestDefinition(XsdSchema addCardSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("AddCardRequest");
        definition.setTargetNamespace("http://www.ecentricswitch.co.za/paymentgateway/v1");
        definition.setLocationUri("/paymentgateway/v1");
        definition.setSchema(addCardSchema);
        return definition;
    }

    /**
     *
     * @param secure3DLookupSchema
     * @return
     */
    @Bean(name = "Secure3DLookupRequest")
    public DefaultWsdl11Definition defaultSecure3dLookUpRequestDef(XsdSchema secure3DLookupSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("Secure3DLookupRequest");
        definition.setTargetNamespace("http://www.ecentricswitch.co.za/paymentgateway/v1");
        definition.setLocationUri("/paymentgateway/v1");
        definition.setSchema(secure3DLookupSchema);
        return definition;
    }


    /**
     *
     * @param authorizeSchema
     * @return
     */
    @Bean(name = "AuthorizeRequest")
    public DefaultWsdl11Definition defaulAuthorizeRequestDef(XsdSchema authorizeSchema)  {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("AuthorizeRequest");
        definition.setTargetNamespace("http://www.ecentricswitch.co.za/paymentgateway/v1");
        definition.setLocationUri("/paymentgateway/v1");
        definition.setSchema(authorizeSchema);
        return definition;
    }

    /**
     *
     * @param voidSchema
     * @return
     */
    @Bean(name = "VoidRequest")
    public DefaultWsdl11Definition defaulVoidRequestDef(XsdSchema voidSchema)  {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("VoidRequest");
        definition.setTargetNamespace("http://www.ecentricswitch.co.za/paymentgateway/v1");
        definition.setLocationUri("/paymentgateway/v1");
        definition.setSchema(voidSchema);
        return definition;
    }

    /**
     *
     * @param paymentSchema
     * @return
     */
    @Bean(name = "PaymentRequest")
    public DefaultWsdl11Definition defaulPaymentRequestDef(XsdSchema paymentSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("PaymentRequest");
        definition.setTargetNamespace("http://www.ecentricswitch.co.za/paymentgateway/v1");
        definition.setLocationUri("/paymentgateway/v1");
        definition.setSchema(paymentSchema);
        return definition;
    }

}
