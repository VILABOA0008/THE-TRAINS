package cosas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Insertar {

  public static void main(String[] args) throws FileNotFoundException {
    String newFile = "";
    String antesDe="ng REST_API = \"/processvigilancewa";
    String mesnaje="calabazina\n";
    // pass the path to the file as a parameter
    String url = "C:\\Users\\pabcos\\Documents\\trains\\prubas\\ProcessVigilanceWarningResource.java";
    Scanner sc = new Scanner(new File(url));

    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      if (line.contains(antesDe)) {
        newFile += mesnaje;
      }
      newFile += (line + "\n");

    }
    System.err.println(newFile);
    Escribir.escribir(url, newFile);
  }
}
