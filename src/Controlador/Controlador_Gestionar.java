/*package Controlador;

import Vista.Vista_Catalogo;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controlador_Gestionar implements ActionListener{
 private final Vista_Catalogo vista;

    public Controlador_Gestionar(Vista_Catalogo vista) {
        this.vista = vista; 
        this.vista.btnVolver.addActionListener(this);
        this.iniciarVista();  
    }
    
    private void iniciarVista(){ 
        //Cambia los botones de el panel de abajo
        JButton btnHabilitar = this.vista.btnAgregar;
        JButton btnDeshabilitar = this.vista.btnEliminar;
        this.vista.btnAgregar.setVisible(false);
        this.vista.btnEliminar.setVisible(false);
        this.vista.btnEditar.setVisible(false);
        this.vista.btnReporte.setVisible(false);
        btnHabilitar.setText("Habilitar");
        btnDeshabilitar.setText("Deshabilitar");
        //Activa los vonotes creados
        btnHabilitar.setVisible(true);
        btnDeshabilitar.setVisible(true);
        btnHabilitar.addActionListener(this);
        btnDeshabilitar.addActionListener(this);
        this.vista.setVisible(true);
        this.vista.setExtendedState(MAXIMIZED_BOTH);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.vista.btnVolver==ae.getSource()){
            this.vista.dispose();
        }
    }
}*/