/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import javax.swing.border.Border;
/**
 *
 * @author pastor
 */
public class MD_IMAGEN implements Border {    
    private BufferedImage mImagen = null;

    public MD_IMAGEN(BufferedImage pImagen) {
        mImagen = pImagen;       
    }
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if (mImagen != null) {
            g.drawImage(mImagen, 0, 0, width, height, null);
        }
    }
    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }
    @Override
    public boolean isBorderOpaque() {
        return true;
    }

    


}

