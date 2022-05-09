package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	public static int canCamion;

	public Camion(String placa, String nombre, int precio, int peso, 
			Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes=ejes;
		Camion.canCamion+=1;
		// TODO Auto-generated constructor stub
	}

	//Getters and Setters	
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	
	
	
	

}
