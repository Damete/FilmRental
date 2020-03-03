package Code;

import javax.persistence.*;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import net.bytebuddy.matcher.FailSafeMatcher;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
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
						System.out.println("Que desea crear ? \n 1- Cliente \n 2- Actor \n 3- Categoria \n 4- Pelicula \n 5- Rental \n 6- Payment \n 7- Volver al men� principal");
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
						System.out.println("Que desea modificar ? \n 1- Cliente \n 2- Actor \n 3- Categoria \n 4- Pelicula \n 5- Rental \n 6- Payment \n 7- Volver al men� principal");
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
						System.out.println("Que desea eliminar ? \n 1- Cliente \n 2- Actor \n 3- Categoria \n 4- Pelicula \n 5- Rental \n 6- Payment \n 7- Volver al men� principal");
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
	
	private static void listLastSeenActors() {  // Igual que en la anterior
		String jpql = "";
		Query query = em.createQuery(jpql);

		List<Object> lista = query.getResultList();

		for(Object algo : lista){
			System.out.println(algo);
		}
	}

	private static void listByDate() { // Igual que en la anterior
		String jpql = "";
		Query query = em.createQuery(jpql);

		List<Object> lista = query.getResultList();

		for(Object byDate : lista){
			System.out.println(byDate);
		}
	}

	private static void showIncome() { // Igual que en la anterior
		String jpql = "";
		Query query = em.createQuery(jpql);

		List<Object> lista = query.getResultList();

		for(Object income: lista){
			System.out.println(income);
		}
	}

	private static void listByCategory() { // Igual que en la anterior
		String jpql = "";
		Query query = em.createQuery(jpql);

		List<Category> categoryList = query.getResultList();

		for(Category c : categoryList){
			System.out.println(c);
		}
	}

	private static void listByActor() { // Igual que la anterior
		String jpql = "";
		Query query = em.createQuery(jpql);

		List<Actor> actorList = query.getResultList();

		for(Actor a : actorList){
			System.out.println(a);
		}
	}

	private static void listByClient() { // Solo los saca por pantalla, hacer algo más (no se el que XD) y poner la query que sin ella poca cosa saldrá
		String jpql = "";
		Query query = em.createQuery(jpql);

		List<Customer> customerList = query.getResultList();

		for(Customer c : customerList){
			System.out.println(c);
		}
	}

	private static void deletePayment() {
		Scanner sc = new Scanner(System.in);
		boolean iterate = true;

		System.out.println("Introduzca el ID del pago");
		String id  = sc.nextLine();

		Payment p = em.getReference(Payment.class, id);
		em.remove(p);
	}

	private static void deleteRental() {
		Scanner sc = new Scanner(System.in);
		boolean iterate = true;

		System.out.println("Introduzca el ID del alquiler");
		String id  = sc.nextLine();

		Rental r = em.getReference(Rental.class, id);
		em.remove(r);
	}

	private static void deleteMovie() {
		Scanner sc = new Scanner(System.in);
		boolean iterate = true;

		System.out.println("Introduzca el ID de la pelicula");
		String id  = sc.nextLine();

		Film f = em.getReference(Film.class, id);
		em.remove(f);
	}

	private static void deleteCategory() {
		Scanner sc = new Scanner(System.in);
		boolean iterate = true;

		System.out.println("Introduzca el ID de la categoria");
		String id  = sc.nextLine();

		Category c = em.getReference(Category.class, id);
		em.remove(c);		
	}

	private static void deleteActor() {
		Scanner sc = new Scanner(System.in);
		boolean iterate = true;

		System.out.println("Introduzca el ID del actor");
		String id  = sc.nextLine();

		Actor a = em.getReference(Actor.class, id);
		em.remove(a);		
	}

	private static void deleteClient() {
		Scanner sc = new Scanner(System.in);
		boolean iterate = true;

		System.out.println("Introduzca el ID del cliente");
		String id  = sc.nextLine();

		Customer c = em.getReference(Customer.class, id);
		em.remove(c);
		
	}

	private static void modifyPayment() {
		Scanner sc = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);
		boolean iterate = true;

		System.out.println("Introduzca el ID del pago");
		String id = sc.nextLine();

		Payment p = em.find(Payment.class, id);

		while(iterate){
			System.out.println("Que quiere modificar del pago? \n 1- Cantidad \n 2- Fecha del pago \n 3- Salir");
			String respuesta = sc.nextLine();

			switch(respuesta){
				case"1":
				System.out.println("Introduzca la cantidad del pago");
				Double cantidad = numeros.nextDouble();
				p.setAmount(cantidad);
				break;

				case"2":
				String pattern = "dd-MM-yyy";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				String date = simpleDateFormat.format(sc.nextLine());
				Date f = new Date(date);
				p.setPayment_date(f);
				break;

				case"3":
				iterate = false;
				break;

				default:
				System.out.println("Opción incorrecta");
			}
		}
	}

	private static void modifyRental() {
		Scanner sc = new Scanner(System.in);
		boolean iterate = true;
		String pattern = "dd-MM-yyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		System.out.println("introduzca el ID del alquiler");
		String id = sc.nextLine();

		Rental r = em.find(Rental.class, id);

		while(iterate){
			System.out.println("Que quiere modificar del alquiler? \n 1- Fecha del alquiler \n 2- Fecha de devolución \n 3- Salir");
			String respuesta = sc.nextLine();

			switch(respuesta){
				case"1":				
				String date = simpleDateFormat.format(sc.nextLine());
				r.setRental_date(date);
				break;

				case"2":
				String date2 = simpleDateFormat.format(sc.nextLine());
				r.setReturn_date(date2);
				break;

				case"3":
				iterate = false;
				break;

				default:
				System.out.println("Opción incorrecta");
			}

			em.persist(r);
		}
		
	}

	private static void modifyMovie() {
		Scanner sc = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);
		boolean iterate = true;

		System.out.println("Introduzca el ID de la pelicula");
		String id = sc.nextLine();

		Film f = em.find(Film.class, id);


		while(iterate){
			System.out.println("Que quiere modificar de la pelicula? \n 1- Titulo \n 2- Descripción \n 3- Año de publicación \n 4- Idioma \n 5- Duración del alquiler \n 6- Fecha del alquiler \n 7- Duración \n 8- Cose de reemplazo \n 9- Salir");
			String respuesta = sc.nextLine();

			switch(respuesta){
				case"1":
				System.out.println("Introduzca el titulo de la pelicula");
				String name = sc.nextLine();
				f.setTitle(name);
				break;

				case"2":
				System.out.println("Introduzca la descripción de la pelicula");
				String desc = sc.nextLine();
				f.setDescription(desc);
				break;

				case"3":
				System.out.println("Introduzca el año en el que salió la pelicula");
				int año = numeros.nextInt();
				f.setRelease_year(año);
				break;

				case"4":
				System.out.println("Introduzca el idioma de la pelicula");
				String idioma = sc.nextLine();
				f.setLanguage(idioma);
				break;

				case"5":
				System.out.println("Duración del alquiler en días");
				int dias = numeros.nextInt();
				f.setRental_duration(dias);
				break;

				case"6":
				System.out.println("Fecha del alquiler");
				int dias2 = numeros.nextInt();
				f.setRental_duration(dias2);
				break;

				case"7":
				System.out.println("introduzca la duración de la pelicula");
				Double duracion = numeros.nextDouble();
				f.setLength(duracion);
				break;

				case"8":
				System.out.println("Introduzca el coste de reposición de la pelicula");
				Double coste = numeros.nextDouble();
				f.setReplacement_cost(coste);
				break;

				case"9":
				iterate = false;
				break;

				default:
				System.out.println("Opcion incorrecta");
			}
			em.persist(f);
		}
	}

	private static void modifyCategory() {
		Scanner sc = new Scanner(System.in);
		boolean iterate = true;

		System.out.println("Introduzca el ID de la categoria");
		String id = sc.nextLine();

		Category ca = em.find(Category.class, id);

		while(iterate){
			System.out.println("Que quiere modificar de la categoria \n 1- Nombre \n 2- Salir");
			
			switch(respuesta){
				case"1":
					System.out.println("Introduzca el nombre de la categoria");
					String name = sc.nextLine();
					ca.setName(name);
				break;

				case"2":
				iterate = false;
				break;

				default:
				System.out.println("Opcion incorrecta");
				break;
			}

			em.persist(ca);
		}
		
	}

	private static void modifyActor() {
		Scanner sc = new Scanner(System.in);
		boolean iterate = true;

		System.out.println("Introduzca el ID del Actor que quiera modificar");
		String id = sc.nextLine();

		Actor a = em.find(Actor.class, id);

		while(iterate){
			System.out.println("Que quire modificar del actor \n 1- Nombre \n 2- Apellido\n 3- Salir");
			String respuesta = sc.nextLine();

			switch(respuesta){
				case"1":
					System.out.println("Introduzca el nombre del Actor");
					String name = sc.nextLine();
					a.setFirst_name(name);
				break;

				case"2":
					System.out.println("Introduzca el apellido del actor");
					String apellido = sc.nextLine();
					a.setLast_name(apellido);
				break;

				case"3":
				iterate = false;
				break;

				default:
				System.out.println("Opcion incorrecta");
				break;
			}
		
			em.persist(a);
			System.out.println("Actor modificado");
		}
		
		
		System.out.println("Introduzca el nombre del Actor");
		String name = sc.nextLine();
		a.setFirst_name(name);
		
		System.out.println("Introduzca el apellido del actor");
		String apellido = sc.nextLine();
		a.setLast_name(apellido);
		em.persist(a);
	}

	private static void modifyCustomer() { 
		sc = new Scanner(System.in);
		boolean iterate = true;

		System.out.println("introduzca el ID del cliente que quiere modificar");
		String id = sc.nextLine();

		Customer c = em.find(Customer.class, id);

		System.out.println("Que quiere modificar del cliente? \n 1- Nombre \n 2- Apellido \n 3- Estado \n 4- Fecha de creación \n 5- Salir");
		String respuesta = sc.nextLine();

		while(iterate){
			switch(respuesta){
				case"1":
				System.out.println("Introduzca el nombre del cliente");
				String name = sc.nextLine();
				c.setFirst_name(name);
				break;

				case"2":
				System.out.println("Introduzca el apellido del cliente");
				String last_name = sc.nextLine();
				c.setLast_name(last_name);
				break;
				
				case"3":
				System.out.println("El usuario está activo?");
				String estado = sc.nextLine();
				if(estado.contains("Si") || estado.contains("si")){
					c.setActive(true);
				}
				else{
					c.setActive(false);
				}
				break;

				case"4":
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");		 
				LocalDate today = LocalDate.now();		 
				String formated = formatter.format(today);
				c.setCreation_date(formated);
				break;

				case"5":
				iterate = false;
				break;

				default:
				System.out.println("Opcion incorrecta");
				break;
			}	
		}

		em.persist(c);

		System.out.println("Cliente modificado");
	}

	private static void createPayment() {
		Payment p = new Payment();
		Scanner sc = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);

		System.out.println("Introduzca la cantidad del pago");
		Double cantidad = numeros.nextDouble();
		p.setAmount(cantidad);

		System.out.println("Introduzca la fecha en la que se ha realizado el pago");
		String pattern = "dd-MM-yyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(sc.nextLine());
		Date f = new Date(date);
		p.setPayment_date(f);
	}

	private static void createRental() {
		Rental r = new Rental();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la fecha en la que se ha alquilado la pelicula");
		String pattern = "dd-MM-yyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(sc.nextLine());
		r.setRental_date(date);

		System.out.println("Introduzca la fecha en la que se tienen que devolver la pelicula");
		String fechaDevolver = simpleDateFormat.format(sc.nextLine());
		r.setReturn_date(fechaDevolver);

		em.persist(r);		
	}

	private static void createMovie() {
		Film f = new Film();
		Scanner sc = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);

		System.out.println("Introduzca el titulo de la pelicula");
		String name = sc.nextLine();
		f.setTitle(name);


		System.out.println("Introduzca la descripción de la pelicula");
		String desc = sc.nextLine();
		f.setDescription(desc);

		System.out.println("Introduzca el año en el que salió la pelicula");
		int año = numeros.nextInt();
		f.setRelease_year(año);

		System.out.println("Introduzca el idioma de la pelicula");
		String idioma = sc.nextLine();
		f.setLanguage(idioma);

		System.out.println("Duración del alquiler en días");
		int dias = numeros.nextInt();
		f.setRental_duration(dias);

		System.out.println("Introduzca el precio del alquiler");
		int rental = numeros.nextInt();
		f.setRental_rate(rental);

		System.out.println("introduzca la duración de la pelicula");
		Double duracion = numeros.nextDouble();
		f.setLength(duracion);

		System.out.println("Introduzca el coste de reposición de la pelicula");
		Double coste = numeros.nextDouble();
		f.setReplacement_cost(coste);

		System.out.println("Introduzca la valoración de la pelicula");
		Double rating = numeros.nextDouble();
		f.setRating(rating);

		em.persist(f);

		System.out.println("La pelicula se ha creado con exito");
		
	}

	private static void createCategory() {
		Category c = new Category();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre de la categoria");
		String name = sc.nextLine();
		c.setName(name);
		em.persist(c);
	}

	private static void createActor() {
		Actor a = new Actor();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del Actor");
		String name = sc.nextLine();
		a.setFirst_name(name);
		
		System.out.println("Introduzca el apellido del actor");
		String apellido = sc.nextLine();
		a.setLast_name(apellido);
		em.persist(a);
		
	}

	private static void createCustomer() {
		sc = new Scanner(System.in);
		
		System.out.println("Introduzca el nombre del cliente");
		String name = sc.nextLine();
		Customer c = new Customer();
		System.out.println("Introduzca el apellido del cliente");
		String last_name = sc.nextLine();	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");		 
		LocalDate today = LocalDate.now();		 
		String formated = formatter.format(today);
		
		c.setFirst_name(name);
		c.setLast_name(last_name);
		c.setActive(true);
		c.setCreation_date(formated);
		em.persist(c);
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