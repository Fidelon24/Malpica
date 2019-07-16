package Controlador;

import Modelo.MD_CONTROLLER;
import Vista.Vista_Login;
import Vista.Vista_Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controlador_Login extends MD_CONTROLLER implements ActionListener{
    private final Vista_Login vista;

    public Controlador_Login(Vista_Login vista)  {
        this.vista = vista; 
        this.vista.btnIniciarSesion.addActionListener(this);
        this.vista.btnConfig.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
        this.iniciarVista();  
    }
    
    private void iniciarVista(){ 
        this.vista.setLocationRelativeTo(null);   
        this.vista.getRootPane().setDefaultButton(this.vista.btnIniciarSesion);
        this.vista.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(this.vista.btnIniciarSesion==ae.getSource()){    
            ResultSet resultado= this.ExecuteQuery("SELECT idEmpleado, tipoUsuario FROM usuarios WHERE usuarios.usuario = '"+ this.vista.txtNombreUsuario.getText()+"' AND usuarios.contrasena = '"+new String(this.vista.txtContraseña.getPassword())+"';" );
            try {
                if(resultado.next() == true)
                {
                    if(resultado.getInt(2) == 0){
                        Vista_Menu Vista_Principal = new Vista_Menu();
                        Controlador_Menu menuPrincipal = new Controlador_Menu(Vista_Principal);
                        this.vista.dispose();
                    }
                    else
                    {
                        new Controlador_Mensaje("Usuario Invalido", "No tienes permisos para ingresar al sistema.");  
                    }
                    
                }
                else
                    new Controlador_Mensaje("Datos Incorrectos", "Contraseña Incorrecta. Vuelve a intentarlo.");                   
        
            } catch (SQLException ex) {
                Logger.getLogger(Controlador_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(this.vista.btnConfig==ae.getSource()){
            new Controlador_Mensaje("Error", "Sistema Incompleto"); 
        }
        
        if(this.vista.btnSalir==ae.getSource()){
            System.exit(0);
        }
    }
    
}
