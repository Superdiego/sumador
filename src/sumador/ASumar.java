package sumador;

public class ASumar {

	String valor_inicial="";
	
	public ASumar(String string) {
		valor_inicial=string;
	}

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
