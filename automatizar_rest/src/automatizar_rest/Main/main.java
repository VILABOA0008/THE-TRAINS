package automatizar_rest.Main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class main {

  public static void main(String[] args) {  
    String output  = getUrlContents("http://localhost:8080/totem-deploy/api/button");
    System.out.println(output);
  }

  private static String getUrlContents(String theUrl)
  {
    StringBuilder content = new StringBuilder();

    // many of these calls can throw exceptions, so i've just
    // wrapped them all in one try/catch statement.
    try
    {
      // create a url object
      URL url = new URL(theUrl);

      // create a urlconnection object
      URLConnection urlConnection = url.openConnection();

      // wrap the urlconnection in a bufferedreader
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

      String line;

      // read from the urlconnection via the bufferedreader
      while ((line = bufferedReader.readLine()) != null)
      {
        content.append(line + "\n");
      }
      bufferedReader.close();
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
    return content.toString();
  }
}


//
//try {
//
//  
//  
//
//  URL miUrl = new URL("http://localhost:8080/totem-deploy/api/swagger.json");
//  URLConnection miUrlCon = miUrl.openConnection();
//  BufferedReader br = new BufferedReader(new InputStreamReader(miUrlCon.getInputStream()));
//  String str = "";
//  str = miUrlCon.getContentType();
//  System.out.println(str);
//  while (str != null) {
//    str = br.readLine();
//    System.out.println(str);
//  }
//
//} catch (Exception e) {
//  System.out.println("error   " + e);
//}
