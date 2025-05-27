import java.net.URI;
import java.net.http.*;

public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("https://api.github.com"))
            .GET()
            .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
              .thenAccept(response -> {
                  System.out.println("Status: " + response.statusCode());
                  System.out.println("Body: " + response.body());
              })
              .join();
    }
}

