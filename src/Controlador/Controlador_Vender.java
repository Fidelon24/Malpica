package Controlador;

import Modelo.MD_CAMBIARPANEL;
import Vista.Panel_Ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;


public class Controlador_Vender implements ActionListener{
 private final Panel_Ventas vista;

    public Controlador_Vender(JPanel panel_principal) {
        
        vista = new Panel_Ventas();
        new MD_CAMBIARPANEL(panel_principal, vista);
        
        this.vista.btnBuscarCliente.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnAñadir.addActionListener(this);
        this.vista.btnQuitar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);  
        
        
        this.vista.btnCancelar.addActionListener(this);
        this.iniciarVista();  
    }
    
    private void iniciarVista(){ 
        this.vista.setVisible(true);
    
        
        this.vista.lblNombreCliente.setText("Cliente Default");
        this.vista.lblNombreEmpleado.setText("Empleado Default");
            
        this.vista.lblDescuento.setText("$ 0");
        this.vista.lblSubTotal.setText("$ 0");
        this.vista.lblTotal.setText("$ 0");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        if(this.vista.btnAñadir==ae.getSource()){
            new Controlador_Entrada("Añadir Producto", "Ingrese Cantidad");
        }
        
        if(this.vista.btnQuitar==ae.getSource()){
            new Controlador_Entrada("Quitar Producto", "Ingrese Cantidad");
        }

        if(this.vista.btnCancelar==ae.getSource()){
            
        }
        
        if(this.vista.btnBuscarCliente==ae.getSource())
        {
            /*Controlador_Listado LISTADO = new Controlador_Listado("cat_clientes", "id , CONCAT(nombre , ' ', `a_paterno` ,' ',`a_materno`) as 'Nombre Cliente'");
            if(LISTADO.Nombre!="0")
            {
                this.vista.lblNombreCliente.setText(LISTADO.Nombre);
            }*/
                
            
        }
    }
}