package automatizar_rest.Main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class main {

  public static void main(String[] args) {

    try {

    
    getData("http://localhost:8080/totem-deploy/api/swagger.json");
    
//
//      URL miUrl = new URL("http://localhost:8080/totem-deploy/api/swagger.json");
//      URLConnection miUrlCon = miUrl.openConnection();
//      BufferedReader br = new BufferedReader(new InputStreamReader(miUrlCon.getInputStream()));
//      String str = "";
//      str = miUrlCon.getContentType();
//      System.out.println(str);
//      while (str != null) {
//        str = br.readLine();
//        System.out.println(str);
//      }
//
    } catch (Exception e) {
      System.out.println("error   " + e);
    }
  }


public static void getData(String address) throws Exception {
  URL page = new URL(address);
  StringBuffer text = new StringBuffer();
  HttpURLConnection conn = (HttpURLConnection) page.openConnection();
  conn.connect();
  InputStreamReader in = new InputStreamReader((InputStream) conn.getContent());
  BufferedReader buff = new BufferedReader(in);
  String line;
  do {
    line = buff.readLine();
    text.append(line + "\n");
  } while (line != null);
  System.out.println(text.toString());
}
}