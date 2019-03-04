

package sumador;

import java.util.Scanner;

/**
 * @see Tema10 Entornos
 * @author DCP
 * @version 1.0
 * @since Febrero 2019
 */

public class DCP_Funciona {

	/**
	 * @param args Método principal 
	 */
	public static void main(String[] args) {
		
		String valor;
		Scanner entrada= new Scanner(System.in);
		System.out.print("Introduzca el valor que desea sumar:  ");
		
		valor=entrada.nextLine();
		
		ASumar sum = new ASumar(valor);
		
		int suma = 0;
        for (int i = 0; i < valor.length(); i++) {            	
        	String numerillo = valor.substring(i,i+1);
        	
        	if (i<(valor.length()-1))
        		System.out.print(numerillo + " + ");
        	else {
        		System.out.print(numerillo + " =  ");
        	}
        	
       
        }
        	
		System.out.print(sum.mostrar());
		
		
		
	}

}
