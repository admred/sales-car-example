
import java.util.ArrayList;
import java.util.Optional;
import java.util.Arrays;
import java.util.Collections;


public class Concesionaria{
	private ArrayList<Vehiculo> vehiculos;
	private ArrayList<Vehiculo> vehiculosSorted;
	private Vehiculo masCaro;
	private Vehiculo masBarato;
	private String letra;
	
	Concesionaria(){
		this.vehiculos=new ArrayList<Vehiculo>();
		this.letra="Y";
	}
	Concesionaria(Vehiculo[] vehiculos){
		this.cargar(vehiculos);
		this.letra="Y";
	}
	void cargar(Vehiculo[] vehiculos){
		this.vehiculos=new ArrayList<Vehiculo>(Arrays.asList(vehiculos));
		this.ordenarPorPrecio();
		this.calcularEstadisticas();
	}
	
	void printConcesionaria(){
		if(this.vehiculos.isEmpty()){
			System.out.println("Concecionaria no tiene vehiculos");
			System.exit(1);
		}
		for(Vehiculo v:this.vehiculos){
			v.printVehiculo();
		}
		System.out.println("==============================================");
		System.out.println("Vehiculo mas caro   : "+this.masCaro.getMarca()+" "+this.masCaro.getModelo());
		System.out.println("Vehiculo mas barato : "+this.masBarato.getMarca()+" "+this.masBarato.getModelo());
		Vehiculo v1=buscarModeloPorLetra(letra);
		if(v1==null)
			System.out.println("Vechiculo que contiene en el modelo la letra '"+letra+"' : No existe tal vehiculo");
		else
			System.out.println("Vechiculo que contiene en el modelo la letra '"+letra+"' : "+v1.getMarca()+" "+v1.getModelo()+" "+v1.getPrecio());
			
		System.out.println("==============================================");
		System.out.println("Vehiculos ordernados por precio de mayor a menor :");
		for(Vehiculo v:this.vehiculosSorted){
			System.out.println(v.getMarca()+" "+v.getModelo());
		}
	}
	private void calcularEstadisticas(){
		this.masCaro=this.vehiculos.get(0);
		this.masBarato=this.vehiculos.get(0);
		
		for(Vehiculo v:this.vehiculos){
			if(v.getPrecio()>this.masCaro.getPrecio())
				this.masCaro=v;
		
			if(v.getPrecio()<this.masBarato.getPrecio())
				this.masBarato=v;
		}
	}
	private void ordenarPorPrecio(){
		vehiculosSorted=new ArrayList<Vehiculo>(this.vehiculos);
		Collections.sort(this.vehiculosSorted,new VehiculoComparator());
		
	}
	private Vehiculo buscarModeloPorLetra(String letra){
		Optional<Vehiculo> matchObj=this.vehiculos.stream().filter(f->f.getModelo().contains(letra)).findFirst();
		return matchObj.orElse(null);
	}
}
