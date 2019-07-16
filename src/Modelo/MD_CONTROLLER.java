
package Modelo;

import java.awt.Color;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JComboBox;

import javax.swing.JTable;

/**
 *
 * @author Denzel Sloth
 */

public class MD_CONTROLLER  extends MD_VALIDACIONES{
        
    public boolean ExecuteQueryUpdate(String Consulta) {
        this.conectar();   
        boolean exito=false;
        String consulta =Consulta;                
        try {
            this.sqlconsulta = this.conexion.prepareStatement(consulta);
            this.sqlconsulta.executeUpdate(consulta);
            exito=true;
        } catch (SQLException ex) {
            this.MessageAlert(null, "Ocurrio El Siguiente Error:"+ ex, null);
            
        }        
        this.desconectar();        
        return exito;
    }
    public ResultSet ExecuteQuery(String Consulta)
    {
        ResultSet retornar =null;
        this.conectar();        
        String consulta =Consulta;                
        try {
            this.sqlconsulta = this.conexion.prepareStatement(consulta);
            retornar  =this.sqlconsulta.executeQuery(consulta);
        } catch (SQLException ex) {
            this.MessageAlert(null, "Ocurrio El Siguiente Error:"+ ex, null);
        }       
        return retornar;
    }
    public int ExecuteQueryById(String Consulta) 
    { //"select id"
        int IdRetornada=0;
        this.conectar();        
        String consulta =Consulta;                
        try {
            
            this.sqlconsulta = this.conexion.prepareStatement(consulta);
            this.registros = this.sqlconsulta.executeQuery();
            if(this.registros.next())
            {
                IdRetornada=this.registros.getInt(1);
            }            
        } catch (SQLException ex) {
            this.MessageAlert(null, "Ocurrio El Siguiente Error:"+ ex, null);
            IdRetornada=0;
        }        
        this.desconectar();        
        return IdRetornada;
    }    
    
    public boolean LoadJTable(String SqlConsulta , JTable table)
    {
        String consulta =SqlConsulta;        
        this.conectar();
        try {        
            this.sqlconsulta = this.conexion.prepareStatement(consulta);
            this.registros = this.sqlconsulta.executeQuery();
            ResultSetMetaData Contenedor_Registro_Individual= this.registros.getMetaData();
            int Numero_Columnas=Contenedor_Registro_Individual.getColumnCount();
            int x;
            MD_TABLES modelo= new MD_TABLES();
            
            //DefaultTableModel modelo = new DefaultTableModel();                
            
            boolean QuieroSaberDondeEstaElFunk=true;
            Object [] Columnas_JTabla = new Object[Numero_Columnas];
            String [] Titulos_JTabla = new String[Numero_Columnas];
              
            
            while(this.registros.next())
            {           
                for(x=1;x<=Numero_Columnas;x++)
                {
                    if(QuieroSaberDondeEstaElFunk==true)
                    {
                        modelo.addColumn(Contenedor_Registro_Individual.getColumnName(x));
                    }                                        
                    switch (Contenedor_Registro_Individual.getColumnTypeName(x)) {
                        case "VARCHAR":
                            Columnas_JTabla[x-1]=String.valueOf(registros.getString(x));
                            break;
                        case "INT":
                            Columnas_JTabla[x-1]=Integer.parseInt(String.valueOf(registros.getString(x)));
                            break;
                        case "FLOAT":
                            Columnas_JTabla[x-1]=this.registros.getFloat(x);
                            break;
                        case "DOUBLE":
                            Columnas_JTabla[x-1]=this.registros.getDouble(x);
                            break;
                        case "DATE":
                            Columnas_JTabla[x-1]=this.registros.getDate(x);
                            break;
                        case "TINYINT":
                            Columnas_JTabla[x-1]=this.registros.getInt(x);
                            break;
                        default:                                                                   
                            break;
                    }
                }                   
                
                modelo.addRow(Columnas_JTabla);                
                QuieroSaberDondeEstaElFunk = false;                                
                
            }   
                table.setModel(modelo);
            
            
            this.desconectar();
        } catch (SQLException ex) {
            this.MessageAlert(null, "Ocurrio El Siguiente Error:"+ex, null);
            return false;
            
        }
        return true;
    }
    public void  LoadComboBox(JComboBox combo , String SqlConsulta)
    {        
        String consulta = SqlConsulta;
        this.conectar();
        try 
        {
            combo.removeAllItems();
            this.sqlconsulta = this.conexion.prepareStatement(consulta);
            this.registros = this.sqlconsulta.executeQuery();
            while (this.registros.next()) 
            {
                combo.addItem(this.registros.getString(1));
            }
        } catch (SQLException ex) {
            this.MessageAlert(null, "Ocurrio El Siguiente Error:"+ex, null);
        }
        this.desconectar();   
    }

    
}
