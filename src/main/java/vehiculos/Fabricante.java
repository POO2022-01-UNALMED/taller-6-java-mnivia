package vehiculos;
import java.util.*;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	
	public static ArrayList<String> NombresFabricantes = new ArrayList<String>();
	public static ArrayList<Fabricante> Fabricantes = new ArrayList<Fabricante>();
	
	
	//Constructor	
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		NombresFabricantes.add(nombre);
		Fabricantes.add(this);
		
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		
		
		Pais p = new Pais("d");
		Fabricante h= new Fabricante("fsfsf", p);
		String masVendedor = "";
		int contador = 0;
		
		for(String FabricanteActual : Fabricante.NombresFabricantes) {
			int contadorActualo=0;
			for(String fabricanteString : Vehiculo.Fabricantes) {
				if(FabricanteActual.equals(fabricanteString)) {
					contadorActualo += 1;
				}
					
			}
			if (contadorActualo > contador) {
				masVendedor = FabricanteActual;
				contador = contadorActualo;
			}
				
		}
		for(Fabricante f : Fabricantes) {
			if(masVendedor.equals(f.getNombre())) {
				return f;
			}
		}
		
		return h;
		
	}
	
	

}
