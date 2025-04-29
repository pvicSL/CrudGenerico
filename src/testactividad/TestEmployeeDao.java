package testactividad;

import javabean.Employee;
import negocio.EmployeeDaoImplList;
import negocio.IEmployeeDao;

public class TestEmployeeDao {

	public static void main(String[] args) {
			
		IEmployeeDao iEmployeeDao = new EmployeeDaoImplList();
		

		//LISTAS DE EMPLEADOS POR DEPARTAMENTO
		System.out.println("-----PRUEBAS DEL MÉTODO porDepartamento-----");
		
		System.out.println("\nLISTA DE EMPLEADOS DEPARTAMENTO: FINANCIERO\n");
		for(Employee ele: iEmployeeDao.porDepartamento(10)) {
			System.out.println(ele);
		}
		
		System.out.println("\nLISTA DE EMPLEADOS DEPARTAMENTO: VENTAS\n");
		for(Employee ele: iEmployeeDao.porDepartamento(20)) {
			System.out.println(ele);
		}
		
		System.out.println("\nLISTA DE EMPLEADOS DEPARTAMENTO: IT\n");
		for(Employee ele: iEmployeeDao.porDepartamento(30)) {
			System.out.println(ele);
		}
		
		System.out.println("\nLISTA DE EMPLEADOS DEPARTAMENTO: AT. AL CLIENTE\n");
		for(Employee ele: iEmployeeDao.porDepartamento(40)) {
			System.out.println(ele);
		}
		
		System.out.println("\nLISTA DE EMPLEADOS DEPARTAMENTO: RR. HH.\n");
		for(Employee ele: iEmployeeDao.porDepartamento(50)) {
			System.out.println(ele);
		}
		
		System.out.println("\nLISTA DE EMPLEADOS DEPARTAMENTO: LOGÍSTICA\n");
		for(Employee ele: iEmployeeDao.porDepartamento(60)) {
			System.out.println(ele);
		}
		System.out.println("\n");
		
		
		
		//LISTAS DE EMPLEADOS POR PUESTO DE TRABAJO
		System.out.println("\n-----PRUEBAS DEL MÉTODO porTrabajo-----");
		 
		System.out.println("\nEMPLEADOS EN PUESTO - PROGRAMADOR\n");
		for(Employee ele: iEmployeeDao.porTrabajo("IT_PROG")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - PROGRAMADOR JUNIOR\n");
		for(Employee ele: iEmployeeDao.porTrabajo("IT_JUNIORPROG")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - JEFE PROYECTO\n");
		for(Employee ele: iEmployeeDao.porTrabajo("JF_PROY")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - CONTABLE\n");
		for(Employee ele: iEmployeeDao.porTrabajo("AD_CONTA")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - PRESIDENTE\n");
		for(Employee ele: iEmployeeDao.porTrabajo("AD_PRESS")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - VICEPRESIDENTE\n");
		for(Employee ele: iEmployeeDao.porTrabajo("AD_VICE")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - REPR. VENTAS\n");
		for(Employee ele: iEmployeeDao.porTrabajo("V_REPR")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - JEFE DE VENTAS\n");
		for(Employee ele: iEmployeeDao.porTrabajo("JF_VENT")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - AT. AL CLIENTE\n");
		for(Employee ele: iEmployeeDao.porTrabajo("AT_CLIENTE")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - RESP. RR. HH.\n");
		for(Employee ele: iEmployeeDao.porTrabajo("JF_RH")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - TÉCNICO RR. HH.\n");
		for(Employee ele: iEmployeeDao.porTrabajo("OP_RH")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - RESP. LOGÍSITCA\n");
		for(Employee ele: iEmployeeDao.porTrabajo("JF_LG")) {
			System.out.println(ele);
		}
		
		System.out.println("\nEMPLEADOS EN PUESTO - RESP. CADENA\n");
		for(Employee ele: iEmployeeDao.porTrabajo("LG_CADENA")) {
			System.out.println(ele);
		}

		
		//PRUEBAS DEL MÉTODO calcularMasaSalarial
		System.out.println("\n-----PRUEBA DEL MÉTODO DE CÁLCULO DE MASA SALARIAL (COMPLEMENTOS INCL.)-----");
		System.out.println("Masa salarial de la plantilla completa: " + iEmployeeDao.calcularMasaSalarial() + " €.");
		System.out.println("\n");
		
		
		//PRUEBAS DEL MÉTODO masaSalarioPorDep
		System.out.println("\n-----PRUEBA DEL CÁLCULO DE MASA SALARIAL POR DEPARTAMENTO (COMPLEMENTOS INCL.)-----");
		
		System.out.println("Salarios del dep. finaciero: " + iEmployeeDao.masaSalarialPorDep(10) + " €.\n");
		
		System.out.println("Salarios del dep. de ventas: " + iEmployeeDao.masaSalarialPorDep(20) + " €.\n");
		
		System.out.println("Salarios del dep. de it: " + iEmployeeDao.masaSalarialPorDep(30) + " €.\n");
		
		System.out.println("Salarios del dep. de at. al cliente: " + iEmployeeDao.masaSalarialPorDep(40) + " €.\n");
		
		System.out.println("Salarios del dep. de RR. HH.: " + iEmployeeDao.masaSalarialPorDep(50) + " €.\n");
		
		System.out.println("Salarios del dep. de logística: " + iEmployeeDao.masaSalarialPorDep(60) + " €.\n");
		
		
		System.out.println("\nComprobación de cálculos: esta cifra y la masa salarial completa deben coincidir:");
		System.out.println(iEmployeeDao.masaSalarialPorDep(10) + iEmployeeDao.masaSalarialPorDep(20) 
							+ iEmployeeDao.masaSalarialPorDep(30) + iEmployeeDao.masaSalarialPorDep(40) 
							+ iEmployeeDao.masaSalarialPorDep(50) + iEmployeeDao.masaSalarialPorDep(60));
		
		
		//PRUEBA DEL MÉTODO fueraSalario
		System.out.println("\n-----PRUEBA DEL MÉTODO FUERA SALARIO-----");
		System.out.println("Empleados esperados en la lista:");
		System.out.println("JOSE LUIS | BELLA | LANA | MONICA | NINA | CASSANDRA | MATEO | MARTINA | ANTIA | KEVIN | BUSTIN\n");
		for(Employee ele: iEmployeeDao.fueraSalario()) {
			System.out.println(ele);
		}
		

	}

}
