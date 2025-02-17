package servicios;

import java.util.Scanner;
import controladores.*;

public class MenuImplementacion implements MenuInterfaz {
	public void mostrarMenu() {
		System.out.println("---------------------");
		System.out.println("Menu Principal");
		System.out.println("Seleccione una opcion");
		System.out.println("1.- Version empleado");
		System.out.println("2.- Version cliente");
		System.out.println("3.- Cerrar aplicacion");
		System.out.println("---------------------");
	}
	public int pedirOpcionUsuario(Scanner sc) {
		int opcionMenuPrincipal;
		opcionMenuPrincipal = sc.nextInt();
		return opcionMenuPrincipal;
	}
	

}
