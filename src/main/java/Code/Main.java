package Code;

import javax.persistence.*;
import java.util.Scanner;

public class Main {
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static Scanner sc = new Scanner(System.in);
	
	public static void begin(){
		emf = Persistence.createEntityManagerFactory("FilmRental1");
		em = emf.createEntityManager();
		em.getTransaction().begin();
	}
	
	public static void menu() {
		System.out.println("Hola \n 1- Crear \n 2- Modificar \n 3- Eliminar \n 4- Mostrar \n 5- Salir");
		String answer = sc.nextLine();
		Boolean mp = true;
		
			while(mp) {
				switch(answer) {
				case "1":					
					Boolean mu = true;
					
					while(mu) {
						System.out.println("Que desea crear ? \n 1- Cliente \n 2- Actor \n 3- Categoria \n 4- Pelicula \n 5- Rental \n 6- Payment \n 7- Volver al menú principal");
						String respuesta = sc.nextLine();
						
						switch(respuesta) {
							case"1":
								createCustomer();
								break;
							
							case"2":
								createActor();
								break;
								
							case"3":
								createCategory();
								break;
								
							case"4":
								createMovie();
								break;
								
							case"5":
								createRental();
								break;
							
							case"6":
								createPayment();
								break;
								
							case"7":
								mu = false;
								break;
								
							default:
								System.out.println("Opcion incorrecta");
						}
					}
					break;
					
				case "2":
					Boolean ms = true;
					
					while(ms) {
						System.out.println("Que desea modificar ? \n 1- Cliente \n 2- Actor \n 3- Categoria \n 4- Pelicula \n 5- Rental \n 6- Payment \n 7- Volver al menú principal");
						String respuesta = sc.nextLine();
						
						switch(respuesta) {
							case"1":
								modifyCustomer();
								break;
								
							case"2":
								modifyActor();
								break;
								
							case"3":
								modifyCategory();
								break;
								
							case"4":
								modifyMovie();
								break;
								
							case"5":
								modifyRental();
								break;
							
							case"6":
								modifyPayment();
								break;
								
							case"7":
								ms = false;
								
							default:
								System.out.println("Valor introducido incorrecto");
						}
					}
					break;
					
				case "3":
					Boolean mt = true;
					
					while(mt) {
						System.out.println("Que desea eliminar ? \n 1- Cliente \n 2- Actor \n 3- Categoria \n 4- Pelicula \n 5- Rental \n 6- Payment \n 7- Volver al menú principal");
						String respuesta = sc.nextLine();
						
						switch(respuesta) {
							case"1":
								deleteClient();
								break;
								
							case"2":
								deleteActor();
								break;
								
							case"3":
								deleteCategory();
								break;
								
							case"4":
								deleteMovie();
								break;
								
							case"5":
								deleteRental();
								break;
								
							case"6":
								deletePayment();
								break;
							
							case"7":
								mt = false;
								break;
								
							default:
								System.out.println("Incorrecto");
						}
					}
					break;
					
				case "4":
					Boolean mc = true;
					
					while(mc) {
						System.out.println("Que desea ver ? \n" +
						"1- Listado de los articulos alquilados por un cliente \n" + 
						"2- Listado de peliculas segun nombre de actor \n " +
						"3- Listado de peliculas segun categoria \n " +
						"4- Listado de ingresos \n " +
						"5- Listado de productos alquilados en unas fechas determinadas \n" +
						"6- Listado de actores de la ultima pelicula alquilada por un cliente concreto");
						
						String respuesta = sc.nextLine();

						switch(respuesta) {
							case"1":
								listByClient();
								break;
								
							case"2":
								listByActor();
								break;
							
							case"3":
								listByCategory();
								break;
								
							case"4":
								showIncome();
								break;
								
							case"5":
								listByDate();
								break;
								
							case"6":
								listLastSeenActors();
								break;
								
							case"7":
								mc = false;
								break;
							
							default:
								System.out.println("Va a ser que no colega");
						}
					}
					break;
					
				case "5":
					mp = false;
					break;
				
				default:
					System.out.println("La opcion introducida es invalida");
			}
		}	
	}
	
	private static void listLastSeenActors() {
		// TODO Auto-generated method stub
		
	}

	private static void listByDate() {
		// TODO Auto-generated method stub
		
	}

	private static void showIncome() {
		// TODO Auto-generated method stub
		
	}

	private static void listByCategory() {
		// TODO Auto-generated method stub
		
	}

	private static void listByActor() {
		// TODO Auto-generated method stub
		
	}

	private static void listByClient() {
		// TODO Auto-generated method stub
		
	}

	private static void deletePayment() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteRental() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteMovie() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteCategory() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteActor() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteClient() {
		// TODO Auto-generated method stub
		
	}

	private static void modifyPayment() {
		// TODO Auto-generated method stub
		
	}

	private static void modifyRental() {
		// TODO Auto-generated method stub
		
	}

	private static void modifyMovie() {
		// TODO Auto-generated method stub
		
	}

	private static void modifyCategory() {
		// TODO Auto-generated method stub
		
	}

	private static void modifyActor() {
		// TODO Auto-generated method stub
		
	}

	private static void modifyCustomer() {
		// TODO Auto-generated method stub
		
	}

	private static void createPayment() {
		// TODO Auto-generated method stub
		
	}

	private static void createRental() {
		// TODO Auto-generated method stub
		
	}

	private static void createMovie() {
		// TODO Auto-generated method stub
		
	}

	private static void createCategory() {
		// TODO Auto-generated method stub
		
	}

	private static void createActor() {
		// TODO Auto-generated method stub
		
	}

	private static void createCustomer() {
		// TODO Auto-generated method stub
		
	}

	public static void end() {
		em.getTransaction().commit();
		em.close();
		emf.close();
		sc.close();
	}
	
	public static void main(String [] args) {
		begin();
		
		menu();
		
		end();
	}
}