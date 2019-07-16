/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Formularios;

import Modelo.MD_CONTROLLER;
import Vista.Formularios.Vista_Formulario_Sucursales;
import Vista.Formularios.Vista_Formulario_Sucursales;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class Controlador_Formulario_Sucursales extends MD_CONTROLLER implements ActionListener {
    
    private final Vista_Formulario_Sucursales vista;
    int idSucursal;
    
     public Controlador_Formulario_Sucursales()
    {
     this.vista = new Vista_Formulario_Sucursales(new Frame(), true); 
     this.vista.btnEliminar.setVisible(false);
     this.iniciarVista();  
    }
     
     
      public Controlador_Formulario_Sucursales(int idSucursal)
    {
        this.vista =  new Vista_Formulario_Sucursales(new Frame(), true);
        this.idSucursal = idSucursal;
        //Aca agarras los datos para el editar
         ResultSet resultado= this.ExecuteQuery("Query agarrar datos del cliente" +  idSucursal);
         try {
                if(resultado.next() == true)
                {
                    /*this.vista.txtNombreSu = resultado.getString(1);
                    this.vista.txtNombreSu = resultado.getString(1);
                    this.vista.txtNombreSu = resultado.getString(1);
                    this.vista.txtNombreSu = resultado.getString(1);
                    this.vista.txtNombreSu = resultado.getString(1);*/
                    
                }
            } catch (SQLException ex) {
                System.err.println(ex);
            }


    }

     private void iniciarVista(){ 
        this.vista.btnCancelar.addActionListener(this);
        this.vista.setLocationRelativeTo(null);   
        this.LoadComboBox(this.vista.ComboxTipoSu, "SELECT  Nombre FROM tiposucursal WHERE estado = 1");
        this.vista.setVisible(true);
    } 

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.vista.btnCancelar==ae.getSource()){
            this.vista.dispose();
        }
    }
     
}
