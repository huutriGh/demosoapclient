
package com.example.soap.ws.client.generated;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "GreetingService", targetNamespace = "http://demo.example.com/", wsdlLocation = "http://localhost:8080/demo/ws/hello?wsdl")
public class GreetingService
    extends Service
{

    private final static URL GREETINGSERVICE_WSDL_LOCATION;
    private final static WebServiceException GREETINGSERVICE_EXCEPTION;
    private final static QName GREETINGSERVICE_QNAME = new QName("http://demo.example.com/", "GreetingService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/demo/ws/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GREETINGSERVICE_WSDL_LOCATION = url;
        GREETINGSERVICE_EXCEPTION = e;
    }

    public GreetingService() {
        super(__getWsdlLocation(), GREETINGSERVICE_QNAME);
    }

    public GreetingService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GREETINGSERVICE_QNAME, features);
    }

    public GreetingService(URL wsdlLocation) {
        super(wsdlLocation, GREETINGSERVICE_QNAME);
    }

    public GreetingService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GREETINGSERVICE_QNAME, features);
    }

    public GreetingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GreetingService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Greeting
     */
    @WebEndpoint(name = "GreetingPort")
    public Greeting getGreetingPort() {
        return super.getPort(new QName("http://demo.example.com/", "GreetingPort"), Greeting.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Greeting
     */
    @WebEndpoint(name = "GreetingPort")
    public Greeting getGreetingPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://demo.example.com/", "GreetingPort"), Greeting.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GREETINGSERVICE_EXCEPTION!= null) {
            throw GREETINGSERVICE_EXCEPTION;
        }
        return GREETINGSERVICE_WSDL_LOCATION;
    }

}