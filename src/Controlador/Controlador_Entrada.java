package Controlador;

import Vista.Vista_Entrada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Denzel Sloth
 */


public class Controlador_Entrada implements ActionListener{
     private final Vista_Entrada vista = new Vista_Entrada(new JFrame(),true);
     private double entrada;
    
    public Controlador_Entrada(String titulo, String mensaje) {
        this.vista.lblTitulo.setText(titulo);
        this.vista.lblMensaje.setText(mensaje);

        this.vista.btnAceptar.addActionListener(this);
        
        this.vista.getRootPane().setDefaultButton(this.vista.btnAceptar);
        this.vista.setLocationRelativeTo(null);  
        this.vista.setVisible(true);
        

    }

    public double getEntrada(){
        return entrada;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(this.vista.btnAceptar ==ae.getSource()){
           this.entrada = Double.parseDouble(this.vista.txtEntrada.getText());
           this.vista.dispose();
        }
    }
}
