/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.datos;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author juliobitar
 */
public class Producto {
    public static final String TABLA ="productos";
    public static final String[] FIELDS = {"id"};
   
    private Integer clave;
    private String descripcion;
    private Float precio;
    private String clasificacion;
    private Integer cantidad;
    private Integer min;
    private Integer max;
    
    
    
    public String fieldsToString(){
    String fieldStr = "";
    List<String> fieldsToConvert = Arrays.asList(FIELDS);
    for (String field: fieldsToConvert){
        fieldStr = String.format("%s","%s",fieldStr,field);
    }
    return fieldStr;
    }

    /**
     * @return the clave
     */
    public Integer getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(Integer clave) {
        this.clave = clave;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * @return the clasificacion
     */
    public String getClasificacion() {
        return clasificacion;
    }

    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the min
     */
    public Integer getMin() {
        return min;
    }

    /**
     * @param min the min to set
     */
    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * @return the max
     */
    public Integer getMax() {
        return max;
    }

    /**
     * @param max the max to set
     */
    public void setMax(Integer max) {
        this.max = max;
    }
}
