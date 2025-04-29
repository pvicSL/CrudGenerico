package negocio;

import java.util.List;

import javabean.Location;

public interface ILocationDao extends ICrudGenerico<Location, Integer>{
	
	//Métodos indicados en el enunciado:
	
		//Buscar por ciudad, que recibe el String del nombre de la ciudad.
		List<Location> buscarPorCity(String city);
		
		//Buscar por código postal, que recibe el String del código.
		List<Location> buscarPorPostalCode(String postalCode);
		
		//Buscar por país que recibe el String del identificador del páis.
		List<Location> buscarPorPais(String countryId);

}
