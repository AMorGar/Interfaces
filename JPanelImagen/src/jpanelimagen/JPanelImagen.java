/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * @author Alex
 */
public class JPanelImagen extends JPanel implements Serializable
{
    private ImagenFondo ImagenFondo;
    
    public JPanelImagen()
    {
        
    }

    public ImagenFondo getRutaImagen() {
        return ImagenFondo;
    }

    public void setRutaImagen(ImagenFondo rutaImagen) {
        this.ImagenFondo = rutaImagen;
    }
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(ImagenFondo.getRutaImagen()!=null && ImagenFondo.getRutaImagen().exists())
        {
        ImageIcon imageIcon = new ImageIcon(ImagenFondo.getRutaImagen().getAbsolutePath());     
        g.drawImage(imageIcon.getImage(),0,0,null);
        }
    }
}
