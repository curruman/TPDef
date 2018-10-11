package TPDefinitvo.TPDef;

import TPDefinitivo.TPAvanzado2.TPAvanzado2;
import TPDefinitvo.TPAvanzado1.TPAvanzado1;


public class App 
{
    public static void main( String[] args )
    {
        if (args[0].equals("salida.json")) {
        	TPAvanzado2 tp2 = new TPAvanzado2();
        	tp2.run(args[0],args[1]);
        }
        else {
        	if(args[0]!="prestamos.json") {
        		String argumento = args[0];
        		TPAvanzado1 tp1 = new TPAvanzado1();
        		tp1.run(argumento);
        	}
        	else {
        		System.out.println("Argumentos invalidos");
        	}
        }
    }
}
