package principales;

import java.util.Scanner;

public class GestionClientes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    int opcion = 0;
	    do {
	        System.out.println("1. Alta del Cliente");
	        System.out.println("2. Buscar un Cliente");
	        System.out.println("3. Mostrar Todos");
	        System.out.println("4. Eliminar un cliente");
	        System.out.println("5. Salir");
	        System.out.println("Escriba una opcion: ");
	        opcion = entrada.nextInt();
	        switch (opcion) {
	            case 1:
	                // C�digo para dar de alta un cliente
	                break;
	            case 2:
	                // C�digo para buscar un cliente
	                break;
	            case 3:
	                // C�digo para mostrar todos los clientes
	                break;
	            case 4:
	                // C�digo para eliminar un cliente
	                break;
	            case 5:
	                System.out.println("Saliendo del programa...");
	                break;
	            default:
	                System.out.println("Opci�n inv�lida. Intente de nuevo.");
	                break;
	        }
	    } while (opcion != 5);

	}

}
