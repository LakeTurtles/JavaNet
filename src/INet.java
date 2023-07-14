import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;

public class INet  {

    public static void main(String[] args) throws Exception {
        URL hp = new  URL("http://www.HerbSchildt.com");
        URL nba = new URL("http://www.nba.com");
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address);

            byte[] byteIP = address.getAddress();
            boolean boolMethod = byteIP.equals(address)? true: false;
            System.out.println(boolMethod);

            address.getHostAddress();
            address.getHostName();

            boolean multiCastAddr = address.isMulticastAddress()? true : false;
            System.out.println("Is localhost a MultiCast Address? : " + multiCastAddr);

            System.out.println(address.toString());

            System.out.println(byteIP);

            address = InetAddress.getByName("HerbSchildt.com");
            System.out.println(address);


            InetAddress[] sw = InetAddress.getAllByName("www.nba.com");
            for (int i =0; i < sw.length; i ++){
                System.out.println(sw[i]);
            }

            for (InetAddress a : sw) {
                System.out.println(a);
            }

        } catch (IOException e){
            e.printStackTrace();
        }




    }






}
