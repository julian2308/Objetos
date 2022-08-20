package Nivel2;

import javax.swing.*;
import java.util.Arrays;

public class captura2F {
    //Variables de Clase
    private Float[] numeros;
    private Float[] numerosAsc;
    private Float[] numerosDes;
    private float promedio;

    //método main
    public static void main(String[] args) {
        //Entra al constructor
        new captura2F();
    }
    public captura2F() {
        //Ingresa al método de servicio
        this.manejador();
    }

    public void manejador(){
        int opcion=0;
        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al programa. Seleccione la opcion deseada escribiendo el numero que aparece junto a esta:\n" +
                "1.Cantidad de datos a ingresar\n" +
                "2.Ingresar datos\n" +
                "3.Mostrar arreglo original\n" +
                "4.Ordenado de menor a mayor\n" +
                "5.Ordenado de mayor a menor\n" +
                "6.Número mayor\n" +
                "7.Número menor\n" +
                "8.X mayores\n" +
                "9.X menores\n" +
                "10.Promedio de los datos\n" +
                "11.Desviación estándar de los datos\n" +
                "0. Finalizar programa"));
        switch(opcion){
            case 1:
                this.configurador();
                break;
            case 2:
                this.capturaDatos();
                break;
            case 3:
                this.muestraOriginal();
                break;
            case 4:
                this.ordenaMenMay();
                break;
            case 5:
                this.ordenaMayMen();
                break;
            case 6:
                this.muestraMay();
                break;
            case 7:
                this.muestraMen();
                break;
            case 8:
                this.xMay();
                break;
            case 9:
                this.xMen();
                break;
            case 10:
                this.promedio();
                break;
            case 11:
                this.desviacionEstandar();
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Gracias por usar el programa");
                break;
        }}
        while(opcion!=0);
    }
    private void configurador() {

        int cantNumeros = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de datos a ingresar"));
        while (cantNumeros <= 0) {
            cantNumeros = Integer.parseInt(JOptionPane.showInputDialog("La cantidad de datos deben ser un numero positivo. Intente de nuevo"));
        }
        this.numeros = new Float[cantNumeros];
    }

    private void capturaDatos(){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor " + (i+1) + " a ingresar"));
        }

    }

    private void muestraOriginal(){
        //Muestra el arreglo original(tarea 4)
        System.out.println("Arreglo original= "+Arrays.toString(this.numeros));
    }

    private void ordenaMenMay(){
        //Ordena de menor a mayor(tarea 4)
        this.numerosAsc=this.numeros.clone();

        Arrays.sort(this.numerosAsc);
        System.out.println("El arreglo ordenado de menor a mayor = "+Arrays.toString(this.numerosAsc));

    }

    private void ordenaMayMen(){
        //Ordena de mayor a menor(tarea 5)
        float x;

        this.numerosDes=this.numeros;
        for (int i = 0; i <= this.numeros.length-2; i++) {
            for (int j = 1; j <= this.numeros.length-1; j++) {
                if(this.numerosDes[i]<this.numerosDes[j]){
                    x=this.numerosDes[i];
                    this.numerosDes[i]=this.numerosDes[j];
                    this.numerosDes[j]=x;
                }
            }
        }
        System.out.println("El arreglo ordenado de mayor a menor es ="+Arrays.toString(this.numerosDes));
    }

    private void muestraMay(){
        //Imprime numero mayor de los ingresados(Tarea 6)
        JOptionPane.showMessageDialog(null,"El numero mayor de los datos ingresados es "+this.numerosDes[0]);
    }

    private void muestraMen(){
        //Imprime numero menor de los ingresados(Tarea 7)
        JOptionPane.showMessageDialog(null,"El numero menor de los datos ingresados es "+ this.numerosDes[this.numerosDes.length-1]);
    }

    private void xMay(){
        //Calcula los X mayores del arreglo(tarea 8)
        int xMayores=0;
        String acum="";

        xMayores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los x mayores que desee obtener"));
        while(xMayores<=0 || xMayores>this.numerosDes.length){
            xMayores = Integer.parseInt(JOptionPane.showInputDialog("Los X mayores no pueden ser valores negativos o que excedan la cantidad de numeros ingresados. Intente de nuevo"));
        }
        for (int i = 0; i < xMayores; i++){
            acum=acum+" "+this.numerosDes[i];
        }
        System.out.println("Los "+xMayores+" numeros mas grandes son = "+acum);
    }

    private void xMen(){
        //Calcula los X menores del arreglo(Tarea 9)
        String acum="";
        int xMenores=0;

        xMenores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los x menores que desee obtener"));
        while(xMenores<=0 || xMenores>this.numerosDes.length){
            xMenores = Integer.parseInt(JOptionPane.showInputDialog("Los X menores no pueden ser valores negativos o que excedan la cantidad de numeros ingresados. Intente de nuevo"));
        }
        for (int i = 0; i < xMenores; i++) {
            acum=acum+" "+this.numerosDes[this.numerosDes.length-1-i];
        }
        System.out.println("Los "+xMenores+" numeros mas pequeños son = "+acum);
    }

    private void promedio(){
        //Calcula el promedio(Tarea 10)
        float sumar=0;

        for (int i = 0; i < this.numeros.length; i++) {
            sumar+=this.numeros[i];
        }
        this.promedio=sumar/this.numeros.length;
        JOptionPane.showMessageDialog(null,"El promedio de los numeros ingresados es = "+this.promedio);
    }

    private void desviacionEstandar( ){
        //Calcula Desviacion estandar de los datos(tarea 11)
        double desviacionE;
        double sumatoria=0;
        float suma=0;


        for (int i = 0; i < this.numeros.length; i++) {
            suma=this.numeros[i]-this.promedio;
            sumatoria=(suma*suma)+sumatoria;
        }
        desviacionE=Math.sqrt(sumatoria/this.numeros.length);
        JOptionPane.showMessageDialog(null,"La desviacion estandar de los numeros ingresados es = "+desviacionE);

    }
}
