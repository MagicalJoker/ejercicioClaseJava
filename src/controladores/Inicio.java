package controladores;

import java.util.ArrayList;
import java.util.Scanner;
import servicios.*;
import dtos.*;

public class Inicio {

	public static ArrayList<ClienteDto> clientes = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MenuInterfaz interfaz = new MenuImplementacion();
		MenuEmpleadoInterfaz interfazEmpleado = new MenuEmpleadoImplementacion();
		MenuClienteInterfaz interfazCliente = new MenuClienteImplementacion();
		ClienteInterfaz clienteInterfaz = new ClienteImplementacion();
		
		boolean esCerrado = false;
		boolean esMenuEmpleadoCerrado = false;
		boolean esMenuClienteCerrado = false;
		
		
		int opcionMenuPrincipal;
		int opcionMenuEmpleado;
		int opcionMenuCliente;
		

		while (!esCerrado) {
			interfaz.mostrarMenu();
			opcionMenuPrincipal = interfaz.pedirOpcionUsuario(sc);

		
			switch (opcionMenuPrincipal) {
			//-----------------------------------------------------------------	
			case 1: {
				System.out.println("Ha seleccionado la version empleado");
				sc.nextLine(); //Limpiar buffer
				while (!esMenuEmpleadoCerrado) {
					interfazEmpleado.mostrarMenuEmpleado();
					opcionMenuEmpleado = interfazEmpleado.opcionMenuEmpleado(sc);
					
					switch (opcionMenuEmpleado) {
					case 1: {
						System.out.println("Ha entrado en la opción Validar Cliente");
						break;
					}
					
					case 2: {
						System.out.println("Ha entrado en la opción Borrar Cliente");
						break;
					}
					
					case 3: {
						System.out.println("Ha entrado en la opcion Mostrar Cliente");
						break;
					}
					
					case 4: {
						System.out.println("Volviendo al menu Principal");
						esMenuEmpleadoCerrado = true;
						sc.nextLine();
						break;
					}
					default:
						System.out.println("Error. Elige una opcion valida");
						break;
					}
				}
				
				break;
				
			}
			//-----------------------------------------------------------------			
			case 2: {
				System.out.println("Ha seleccionado la version cliente");
				//sc.nextLine(); //Limpiar buffer
				while (!esMenuClienteCerrado ) {
					interfazCliente.mostrarMenuCliente();
					opcionMenuCliente = interfazCliente.opcionMenuCliente(sc);
					
				switch (opcionMenuCliente) {
				case 1: {
					System.out.println("Ha entrado en la opción registro cliente");
					clienteInterfaz.nuevoCliente();
					break;
				}
				
				case 2: {
					System.out.println("Ha entrado en la opción acceso cliente");
					break;
				}
				
				case 3: {
					System.out.println("Volviendo al menu principal...");
					esMenuClienteCerrado = true;
					//sc.nextLine();
					break;
				}
				default:
					System.out.println("Error. Introduce una opcion valida");
					break;	
					}
				
				}
				break;
			}
			//-----------------------------------------------------------------				
			case 3: {
				System.out.println("Ha seleccionado salir de la aplicacion");
				esCerrado = true;
				break;
			}
			default:
				System.out.println("Error. Seleccione una opcion ente las ofrecidas.");
			}
			
		}
		sc.close();
	}




}
