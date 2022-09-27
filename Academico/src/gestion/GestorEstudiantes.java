package gestion;

import negocio.Estudiante;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;


public class GestorEstudiantes {

    private ArrayList<Estudiante> misEstudiantes;
    private String ruta;

    public GestorEstudiantes(String ruta) {
        this.misEstudiantes = new ArrayList();
        this.ruta = ruta;
    }

    private float capturaNota(int corte){

        float nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota del estudiante correspondiente al corte "+ corte));

        while(nota <= 0 || nota > 5){
            nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese una nota entre 0 y 5 para que se válida"));
        }

        return nota;

    }
    public void nuevoEstudiante(){
        String id, name, lastN, phone;
        float [] grades;
        char gender;

        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        while (existeCodigo(id)){
            id =JOptionPane.showInputDialog(null, "Ese código ya existe, ingrese uno nuevo");
        }



        name = JOptionPane.showInputDialog("Digite los nombres del estudiante: ");
        lastN = JOptionPane.showInputDialog("Digite los apellidos del estudiante: ");
        phone = JOptionPane.showInputDialog("Digite el teléfono del estudiante: ");

        grades = this.obtenerNotas();

        gender = JOptionPane.showInputDialog("Digite el género del estudiante: ").charAt(0);
        while (gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f'){
            gender = JOptionPane.showInputDialog("Digite un valor adecuado: ").charAt(0);

        }

        Estudiante stud = new Estudiante(id, name, lastN, phone, grades, gender);
        this.guardarEstudiante(stud);
        JOptionPane.showMessageDialog(null, "El estudiante con id " + id + " fue creado con éxito");

    }


    private float[] obtenerNotas (){
        float [] nuevasNotas = new float[3];
        for (int i = 0; i < 3; i++) {
            nuevasNotas[i] = this.capturaNota(i+1);
        }

        return nuevasNotas;
    }
    public void buscarEstudiante(){

        String id;
        Estudiante stud;
        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        stud = this.devolverEstudiante(id);

        if (stud != null){
            System.out.println(stud.toString());
        } else{
            JOptionPane.showMessageDialog(null, "Ese estudiante no existe");
        }

    }



    public void verTodosLosEstudiantes(){
        ArrayList<Estudiante> estudiantes = this.obtenerEstudiantes();
        for (Estudiante stud: estudiantes) {
            System.out.println(stud.toString());
        }


    }

    public void eliminarEstudiante(){
        String id = JOptionPane.showInputDialog(null, "Digite el código del estudiante");
        Estudiante estudiante = this.devolverEstudiante(id);
        ArrayList<Estudiante> estudiantes;

        if (estudiante != null){
            estudiantes = this.obtenerEstudiantes();
            for (Estudiante estud: estudiantes) {
                if(estud.getIdEstudiante().equals(estudiante.getIdEstudiante())){
                    estudiantes.remove(estud);
                    this.reemplazarArchivo(estudiantes);
                    JOptionPane.showMessageDialog(null, "El estudiante fue eliminado");
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe un estudiante con ese id");
        }

    }

    //Modificar atributos

    public void modificarId() {
        ArrayList<Estudiante> estudiantes;
        Estudiante existente;
        String nuevoDato;
        Estudiante estudiante;
        String id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        estudiante = devolverEstudiante(id);

        boolean existe = existeCodigo(id);

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }
        if (estudiante != null){
            estudiantes = this.obtenerEstudiantes();
            for (Estudiante stud: estudiantes){
                if (stud.getIdEstudiante().equals(estudiante.getIdEstudiante())){
                    do {
                        nuevoDato = JOptionPane.showInputDialog(null, "Ingrese el nuevo código");
                        existente = this.devolverEstudiante(nuevoDato);
                    }while(existente != null);
                    stud.setIdEstudiante(nuevoDato);
                    this.reemplazarArchivo(estudiantes);
                    JOptionPane.showMessageDialog(null, "El estudiante ha sido modificado con éxito");
                }
            }
        }


    }

    public void modificarNombres(){

        String id, nuevoDato;
        ArrayList<Estudiante> estudiantes;
        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        Estudiante estudiante = this.devolverEstudiante(id);

        boolean existe = existeCodigo(id);
        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }

        if (estudiante != null){
            estudiantes = this.obtenerEstudiantes();
            for (Estudiante stud: estudiantes){
                if (stud.getIdEstudiante().equals(estudiante.getIdEstudiante())){
                    nuevoDato = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre");
                    stud.setNombres(nuevoDato);
                    this.reemplazarArchivo(estudiantes);
                    JOptionPane.showMessageDialog(null, "El estudiante ha sido modificado con éxito");
                }
            }
        }
    }

    public void modificarApellidos(){
        String id, nuevoDato;
        ArrayList<Estudiante> estudiantes;
        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        Estudiante estudiante = this.devolverEstudiante(id);

        boolean existe = existeCodigo(id);
        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }

        if (estudiante != null){
            estudiantes = this.obtenerEstudiantes();
            for (Estudiante stud: estudiantes){
                if (stud.getIdEstudiante().equals(estudiante.getIdEstudiante())){
                    nuevoDato = JOptionPane.showInputDialog(null, "Ingrese el nuevo apellido");
                    stud.setApellidos(nuevoDato);
                    this.reemplazarArchivo(estudiantes);
                    JOptionPane.showMessageDialog(null, "El estudiante ha sido modificado con éxito");
                }
            }
        }
    }

    public void modificarTelefono(){
        String id, nuevoDato;
        ArrayList<Estudiante> estudiantes;
        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        Estudiante estudiante = this.devolverEstudiante(id);

        boolean existe = existeCodigo(id);
        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }

        if (estudiante != null){
            estudiantes = this.obtenerEstudiantes();
            for (Estudiante stud: estudiantes){
                if (stud.getIdEstudiante().equals(estudiante.getIdEstudiante())){
                    nuevoDato = JOptionPane.showInputDialog(null, "Ingrese el nuevo teléfono");
                    stud.setTelefono(nuevoDato);
                    this.reemplazarArchivo(estudiantes);
                    JOptionPane.showMessageDialog(null, "El estudiante ha sido modificado con éxito");
                }
            }
        }

    }

    public void modificarNotaFinal(){
        String id;
        float [] nuevasNotas;
        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        boolean existe = existeCodigo(id);
        for(Estudiante stud: this.misEstudiantes){
            if(stud.getIdEstudiante().equals(id)){
                nuevasNotas = this.obtenerNotas();
                stud.setNotaFinal(nuevasNotas);
                JOptionPane.showMessageDialog(null, "La nota fue actualizada con éxito");
                break;
            }

        }

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }

    }

    public void modificarGenero(){
        String id, nuevoDato;


        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        boolean existe = existeCodigo(id);
        for(Estudiante stud: this.misEstudiantes){
            if(stud.getIdEstudiante().equals(id)){
                nuevoDato = JOptionPane.showInputDialog("Digite el nuevo género del estudiante: ");
                stud.setGenero(nuevoDato.charAt(0));
                JOptionPane.showMessageDialog(null, "El género fue actualizado con éxito");
                break;
            }

        }

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }


    }

    private void guardarEstudiante(Estudiante estud){
        try{
            File archivo = new File(this.ruta);
            FileWriter wr = new FileWriter(archivo, true);
            PrintWriter pw = new PrintWriter(wr);
            pw.println(estud.toString());
            pw.close();
        }

        catch(IOException ex){
            System.out.println("No se pudo cargar el estudiante. Intente de nuevo");
        }
    }

    private Estudiante devolverEstudiante(String code){
        Estudiante stud = null;
        FileReader archivo;
        BufferedReader br;
        String registro;
        try{
            archivo = new FileReader(this.ruta);
            br = new BufferedReader(archivo);
            while((registro = br.readLine()) != null){
                String[] campos = registro.split("/");
                String[] notas = campos[4].split(",");
                float[] notasNuevas = new float[3];
                notasNuevas[0] = Float.parseFloat(notas[0].substring(1,4));
                notasNuevas[1] = Float.parseFloat(notas[1].substring(1,4));
                notasNuevas[2] = Float.parseFloat(notas[2].substring(1,4));
                if(campos[0].equals(code)){
                    stud = new Estudiante(campos[0], campos[1], campos[2], campos[3], notasNuevas, campos[5].charAt(0));
                    break;
                }
            }
        }

        catch(IOException ex){
            System.out.println("Fallo busqueda estudiante...");
        }
        return stud;
    }

    private ArrayList<Estudiante> obtenerEstudiantes(){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Estudiante stud;
        FileReader archivo;
        BufferedReader br;
        String lineas;
        try{
            archivo = new FileReader(this.ruta);
            br = new BufferedReader(archivo);
            while((lineas = br.readLine()) != null){
                String[] campos = lineas.split("/");
                String[] notas = campos[4].split(",");
                float[] notasNuevas = new float[3];
                notasNuevas[0] = Float.parseFloat(notas[0].substring(1,4));
                notasNuevas[1] = Float.parseFloat(notas[1].substring(1,4));
                notasNuevas[2] = Float.parseFloat(notas[2].substring(1,4));
                stud = new Estudiante(campos[0], campos[1], campos[2], campos[3], notasNuevas, campos[5].charAt(0));
                estudiantes.add(stud);
            }
        }

        catch(IOException ex){
            System.out.println("Fallo busqueda estudiante...");
        }

        return estudiantes;
    }

    private boolean existeCodigo(String codigo){
        boolean existe = false;
        FileReader archivo;
        BufferedReader buffer;
        String registro;
        try{
            archivo = new FileReader(this.ruta);
            buffer = new BufferedReader(archivo);
            while((registro = buffer.readLine()) != null){
                String[] campos = registro.split("/");
                if(campos[0].equals(codigo)){
                    existe = true;
                }
            }
        }

        catch(IOException ex){
            System.out.println("Fallo busqueda estudiante...");
        }

        return existe;



    }

    private void reemplazarArchivo(ArrayList<Estudiante> student){
        try{
            File archivo = new File(this.ruta);
            FileWriter writer = new FileWriter(archivo, false);
            PrintWriter pw = new PrintWriter(writer);
            for(Estudiante stud: student){
                pw.println(stud.toString());
            }
            pw.close();
        }

        catch(IOException ex) {
            System.out.println("No se puede reemplazar el archivo...");
        }
    }
}
