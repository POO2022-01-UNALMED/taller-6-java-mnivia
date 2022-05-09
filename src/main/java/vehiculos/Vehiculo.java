package vehiculos;

import java.util.*;

public class Vehiculo {

	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;

	public static int CantidadVehiculos;
	public static ArrayList<String> Paises =new ArrayList<String>();
	public static ArrayList<String> Fabricantes= new ArrayList<String>();

	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		super();
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.CantidadVehiculos+=1;
		Paises.add(fabricante.getPais().getNombre());
		Fabricantes.add(fabricante.getNombre());
	}

	// Getters y Setters
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {// Revisar si es necesrio
		return CantidadVehiculos;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {// Revisar si es necesrio
		CantidadVehiculos = cantidadVehiculos;
	}

	// Metodos
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.canAutomovil + "\n" + "Camionetas: " + Camioneta.canCamioneta + "\n"
				+ "Camiones: " + Camion.canCamion;
	}

	public String paisMasVendedor() {

		String masVendedor = "";
		int contador = 0;
		for (String paisActual : Pais.nombres) {
			int contadoractual = 0;
			for (String pais : Paises) {
				if (paisActual.equals(pais)) {
					contadoractual += 1;
				}
			}
			if (contadoractual > contador) {
				masVendedor = paisActual;
				contador = contadoractual;
			}
		}

		return masVendedor;
	}

	public String fabricaMayorVentas() {
		String masVendedor = "";
		int contador = 0;
		
		for(String FabricanteActual : Fabricante.NombresFabricantes) {
			int contadorActualo=0;
			for(String fabricanteString : Fabricantes) {
				if(FabricanteActual.equals(fabricanteString)) {
					contadorActualo += 1;
				}
					
			}
			if (contadorActualo > contador) {
				masVendedor = FabricanteActual;
				contador = contadorActualo;
			}
				
		}
		return masVendedor	;
	}

}
