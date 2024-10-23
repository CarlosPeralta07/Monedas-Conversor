import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ConsultarApi consultarApi = new ConsultarApi();
        TranformarMoneda tranformarMoneda = new TranformarMoneda();
        System.out.println("Bienvenidos a mi conversor de monedas con lo aprendido en alura");
        int option = 0;


        while (option != 6) {
            System.out.println("""
                    ****************************************************************
                    1- Peso Dominicano a Dolar Estadounidese.
                    2- Dolar Estadounidese a Peso Dominicano.
                    3- Dolar Canadiense a Peso Dominicano.
                    4- Peso Mexicano a Peso Colombiano.
                    5- Peso Dominicano a Dolar Argentino.
                    6- Salir.
                    """);
           try {

               option = teclado.nextInt();
               switch (option) {
                   case 1:
                       tranformarMoneda.equivanlente("DOP","USD",consultarApi,teclado);
                       
                       break;
                   case 2:
                        tranformarMoneda.equivanlente("USD","DOP",consultarApi,teclado);
                       
                       break;
                   case 3:
                       tranformarMoneda.equivanlente("CAD","DOP",consultarApi,teclado);
                       
                       break;
                   case 4:
                       tranformarMoneda.equivanlente("MXN","COP",consultarApi,teclado);
                       
                       break;
                   case 5:
                       tranformarMoneda.equivanlente("DOP","ARS",consultarApi,teclado);
                       

                       break;
                   case 6:
                       System.out.println("Saliendo de la aplicación...");
                   default:
                       System.out.println("Opción no válida, por favor elige una opción del 1 al 6.");
               }
           }catch (NumberFormatException e){
               System.out.println("Algo inesperado esta pansando revisa el codigo!!");
           }catch (RuntimeException e){
               System.out.println("Ha ocurrido un error estamos trabajando en ello..."+e.getMessage());
           }
        }
        teclado.close();
    }
}
