package Controlador;

import Modelo.MD_CAMBIARPANEL;
import Modelo.MD_CONTROLLER;
import Modelo.M_Formularios;
import Vista.Panel_Catalogos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import Controlador.Controlador_CrearCotizacion;
import Controlador.Formularios.Controlador_Formulario_Clientes;
import Controlador.Formularios.Controlador_Formulario_Empleados;
import Controlador.Formularios.Controlador_Formulario_Productos;
import Controlador.Formularios.Controlador_Formulario_Sucursales;


/**
 *
 * @author Denzel Sloth
 */

public final class Controlador_Catalogos extends MD_CONTROLLER implements ActionListener {  
     private final Panel_Catalogos vista;
     private final JPanel panelMenu;
     private int tipoCatalogo;
     
    public Controlador_Catalogos(JPanel panel_principal, int tipoCatalogo) {
        this.vista = new Panel_Catalogos();
        this.tipoCatalogo = tipoCatalogo;
        this.panelMenu = panel_principal;
        new MD_CAMBIARPANEL(panel_principal, vista);
        
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.txtBuscar.addActionListener(this);
         
        /*
        Tipos de Catalogo:
            1 - Sucursal
            2 - Empleados
            3 - Clientes
            4 - Productos
            5 - Gastos
        */
        
        switch(this.tipoCatalogo){
            case 1:
                this.vista.lblTitulo.setText("Catálogo de Sucursales"); 
                CargarCatalogo();
                break;
            case 2:
                this.vista.lblTitulo.setText("Catálogo de Empleados");       
                 CargarCatalogo();
                break;
            case 3:
                this.vista.lblTitulo.setText("Catálogo de Clientes"); 
                 CargarCatalogo();
                break;
            case 4:
                this.vista.lblTitulo.setText("Catálogo de Productos"); 
                 CargarCatalogo();
                break;
            case 5:
                this.vista.lblTitulo.setText("Catálogo de Gastos");   
                break;
        }
        
        
        this.iniciarVista();
        
    }
    
    
    private void iniciarVista(){ 
        this.vista.setVisible(true);  
    }
    
    private void EsconderColumna(JTable tabla, int index){
        tabla.getColumnModel().getColumn(index).setMinWidth(index);
        tabla.getColumnModel().getColumn(index).setMaxWidth(index);
        tabla.getColumnModel().getColumn(index).setWidth(index);
    }
    

      
    @Override
    public void actionPerformed(ActionEvent ae) {   
        if(ae.getSource() == this.vista.btnAgregar)
        {
        /*
            Tipos de Catalogo:
            1 - Sucursal
            2 - Empleados
            3 - Clientes
            4 - Productos
            5 - Gastos
        */
            switch(this.tipoCatalogo){               
            case 1:       
                Controlador_Formulario_Sucursales modal_sucursales = new Controlador_Formulario_Sucursales();
                break;
            case 2:
                Controlador_Formulario_Empleados modal_empleados = new Controlador_Formulario_Empleados();
                break;
            case 3:
                Controlador_Formulario_Clientes modal_clientes = new Controlador_Formulario_Clientes();
                break;
            case 4:
                Controlador_Formulario_Productos modal_productos = new Controlador_Formulario_Productos();
                break;
            case 5:
                break;
            }
        }
        
        if(ae.getSource() == this.vista.btnBuscar)
        {
           CargarCatalogo();
        }
        
        if(ae.getSource() == this.vista.txtBuscar)
        {
            CargarCatalogo();
        }
              
    }
    
    private void CargarCatalogo()
    {
        switch(this.tipoCatalogo){               
            case 1:       
                this.LoadJTable("SELECT idSucursal,tiposucursal.nombre AS tipo, sucursal.nombre, direccion, telefono\n" +
"                                       FROM sucursal\n" +
"                                       JOIN tiposucursal ON sucursal.idtipoSucursal = tiposucursal.idtipoSucursal\n" +
"                                       WHERE sucursal.`nombre` LIKE '%"+this.vista.txtBuscar.getText()+"%'\n" +
"                                       ORDER BY sucursal.idtipoSucursal ASC", this.vista.tblRegistros);
                this.vista.tblRegistros.getColumnModel().getColumn(1).setHeaderValue("Nombre");
                this.vista.tblRegistros.getColumnModel().getColumn(2).setHeaderValue("Tipo");
                this.vista.tblRegistros.getColumnModel().getColumn(3).setHeaderValue("Dirección");
                this.vista.tblRegistros.getColumnModel().getColumn(4).setHeaderValue("Teléfono");
                EsconderColumna(this.vista.tblRegistros, 0);
                break;
            case 2:
                this.LoadJTable("SELECT idEmpleado,nombre,direccion,telefono, DATE(fecha_inicio) AS inicio FROM empleados WHERE nombre LIKE '%"+this.vista.txtBuscar.getText()+"%'", this.vista.tblRegistros);
                this.vista.tblRegistros.getColumnModel().getColumn(1).setHeaderValue("Nombre");
                this.vista.tblRegistros.getColumnModel().getColumn(2).setHeaderValue("Dirección");
                this.vista.tblRegistros.getColumnModel().getColumn(3).setHeaderValue("Teléfono");
                this.vista.tblRegistros.getColumnModel().getColumn(4).setHeaderValue("Fecha de Inicio");
                EsconderColumna(this.vista.tblRegistros, 0);        
                break;
            case 3:
                this.LoadJTable("SELECT idCliente, nombre, direccion, telefono FROM clientes WHERE nombre LIKE '%"+this.vista.txtBuscar.getText()+"%'", this.vista.tblRegistros);
                this.vista.tblRegistros.getColumnModel().getColumn(1).setHeaderValue("Nombre");
                this.vista.tblRegistros.getColumnModel().getColumn(2).setHeaderValue("Dirección");
                this.vista.tblRegistros.getColumnModel().getColumn(3).setHeaderValue("Teléfono");
                EsconderColumna(this.vista.tblRegistros, 0);
                break;
            case 4:
                this.LoadJTable("SELECT idProducto, codigo, nombre, CONCAT('$ ',FORMAT(precio, 2)) AS precio, CONCAT('$ ',FORMAT(precioMayoreo, 2)) AS precioMayoreo FROM productos WHERE nombre LIKE '%"+this.vista.txtBuscar.getText()+"%' OR codigo LIKE '%"+this.vista.txtBuscar.getText()+"%'", this.vista.tblRegistros);
                this.vista.tblRegistros.getColumnModel().getColumn(1).setHeaderValue("Codigo");
                this.vista.tblRegistros.getColumnModel().getColumn(2).setHeaderValue("Nombre");
                this.vista.tblRegistros.getColumnModel().getColumn(3).setHeaderValue("Precio");
                this.vista.tblRegistros.getColumnModel().getColumn(4).setHeaderValue("Precio Mayoreo");
                EsconderColumna(this.vista.tblRegistros, 0);
                break;
            case 5:
                break;
            }
    }
}

