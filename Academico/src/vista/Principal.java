import javax.swing.*;

public class Principal {
    //Atributos
    private ManageStudents gestor;
    private String rutaDB;
    //Métodos
    public static void main(String [] args){
        new Principal();
    }

    public Principal() {
        this.menuPrincipal();
    }

    private void menuPrincipal(){
        int opcion=0;
        this.rutaDB = "./src/db.txt";
        this.gestor = new ManageStudents(rutaDB);
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al programa. Seleccione la opcion deseada escribiendo el numero que aparece junto a esta:\n" +
                    "1.Crear nuevo\n" +
                    "2.Buscar estudiante\n" +
                    "3.Ver todos\n" +
                    "4.Modificar estudiante\n" +
                    "5.Eliminar estudiante\n" +
                    "6.Estadistica\n" +
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

                case 6:
                    this.menuEstadistica();
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

    public void menuEstadistica(){
        int opcion=0;
        Estadistica pepito = new Estadistica();

        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al programa. Seleccione la opcion deseada escribiendo el numero que aparece junto a esta:\n" +
                    "1.Ordenado de menor a mayor\n" +
                    "2.Ordenado de mayor a menor\n" +
                    "3.Número mayor\n" +
                    "4.Número menor\n" +
                    "5.X mayores\n" +
                    "6.X menores\n" +
                    "7.Promedio de los datos\n" +
                    "8.Desviación estándar de los datos\n" +
                    "0. Finalizar programa"));
            switch(opcion){
                case 1:
                    pepito.ordenaMenMay();
                    break;
                case 2:
                    pepito.ordenaMayMen();
                    break;
                case 3:
                    pepito.muestraMay();
                    break;
                case 4:
                    pepito.muestraMen();
                    break;
                case 5:
                    pepito.xMay();
                    break;
                case 6:
                    pepito.xMen();
                    break;
                case 7:
                    pepito.promedio();
                    break;
                case 8:
                        pepito.desviacionEstandar();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Gracias por usar el programa");
                    break;
            }}
        while(opcion!=0);
    }
}
