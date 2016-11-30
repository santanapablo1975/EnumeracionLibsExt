/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeracion;

/**
 *
 * @author Pc12
 */
public enum NewEnum {
    
    Rojo("Peligro Alto", "Evacuar"),
    Naranja("Peligro Medio", "Esconder"),
    Verde("Peligro Bajo", "Dormir");
    
    private final String descripcion;
    private final String recomendacion;

    private NewEnum(String descripcion, String recomendacion) {
        this.descripcion = descripcion;
        this.recomendacion = recomendacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the recomendacion
     */
    public String getRecomendacion() {
        return recomendacion;
    }

    
    
    
    
    
}
