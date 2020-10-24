
package com.softeng.server;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServerMethodsService", targetNamespace = "http://server.softeng.com/", wsdlLocation = "http://localhost:8080/serverMethodsInterface/?wsdl")
public class ServerMethodsService
    extends Service
{

    private final static URL SERVERMETHODSSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVERMETHODSSERVICE_EXCEPTION;
    private final static QName SERVERMETHODSSERVICE_QNAME = new QName("http://server.softeng.com/", "ServerMethodsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/serverMethodsInterface/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVERMETHODSSERVICE_WSDL_LOCATION = url;
        SERVERMETHODSSERVICE_EXCEPTION = e;
    }

    public ServerMethodsService() {
        super(__getWsdlLocation(), SERVERMETHODSSERVICE_QNAME);
    }

    public ServerMethodsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVERMETHODSSERVICE_QNAME, features);
    }

    public ServerMethodsService(URL wsdlLocation) {
        super(wsdlLocation, SERVERMETHODSSERVICE_QNAME);
    }

    public ServerMethodsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVERMETHODSSERVICE_QNAME, features);
    }

    public ServerMethodsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServerMethodsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServerMethodsInterface
     */
    @WebEndpoint(name = "ServerMethodsPort")
    public ServerMethodsInterface getServerMethodsPort() {
        return super.getPort(new QName("http://server.softeng.com/", "ServerMethodsPort"), ServerMethodsInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServerMethodsInterface
     */
    @WebEndpoint(name = "ServerMethodsPort")
    public ServerMethodsInterface getServerMethodsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.softeng.com/", "ServerMethodsPort"), ServerMethodsInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVERMETHODSSERVICE_EXCEPTION!= null) {
            throw SERVERMETHODSSERVICE_EXCEPTION;
        }
        return SERVERMETHODSSERVICE_WSDL_LOCATION;
    }

}