package nivel3;

import javax.swing.*;
import java.util.Arrays;

public class Estadistica {
    private Float[] numeros;
    private Float[] numerosAsc;
    private Float[] numerosDes;
    private float promedio=0;

    //métodos constructor sin parametros
    public Estadistica(){
        this.numeros=null;
        this.numerosAsc=null;
        this.numerosDes=null;
        this.promedio=0;
    }
    //métodos constructor parametrizado
    public Estadistica(Float[]numeros){
        this.numeros=numeros.clone();
        this.numerosAsc=this.numeros.clone();
        this.numerosDes=this.numeros.clone();
        this.promedio=0;
    }

    public void muestraOriginal(){
        //Muestra el arreglo original(tarea 4)
        System.out.println("Arreglo original= "+ Arrays.toString(this.numeros));
    }

    public void ordenaMenMay(){
        //Ordena de menor a mayor(tarea 4)
        this.numerosAsc=this.numeros.clone();

        Arrays.sort(this.numerosAsc);
        System.out.println("El arreglo ordenado de menor a mayor = "+Arrays.toString(this.numerosAsc));

    }

    public void ordenaMayMen(){
        //Ordena de mayor a menor(tarea 5)
        float x;

        this.numerosDes=this.numeros.clone();
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

    public void muestraMay(){
        //Imprime numero mayor de los ingresados(Tarea 6)
        JOptionPane.showMessageDialog(null,"El numero mayor de los datos ingresados es "+this.numerosDes[0]);
    }

    public void muestraMen(){
        //Imprime numero menor de los ingresados(Tarea 7)
        JOptionPane.showMessageDialog(null,"El numero menor de los datos ingresados es "+ this.numerosDes[this.numerosDes.length-1]);
    }

    public void xMay(){
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

    public void xMen(){
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

    public void promedio(){
        //Calcula el promedio(Tarea 10)
        float sumar=0;

        for (int i = 0; i < this.numeros.length; i++) {
            sumar+=this.numeros[i];
        }
        this.promedio=sumar/this.numeros.length;
        JOptionPane.showMessageDialog(null,"El promedio de los numeros ingresados es = "+this.promedio);
    }

    public void desviacionEstandar( ){
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

    public void setNumeros(Float[] numeros) {
        this.numeros = numeros;
        this.numerosAsc=this.numeros.clone();
        this.numerosDes=this.numeros.clone();
    }
}
