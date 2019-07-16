/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Denzel Sloth
 */
public class MD_TABLES  extends DefaultTableModel{
    
     @Override
   public boolean isCellEditable (int row, int column)
   {
        return column == 3;
   }
   
}
