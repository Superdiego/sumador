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
       
        return numero;
	}

}
