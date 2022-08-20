package nivel3;

import javax.swing.*;

public class Entrada1 {
    //Variables de Clase
    private Estadistica pepito;


    //método main
    public static void main(String[] args) {
        //Entra al constructor

        new Entrada1();
    }
    public Entrada1() {
        //Se necesita inicializar las variables de clase
        this.pepito=null;

        //Ingresa al método de servicio
        this.manejador();

    }

    public void manejador(){
        int opcion=0;
        boolean capturo=false;

        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al programa. Seleccione la opcion deseada escribiendo el numero que aparece junto a esta:\n" +
                "1.Capturar datos\n" +
                "2.Mostrar arreglo original\n" +
                "3.Ordenado de menor a mayor\n" +
                "4.Ordenado de mayor a menor\n" +
                "5.Número mayor\n" +
                "6.Número menor\n" +
                "7.X mayores\n" +
                "8.X menores\n" +
                "9.Promedio de los datos\n" +
                "10.Desviación estándar de los datos\n" +
                "0. Finalizar programa"));
        switch(opcion){
            case 1:
                this.capturaDatos();
                capturo=true;
                break;

            case 2:
                if(capturo){
                    this.pepito.muestraOriginal();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;

            case 3:
                if(capturo){
                    this.pepito.ordenaMenMay();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;

            case 4:
                if(capturo){
                    this.pepito.ordenaMayMen();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;

            case 5:
                if(capturo){
                    this.pepito.muestraMay();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;

            case 6:
                if(capturo){
                    this.pepito.muestraMen();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;

            case 7:
                if (capturo) {
                    this.pepito.xMay();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;
            case 8:
                if(capturo){
                    this.pepito.xMen();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;
            case 9:
                if(capturo){
                this.pepito.promedio();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;
            case 10:
                if(capturo){
                    this.pepito.desviacionEstandar();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Gracias por usar el programa");
                break;
        }}
        while(opcion!=0);
    }

    private void capturaDatos(){
        //Variable local del metodo
        Float[] numeros;

        int cantNumeros = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de datos a ingresar"));
        while (cantNumeros <= 0) {
            cantNumeros = Integer.parseInt(JOptionPane.showInputDialog("La cantidad de datos deben ser un numero positivo. Intente de nuevo"));
        }
        numeros = new Float[cantNumeros];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor " + (i+1) + " a ingresar"));
        }
        this.pepito = new Estadistica();
        this.pepito.setNumeros(numeros);
    }

}
