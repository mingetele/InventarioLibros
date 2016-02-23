package inventariolibros;

import java.util.Scanner;

public class InventarioLibros {

    public static void main(String[] args) {

        int opcion, Cedula;
        String Nombre;
        Scanner lector = new Scanner(System.in);
        Libro Libro1 = new Libro();

        do {
            System.out.println("Que desea hacer: ");
            System.out.println("1. Gestion de Libros: ");
            System.out.println("2. Gestion de Prestamos: ");
            System.out.println("3. Salir. ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:

                    do {
                        System.out.println("1. Ingresar Libro. ");
                        System.out.println("2. Actualizar Libro. ");
                        System.out.println("3. Eliminar Libro. ");
                        System.out.println("4. Buscar Libro. ");
                        System.out.println("5. Salir. ");
                        opcion = lector.nextInt();

                        switch (opcion) {
                            case 1:
                                Libro1.INGRESO();

                                break;
                            case 2:
                                Libro1.ACTUALIZAR();
                                break;
                            case 3:
                                Libro1.ELIMINAR();
                                break;
                            case 4:
                                System.out.println("Digite el nombre del libro:");
                                Nombre = lector.nextLine();
                                break;
                        }

                    } while (opcion != 5);

                    break;

                case 2:
                    System.out.println("Digite la cedula del usuario: ");
                    Cedula = lector.nextInt();
                    do {

                        System.out.println("Que desea hacer: ");
                        System.out.println("1. Prestar Libro. ");
                        System.out.println("2. Devolver un Libro. ");
                        System.out.println("3. Consultar libros prestados. ");
                        System.out.println("4. Salir. ");
                        opcion = lector.nextInt();

                        switch (opcion) {
                            case 1:
                                Libro1.PRESTAR();

                                break;
                            case 2:
                                Libro1.DEVOLVER();
                                break;
                            case 3:
                                Libro1.CONSULTAR();
                                break;

                        }

                    } while (opcion != 4);
                    break;

            }

        } while (opcion != 3);

    }

}
