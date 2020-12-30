

public class Auto extends Vehiculo {
	private int puertas;
	
	Auto(String marca,String modelo,double precio,int puertas){
		super(marca,modelo,precio);
		this.cargar(marca,modelo,precio,puertas);
	}
	
	void cargar(String marca,String modelo,double precio,int puertas){
		this.puertas=puertas;
		super.insertFmtStr("Puertas : "+puertas);
	}
	
	int getPuertas(){
		return this.puertas;
	}
	void setPuertas(int puertas){
		this.puertas=puertas;
	}
}
