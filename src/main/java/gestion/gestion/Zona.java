package gestion;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona() {

	}
	
	public void agregarAnimales(Animal animal) {
		animales[animales.length] = animal;
	}
	
	public int cantidadAnimales() {
		return animales.length;
	}
	
	public void setNombre(String nomb) {
		nombre = nomb;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public Zoologico getZoo() {
		return zoo;
	}
	
}
