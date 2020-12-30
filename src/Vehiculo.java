import java.util.Comparator;

class VehiculoComparator implements Comparator<Vehiculo> {
    @Override
    public int compare(Vehiculo v1, Vehiculo v2) {
        return (int)(v2.getPrecio()-v1.getPrecio());
    }
}


public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private double precio;
	private String fmtStr;
	Vehiculo(String marca,String modelo,double precio){
		
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;

		this.fmtStr=new String("Marca : "+this.marca+" // Modelo : "+this.modelo+" // Precio : $"+this.precio);
	}
	/* MIS METODOS */
	void printVehiculo(){
		System.out.println(this.fmtStr);
	}
	protected void insertFmtStr(String str){
		this.fmtStr=new String("Marca : "+this.marca+" // Modelo : "+this.modelo+" // "+str+" // Precio : $"+this.precio);
	}
	
	/* GETTERS Y SETTERS (por si hace falta)*/
	String getMarca(){
		return this.marca;
	}
	String getModelo(){
		return this.modelo;
	}
	double getPrecio(){
		return this.precio;
	}
	protected String getFmtStr(){
		return this.fmtStr;
	}
	void setMarca(String marca){
		this.marca=marca;
	}
	void setModelo(String modelo){
		this.modelo=modelo;
	}
	void setPrecio(double precio){
		this.precio=precio;
	}
}
