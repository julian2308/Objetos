package nivel2;

public class Nivel2C {
    public static void main(String[] args) {
        new Nivel2C();
    }

    public Nivel2C() {

    }
    //Llamar desde el constructor
    /*private void configurador(){
        //Tarea 1, crea arreglos de numeros
        int cantNumeros=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de datos a ingresar"));
        while(cantNumeros<=0){
            cantNumeros = Integer.parseInt(JOptionPane.showInputDialog("La cantidad de datos deben ser un numero positivo. Intente de nuevo"));
        }
        float[] numeros = new float[cantNumeros];
        float[] numerosAsc ;
        float[] numerosDes = new float[cantNumeros];
        this.capturaDatos(cantNumeros, numeros);
    }

    private void capturaDatos(int cantNumeros, float[] numeros){
        //Tarea 2, llenar el arreglo
        for (int i = 0; i < cantNumeros; i++) {
            numeros[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor " + (i+1) + " a ingresar"));
        }
        this.muestraOriginales(numeros);
    }

    private void muestraOriginales(float [] numeros){
        //Tarea 3, moestrar los datos como fueron ingresados
        System.out.println("Arreglo original= "+Arrays.toString(numeros));
        this.ordenaMenMay(numeros);
    }

    private void ordenaMenMay(float [] numeros){
        //Tarea 4, Ordena de menor a mayor

        float [] numerosAsc=numeros;
        Arrays.sort(numerosAsc);
        System.out.println("El arreglo ordenado de menor a mayor = "+Arrays.toString(numerosAsc));
        this.ordenaMayMen(numeros, numerosAsc);
    }

    private void ordenaMayMen(float [] numeros, float [] numerosAsc) {
        //Tarea 5, Ordena de mayor a menor
        float [] numerosDes = numeros;
        for(int i=0 ; i<numerosDes.length ; i++){
            numerosDes[i] = numerosAsc[numerosAsc.length-1-i];
        }
        System.out.println("El arreglo ordenado de mayor a menor es ="+Arrays.toString(numerosDes));
        this.mostrarMayor(numerosAsc);
    }


    private void mostrarMayor(float [] numerosAsc){
        //Tarea 6, Imprime numero mayor de los ingresados
        JOptionPane.showMessageDialog(null,"El numero mayor de los datos ingresados es "+numerosAsc[numerosAsc.length-1]);
        this.mostrarMenor(numerosAsc);
    }

    private void mostrarMenor(float [] numerosAsc){
        //Tarea 7,Imprime numero menor de los ingresados
        JOptionPane.showMessageDialog(null,"El numero menor de los datos ingresados es "+ numerosAsc[0]);
        this.mostrarXMayores(numerosAsc);
    }

    private void mostrarXMayores(float [] numeros){
        //Tarea 8, Calcula los X mayores del arreglo
        int xMayores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los x mayores que desee obtener"));
        while(xMayores<=0 || xMayores>numeros.length){
            xMayores = Integer.parseInt(JOptionPane.showInputDialog("Los X mayores no pueden ser valores negativos o que excedan la cantidad de numeros ingresados. Intente de nuevo"));
        }
        String acum = "";
        for (int i = 0; i < xMayores; i++) {
            acum=acum+" "+numerosDes[i];
        }
        System.out.println("Los "+xMayores+" numeros mas grandes son = "+acum);
        acum="";
    }

    private void mostrarXMenores(){
        //Tarea 9, Calcula los X menores del arreglo
        int xMenores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los x menores que desee obtener"));
        String acum = "";
        while(xMenores<=0 || xMenores>numeros.length){
            xMenores = Integer.parseInt(JOptionPane.showInputDialog("Los X menores no pueden ser valores negativos o que excedan la cantidad de numeros ingresados. Intente de nuevo"));
        }
        for (int i = 0; i < xMenores; i++) {
            acum=acum+" "+numerosAsc[i];
        }
        System.out.println("Los "+xMenores+" numeros mas pequenios son = "+acum);
    }

    private void promedio(){
        //Tarea 10, Calcula el promedio
        for (int i = 0; i < numeros.length; i++) {
            sumar+=numeros[i];
        }
        promedio=sumar/numeros.length;
        JOptionPane.showMessageDialog(null,"El promedio de los numeros ingresados es = "+promedio);

    }

    private void desviacionEstandar(){
        //Tarea 11,Calcula Desviacion estandar de los datos
        for (int i = 0; i < numeros.length; i++) {
            suma=numeros[i]-promedio;
            sumatoria=(suma*suma)+sumatoria;
        }
        desviacionE=Math.sqrt(sumatoria/numeros.length);
        JOptionPane.showMessageDialog(null,"La desviacion estandar de los numeros ingresados es = "+desviacionE);

    }

    /*public void ordenarNumeros(){
        //Declaracion de variables
        int xMayores=0;
        int xMenores=0;
        double desviacionE;
        double sumatoria=0;
        float suma=0;
        float sumar=0;
        float promedio=0;
        String acum="";*/


















    }

