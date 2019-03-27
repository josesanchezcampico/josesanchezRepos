package bug;

public class P00_Prueba {

	public static void main(String[] args) {
		int suma=suma();
		System.out.println("Suma: "+suma);
	}
	
	static public int suma(){
		int suma=0;
		for( int i=0; i<5; i++){
			suma += i;
		}
		return suma;
	}

}
