import java.util.Arrays;

public class Estudiante {

    private String idEstudiante;
    private String nombres;
    private String apellidos;
    private String telefono;
    private float nota;
    private char genero;

    public Estudiante(String idEstudiante, String nombres, String apellidos, String telefono, float nota, char genero) {
        this.idEstudiante = idEstudiante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.nota = nota;
        this.genero = genero;
    }

    public String getIdEstudiante() {
        return this.idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getNotaFinal() {
        return this.nota;
    }

    public void setNotaFinal(float notaFinal) {
        this.nota = notaFinal;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return   this.idEstudiante + '/' +
                 this.nombres + '/' +
                 this.apellidos + '/' +
                 this.telefono + '/' +
                 this.nota+ '/' +
                 this.genero;
    }



}
