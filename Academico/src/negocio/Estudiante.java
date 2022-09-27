import java.util.Arrays;

public class Estudiante {

    private String idEstudiante;
    private String nombres;
    private String apellidos;
    private String telefono;
    private float [] notas;
    private char genero;

    public Estudiante(String idEstudiante, String nombres, String apellidos, String telefono, float []notas, char genero) {
        this.idEstudiante = idEstudiante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.notas = notas;
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

    public float[] getNotaFinal() {
        return this.notas;
    }

    public void setNotaFinal(float[] notaFinal) {
        this.notas = notaFinal;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    private float obtenerDefinitiva(){
        float acumulador = 0;
        for (int i = 0; i < this.notas.length; i++) {
            if (i == 2){
                acumulador+= this.notas[i] * 0.4;
            } else {
                acumulador+= this.notas[i]*0.3;
            }
        }
        return acumulador;
    }

    @Override
    public String toString() {
        return   this.idEstudiante + '/' +
                 this.nombres + '/' +
                 this.apellidos + '/' +
                 this.telefono + '/' +
                 Arrays.toString(this.notas) + '/' +
                 this.genero;
    }



}
