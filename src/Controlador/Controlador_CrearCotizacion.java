package Controlador;

import Modelo.MD_CAMBIARPANEL;
import Vista.Panel_CrearCotizacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Denzel Sloth
 */

public class Controlador_CrearCotizacion implements ActionListener{
 private final Panel_CrearCotizacion vista;

    public Controlador_CrearCotizacion(JPanel panel_principal) {
        vista = new Panel_CrearCotizacion();
        new MD_CAMBIARPANEL(panel_principal, vista);
        
        this.iniciarVista();  
    }
    
    
    private void iniciarVista(){       
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.vista.btnCancelar==ae.getSource()){
            this.vista.setVisible(false);
        }
    }
}