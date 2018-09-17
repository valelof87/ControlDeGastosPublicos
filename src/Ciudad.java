import java.util.List;

public class Ciudad {
	protected String nombreCiudad;
	protected int cantHabitantes;
	protected int dineroRecaudado;
	protected int gastosMantenimiento;
	protected List <Integer>impuestos;
	protected boolean deficit;
	
	
	public Ciudad() {
		
	}
	
	public  Ciudad (String nombreCiudad, int cantHabitantes, int dineroRecaudado,
			int gastosMantenimiento,List<Integer>impuestos, boolean dificit) {
		this.nombreCiudad = nombreCiudad;
		this.cantHabitantes = cantHabitantes;
		this.dineroRecaudado = dineroRecaudado;
		this.gastosMantenimiento= gastosMantenimiento;
		this.impuestos = impuestos;
		this.deficit = deficit;
	}
	
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	
	public void setNombreCiudad (String nombreCiudad) {
		this.nombreCiudad= nombreCiudad;
	}
	
	public int getCantHabitantes() {
		return cantHabitantes;
	}
	
	public void setCantdHabitantes(int cantHabitantes) {
		this.cantHabitantes= cantHabitantes;
		
	}
	
	public int getDineroRecaudado() {
		return dineroRecaudado;
	}
	
	public void setDineroRecaudado (int dineroRecaudado) {
		this.dineroRecaudado = dineroRecaudado;
	}
	
	public int getgastosMantenimiento() {
		return gastosMantenimiento;
	}
	
	public void setGastosMantenimiento (int gastosMantenimiento) {
		this.gastosMantenimiento = gastosMantenimiento;
	}
	
	public List<Integer> getImpuestos() {
		return impuestos;
	}
	
	public void setImpuestos(List<Integer>impuestos) {
		this.impuestos = impuestos;
	}
	
	public int calcularGastos() {
		int total= 0;
	 for (int i =0; i< impuestos.size();i++) {
		 total += impuestos.get(i);
	 }
	 return total;
	}
	
	public static boolean deficit() {
		/*if (calcularGastos() < 0) {
			return true;
		}*/
		return false;
	}
}
