
package com.udea.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.udea.service package. 
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

    private final static QName _BuscarCiudad_QNAME = new QName("http://service.udea.com/", "buscarCiudad");
    private final static QName _BuscarCiudadResponse_QNAME = new QName("http://service.udea.com/", "buscarCiudadResponse");
    private final static QName _BuscarRegistro_QNAME = new QName("http://service.udea.com/", "buscarRegistro");
    private final static QName _BuscarRegistroResponse_QNAME = new QName("http://service.udea.com/", "buscarRegistroResponse");
    private final static QName _ConsultarRegistro_QNAME = new QName("http://service.udea.com/", "consultarRegistro");
    private final static QName _ConsultarRegistroResponse_QNAME = new QName("http://service.udea.com/", "consultarRegistroResponse");
    private final static QName _IngresarRegistro_QNAME = new QName("http://service.udea.com/", "ingresarRegistro");
    private final static QName _IngresarRegistroResponse_QNAME = new QName("http://service.udea.com/", "ingresarRegistroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.udea.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarCiudad }
     * 
     */
    public BuscarCiudad createBuscarCiudad() {
        return new BuscarCiudad();
    }

    /**
     * Create an instance of {@link BuscarCiudadResponse }
     * 
     */
    public BuscarCiudadResponse createBuscarCiudadResponse() {
        return new BuscarCiudadResponse();
    }

    /**
     * Create an instance of {@link BuscarRegistro }
     * 
     */
    public BuscarRegistro createBuscarRegistro() {
        return new BuscarRegistro();
    }

    /**
     * Create an instance of {@link BuscarRegistroResponse }
     * 
     */
    public BuscarRegistroResponse createBuscarRegistroResponse() {
        return new BuscarRegistroResponse();
    }

    /**
     * Create an instance of {@link ConsultarRegistro }
     * 
     */
    public ConsultarRegistro createConsultarRegistro() {
        return new ConsultarRegistro();
    }

    /**
     * Create an instance of {@link ConsultarRegistroResponse }
     * 
     */
    public ConsultarRegistroResponse createConsultarRegistroResponse() {
        return new ConsultarRegistroResponse();
    }

    /**
     * Create an instance of {@link IngresarRegistro }
     * 
     */
    public IngresarRegistro createIngresarRegistro() {
        return new IngresarRegistro();
    }

    /**
     * Create an instance of {@link IngresarRegistroResponse }
     * 
     */
    public IngresarRegistroResponse createIngresarRegistroResponse() {
        return new IngresarRegistroResponse();
    }

    /**
     * Create an instance of {@link Clima }
     * 
     */
    public Clima createClima() {
        return new Clima();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCiudad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "buscarCiudad")
    public JAXBElement<BuscarCiudad> createBuscarCiudad(BuscarCiudad value) {
        return new JAXBElement<BuscarCiudad>(_BuscarCiudad_QNAME, BuscarCiudad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCiudadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "buscarCiudadResponse")
    public JAXBElement<BuscarCiudadResponse> createBuscarCiudadResponse(BuscarCiudadResponse value) {
        return new JAXBElement<BuscarCiudadResponse>(_BuscarCiudadResponse_QNAME, BuscarCiudadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "buscarRegistro")
    public JAXBElement<BuscarRegistro> createBuscarRegistro(BuscarRegistro value) {
        return new JAXBElement<BuscarRegistro>(_BuscarRegistro_QNAME, BuscarRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarRegistroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "buscarRegistroResponse")
    public JAXBElement<BuscarRegistroResponse> createBuscarRegistroResponse(BuscarRegistroResponse value) {
        return new JAXBElement<BuscarRegistroResponse>(_BuscarRegistroResponse_QNAME, BuscarRegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "consultarRegistro")
    public JAXBElement<ConsultarRegistro> createConsultarRegistro(ConsultarRegistro value) {
        return new JAXBElement<ConsultarRegistro>(_ConsultarRegistro_QNAME, ConsultarRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarRegistroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "consultarRegistroResponse")
    public JAXBElement<ConsultarRegistroResponse> createConsultarRegistroResponse(ConsultarRegistroResponse value) {
        return new JAXBElement<ConsultarRegistroResponse>(_ConsultarRegistroResponse_QNAME, ConsultarRegistroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarRegistro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "ingresarRegistro")
    public JAXBElement<IngresarRegistro> createIngresarRegistro(IngresarRegistro value) {
        return new JAXBElement<IngresarRegistro>(_IngresarRegistro_QNAME, IngresarRegistro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarRegistroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "ingresarRegistroResponse")
    public JAXBElement<IngresarRegistroResponse> createIngresarRegistroResponse(IngresarRegistroResponse value) {
        return new JAXBElement<IngresarRegistroResponse>(_IngresarRegistroResponse_QNAME, IngresarRegistroResponse.class, null, value);
    }

}
