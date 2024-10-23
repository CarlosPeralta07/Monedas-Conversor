import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class TranformarMoneda {
    public void equivanlente(String base, String target, ConsultarApi consultarApi, Scanner teclado){

            try {
                Monedas monedas = consultarApi.buscarMonedas(base, target);
                System.out.println("La tasa al dia de hoy es:\n1 "+base+ " = "+monedas.conversion_rate()+" "+target);
                System.out.println("Ingrese la catidad deseada de: "+ base+"\n");
               double cantidad = teclado.nextDouble();
               teclado.nextLine();

               double resultado = cantidad * monedas.conversion_rate();
                System.out.println(cantidad+" "+base+ " = " + resultado+ " "+ monedas.target_code());

            }catch (NumberFormatException e){
                System.out.println("Revisa miop"+e.getCause());
            }catch (RuntimeException e) {
                throw new RuntimeException(e);
            }




    }

}
