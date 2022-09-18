package zooAnimales;

public class Ave extends Animal {
	private static Ave[] listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorPlumas = colorPlumas;
		listado[listado.length] = this;
	}
	
	public Ave() {

	}
	
	
	public static int cantidadAves() {
		return halcones+aguilas;
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
	
	public void setColorPlumas(String cp) {
		colorPlumas = cp;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
}
