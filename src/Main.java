

public class Main {
	public static void main (String[] args){
		Concesionaria c=new Concesionaria();
		c.cargar(new Vehiculo[]{
			new Auto("Peugeot","206",200000,4),
			new Moto("Honda","Titan",60000,125),
			new Auto("Peugeot","208",250000,5),
			new Moto("Yamaha","YBR",80500.50,160)
		});
		c.printConcesionaria();
	}
}
