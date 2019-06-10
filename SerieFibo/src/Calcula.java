
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Calcula {

	public static void main(String[] args) throws IOException{
			
		int n;
		    
		FiboBean obj = new FiboBean();
		
	    System.out.println("");
		System.out.println(" - Sucesión de Fibonacci - ");
		System.out.println(" * Introduce un número ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		String numero = br.readLine();
			
		n = Integer.parseInt(numero);
			
		System.out.println("");
		try {
			System.out.println(" Resultado = "+obj.fibonacci(n));
		} catch (NotNaturalException e) {	
			System.out.println("         ************************************ ");
			System.out.println(e);
			System.out.println("         ************************************ ");
		}
	}
}