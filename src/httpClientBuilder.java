import java.net.http.HttpClient;

public class httpClientBuilder {
    public static void main(String[] args) {
        HttpClient myHC = HttpClient.newBuilder().build();

        HttpClient.Builder myBuilder = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.NORMAL);
        myHC = myBuilder.build();

    }

    static HttpClient newHttpClient(){

        HttpClient myHC =  HttpClient.newHttpClient();

        return myHC;
    }
}
