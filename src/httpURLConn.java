import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class httpURLConn {
    public static void main(String[] args) throws Exception {
        int c;

        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpcon = (HttpURLConnection) hp.openConnection();

        //Display Request Method
        System.out.println("Request method is " + hpcon.getRequestMethod());

        //Display Response Code
        System.out.println("Response code is " + hpcon.getResponseCode());

        //Display Response Message
        System.out.println("Response message is " + hpcon.getResponseMessage());

        //Get a list of the header fields and a set of the header keys
        Map<String, List<String>> hdrMap = hpcon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nHere are the headers : " );

        //Display all header keys and values
        for(String k : hdrField){
            System.out.println("Key : " + k + "  Value" + hdrMap.get(k)) ;
        }





    }

}
