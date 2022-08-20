package nivel1;

import javax.swing.*;

public class Suma {

    //Atributos




    //Métodos
    public static void main(String [] x){

        new Suma();
    }

    public Suma (){

        System.out.println("Objeto construido y listo para usarse");
        this.realizarSuma();
    }

    private void realizarSuma(){

        float x,y,z;

        x=Float.parseFloat(JOptionPane.showInputDialog("Digite el dato número 1"));
        y=Float.parseFloat(JOptionPane.showInputDialog("Digite el dato número 2"));
        z=x+y;

        JOptionPane.showMessageDialog(null, "El resultado es:" + z);

    }


}
