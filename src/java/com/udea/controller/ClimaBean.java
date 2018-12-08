/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.service.Clima;
import com.udea.service.ClimaWS_Service;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author FABIAN
 */
public class ClimaBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8083/ClimaWSHibernate/ClimaWS.wsdl")
    private ClimaWS_Service service;
    private int codigo;
    private String ciudad;
    private String clima;
    private int centigrados;
    private int fahrenheit;
    private int nubosidad;
    private int porcentaje_humedad;
    private int prob_precipitacion;
    private String prediccion;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getCentigrados() {
        return centigrados;
    }

    public void setCentigrados(int centigrados) {
        this.centigrados = centigrados;
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public int getNubosidad() {
        return nubosidad;
    }

    public void setNubosidad(int nubosidad) {
        this.nubosidad = nubosidad;
    }

    public int getPorcentaje_humedad() {
        return porcentaje_humedad;
    }

    public void setPorcentaje_humedad(int porcentaje_humedad) {
        this.porcentaje_humedad = porcentaje_humedad;
    }

    public int getProb_precipitacion() {
        return prob_precipitacion;
    }

    public void setProb_precipitacion(int prob_precipitacion) {
        this.prob_precipitacion = prob_precipitacion;
    }

    public String getPrediccion() {
        return prediccion;
    }

    public void setPrediccion(String prediccion) {
        this.prediccion = prediccion;
    }
    
    private String buscarRegistro(int codigo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.udea.service.ClimaWS port = service.getClimaWSPort();
        return port.buscarRegistro(codigo);
    }
     
    private java.util.List<com.udea.service.Clima> consultarRegistro() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.udea.service.ClimaWS port = service.getClimaWSPort();
        return port.consultarRegistro();
    }

    private String ingresarRegistro(java.lang.String ciudad, java.lang.String clima, int centigrados, int fahrenheit, int nubosidad, int porcentajeHumedad, int probPrecipitacion, java.lang.String prediccion) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.udea.service.ClimaWS port = service.getClimaWSPort();
        return port.ingresarRegistro(ciudad, clima, centigrados, fahrenheit, nubosidad, porcentajeHumedad, probPrecipitacion, prediccion);
    }
    public String guardarRegistro(){
        String msj = ingresarRegistro(ciudad, clima,centigrados, fahrenheit, nubosidad, porcentaje_humedad, prob_precipitacion, prediccion);
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, msj, "....");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        limpiarForm();
        return "result";
    }
    public String buscarRegistro(){
        String msj = buscarRegistro(codigo);
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,msj,"....");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        limpiarForm();
        return "index";
    }
    
    
    public List<Clima> getListRegistro(){
        List <Clima> lista = consultarRegistro();
        return lista;
    }
    public void limpiarForm(){
        this.codigo=0;
        this.ciudad="";
        this.clima="";
        this.centigrados=0;
        this.fahrenheit=0;
        this.nubosidad=0;
        this.porcentaje_humedad=0;
        this.prob_precipitacion=0;
        this.prediccion="";
    }
    public ClimaBean() {
    }

    private String buscarCiudad(java.lang.String ciudad) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.udea.service.ClimaWS port = service.getClimaWSPort();
        return port.buscarCiudad(ciudad);
    }

    public String buscarCiudad(){
        String msj = buscarCiudad(ciudad);
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,msj,"....");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        limpiarForm();
        return "index";
    }
    public String registros(){
        return "result";
    }
    
}
