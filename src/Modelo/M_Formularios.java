package Modelo;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author Denzel Sloth
 */
public class M_Formularios extends MD_MANEJADOR_BD{


    public String [][] TraerNombresColumnas(String SqlConsulta )
    {        
        int registro=0;
        String consulta =SqlConsulta;        
        this.conectar();
        String [][] Columnas_JTabla ;
        try {        
            this.sqlconsulta = this.conexion.prepareStatement(consulta);
            this.registros = this.sqlconsulta.executeQuery();
            ResultSetMetaData Contenedor_Registro_Individual= this.registros.getMetaData();
            int Numero_Columnas=Contenedor_Registro_Individual.getColumnCount();
            int x; 
            
           
            Columnas_JTabla = new String[Numero_Columnas-2][2];
            while(this.registros.next())
            {           
                for(x=1;x<=Numero_Columnas;x++)
                {
                    if(!Contenedor_Registro_Individual.getColumnName(x).equals("id")&&!Contenedor_Registro_Individual.getColumnName(x).equals("status"))
                    {
                        if(Contenedor_Registro_Individual.getColumnName(x).startsWith("id_"))
                        {
                            Columnas_JTabla[registro][0]=Contenedor_Registro_Individual.getColumnName(x).replace("id_", "");
                        }else{
                            Columnas_JTabla[registro][0]=Contenedor_Registro_Individual.getColumnName(x);
                        }
                        Columnas_JTabla[registro][1]=Contenedor_Registro_Individual.getColumnTypeName(x);
                       
                        registro++;   
                    }
                }   
                break;
            }   
            this.desconectar();
        } catch (SQLException ex) {            
            System.err.println("error"+ex);
            return null;
        }
        return Columnas_JTabla;
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
                combo.addItem(this.registros.getString(2));
            }
        } catch (SQLException ex) {
            System.err.printf("error"+ex);
        }
        this.desconectar();   
    }
    
}
