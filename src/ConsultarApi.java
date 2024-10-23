import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarApi {
     public Monedas buscarMonedas (String base, String target){
         URI dirrecion = URI.create("https://v6.exchangerate-api.com/v6/dd1bdb6ce4172c897cdb5725/pair/"+ base+ "/"+target);

         HttpClient client = HttpClient.newHttpClient();
         HttpRequest request = HttpRequest.newBuilder()
                 .uri(dirrecion)
                 .build();


          try {
              HttpResponse<String>  response = client
                      .send(request, HttpResponse.BodyHandlers.ofString());
              return new Gson().fromJson(response.body(), Monedas.class);

          } catch (Exception e) {
              throw new RuntimeException("Ocurrio un error al buscar la conversión " + e.getMessage());
          }


     }

}
