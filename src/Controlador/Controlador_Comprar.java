package Controlador;

import Modelo.MD_CAMBIARPANEL;
import Vista.Panel_Compras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Denzel Sloth
 */

public class Controlador_Comprar implements ActionListener{
 private final Panel_Compras vista;

    public Controlador_Comprar(JPanel panel_principal) {
        
        vista = new Panel_Compras();
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