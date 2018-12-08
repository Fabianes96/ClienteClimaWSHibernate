
package com.udea.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clima complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clima"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="centigrados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clima" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fahrenheit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nubosidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="porcentajeHumedad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prediccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="probPrecipitacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clima", propOrder = {
    "centigrados",
    "ciudad",
    "clima",
    "codigo",
    "fahrenheit",
    "nubosidad",
    "porcentajeHumedad",
    "prediccion",
    "probPrecipitacion"
})
public class Clima {

    protected int centigrados;
    protected String ciudad;
    protected String clima;
    protected Integer codigo;
    protected int fahrenheit;
    protected int nubosidad;
    protected int porcentajeHumedad;
    protected String prediccion;
    protected int probPrecipitacion;

    /**
     * Obtiene el valor de la propiedad centigrados.
     * 
     */
    public int getCentigrados() {
        return centigrados;
    }

    /**
     * Define el valor de la propiedad centigrados.
     * 
     */
    public void setCentigrados(int value) {
        this.centigrados = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad clima.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClima() {
        return clima;
    }

    /**
     * Define el valor de la propiedad clima.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClima(String value) {
        this.clima = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigo(Integer value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad fahrenheit.
     * 
     */
    public int getFahrenheit() {
        return fahrenheit;
    }

    /**
     * Define el valor de la propiedad fahrenheit.
     * 
     */
    public void setFahrenheit(int value) {
        this.fahrenheit = value;
    }

    /**
     * Obtiene el valor de la propiedad nubosidad.
     * 
     */
    public int getNubosidad() {
        return nubosidad;
    }

    /**
     * Define el valor de la propiedad nubosidad.
     * 
     */
    public void setNubosidad(int value) {
        this.nubosidad = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeHumedad.
     * 
     */
    public int getPorcentajeHumedad() {
        return porcentajeHumedad;
    }

    /**
     * Define el valor de la propiedad porcentajeHumedad.
     * 
     */
    public void setPorcentajeHumedad(int value) {
        this.porcentajeHumedad = value;
    }

    /**
     * Obtiene el valor de la propiedad prediccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrediccion() {
        return prediccion;
    }

    /**
     * Define el valor de la propiedad prediccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrediccion(String value) {
        this.prediccion = value;
    }

    /**
     * Obtiene el valor de la propiedad probPrecipitacion.
     * 
     */
    public int getProbPrecipitacion() {
        return probPrecipitacion;
    }

    /**
     * Define el valor de la propiedad probPrecipitacion.
     * 
     */
    public void setProbPrecipitacion(int value) {
        this.probPrecipitacion = value;
    }

}
