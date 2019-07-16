package Controlador;

import Modelo.MD_CONTROLLER;
import Modelo.M_Formularios;
import Vista.Vista_Formularios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Denzel Sloth
 */

public class Controlador_Formularios extends MD_CONTROLLER implements ActionListener ,KeyListener{
    public Vista_Formularios vista= new Vista_Formularios(new JFrame(),true);
    private JLabel[] labels ;
    private JTextField[] txtfields;
    private JComboBox[] combo;
    public String [] [] campos ;
    String titulo;
    public int i=0;
    int numCombobox = 0;
    public MD_CONTROLLER VALIDAR= new MD_CONTROLLER();
    private M_Formularios CONTROLLER = new M_Formularios();
    
    public Controlador_Formularios(String titulo ,String[][] campos ){  
        
        this.titulo = titulo;
        this.campos = campos;
        labels = new JLabel[this.campos.length];
        txtfields = new JTextField[this.campos.length];
        combo= new JComboBox[this.campos.length];
        
        
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnCancelar.addActionListener(this);

        iniciarVista();
    }
    public void iniciarVista()
    {
        this.vista.PanelFormulario.setLayout(new java.awt.GridLayout(campos.length, 2, 5, 5));    
        for(  i = 0 ; i < campos.length ; i ++ )
        {                        
            labels[i] = new javax.swing.JLabel(campos[i][0].replace("_", " ").toUpperCase());
          
            labels[i].setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            labels[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            this.vista.PanelFormulario.add(labels[i]);

            if(this.campos[i][0].startsWith("cat_"))
            {
                combo[i]= new javax.swing.JComboBox();    
                combo[i].setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N   
                this.vista.PanelFormulario.add(combo[i]);
                this.CONTROLLER.LoadComboBox(combo[i],"Select  * from "+this.campos[i][0]);
                numCombobox++;
            }else
            {                            
                txtfields[i] = new javax.swing.JTextField();
                txtfields[i].setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                this.vista.PanelFormulario.add(txtfields[i]);
                this.vista.lblTitulo.setText(titulo);
                txtfields[i].addKeyListener(this);
            }
        }
       this.vista.setLocationRelativeTo(null);  
       vista.setVisible(true);
       txtfields[0].requestFocus();
   }
   
    @Override    
    public void actionPerformed(ActionEvent e) {
        if(this.vista.btnAgregar==e.getSource()){
            boolean camposVacios = false;
            for(int x = 0 ; x < this.campos[0].length -this.numCombobox ; x++)
            {
                if(this.txtfields[x].getText().equals(""))
                {
                    camposVacios = true;
                    break;
                }
                       
            }
            if(camposVacios==false)
            {
                new Controlador_Mensaje("Campos Vacios", "Ingrese todos los campos."); 
                //this.vista.dispose();
            }
            else
            {
               this.vista.dispose();  
            }
              
        }
        
        if(this.vista.btnCancelar==e.getSource()){
            this.vista.dispose();
        }    
    }  

    @Override
    public void keyTyped(KeyEvent ke) {
      for(int i=0; i<campos.length;i++)
      {
           if(ke.getSource()==txtfields[i])
           {
               if(campos[i][1].equals("INT"))
                   VALIDAR.onlyNumbers(ke);
                        
               
           }
      }
          
       
    }

    @Override
    public void keyPressed(KeyEvent ke) {
       int x=0;
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        int x=0;
    }
}
