package Controlador;

import Vista.Vista_Login;
public class Controlador_Run {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
   
        Vista_Login vista  = new Vista_Login();
        Controlador_Login controlador = new Controlador_Login(vista);
       
    }
}
