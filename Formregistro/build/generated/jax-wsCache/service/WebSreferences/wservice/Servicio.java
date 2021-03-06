
package wservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Servicio", targetNamespace = "http://WService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicio {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://WService/", className = "wservice.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://WService/", className = "wservice.HelloResponse")
    @Action(input = "http://WService/Servicio/helloRequest", output = "http://WService/Servicio/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
