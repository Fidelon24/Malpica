
package Modelo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public  abstract class MD_VALIDACIONES extends MD_MANEJADOR_BD 
{    
    
    public boolean bandera = true;
    public boolean character(KeyEvent  e)
    {
        return (e.getKeyChar() >= 65 && e.getKeyChar() <= 90) || (e.getKeyChar() >= 97 && e.getKeyChar() <= 122) || e.getKeyChar()== 'ñ' || e.getKeyChar() == 'Ñ' ;
    }
    public boolean number(KeyEvent e)
    {
        return e.getKeyChar() >= 48 && e.getKeyChar() <= 57;
    }
    public boolean space(KeyEvent e)
    {
        return e.getKeyChar() == 32;
    }

    public boolean delete(KeyEvent e)
    {
        return e.getKeyChar() == 8;
    }
    public void onlyLetters(KeyEvent e)
    {
        if (!(character(e) || delete(e) || space(e)))
        {
            e.consume(); 
        }
    }
    public void LettersAndNumbers(KeyEvent e)
    {
        if (!(character(e) || number(e) || delete(e) ))
        {
            e.consume(); 
        }
    }
    public void LettersAndNumbersAndSpace(KeyEvent e)
    {
        if (!(character(e) || number(e) || delete(e) || space(e) ))
        {
            e.consume(); 
        }
    }
    public void onlyNumbers(KeyEvent e)
    {
        if (!(number(e) || delete(e)))
        {
            e.consume(); 
        }
    }
    /*public void onlyDecimal(KeyEvent e,JFrame txtCosto)
        {

            if (e.getKeyChar() == 8)
            {
                e.Handled = false;
                return;
            }
            boolean IsDec = false;
            int nroDec = 0;

            for (int i = 0; i < txtCosto.Text.Length; i++)
            {
                if (txtCosto.Text[i] == '.')
                    IsDec = true;

                if (IsDec && nroDec++ >= 2)
                {
                    e.Handled = true;
                    return;
                }
            }

            if (e.KeyChar >= 48 && e.KeyChar <= 57)
                e.Handled = false;
            else if (e.KeyChar == 46)
                e.Handled = (IsDec) ? true : false;
            else
                e.Handled = true;     
        }*/
    public boolean ValidateControls(JPanel panel,Color color)
    {
     
       boolean exito= true;

       for(Component comp: panel.getComponents())
       {
           if(comp instanceof JTextField)
           {
               if(((JTextField)comp).getText().equals("")&&((JTextField)comp).isEnabled() )
               {
                   exito=false;
                   ((JTextField)comp).setBackground((color==null)?new Color(255, 53, 53):color);
                   ((JTextField)comp).setForeground(Color.WHITE);
                   
               }else
               {
                   ((JTextField)comp).setBackground(new Color(250,250, 250));
                   ((JTextField)comp).setForeground(Color.BLACK);
               }
               
           }           
       }            
       return exito;
    }
    public void ClarControls(JPanel panel )
    {        
       for(Component comp: panel.getComponents())
       {
           if(comp instanceof JTextField)
           {
                                
                ((JTextField)comp).setText("");
                ((JTextField)comp).setBackground(new Color(250,250, 250));
                ((JTextField)comp).setForeground(Color.BLACK);
               
           }           
       }            
       
    }
    public void ActivateEvent(JPanel panel , KeyListener key, ActionListener action)
    {        
        JTextField txt;
        JButton button;        
       for(Component comp: panel.getComponents())
       {
           if(comp instanceof JTextField)
           {
               txt=(JTextField)comp;
               txt.addKeyListener((KeyListener) key);                              
           }           
           if(comp instanceof JButton)
           {
               button = (JButton)comp;
               button.addActionListener(action);               
           }
       }
    }
    public void ActivateMouseListenerLabel(JPanel panel , MouseListener mouse)
    {
        JLabel label;
       for(Component comp: panel.getComponents())
       {
           if(comp instanceof JLabel)
           {
               label= (JLabel) comp;
               label.addMouseListener(mouse);
           }           

       }
    }
    
    public void MessageInformation(JFrame Form ,String Cuerpo_Mensaje , String Titulo_Mensaje)
    {
        JOptionPane.showMessageDialog(Form,Cuerpo_Mensaje,(Titulo_Mensaje==null?"Informacion Del Sistema":Titulo_Mensaje),JOptionPane.INFORMATION_MESSAGE);
    }
    public void MessageWarning(JFrame Form ,String Cuerpo_Mensaje , String Titulo_Mensaje)
    {        
        JOptionPane.showMessageDialog(Form, Cuerpo_Mensaje,(Titulo_Mensaje==null?"Informacion Del Sistema":Titulo_Mensaje) , JOptionPane.WARNING_MESSAGE);
    }
    public void MessageAlert(JFrame Form ,String Cuerpo_Mensaje , String Titulo_Mensaje)
    {        
        JOptionPane.showMessageDialog(Form, Cuerpo_Mensaje, (Titulo_Mensaje==null?"Informacion Del Sistema":Titulo_Mensaje), JOptionPane.ERROR_MESSAGE);
    }  
    public int MessageResult(Component Form ,String Cuerpo_Mensaje , String Titulo_Mensaje) // 0 =YES -- 1==NO
    {        
        return JOptionPane.showConfirmDialog(Form,Cuerpo_Mensaje,(Titulo_Mensaje==null?"Informacion Del Sistema":Titulo_Mensaje), JOptionPane.YES_NO_OPTION);        
    }
    public int MessageResultAlert(Component Form ,String Cuerpo_Mensaje , String Titulo_Mensaje) // 0 =YES -- 1==NO
    {        
        return JOptionPane.showConfirmDialog(Form,Cuerpo_Mensaje,(Titulo_Mensaje==null?"Informacion Del Sistema":Titulo_Mensaje), JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);        
    }
    public int MessageResultInformation(Component Form ,String Cuerpo_Mensaje , String Titulo_Mensaje) // 0 =YES -- 1==NO
    {        
        return JOptionPane.showConfirmDialog(Form,Cuerpo_Mensaje,(Titulo_Mensaje==null?"Informacion Del Sistema":Titulo_Mensaje), JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE);        
    }
    public int MessageResultWarning(Component Form ,String Cuerpo_Mensaje , String Titulo_Mensaje) // 0 =YES -- 1==NO
    {        
        return JOptionPane.showConfirmDialog(Form,Cuerpo_Mensaje,(Titulo_Mensaje==null?"Informacion Del Sistema":Titulo_Mensaje), JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);        
    }
        
    
    
    public Font NuevaFuente(int estilo , float tamanio,String fuente)
    {        
        Font font;
            
           File ubicacion = new File(Ubicacion+"\\src\\fuentes\\"+fuente);
           
        try {               
            font = Font.createFont(Font.TRUETYPE_FONT, ubicacion);
        } catch (FontFormatException | IOException ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(ubicacion+" No se cargo la fuente");
            font = new Font("Rockwell", Font.PLAIN, 14);            
        }
        return font.deriveFont(estilo, tamanio);
    }
    
    private MD_IMAGEN borde;               
    private File a;
    public void LoadImagen(String imagen, JPanel componente) 
    {
       a = new File(this.getUbicacion()+"\\src\\imagenes\\"+imagen);
        try 
        {
            borde = new MD_IMAGEN(ImageIO.read(a));
            componente.setBorder(borde);            
        } catch (IOException ex) {
            System.err.println("ocurrio un error en fondo"+ex);
        }
         
        
    }
    public void CargarFuentesBotones(int estilo , float tamanio,String fuente , JPanel panel)    
    {
       for(Component comp: panel.getComponents())
       {
           if(comp instanceof JButton)
           {                                
                ((JButton)comp).setFont(this.NuevaFuente(estilo, tamanio, fuente));               
           }           
       }             
    }
    public void CargarFuentesLabel(int estilo , float tamanio,String fuente , JPanel panel)    
    {
       for(Component comp: panel.getComponents())
       {
           if(comp instanceof JLabel)
           {                                
                ((JLabel)comp).setFont(this.NuevaFuente(estilo, tamanio, fuente));               
           }           
       }             
    }
    public void CargarFuentesTextoBox(int estilo , float tamanio,String fuente , JPanel panel)    
    {
       for(Component comp: panel.getComponents())
       {
           if(comp instanceof JTextField)
           {                                
                ((JTextField)comp).setFont(this.NuevaFuente(estilo, tamanio, fuente));               
           }           
       }             
    }
    public void AplicarStilos(Component componente)
    {

        if( componente instanceof JPanel)
        {

            ((JPanel)componente).setLayout(null);               
            for (Component comp : ((JPanel) componente).getComponents())
            {
                AplicarStilos(comp);
            }
        }else if(componente instanceof JTextField)
        {
            ((JTextField) componente).setFont( new Font("Arial Unicode MS",Font.BOLD, (int) 16f));
        }else if(componente instanceof JTable)
        {
            
            JTable table= (JTable) componente;
            table.getTableHeader().setFont( new Font("Rockwell",Font.BOLD, (int) 18f));
            table.getTableHeader().setForeground(new Color(255,255,255));
            table.getTableHeader().setBackground(new Color(86, 87, 105));        
            table.setFont(new Font("Rockwell",Font.PLAIN, (int) 15f));
            table.setForeground(new Color(56, 75, 106));
        }
        }
    
        
}
