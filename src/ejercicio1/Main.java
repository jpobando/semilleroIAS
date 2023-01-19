package ejercicio1;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String opcion;
        Cliente[] clientesArray = new Cliente[4];

        clientesArray[0] = new Cliente("Juan Diego", 2222);
        clientesArray[1] = new Cliente("Johan", 1111);
        clientesArray[2] = new Cliente("Pedro", 4444);
        clientesArray[3] = new Cliente("Juan Pablo", 5555);


        // Se válida que el usuario haya realizado una entrada correcta
        do  {
            Scanner sc=new Scanner(System.in);
            System.out.println("----------------------------");
            System.out.println("------------MENÚ------------");
            System.out.println("a. Añadir un nuevo cliente \n" +
                    "b. Borrar un cliente \n" +
                    "c. Buscar un cliente \n" +
                    "d. Mostrar cliente \n" +
                    "e. Salir \n" +
                    "----------------------------\n" +
                    "Seleccione una opción: "
            );
            opcion = sc.nextLine();

            switch (opcion) {

                // Caso a: agregar un nuevo cliente al array
                case "a":
                    if( clientesArray.length == 10){
                        System.out.println("Debe borrar un cliente antes de poder ingresar uno nuevo.");
                        break;
                    }
                    System.out.println("Ingrese el nombre del cliente");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese la cédula del cliente");
                    int cedula = Integer.parseInt(sc.nextLine());

                    // se sobreescribe el array de clientes con el método Array.copyOf() el cual hace una copia del
                    // array original, el nuevo puede tener mas posiciones que el original y los elementos de más se
                    // asignan como ceros.
                    clientesArray = Arrays.copyOf(clientesArray, clientesArray.length + 1);

                    // En la última posición donde hay un cero, se instancia un cliente con los datos ingresados por
                    //el usuario
                    clientesArray[clientesArray.length - 1] = new Cliente(nombre, cedula);

                    //print para verificar
                    for (int i = 0; i < clientesArray.length; i++) {
                        System.out.println(clientesArray[i].getNombre() + "\t");
                        System.out.println(clientesArray[i].getCedula() + "\t");
                    }

                    break;

                case "b":
                    System.out.println("Ingrese el número de la posición que desea borrar");
                    int pos = Integer.parseInt(sc.nextLine());

//                    if (pos > clientesArray.length - 1){
//                        System.out.println("La posición ingresada no existe");
//                        break;
//                    }

                    Cliente[] clientesArrayCopia = Arrays.copyOf(clientesArray, 0, )



                    for (int i = 0; i < clientesArrayCopia.length; i++) {
                        System.out.print(clientesArrayCopia[i] + " ");
                    }
                    break;


//                case "c":
//                    break;
//
//                case "d":
//                    break;
//
//                case "e":
//                    break;

            }

        } while (!opcion.equals("e"));
        //System.out.println("La opción escogida fue la " + opcion);



    }


}
