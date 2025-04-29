package testactividad;

import javabean.Location;
import negocio.ILocationDao;
import negocio.LocationDaoImplList;

public class TestLocationDao {

	public static void main(String[] args) {
		ILocationDao iLocationDao = new LocationDaoImplList();
	

		//Pruebas de método de búsqueda por nombre de ciudad:
		System.out.println("-----PRUEBAS DEL MÉTODO buscarPorCiudad-----");
		
		System.out.println("\nBúsqueda por ciudad - dato introducido: Moissac");
		System.out.println(iLocationDao.buscarPorCity("Moissac"));
		
		System.out.println("\nBúsqueda por ciudad - dato introducido: Donostia");
		System.out.println(iLocationDao.buscarPorCity("Donostia"));
		
		System.out.println("\nBúsqueda por ciudad - dato introducido: Dresde");
		System.out.println(iLocationDao.buscarPorCity("Desdre"));
		
		System.out.println("\nBúsqueda por ciudad - dato introducido: León");
		System.out.println(iLocationDao.buscarPorCity("León"));
		
		System.out.println("\nBúsqueda por ciudad - dato introducido: Barcelona (NO EXISTE - debe salir vacío)");
		System.out.println(iLocationDao.buscarPorCity("Barcelona"));
		
		
		//Pruebas de método de búsqueda por código postal:
		System.out.println("\n-----PRUEBAS DEL MÉTODO buscarPorCodigPostal-----");
		System.out.println("\nBúsqueda de ubicación por CODIGO POSTAL: CP de ValverdeEnrique");
		System.out.println(iLocationDao.buscarPorPostalCode("24292"));
		
		System.out.println("\nBúsqueda de ubicación por CODIGO POSTAL: CP de Donostia");
		System.out.println(iLocationDao.buscarPorPostalCode("20012"));
		
		System.out.println("\nBúsqueda de ubicación por CODIGO POSTAL: CP de Burdeos");
		System.out.println(iLocationDao.buscarPorPostalCode("33700"));
		
		System.out.println("\nBúsqueda de ubicación por CODIGO POSTAL: INEXISTENTES - 15408 y 24710 (debe salir vacío)\n");
		System.out.println(iLocationDao.buscarPorPostalCode("15408"));
		System.out.println(iLocationDao.buscarPorPostalCode("24710"));
		
		
		//Prueba de método de búsqueda por id de País:
		System.out.println("\n-----PRUEBAS DEL MÉTODO buscarPorPais-----");
		
			System.out.println("\nUbicaciones en España:\n");
			for(Location ele: iLocationDao.buscarPorPais("ES")) {
			System.out.println(ele);
			}
		
			System.out.println("\nUbicaciones en Francia:\n");
			for(Location ele: iLocationDao.buscarPorPais("FR")) {
				System.out.println(ele);
			}
			
			System.out.println("\nUbicaciones en Alemania:\n");
			for(Location ele: iLocationDao.buscarPorPais("AL")) {
				System.out.println(ele);
			}
		
			System.out.println("\nUbicaciones en país Portugal (no existente - la lista debe aparecer vacía):\n");
			for(Location ele: iLocationDao.buscarPorPais("PT")) {
				System.out.println(ele);
			}
			
			System.out.println("\nUbicaciones en país Italia (no existente - la lista debe aparecer vacía):\n");
			for(Location ele: iLocationDao.buscarPorPais("IT")) {
				System.out.println(ele);
			}

	}


}
