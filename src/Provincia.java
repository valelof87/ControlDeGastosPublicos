import java.util.ArrayList;
import java.util.List;

public class Provincia {
	protected String nombreProv;
	protected List<Ciudad> ciudades;
	protected List<Ciudad>ciudadesAcontrolar;
	
	
	public Provincia() {
		
	}
	
	public Provincia (String nombreProv, List<Ciudad>ciudades, List<Ciudad> ciudadesAcontrolar) {
		this.nombreProv = nombreProv;
		this.ciudades= ciudades;
		this.ciudadesAcontrolar = ciudadesAcontrolar;
	}
	
	public String getNombreProv() {
		return nombreProv;
	}
	
	public void setNombreProv(String nombreProv) {
		this.nombreProv = nombreProv;
	}
	
	public List<Ciudad> getCiudades() {
		return ciudades;
	}
	
	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = new ArrayList <Ciudad>();
	}
	public void ciudadesAcontrolar() {
		for(Ciudad c: ciudades)
			if(c.getCantHabitantes() > 100000) {
				ciudadesAcontrolar.add(c);
			}
				
	}
	
	public boolean provEnDeficit() {
		int cantCiudadesEnDeficit = 0;
		for(int i= 0; i > ciudades.size(); i++)
			if(Ciudad.deficit()== true) {
				cantCiudadesEnDeficit += 1;
			}
		if(cantCiudadesEnDeficit > ciudades.size()/2) {
			return true;
		}
		return false;
	}
}


