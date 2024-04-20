import Articulo.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();
    public static void main(String[] args) {
        Menu();
    }

    private static void Menu() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                mostrarOpciones();
                int opcion = sc.nextInt();
                if (opcion == 5) {
                    System.out.println("Hasta la proxima!");
                    break;
                }
                switch (opcion){
                    case 1:
                        anadirArticulo();
                        break;
                    case 2:
                        modificarArticulo();
                        break;
                    case 3:
                        mostrarArticulo();
                        break;
                    case 4:
                        mostrarLista(listaArticulos);
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese una opcion válida");
                sc.nextLine();
            }
        }
    }

    private static void mostrarArticulo() {
        Articulo art;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id");
        int id = sc.nextInt();
        art = buscarArticulo(id);
        System.out.println("Nombre: "+ art.getNombre());
        System.out.println("Modelo: "+art.getModelo());
        System.out.println("Precio: "+art.ObtenerPrecio());
        art.ObtenerDescripcion();

    }

    private static void mostrarLista(ArrayList<Articulo> listaArticulos) {
        for (int i = 0; i < listaArticulos.size(); i++){
            System.out.println("Id: "+ listaArticulos.get(i).getId());
            System.out.println("Nombre: "+listaArticulos.get(i).getNombre());
            System.out.println("Modelo: "+listaArticulos.get(i).getModelo());
            System.out.println("Precio: "+listaArticulos.get(i).ObtenerPrecio());
            listaArticulos.get(i).ObtenerDescripcion();
            System.out.println("----------------------------");

        }
    }

    private static void modificarArticulo() {
        Articulo art;
        Scanner sc = new Scanner(System.in);
        System.out.println("Se modificaran unicamente datos generales del articulo (si el articulo es telefono siempre sera telefono)");
        System.out.println("Ingrese el id: ");
        int id = sc.nextInt();
        sc.nextLine();
        art = buscarArticulo(id);
        System.out.println("Nombre: ");
        art.setNombre(sc.nextLine());
        System.out.println("Modelo: ");
        art.setModelo(sc.nextLine());
        System.out.println("Precio :");
        art.setPrecio(sc.nextFloat());
        System.out.println("Se ha modificado el articulo");
    }

    private static Articulo buscarArticulo(int id) {
        for(int i = 0; i < listaArticulos.size();i++){
            if (listaArticulos.get(i).getId() == id){
                return listaArticulos.get(i);
            }
        }
        return null;
    }

    private static void anadirArticulo() {
        Articulo art;
        int id;
        String nombre;
        String modelo;
        float precio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Id del articulo: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre del articulo: ");
        nombre = sc.nextLine();
        System.out.println("Modelo: ");
        modelo = sc.nextLine();
        System.out.println("Precio: ");
        precio = sc.nextFloat();
        switch (tipoArticulo()){
            case 1:
                System.out.println("Memoria: ");
                int memoria = sc.nextInt();
                System.out.println("Megapixeles de la camara: ");
                int pixeles = sc.nextInt();
                art = new Telefono(id,nombre,modelo,precio,memoria,pixeles);
                listaArticulos.add(art);
                break;
            case 2:
                System.out.println("Memoria Ram: ");
                int memoriaRam = sc.nextInt();
                sc.nextLine();
                System.out.println("Sistema operativo : ");
                String sistemaOperativo = sc.nextLine();
                art = new Laptop(id,nombre,modelo,precio,memoriaRam,sistemaOperativo);
                listaArticulos.add(art);
                break;

        }



    }

    private static int tipoArticulo() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Que tipo de articulo es:\n 1.Telefono \n 2. Laptop ");
                int opcion = sc.nextInt();
                if(opcion >=1 && opcion <=2){
                    return opcion;
                }
            }catch (InputMismatchException e) {
                System.out.println("Ingrese opcion valida");
                sc.nextLine();
            }
        }
    }

    private static void mostrarOpciones() {
        System.out.println("------------------");
        System.out.println("Bienvenido que desea hacer: \n 1.Añadir Articulo \n 2. Modificar Articulo (se modificara todo el articulo) \n 3.Ver articulo \n 4.Ver lista \n 5. Salir");
    }

}
