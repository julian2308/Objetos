package nivel4;

import javax.swing.*;
import java.util.ArrayList;

public class GestionEstudiantes {

    private ArrayList<Estudiante> misEstudiantes;

    public GestionEstudiantes() {
        this.misEstudiantes = new ArrayList();
    }

    public void nuevoEstudiante(){
        String id, name, lastN, phone;
        float grade;
        char gender;

        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        name = JOptionPane.showInputDialog("Digite los nombres del estudiante: ");
        lastN = JOptionPane.showInputDialog("Digite los apellidos del estudiante: ");
        phone = JOptionPane.showInputDialog("Digite el teléfono del estudiante: ");

        //Validar
        grade = Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del estudiante: "));
        gender = JOptionPane.showInputDialog("Digite el género del estudiante: ").charAt(0);

        Estudiante stud = new Estudiante(id, name, lastN, phone, grade, gender);
        this.misEstudiantes.add(stud);
        JOptionPane.showMessageDialog(null, "El estudiante con id " + id + " fue creado con éxito");

    }

    public void buscarEstudiante(){

        String id;
        boolean existe = false;
        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        for(Estudiante stud: this.misEstudiantes){
            if(stud.getIdEstudiante().equals(id)) {
                System.out.println(stud);
                existe = true;
                break;
            }
        }

        if (!existe){
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");

        }

    }



    public void verTodosLosEstudiantes(){
        for(Estudiante stud: this.misEstudiantes){
            System.out.println(stud);
        }

    }

    public void eliminarEstudiante(){
        String id;
        boolean existe = false;
        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        for(Estudiante stud: this.misEstudiantes){
            if(stud.getIdEstudiante().equals(id)){
                this.misEstudiantes.remove(stud);
                existe = true;
                JOptionPane.showMessageDialog(null, "El estudiante con id " + id + " fue eliminado con éxito");
                break;
            }

        }

        if (!existe){
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");

        }

    }

    public void modificarId() {
        String id, nuevoDato;
        boolean existe = false;


        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        for (Estudiante stud : this.misEstudiantes) {
            if (stud.getIdEstudiante().equals(id)) {

                //Validar
                nuevoDato = JOptionPane.showInputDialog("Digite el nuevo código: ");
                stud.setIdEstudiante(nuevoDato);
                existe = true;
                JOptionPane.showMessageDialog(null, "El id fue actualizado con éxito");
                break;
            }

        }

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }

    }

    public void modificarNombres(){

        String id, nuevoDato;
        boolean existe = false;


        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        for(Estudiante stud: this.misEstudiantes){
            if(stud.getIdEstudiante().equals(id)){

                //Validar
                nuevoDato = JOptionPane.showInputDialog("Digite el nuevo nombre: ");
                stud.setNombres(nuevoDato);
                JOptionPane.showMessageDialog(null, "El nombre fue actualizado con éxito");
                existe = true;
                break;
            }

        }

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }

    }

    public void modificarApellidos(){
        String id, nuevoDato;
        boolean existe = false;


        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        for(Estudiante stud: this.misEstudiantes){
            if(stud.getIdEstudiante().equals(id)){

                //Validar
                nuevoDato = JOptionPane.showInputDialog("Digite el nuevo apellido: ");
                stud.setApellidos(nuevoDato);
                JOptionPane.showMessageDialog(null, "El apellido fue actualizado con éxito");
                existe = true;
                break;
            }

        }

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }

    }

    public void modificarTelefono(){
        String id, nuevoDato;
        boolean existe = false;


        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        for(Estudiante stud: this.misEstudiantes){
            if(stud.getIdEstudiante().equals(id)){

                //Validar
                nuevoDato = JOptionPane.showInputDialog("Digite el nuevo teléfono: ");
                stud.setTelefono(nuevoDato);
                JOptionPane.showMessageDialog(null, "El teléfono fue actualizado con éxito");
                existe = true;
                break;
            }

        }

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }


    }


    public void modificarNotaFinal(){
        String id;
        float nuevoDato;
        boolean existe = false;


        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        for(Estudiante stud: this.misEstudiantes){
            if(stud.getIdEstudiante().equals(id)){

                //Validar
                nuevoDato = Float.parseFloat(JOptionPane.showInputDialog("Digite la nueva nota: "));
                stud.setNotaFinal(nuevoDato);
                JOptionPane.showMessageDialog(null, "La nota fue actualizada con éxito");
                existe = true;
                break;
            }

        }

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }

    }

    public void modificarGenero(){
        String id, nuevoDato;
        boolean existe = false;


        id = JOptionPane.showInputDialog("Digite el código del estudiante: ");
        for(Estudiante stud: this.misEstudiantes){
            if(stud.getIdEstudiante().equals(id)){

                //Validar
                nuevoDato = JOptionPane.showInputDialog("Digite el nuevo género del estudiante: ");
                stud.setGenero(nuevoDato.charAt(0));
                JOptionPane.showMessageDialog(null, "El género fue actualizado con éxito");
                existe = true;
                break;
            }

        }

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Ese código no existe!!!");
        }


    }

    private boolean existeCodigo(String codigo){
        boolean existe = false;
        for(Estudiante stud: this.misEstudiantes){
            if (stud.getIdEstudiante().equals(codigo)){
                existe = true;
                break;
            }
        }

        return existe;

    }
}
