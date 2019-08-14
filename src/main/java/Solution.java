import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Solution {

    public static void main(String[] args) {
        try  {
            URI uri = new URI("anchor-asset://mmhome/v0/assets/123");
            System.out.println("uri = " + uri.toString());
            System.out.println("host = " + uri.getRawPath());
            System.out.println("path = " + uri.getPath());
//            System.out.println("url = " + uri.toURL());

            URI uri2 = new URI("a random");
            System.out.println("path2 = " + uri2.getPath());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        URL url = new URL("https://www.google.com/");
    }
}
