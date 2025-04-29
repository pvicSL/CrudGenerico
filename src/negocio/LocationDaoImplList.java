package negocio;

import java.util.ArrayList;
import java.util.List;

import javabean.Location;

public class LocationDaoImplList implements ILocationDao {
	
	private List<Location> lista;
	
	private ICountryDao iCountryDao;
	
	
	public LocationDaoImplList() {
		lista = new ArrayList<Location>();
		iCountryDao = new CountryDaoImplList();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Location(1500, "pez 3", "28008", "Madrid", "Madrid", iCountryDao.findById("ES")));
		lista.add(new Location(1600, "nuez 3", "28016", "Madrid", "Madrid", iCountryDao.findById("ES")));
		lista.add(new Location(1700, "rosa 34", "19002", "Guadalajara", "Guadalajara", iCountryDao.findById("ES")));
		
		
		//Añadidos objetos adicionales conforme al enunciado de la actividad ACT:
		lista.add(new Location(1810, "Antonio Gaudi, 28", "24008", "León", "León", iCountryDao.findById("ES")));
		lista.add(new Location(1910, "Camino de Valdespino", "24292", "ValverdeEnrique", "León", iCountryDao.findById("ES")));
		lista.add(new Location(2010, "Egia, 12", "20012", "Donostia", "Gipuzkoa", iCountryDao.findById("ES")));
		
		lista.add(new Location(2110, "Kasseler Str, 10-30", "01069", "Desdre", "Sajonia", iCountryDao.findById("AL")));
		lista.add(new Location(2200, "KAlbersdorfer Str, 50", "04249", "Leipzig", "Sajonia", iCountryDao.findById("AL")));
		
		lista.add(new Location(2300, "Rue d'Epernay, 7", "33700", "Burdeos", "Gironda", iCountryDao.findById("FR")));
		lista.add(new Location(2400, "Prom. Sancert, 1", "82200", "Moissac", "Garona", iCountryDao.findById("FR")));
		
	}

	@Override
	public Location findById(Integer atributoPk) {
		for (Location ele: lista) {
			if (ele.getLocationId() == atributoPk)
				return ele;
		}
		
		return null;
	}

	@Override
	public int insertOne(Location objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Location objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer atributoPk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteObj(Location objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Location> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

	
	//Métodos introducidos según el enunciado de la actividad 4:
	
	//Búsqueda de la ubicación por String de ciudad.
	@Override
	public List<Location> buscarPorCity(String city) {
		List<Location> aux = new ArrayList<Location>();
		
		for (Location ele: lista) {
			 if (ele.getCity().equals(city))
				 aux.add(ele);
		}
		return aux;
	}
	
	//Búsqueda de ubicación por String del código postal.
	@Override
	public List<Location> buscarPorPostalCode(String postalCode) {
		List<Location> aux = new ArrayList<Location>();
		
		for (Location ele: lista) {
			if (ele.getPostalCode().equals(postalCode)) {
				aux.add(ele);
			} 
		}
		return aux;
	}

	//Búsqueda de ubicación por String de id del país.
	@Override
	public List<Location> buscarPorPais(String countryId) {
	List<Location> aux = new ArrayList<Location>();
		
		for (Location ele: lista) {
			if (ele.getCountry().getCountryId() == countryId)
				aux.add(ele);
		}
		return aux;
	}

}
