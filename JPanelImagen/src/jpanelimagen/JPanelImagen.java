/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.io.File;
import java.io.Serializable;
import javax.swing.JPanel;

/**
 * @author Alex
 */
public class JPanelImagen extends JPanel  implements Serializable
{
    private File rutaImagen;
    
    public JPanelImagen()
    {
        
    }

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}
