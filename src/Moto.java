
public class Moto extends Vehiculo {
	private int cilindrada;
	Moto(String marca,String modelo,double precio,int cilindrada){
		super(marca,modelo,precio);
		this.cargar(marca,modelo,precio,cilindrada);
	}
	void cargar(String marca,String modelo,double precio,int cilindrada){
		super.insertFmtStr("Cilindrada : "+cilindrada+"cc");
		this.cilindrada=cilindrada;
	}
	int getCilindrada(){
		return this.cilindrada;
	}
	void setCilindrada(int cilindrada){
		this.cilindrada=cilindrada;
	}
}
