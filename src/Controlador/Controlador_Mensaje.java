package Controlador;

import Vista.Vista_Mensaje;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Controlador_Mensaje implements ActionListener{
     private final Vista_Mensaje vista = new Vista_Mensaje(new JFrame(),true);
     private JButton [] botones = new JButton[5];
     private int lenght; 
     private int selection;
    
    public Controlador_Mensaje(String titulo, String mensaje, String[] opciones) {
        this.vista.lblTitulo.setText(titulo);
        this.vista.lblMensaje.setText(mensaje);
        this.lenght = opciones.length;
        
        java.awt.Toolkit.getDefaultToolkit().beep();
        for (int i = 0; i < this.lenght ; i++){
            
            botones[i]=new JButton(opciones[i]);
            botones[i].setBackground(new java.awt.Color(204, 204, 204));
            botones[i].setFont(new java.awt.Font("Segoe UI Semilight", 0, 18));
            botones[i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            botones[i].setFocusPainted(false);
            this.vista.PanelBotones.add(botones[i]); 
            botones[i].addActionListener(this);       
        }    
        this.vista.getRootPane().setDefaultButton(this.botones[0]);
        this.vista.setLocationRelativeTo(null);  
        this.vista.setVisible(true);
        
    }
    
    public Controlador_Mensaje(String titulo, String mensaje) {
        this.vista.lblTitulo.setText(titulo);
        this.vista.lblMensaje.setText(mensaje);
        this.lenght = 1;
        String[] opciones = {"Aceptar"};
      
        java.awt.Toolkit.getDefaultToolkit().beep();
        for (int i = 0; i < this.lenght ; i++){
            
            botones[i]=new JButton(opciones[i]);
            botones[i].setBackground(new java.awt.Color(204, 204, 204));
            botones[i].setFont(new java.awt.Font("Segoe UI Semilight", 0, 18));
            botones[i].setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
            botones[i].setFocusPainted(false);
            this.vista.PanelBotones.add(botones[i]); 
            botones[i].addActionListener(this);       
        }    
        this.vista.getRootPane().setDefaultButton(this.botones[0]);
        this.vista.setLocationRelativeTo(null);  
        this.vista.setVisible(true);
        
    }

    public int getSeleccion() {
        return selection;
    }

   
    @Override
    public void actionPerformed(ActionEvent ae) {      
        for(int i=0; i < this.lenght ; i++){
            if(ae.getSource() == botones[i]){
                this.selection = i;
                this.vista.dispose();
            }        
        }
    }
}

