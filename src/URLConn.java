import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConn {
    public static void main(String[] args) throws Exception{
        int c;

        URL hp = new URL("http://internic.net");
        URLConnection hpcon = hp.openConnection();

        // get date
        long d = hpcon.getDate();
        if (d == 0){
            System.out.println("No date information");
        } else {
            System.out.println("Date: " + new Date(d) + "\nFrom: " + hp.getHost());
        }

        // get content type
        System.out.println("Content-Type: " + hpcon.getContentType());

        //get expiration date
        d = hpcon.getExpiration();
        if (d == 0){
            System.out.println("No Expiration information");
        } else
            System.out.println("Expires: " + new Date(d));

        // get last modified date
        d = hpcon.getLastModified();
        if (d == 0) {
            System.out.println("no modified information available");
        } else
            System.out.println("Last Modified: " + new Date(d));

        //get content length
        long len = hpcon.getContentLength();
        if(len == -1){
            System.out.println("Content length is unavailable");
        } else
            System.out.println("Content-Length: " + len);

        if (len != 0) {
            System.out.println("===Content===");
            InputStream input = hpcon.getInputStream();
            while ((c = input.read()) != -1) {
                System.out.println((char) c);
            }
            input.close();
        } else {
            System.out.println("No content available");
        }



    }
}
