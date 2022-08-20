package nivel3;

import javax.swing.*;

public class Entrada2 {
    //Variables de Clase


    //método main
    public static void main(String[] args) {
        //Entra al constructor

        new Entrada2();
    }
    public Entrada2() {
        //Se necesita inicializar las variables de clase

        //Ingresa al método de servicio
        this.manejador();

    }

    public void manejador(){
        int opcion=0;
        boolean capturo=false;
        Estadistica pepito = new Estadistica();

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
                Float[] datos = this.capturaDatos();
                pepito.setNumeros(datos);
                capturo=true;
                break;

            case 2:
                if(capturo){
                    pepito.muestraOriginal();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;

            case 3:
                if(capturo){
                    pepito.ordenaMenMay();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;

            case 4:
                if(capturo){
                    pepito.ordenaMayMen();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;

            case 5:
                if(capturo){
                    pepito.muestraMay();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;

            case 6:
                if(capturo){
                    pepito.muestraMen();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;

            case 7:
                if (capturo) {
                    pepito.xMay();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;
            case 8:
                if(capturo){
                    pepito.xMen();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;
            case 9:
                if(capturo){
                    pepito.promedio();
                }else{
                    JOptionPane.showMessageDialog(null, "Primero debe hacer la captura de datos..!!");
                }
                break;
            case 10:
                if(capturo){
                    pepito.desviacionEstandar();
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

    private Float[] capturaDatos(){
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
        return numeros;
    }

}
