/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Formularios;

import Modelo.MD_CONTROLLER;
import Vista.Formularios.Vista_Formulario_Producto;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author marco
 */
public class Controlador_Formulario_Productos extends MD_CONTROLLER implements ActionListener {
    
    private final Vista_Formulario_Producto vista;
    int idProducto;
    
    //Agregar
    public Controlador_Formulario_Productos()
    {
     this.vista = new Vista_Formulario_Producto(new Frame(), true);
     this.vista.btnEliminar.setVisible(false);
     this.iniciarVista();  
    }
    
    //Editar
    public Controlador_Formulario_Productos(int idProducto)
    {
        this.vista = new Vista_Formulario_Producto(new Frame(), true);
        this.idProducto = idProducto;
        //Aca agarras los datos para el editar
         ResultSet resultado= this.ExecuteQuery("Query agarrar datos del cliente" +  idProducto);
         try {
                if(resultado.next() == true)
                {
                    /*this.vista.txtNombrePro = resultado.getString(1);
                    this.vista.txtNombrePro = resultado.getString(1);
                    this.vista.txtNombrePro = resultado.getString(1);
                    this.vista.txtNombrePro = resultado.getString(1);
                    this.vista.txtNombrePro = resultado.getString(1);*/
                    
                }
            } catch (SQLException ex) {
                System.err.println(ex);
            }
    }
    
    private void iniciarVista(){ 
        this.vista.btnCancelar.addActionListener(this);
        this.vista.setLocationRelativeTo(null);  
        this.LoadComboBox(this.vista.ComboxTipoSu, "SELECT  Nombre FROM tiposucursal WHERE estado = 2");
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.vista.btnCancelar==ae.getSource()){
            this.vista.dispose();
        }
    }
    
}
