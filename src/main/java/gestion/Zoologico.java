package gestion;
import java.util.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		
	}
	
	public Zoologico() {
		
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int cantAnim = 0;
		for (Zona i: zonas) {
			cantAnim += i.cantidadAnimales();
		}
		return cantAnim;
	}
	
	public void setNombre(String nomb) {
		nombre = nomb;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setUbicacion(String ubi) {
		ubicacion = ubi;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public List<Zona> getZona() {
		return zonas;
	}
	
}
