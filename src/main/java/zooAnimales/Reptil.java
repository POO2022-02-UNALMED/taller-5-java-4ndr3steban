package zooAnimales;

public class Reptil extends Animal {
	private static Reptil[] listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado[listado.length] = this;
	}
	
	public Reptil() {

	}
	
	
	public static int cantidadReptiles() {
		return iguanas+serpientes;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		
	}
	
	public Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	
	public void setColorEscamas(String ce) {
		colorEscamas = ce;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setLargoCola(int lc) {
		largoCola = lc;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	
	
}