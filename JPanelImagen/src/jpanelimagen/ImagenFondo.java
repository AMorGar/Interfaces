/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Alex
 */
public class ImagenFondo implements Serializable
{
    private File rutaImagen;
    private Float poacidad;

    public ImagenFondo(File rutaImagen, Float poacidad) {
        this.rutaImagen = rutaImagen;
        this.poacidad = poacidad;
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public Float getPoacidad() {
        return poacidad;
    }

    public void setPoacidad(Float poacidad) {
        this.poacidad = poacidad;
    }
    
    
}
