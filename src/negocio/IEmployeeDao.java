package negocio;

import java.util.List;

import javabean.Employee;

public interface IEmployeeDao extends ICrudGenerico<Employee, Integer>{
		
	//Se añaden los métodos indicados en el enunciado:
	
		//Lista de empleados por departamento, recibe un int que identifica al departamento.
		List<Employee> porDepartamento(int departmentId);
		
		//Lista de empleados según el puesto, que recibe el string del nombre del puesto.
		List<Employee> porTrabajo(String jobId);
		
		//Cálculo de la suma de los salarios de todos los empleados, que devuelve un double con la cantidad.
		double calcularMasaSalarial();
		
		//Cáculo de la suma de salarios de un solo departamento, que devuelve un double con la cantidad.
		double masaSalarialPorDep(int departmentId);
		
		//lista de empleados que quedan fuera de los umbrales de salario establecidos, es decir,
		//por encima de maxSalary o por debajo de minSalary.
		List<Employee> fueraSalario();
		
}
