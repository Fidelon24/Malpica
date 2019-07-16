/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Formularios;

import Modelo.MD_CONTROLLER;
import Vista.Formularios.Vista_Formulario_Clientes;
import Vista.Formularios.Vista_Formulario_Sucursales;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class Controlador_Formulario_Clientes extends MD_CONTROLLER implements ActionListener{
    
    private final Vista_Formulario_Clientes vista;
    int idCliente;
    
    //Agregar
    public Controlador_Formulario_Clientes()
    {
     this.vista = new Vista_Formulario_Clientes(new Frame(), true);
     this.vista.btnEliminar.setVisible(false);
     this.iniciarVista();  
    }
    
    //Editar
    public Controlador_Formulario_Clientes(Vista_Formulario_Sucursales vista,int idCliente)
    {
        this.vista = new Vista_Formulario_Clientes(new Frame(), true);
        this.idCliente = idCliente;
         ResultSet resultado= this.ExecuteQuery("Query agarrar datos del cliente" +  idCliente);
         try {
                if(resultado.next() == true)
                {
                   /* this.vista.txtCliente.setText(resultado.getString(1));
                    this.vista.txtCliente.setText(resultado.getString(1));
                    this.vista.txtCliente.setText(resultado.getString(1));*/
                }
            } catch (SQLException ex) {
                System.err.println(ex);
            }
    }
    
    private void iniciarVista(){ 
        this.vista.btnCancelar.addActionListener(this);
        this.vista.setLocationRelativeTo(null);   
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.vista.btnCancelar==ae.getSource()){
            this.vista.dispose();
        }
    }
}
