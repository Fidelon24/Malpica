package Controlador;

import Vista.Vista_Reporte;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Denzel Ovando
 */
public class Controlador_Reporte implements ActionListener{
 private final Vista_Reporte vista;

    public Controlador_Reporte(Vista_Reporte vista) {
        this.vista = vista; 
        this.vista.btnVolver.addActionListener(this);
        this.iniciarVista();  
    }
    
    private void iniciarVista(){ 
        this.vista.setVisible(true);
        this.vista.setExtendedState(MAXIMIZED_BOTH);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.vista.btnVolver==ae.getSource()){
            this.vista.dispose();
        }
    }
}