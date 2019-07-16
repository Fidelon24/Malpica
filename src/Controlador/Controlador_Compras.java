/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MD_CAMBIARPANEL;
import Vista.Vista_Compras;
import javax.swing.JPanel;

/**
 *
 * @author Desarollador
 */
public class Controlador_Compras {
    public final Vista_Compras vista;
    
    public Controlador_Compras(JPanel panelPrincipal){
        this.vista = new Vista_Compras();
        new MD_CAMBIARPANEL(panelPrincipal, vista);
    }
    
    
}
