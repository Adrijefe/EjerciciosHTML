package ProcesarUnHTML;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
3.- Processar un arxiu HTML.
Escriu un programa en Java que llegeix un arxiu HTML anomenat "index.HTML" i trobe la suma de
tots els números presents en l'arxiu. L'arxiu HTML serà el generat de l'arxiu anterior:
Nota:
Cal usar patter i matcher.
Pots concatenar primer tot l’arxiu en un String i aplicar el patró o llegir directament de
l’arxiu línea a línea i aplicar el patró a cada línea que vas llegint
 */
public class Main {
    public static void main(String[] args) {
        String nombreArchivo = "arxiu.html";

        Pattern pattern = Pattern.compile("\\d+");

        int sumaDeTodo = 0;
        //Lo utilizamos para leer el fichero que queremos.
        try(BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
        String linea;

        while ((linea = br.readLine()) !=null){
            Matcher matcher = pattern.matcher(linea);

        while (matcher.find()) {
            int numero = Integer.parseInt(matcher.group());
            sumaDeTodo += numero;
        }
        }
            System.out.println("La suma total de las lineas son: " + sumaDeTodo);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
