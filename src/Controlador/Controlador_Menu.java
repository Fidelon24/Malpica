package Controlador;

import Vista.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.MD_CAMBIARPANEL;
import javax.swing.JPanel;

public class Controlador_Menu implements ActionListener{
    private final Vista_Menu vista;

    public Controlador_Menu(Vista_Menu vista) {
        this.vista = vista; 
        //Panel Superior
        this.vista.btnMenu.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
        this.vista.btnVenPuntoVen.addActionListener(this);
        
        //Menu Lateral
        this.vista.btnCatalogos.addActionListener(this);
            this.vista.btnCatSucursal.addActionListener(this);
            this.vista.btnCatEmpleados.addActionListener(this);
            this.vista.btnCatClientes.addActionListener(this);
            this.vista.btnCatProductos.addActionListener(this);
            this.vista.btnCatGastos.addActionListener(this);
  
        this.vista.btnVentas.addActionListener(this);
           this.vista.btnVenPuntoVen.addActionListener(this);
           this.vista.btnVenFacturas.addActionListener(this);
           this.vista.btnVenPedidos.addActionListener(this);
           this.vista.btnVenCotizacion.addActionListener(this);
           this.vista.btnVenAlmacen.addActionListener(this);
           
        
        this.vista.btnProduccion.addActionListener(this);
        
        this.vista.btnAdministrativo.addActionListener(this);
            this.vista.btnAdminCuentasPagar.addActionListener(this);
            this.vista.btnAdminNomina.addActionListener(this);
            this.vista.btnAdminGastos.addActionListener(this);
            this.vista.btnAdminEfectivo.addActionListener(this);
            this.vista.btnAdminChequeo.addActionListener(this);
            this.vista.btnAdminCompras.addActionListener(this);
            
        this.vista.btnInventario.addActionListener(this); 
            this.vista.btnInvCompras.addActionListener(this);
            this.vista.btnInvAlmacenes.addActionListener(this);
        
        this.vista.btnRecursosHumanos.addActionListener(this);  
            
        OcultarSubmenus();
        this.iniciarVista();  
    }
    
    private void iniciarVista(){ 
        this.vista.setVisible(true);
        this.vista.setExtendedState(MAXIMIZED_BOTH);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(this.vista.btnMenu == ae.getSource()){
            this.vista.NavBar.setVisible(!this.vista.NavBar.isVisible());
        }
        
        if(this.vista.btnSalir==ae.getSource()){
            String[] opciones = {"No","Si"};
            if(new Controlador_Mensaje("Cerrar Sesión", "¿ Desea Cerrar Sesión ?", opciones).getSeleccion() == 1){
               this.vista.dispose(); 
               Vista_Login Vista_Login = new Vista_Login();
               Controlador_Login login = new Controlador_Login(Vista_Login);
            }      
        }
        
        //Catalogos
        
        if(this.vista.btnCatalogos == ae.getSource()){
            MostrarMenu(1);
        }
        
        if(this.vista.btnCatSucursal == ae.getSource()){
            Controlador_Catalogos controlador_catalogo = new Controlador_Catalogos(this.vista.pnlPrincipal,1);
        }
        
        if(this.vista.btnCatEmpleados == ae.getSource()){
            Controlador_Catalogos controlador_catalogo = new Controlador_Catalogos(this.vista.pnlPrincipal,2);
        }
        
        if(this.vista.btnCatClientes == ae.getSource()){
            Controlador_Catalogos controlador_catalogo = new Controlador_Catalogos(this.vista.pnlPrincipal,3);
        }
        
        if(this.vista.btnCatProductos == ae.getSource()){
            Controlador_Catalogos controlador_catalogo = new Controlador_Catalogos(this.vista.pnlPrincipal,4);
        }
        
        if(this.vista.btnCatGastos == ae.getSource()){
            Controlador_Catalogos controlador_catalogo = new Controlador_Catalogos(this.vista.pnlPrincipal,5);
        }
        
        if(this.vista.btnVenPuntoVen == ae.getSource()){
            Controlador_Vender controlador_ventas = new Controlador_Vender(this.vista.pnlPrincipal);           
        }
        
        
        
        if(this.vista.btnVentas == ae.getSource()){
            MostrarMenu(2);
        }
        if(this.vista.btnVenCotizacion == ae.getSource()){
            Controlador_Catalogos controlador_catalogo = new Controlador_Catalogos(this.vista.pnlPrincipal,101);  
        }
        
        if(this.vista.btnProduccion == ae.getSource()){
           
        }
        
        if(this.vista.btnAdministrativo == ae.getSource()){
            MostrarMenu(4);
        }
         
        //Inventario
        if(this.vista.btnInventario == ae.getSource()){
            MostrarMenu(5);
        }
        
        if(this.vista.btnInvCompras == ae.getSource()){
            Controlador_Compras controlador_compras = new Controlador_Compras(this.vista.pnlPrincipal);
            //Controlador_CrearCotizacion controlador_cotizacion = new Controlador_CrearCotizacion(this.vista.pnlPrincipal); 
        }
        
        if(this.vista.btnRecursosHumanos == ae.getSource()){
            MostrarMenu(6);
        }
    }
    
    private void MostrarMenu(int menu){
        switch(menu){
            case 1:
                this.vista.btnCatSucursal.setVisible(!this.vista.btnCatSucursal.isVisible());
                this.vista.btnCatEmpleados.setVisible(!this.vista.btnCatEmpleados.isVisible());
                this.vista.btnCatClientes.setVisible(!this.vista.btnCatClientes.isVisible());
                this.vista.btnCatProductos.setVisible(!this.vista.btnCatProductos.isVisible());
                this.vista.btnCatGastos.setVisible(!this.vista.btnCatGastos.isVisible());
                break;
            case 2:
                this.vista.btnVenPuntoVen.setVisible(!this.vista.btnVenPuntoVen.isVisible());
                this.vista.btnVenFacturas.setVisible(!this.vista.btnVenFacturas.isVisible());
                this.vista.btnVenPedidos.setVisible(!this.vista.btnVenPedidos.isVisible());
                this.vista.btnVenCotizacion.setVisible(!this.vista.btnVenCotizacion.isVisible());
                this.vista.btnVenAlmacen.setVisible(!this.vista.btnVenAlmacen.isVisible());
                break;
            case 3:
                break;
            case 4:
                this.vista.btnAdminCuentasPagar.setVisible(!this.vista.btnAdminCuentasPagar.isVisible());
                this.vista.btnAdminNomina.setVisible(!this.vista.btnAdminNomina.isVisible());
                this.vista.btnAdminGastos.setVisible(!this.vista.btnAdminGastos.isVisible());
                this.vista.btnAdminEfectivo.setVisible(!this.vista.btnAdminEfectivo.isVisible());
                this.vista.btnAdminChequeo.setVisible(!this.vista.btnAdminChequeo.isVisible());
                this.vista.btnAdminCompras.setVisible(!this.vista.btnAdminCompras.isVisible());                      
                break;
            case 5:
                this.vista.btnInvCompras.setVisible(!this.vista.btnInvCompras.isVisible());   
                this.vista.btnInvAlmacenes.setVisible(!this.vista.btnInvAlmacenes.isVisible());   
                break;
            case 6:
                /*this.vista.btnRecuEmpleados.setVisible(!this.vista.btnRecuEmpleados.isVisible());
                this.vista.btnRecuContratacion.setVisible(!this.vista.btnRecuContratacion.isVisible());           */ 
                break;
                
        }
        
    }
     
    private void OcultarSubmenus(){
        this.vista.btnCatSucursal.setVisible(false);
        this.vista.btnCatEmpleados.setVisible(false);
        this.vista.btnCatClientes.setVisible(false);
        this.vista.btnCatProductos.setVisible(false);
        this.vista.btnCatGastos.setVisible(false);
 
        this.vista.btnVenPuntoVen.setVisible(false);
        this.vista.btnVenFacturas.setVisible(false);
        this.vista.btnVenPedidos.setVisible(false);
        this.vista.btnVenCotizacion.setVisible(false);
        this.vista.btnVenAlmacen.setVisible(false);

        this.vista.btnAdminCuentasPagar.setVisible(false);
        this.vista.btnAdminNomina.setVisible(false);
        this.vista.btnAdminGastos.setVisible(false);
        this.vista.btnAdminEfectivo.setVisible(false);
        this.vista.btnAdminChequeo.setVisible(false);
        this.vista.btnAdminCompras.setVisible(false); 
        
        this.vista.btnInvCompras.setVisible(false);
        this.vista.btnInvAlmacenes.setVisible(false);
        
        

    }
    
    
    
}
