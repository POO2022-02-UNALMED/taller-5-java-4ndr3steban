package zooAnimales;

public class Anfibio extends Animal {
	private static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado[listado.length] = this;
	}
	
	public Anfibio() {
		
	}
	
	public static int cantidadAnfibios() {
		return ranas+salamandras;
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
	
	public void setColorPiel(String cp) {
		colorPiel = cp;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setLargoCola(boolean ven) {
		venenoso = ven;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}
	
}
