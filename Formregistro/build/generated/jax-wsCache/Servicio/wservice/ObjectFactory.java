
package wservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://WService/", "helloResponse");
    private final static QName _Verificacion_QNAME = new QName("http://WService/", "verificacion");
    private final static QName _VerificacionResponse_QNAME = new QName("http://WService/", "verificacionResponse");
    private final static QName _LimpiarResponse_QNAME = new QName("http://WService/", "limpiarResponse");
    private final static QName _ReturnlistaResponse_QNAME = new QName("http://WService/", "returnlistaResponse");
    private final static QName _Hello_QNAME = new QName("http://WService/", "hello");
    private final static QName _Limpiar_QNAME = new QName("http://WService/", "limpiar");
    private final static QName _Returnlista_QNAME = new QName("http://WService/", "returnlista");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerificacionResponse }
     * 
     */
    public VerificacionResponse createVerificacionResponse() {
        return new VerificacionResponse();
    }

    /**
     * Create an instance of {@link Verificacion }
     * 
     */
    public Verificacion createVerificacion() {
        return new Verificacion();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Limpiar }
     * 
     */
    public Limpiar createLimpiar() {
        return new Limpiar();
    }

    /**
     * Create an instance of {@link Returnlista }
     * 
     */
    public Returnlista createReturnlista() {
        return new Returnlista();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link LimpiarResponse }
     * 
     */
    public LimpiarResponse createLimpiarResponse() {
        return new LimpiarResponse();
    }

    /**
     * Create an instance of {@link ReturnlistaResponse }
     * 
     */
    public ReturnlistaResponse createReturnlistaResponse() {
        return new ReturnlistaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Verificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "verificacion")
    public JAXBElement<Verificacion> createVerificacion(Verificacion value) {
        return new JAXBElement<Verificacion>(_Verificacion_QNAME, Verificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "verificacionResponse")
    public JAXBElement<VerificacionResponse> createVerificacionResponse(VerificacionResponse value) {
        return new JAXBElement<VerificacionResponse>(_VerificacionResponse_QNAME, VerificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LimpiarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "limpiarResponse")
    public JAXBElement<LimpiarResponse> createLimpiarResponse(LimpiarResponse value) {
        return new JAXBElement<LimpiarResponse>(_LimpiarResponse_QNAME, LimpiarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnlistaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "returnlistaResponse")
    public JAXBElement<ReturnlistaResponse> createReturnlistaResponse(ReturnlistaResponse value) {
        return new JAXBElement<ReturnlistaResponse>(_ReturnlistaResponse_QNAME, ReturnlistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Limpiar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "limpiar")
    public JAXBElement<Limpiar> createLimpiar(Limpiar value) {
        return new JAXBElement<Limpiar>(_Limpiar_QNAME, Limpiar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Returnlista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "returnlista")
    public JAXBElement<Returnlista> createReturnlista(Returnlista value) {
        return new JAXBElement<Returnlista>(_Returnlista_QNAME, Returnlista.class, null, value);
    }

}
