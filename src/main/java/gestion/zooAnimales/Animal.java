package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}
	
	public Animal() {
		totalAnimales++;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo() {
		String str = "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" + 
				"Aves: "+Ave.cantidadAves()+ "\n" + 
				"Reptiles:"+ Reptil.cantidadReptiles() + "\n" + 
				"Peces: "+ Pez.cantidadPeces() +"\n" + 
				"Anfibios: "+ Anfibio.cantidadAnfibios();
		return str;
		
	}
	
	@Override
	public String toString() {
		if (zona.length == 0) {
			String str = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + "y mi genero es " + genero;
			return str;
		} else {
			String str = "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + "y mi genero es " + genero + 
					", la zona en la que me ubico es " + zona[0] + ", en el " + zona[0].getZoo();
			return str;
		}
		
	}
	
	public void setNombre(String nomb) {
		nombre = nomb;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int ed) {
		edad = ed;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setHabitat(String hab) {
		habitat = hab;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setGenero(String gen) {
		genero = gen;
	}
	
	public String getGenero() {
		return genero;
	}
}

