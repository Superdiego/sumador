package sumador;

/**
 * @see Tema10 Entornos
 * @author DCP
 * @version 1.0
 * @since Febrero 2019
 */
public class ASumar {

	String valor_inicial="";
	
	/**
	 * Constructor
	 * @param string valor_inicial es el dato que pasamos para que realice el cálculo
	 */
	public ASumar(String string) {
		valor_inicial=string;
	}

	/**
	 * @return el cálculo obtenido tras las tres condiciones reflejadas
	 * Primera condición: que la cadena sea un solo carácter
	 * Segunda condición: que la cadena sea un número negativo
	 * Tercera condición: que la cadena sea un número que no cumpla las dos condiciones anteriores
	 */
	public String mostrar() {
		String numero = valor_inicial;
        if (numero.length() == 1) {
            numero =numero + " = " + numero;
        }
        else if (Integer.parseInt(numero)<0) {
       	numero="";
        }
        else {
        	
        	int suma = 0;
            for (int i = 0; i < numero.length(); i++) {            	
            	String digito = numero.substring(i,i+1);
                suma = suma + Integer.parseInt(digito);
            }
            numero = Integer.toString(suma);
            }
       
        return numero;
	}

}
