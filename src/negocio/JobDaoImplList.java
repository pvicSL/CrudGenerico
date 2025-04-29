package negocio;

import java.util.ArrayList;
import java.util.List;

import javabean.Job;

public class JobDaoImplList implements IJobDao{
	
	private List<Job> lista;
	
	public JobDaoImplList() {
		lista = new ArrayList<Job>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Job("IT_PROG","Programador", 20000,38000));
		lista.add(new Job("JF_PROY","Jefe de Proyecto", 38000,98000));
		lista.add(new Job("AD_PRESS","Presidente", 120000,380000));
		
		//Creación de puestos adicionales para la ACT4:
		lista.add(new Job("AD_CONTA","Administrativo Contable", 32000,41000));
		
		lista.add(new Job("V_REPR","Representante Ventas", 30000,45000));
		lista.add(new Job("JF_VENT","Jefe de Ventas", 36000,50000));
		
		lista.add(new Job("IT_JUNIORPROG","Programador Junior", 16000,20000));
		lista.add(new Job("AD_VICE","Vicepresidente", 100000,250000));
		
		lista.add(new Job("AT_CLIENTE","Asesor de Clientes", 20000,30000));
		
		lista.add(new Job("JF_RH","Resp. RR.HH.", 65000,70000));
		lista.add(new Job("OP_RH","Técnico de RR.HH.", 25000,35000));
		
		lista.add(new Job("JF_LG","Resp. Logística", 38000,110000));
		lista.add(new Job("LG_CADENA","Responsable de Cadena", 28000,38000));
		
	}

	@Override
	public Job findById(String atributoPk) {
		for (Job ele: lista) {
			if (ele.getJobId().equals(atributoPk))
				return ele;
		}
		
		return null;
	}

	@Override
	public int insertOne(Job objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Job objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String atributoPk) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteObj(Job objeto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Job> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

}
