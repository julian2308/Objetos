package nivel4;

import javax.swing.*;
import java.util.ArrayList;

public class Entrada {
    //Atributos
    private GestionEstudiantes gestor;
    //Métodos
    public static void main(String [] args){
        new Entrada();
    }

    public Entrada() {
        this.gestor = new GestionEstudiantes();
        this.menuPrincipal();
    }

    private void menuPrincipal(){
        int opcion=0;

        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al programa. Seleccione la opcion deseada escribiendo el numero que aparece junto a esta:\n" +
                    "1.Crear nuevo\n" +
                    "2.Buscar estudiante\n" +
                    "3.Ver todos\n" +
                    "4.Modificar estudiante\n" +
                    "5.Eliminar estudiante\n" +
                    "0.Salir"));
            switch(opcion){
                case 1:
                    gestor.nuevoEstudiante();
                    break;
                case 2:
                    gestor.buscarEstudiante();
                    break;

                case 3:
                    gestor.verTodosLosEstudiantes();
                    break;

                case 4:
                    this.menuModificaciones();
                    break;

                case 5:
                    gestor.eliminarEstudiante();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Gracias por usar el programa");
                    break;
            }}
        while(opcion!=0);
    }

    private void menuModificaciones(){
        int opcion=0;

        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al programa. Seleccione la opcion deseada escribiendo el numero que aparece junto a esta:\n" +
                    "1.Modificar id\n" +
                    "2.Modificar nombres\n" +
                    "3.Modificar apellidos\n" +
                    "4.Modificar teléfono\n" +
                    "5.Modificar nota final\n" +
                    "6.Modificar género\n" +
                    "0.Salir"));
            switch(opcion){
                case 1:
                    gestor.modificarId();
                    break;
                case 2:
                    gestor.modificarNombres();
                    break;

                case 3:
                    gestor.modificarApellidos();
                    break;

                case 4:
                    gestor.modificarTelefono();
                    break;

                case 5:
                    gestor.modificarNotaFinal();
                    break;

                case 6:
                    gestor.modificarGenero();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Gracias por usar el programa");
                    break;
            }}
        while(opcion!=0);

    }
}
