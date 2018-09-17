import java.util.List;

public class Pais {
	protected String nombrePais;
	protected List<Provincia> provincias;
	
	public Pais() {
		
	}
	
	public Pais(String nombrePais, List<Provincia> provincias) {
		this.nombrePais = nombrePais;
		this.provincias = provincias;
	}
	
	public String getNombrePais() {
		return nombrePais;
	}
	
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	public List<Provincia> getProvincias(){
		return provincias;
	}
	
	public void setProvincias(List<Provincia>provincias) {
		this.provincias= provincias;
	}
}
