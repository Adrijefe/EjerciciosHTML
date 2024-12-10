package WebScrapping;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.marca.com/");

            Scanner sc = new Scanner(url.openStream());
            StringBuilder contenido = new StringBuilder();

            while (sc.hasNext()) {
                contenido.append(sc.nextLine());
            }
            sc.close();

            String contenidoPagina = contenido.toString();
            Pattern tituloPattern = Pattern.compile("<title>(.*?)</title>");
            Matcher tituloMatcher = tituloPattern.matcher(contenidoPagina);


            if (tituloMatcher.find()) {
                System.out.println("EL titulo de la pagina es: " + tituloMatcher.group(1));
            }
            Pattern linkPattern = Pattern.compile("<a[^>]*>(.*?)</a>");
            Matcher linkMatcher = linkPattern.matcher(contenidoPagina);

            while (linkMatcher.find()) {
                String link = linkMatcher.group(1);
                String texto = linkMatcher.group(2);


                System.out.println("El texto es: " + texto + " el enlace ->" + link);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
