
package com.mycompany.pizzaws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "pizzaWSImplService", targetNamespace = "http://pizzaws.mycompany.com/", wsdlLocation = "http://localhost:8080/pizza?wsdl")
public class PizzaWSImplService
    extends Service
{

    private final static URL PIZZAWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException PIZZAWSIMPLSERVICE_EXCEPTION;
    private final static QName PIZZAWSIMPLSERVICE_QNAME = new QName("http://pizzaws.mycompany.com/", "pizzaWSImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/pizza?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PIZZAWSIMPLSERVICE_WSDL_LOCATION = url;
        PIZZAWSIMPLSERVICE_EXCEPTION = e;
    }

    public PizzaWSImplService() {
        super(__getWsdlLocation(), PIZZAWSIMPLSERVICE_QNAME);
    }

    public PizzaWSImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PIZZAWSIMPLSERVICE_QNAME, features);
    }

    public PizzaWSImplService(URL wsdlLocation) {
        super(wsdlLocation, PIZZAWSIMPLSERVICE_QNAME);
    }

    public PizzaWSImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PIZZAWSIMPLSERVICE_QNAME, features);
    }

    public PizzaWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PizzaWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PizzaWSInterface
     */
    @WebEndpoint(name = "pizzaWSImplPort")
    public PizzaWSInterface getPizzaWSImplPort() {
        return super.getPort(new QName("http://pizzaws.mycompany.com/", "pizzaWSImplPort"), PizzaWSInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PizzaWSInterface
     */
    @WebEndpoint(name = "pizzaWSImplPort")
    public PizzaWSInterface getPizzaWSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://pizzaws.mycompany.com/", "pizzaWSImplPort"), PizzaWSInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PIZZAWSIMPLSERVICE_EXCEPTION!= null) {
            throw PIZZAWSIMPLSERVICE_EXCEPTION;
        }
        return PIZZAWSIMPLSERVICE_WSDL_LOCATION;
    }

}