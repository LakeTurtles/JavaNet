import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class Sockets  {

    public static void main(String[] args) throws Exception{
        int c;

        // Create a socket connected to internic.net, port 43.
//        Socket s = new Socket("whois.internic.net" , 43);
        Socket s = new Socket("127.0.0.1" , 8080);

        //Obtain input and output Streams.
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        //Construct a request string

        String str = (args.length == 0 ? "MHProfesional.com" : args[0]) + "\n";
        //Convert to bytes
        byte[] buf = str.getBytes();

        //Send request
        out.write(buf);

        //Read and display response


        while((c = in.read()) != -1) {



            System.out.print((char) c);
        }



        s.close();

        URL hp = new  URL("http://www.HerbSchildt.com/WhatsNew");

        System.out.println("Protocol: " + hp.getProtocol());
        System.out.println("Port: " + hp.getPort());
        System.out.println("Host: " + hp.getHost());
        System.out.println("File: " + hp.getFile());
        System.out.println("Ext: " + hp.toExternalForm());

        URLConnection urlc = hp.openConnection();
        System.out.println(urlc.getContentLength());
        System.out.println(urlc.getContentLengthLong());
        System.out.println(urlc.getContentType());
        System.out.println(urlc.getDate());
        System.out.println(urlc.getExpiration());
        System.out.println(urlc.getHeaderField(2));
        System.out.println(urlc.getHeaderField("h1"));
        System.out.println(urlc.getHeaderFieldKey(1));
        System.out.println(urlc.getHeaderFields());
        System.out.println(urlc.getLastModified());
        System.out.println(urlc.getInputStream());




    }
}
