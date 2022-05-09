package vehiculos;
import java.util.*;

public class Pais {
	
	private String nombre;
	public static ArrayList<String> nombres= new ArrayList<String>();
	public static ArrayList<Pais> paises= new ArrayList<Pais>();
	
	//Constructor

	public Pais(String nombre) {
		this.nombre = nombre;
		Pais.nombres.add(nombre);
		Pais.paises.add(this);
		
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {

		Pais sol = new Pais("ddd");
		String masVendedor = "";
		int contador = 0;
		for (String paisActual : Pais.nombres) {
			int contadoractual = 0;
			for (String pais : Vehiculo.Paises) {
				if (paisActual.equals(pais)) {
					contadoractual += 1;
				}
			}
			if (contadoractual > contador) {
				masVendedor = paisActual;
				contador = contadoractual;
			}
		}
		
		for(Pais p :paises) {
			if(masVendedor.equals(p.getNombre())) {
				return p;				
			}
		}

		return sol;
	}

	
}
