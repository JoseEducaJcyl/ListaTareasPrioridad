import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos un scanner
        Scanner sc = new Scanner(System.in);
        //Declaramos una lista de Strings cmo 'tareas'
        ArrayList<String> tareas = new ArrayList<>();
        //Declaramos un boolean para controlar el bucle
        boolean bandera = false;
        //Declaramos un while que hara de bucle mientras elijamos opciones en el menu
        while(!bandera){
            //Un menu con varias opciones sobre la lista
            System.out.println("MENU");
            System.out.println("1. Añadir tarea al final");
            System.out.println("2. Insertar una tarea en una posicion");
            System.out.println("3. Eliminar una tarea en una posicion");
            System.out.println("4. Mostrar tareas");
            System.out.println("0. Salir");
            System.out.println("Ingresa una opcion que desea realizar:");
            //Le pedimos al usuario introducir una opcion
            int opcion = sc.nextInt();
            sc.nextLine();
            //A traves de un switch, se diferencian las opciones
            switch(opcion){
                //Opcion 1, introduce una tarea en la lista
                case 1:
                    System.out.println("Introduce la tarea");
                    String tarea = sc.nextLine();
                    tareas.add(tarea);
                    break;
                //Opcion 2, introduce una tarea y la posicion donde quiere que este
                //no hara nada si introduce una posicion invalida
                case 2:
                    System.out.println("Introduce la tarea");
                    String nuevaTarea = sc.nextLine();
                    System.out.println("Introduce la posicion");
                    int posicion = sc.nextInt();

                    if (posicion >= 0 && posicion <= tareas.size()) {
                        tareas.add(posicion, nuevaTarea);
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                //Opcion 3, elimina una tarea por la posicion introducida
                //no hara nada si introduce una posicion invalida
                case 3:
                    System.out.print("Introduce la posición de la tarea eliminar: ");
                    int posEliminar = sc.nextInt();

                    if (posEliminar >= 0 && posEliminar < tareas.size()) {
                        tareas.remove(posEliminar);
                    } else {
                        System.out.println("Posición inválida.");
                    }
                    break;
                //Opcion 4, muestra la lista de tarea, enumeradas
                case 4:
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas.");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println(i + ". " + tareas.get(i));
                        }
                    }
                    break;
                //Opcion 0, sale del menu y termina el bucle
                case 0:
                    bandera = true;
                    System.out.println("Saliendo...");
                    break;
                //Opcion por defecto si el usuario elija un numero fuera del rango del menu
                //indicandole que la opcion no es valida
                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}