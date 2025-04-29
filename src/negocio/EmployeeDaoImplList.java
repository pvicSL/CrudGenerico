package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javabean.Employee;

public class EmployeeDaoImplList implements IEmployeeDao{
	
	private List<Employee> lista;
	private IDepartmentDao iDepartmentDao;
	private IJobDao  iJobDao;
	
	public EmployeeDaoImplList() {
		lista = new ArrayList<Employee>();
		iDepartmentDao = new DepartmentDaoImplList();
		iJobDao = new JobDaoImplList();
		
		cargarDatos();
		
		
	}
	
	private void cargarDatos() {
		lista.add(new Employee(114, "Esteban", "Raphaelly", "est@fp.com", "678678678", LocalDate.of(1996, 7, 7),
								iJobDao.findById("IT_PROG"), 35000, 0.2,  iDepartmentDao.findById(30)));
		
		lista.add(new  Employee(115, "Ana", "Koo", "ana@fp.com", "678678678", LocalDate.of(1996, 7, 7), 
				iJobDao.findById("IT_PROG"), 35000, 0.2,  iDepartmentDao.findById(30)));
		
		lista.add(new  Employee(116, "carlos", "Colmenares", "carlos@fp.com", "678678678", LocalDate.of(1996, 7, 7), 
				iJobDao.findById("AD_PRESS"), 135000, 0.2,  iDepartmentDao.findById(20)));
		
		lista.add(new  Employee(131, "Jose Luis", "Palomo", "jlp@fp.com", "666525253", LocalDate.of(1990, 6, 5), 
				iJobDao.findById("IT_PROG"), 450000, 0.2,  iDepartmentDao.findById(20)));
		
		
		//Creación de empleados adicionales para la ACT4:
		
		lista.add(new  Employee(201, "Mortimer", "Meier", "meierh@fp.com", "655656565", LocalDate.of(2001, 9, 3), 
				iJobDao.findById("JF_PROY"), 95000, 0.2,  iDepartmentDao.findById(30)));
		
		
		lista.add(new  Employee(201, "Bella", "Goth", "bgoth@fp.com", "555489201", LocalDate.of(2000, 8, 3), 
				iJobDao.findById("JF_VENT"), 85000, 0.3,  iDepartmentDao.findById(20)));
		
		lista.add(new  Employee(222, "Linda", "Laandgrab", "lgraab@fp.com", "666580213", LocalDate.of(1999, 5, 2), 
				iJobDao.findById("V_REPR"), 38000, 0.0,  iDepartmentDao.findById(20)));
		
		lista.add(new  Employee(223, "Lana", "Banana", "lbanana@fp.com", "651850264", LocalDate.of(1992, 5, 7), 
				iJobDao.findById("V_REPR"), 110000, 0.1,  iDepartmentDao.findById(20)));
		
		
		lista.add(new  Employee(224, "Gunter", "Nervioso", "gnervios@fp.com", "458620159", LocalDate.of(1994, 6, 6), 
				iJobDao.findById("IT_JUNIORPROG"), 19000, 0.1,  iDepartmentDao.findById(30)));
		
		lista.add(new  Employee(226, "Monica", "Tequista", "mtequis@fp.com", "491358074", LocalDate.of(1998, 8, 16), 
				iJobDao.findById("IT_JUNIORPROG"), 185000, 0.1,  iDepartmentDao.findById(30)));
		
		
		lista.add(new  Employee(228, "Nina", "Caliente", "ncali@fp.com", "2795020202", LocalDate.of(2000, 6, 6), 
				iJobDao.findById("AD_VICE"), 256000, 0.1,  iDepartmentDao.findById(20)));
		
		lista.add(new  Employee(230, "Cassandra", "Lapida", "clapida@fp.com", "6540287952", LocalDate.of(2001, 6, 6), 
				iJobDao.findById("AD_CONTA"), 256000, 0.1,  iDepartmentDao.findById(10)));
		
		lista.add(new  Employee(231, "Mateo", "Antunez", "mantunez@fp.com", "648502231", LocalDate.of(2001, 6, 6), 
				iJobDao.findById("AD_CONTA"), 42000, 0.1,  iDepartmentDao.findById(10)));
		
		lista.add(new  Employee(232, "Martina", "Ladina", "mladina@fp.com", "6540287952", LocalDate.of(2001, 6, 6), 
				iJobDao.findById("AD_CONTA"), 25600, 0.1,  iDepartmentDao.findById(10)));
		
		
		lista.add(new  Employee(240, "Antia", "Ricardez", "aricard@fp.com", "152036888", LocalDate.of(2003, 5, 6), 
				iJobDao.findById("AT_CLIENTE"), 40000, 0.1,  iDepartmentDao.findById(40)));
		
		lista.add(new  Employee(250, "Desoderio", "Armenterios", "darment@fp.com", "454545222", LocalDate.of(1992, 9, 6), 
				iJobDao.findById("AT_CLIENTE"), 22000, 0.1,  iDepartmentDao.findById(40)));
		
		
		lista.add(new  Employee(260, "Ambrosio", "Barroso", "abarroso@fp.com", "000222321", LocalDate.of(2005, 9, 6), 
				iJobDao.findById("JF_RH"), 65000, 0.0,  iDepartmentDao.findById(50)));
		
		lista.add(new  Employee(261, "Kevin", "Calvo", "kcalvo@fp.com", "654852103", LocalDate.of(1993, 2, 6), 
				iJobDao.findById("OP_RH"), 12000, 0.0,  iDepartmentDao.findById(50)));
		
		lista.add(new  Employee(262, "Higinio", "Borno", "hbono@fp.com", "459852013", LocalDate.of(1996, 2, 2), 
				iJobDao.findById("OP_RH"), 29000, 0.0,  iDepartmentDao.findById(50)));
		
		
		lista.add(new  Employee(270, "Paulo", "Ventura", "pventura@fp.com", "4546454641", LocalDate.of(2002, 1, 1), 
				iJobDao.findById("JF_LG"), 42000, 0.0,  iDepartmentDao.findById(60)));
		
		lista.add(new  Employee(272, "Bustin", "Sinclair", "bsincair@fp.com", "02030506985", LocalDate.of(1985, 2, 2), 
				iJobDao.findById("LG_CADENA"), 22000, 0.0,  iDepartmentDao.findById(60)));
		
		lista.add(new  Employee(270, "Quinto", "Meridio", "qmeridio@fp.com", "452016845", LocalDate.of(2003, 7, 7), 
				iJobDao.findById("LG_CADENA"), 34000, 0.0,  iDepartmentDao.findById(60)));
		 
	}


	@Override
	public Employee findById(Integer atributoPk) {
		for (Employee ele: lista) {
			if (ele.getEmployeeId() == atributoPk)
				return ele;
		}
		
		return null;
	}

	@Override
	public int insertOne(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer atributoPk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteObj(Employee objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

	
	//IMPLEMENTACIÓN DE MÉTODOS DE LA ACTIVIDAD 4:
	
	//Empleados según departamento, introduciendo el int que lo identifica.
	@Override
	public List<Employee> porDepartamento(int departmentId) {
		
		List<Employee> aux = new ArrayList<Employee>();
		
		for (Employee employee: lista) {
			if (employee.getDepartment().getDepartmentId() == departmentId)
				aux.add(employee);
		}
		return aux;
	}
	
	//Empleados por puesto de trabajo, introduciendo el String correspondiente.
	@Override
	public List<Employee> porTrabajo(String jobId) {
		
		List<Employee> aux = new ArrayList<Employee>();
		
		for (Employee employee: lista) {
			if (employee.getJob().getJobId() == jobId)
				aux.add(employee);
		}
		return aux;
	}
	
	
	//Cálculo del total de salarios de la empresa, con sus complementos incluidos.
	@Override
	public double calcularMasaSalarial() {
		
		double sumaSalarios=0;
	
		for (Employee employee: lista) {
			sumaSalarios+=employee.getSalary() + (employee.getSalary()*employee.getCommissionPct());
		}
		
		return sumaSalarios;
	}
	

	//Cálculo del total de salarios (con complementos) del departamento indicado.
	@Override
	public double masaSalarialPorDep(int departmentId) {
		
		double sumaSalDep=0;
		
		for (Employee employee: lista) {
			if (employee.getDepartment().getDepartmentId() == departmentId)
			sumaSalDep+=employee.getSalary() + (employee.getSalary()*employee.getCommissionPct());
		}
		
		return sumaSalDep;
	}

	
	//Lista de empleados cuyo salario queda fuera de los umbrales mínimo y máximo.
	@Override
	public List<Employee> fueraSalario() {
		
		List<Employee> aux = new ArrayList<Employee>();
		
		for(Employee employee: lista) {
			if (employee.getSalary() > employee.getJob().getMaxSalary() | employee.getSalary() < employee.getJob().getMinSalary()) {
				aux.add(employee);
			}
		}
		return aux;
	}

}
