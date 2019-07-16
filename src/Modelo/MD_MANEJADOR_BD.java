package Modelo;

import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class MD_MANEJADOR_BD {
    protected int Caja=1;
    protected String Ubicacion = new File ("").getAbsolutePath();
    protected Connection conexion;
    protected PreparedStatement sqlconsulta;
    protected ResultSet registros;
    private int WidthActual=Toolkit.getDefaultToolkit().getScreenSize().width;
    private int HeigthActual=java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;        
    private String url ="jdbc:mysql://localhost/panaderia_malpica?zeroDateTimeBehavior=convertToNull&useSSL=false";
    private String usuario="root";
    private String password="";
    private String dataBase="panaderia_malpica";
    private String drive= "com.mysql.jdbc.Driver";
  
    public void conectar()
    {
        try
        {
            Class.forName(this.getDrive());
        }catch(ClassNotFoundException e)
        {
            System.err.println("No encontro drivers " + e.getMessage());
            System.exit(-1);
        }
        try
        {
            this.setConexion(DriverManager.getConnection(this.getUrl(), this.getUsuario(), this.getPassword()));
        }catch (SQLException e)
        {
            System.err.println("Surgio un error" + e.getMessage());
        }
    }
    public void desconectar()
    {
        try
        {
            if(!this.conexion.isClosed()) 
                this.getConexion().close();
            
        }catch(SQLException e)
        {
            System.err.println("Surgio un error" + e.getMessage());
        }
    }
    
    public Connection getConexion() { return conexion; }
    public void setConexion(Connection conexion){ this.conexion= conexion; }
    public Statement getSqlConsulta() { return sqlconsulta; }
    public void setSqlConsulta(PreparedStatement sqlConsulta) { this.sqlconsulta = sqlConsulta; }
    public Statement getsqlConsulta() { return this.sqlconsulta; }
    public void setaqlConsulta(PreparedStatement sqlConsulta) { this.sqlconsulta = sqlConsulta; }
    public ResultSet getRegistro() { return registros; }
    public void setRegistro(ResultSet registro) { this.registros = registro; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public String getPassword(){ return password; }
    public void setPassword(String password){ this.password = password; }
    public String getDataBase() { return dataBase; }
    public void setDataBase(String dataBase) { this.dataBase = dataBase; }
    public String getDrive() { return drive; }
    public void setDrive(String drive) { this.drive = drive; }
    public String getUbicacion(){ return this.Ubicacion; }
    public void setUbicacion(String ubicacion) {this.Ubicacion= ubicacion;}
        
    public int getWidthActual(){ return this.WidthActual; }
    public void setWidth(int WidthtActual) {this.WidthActual= WidthtActual;}
    
    public int getHeightActual(){ return this.HeigthActual; }
    public void setHeightActual(int HeightActual) {this.HeigthActual= HeightActual;}
    
    public int getCaja(){ return this.Caja; }
    public void setCaja(int Caja) {this.Caja= Caja;}
}
