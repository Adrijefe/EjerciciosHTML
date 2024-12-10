package CrearHTMLconUTF8;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileOutputStream out = new FileOutputStream("arxiu.html");
             OutputStreamWriter output = new OutputStreamWriter(out, "UTF-8");
             BufferedWriter writer = new BufferedWriter(output);) {
            writer.write("<html>");
            writer.write("<head>");
            System.out.println("Que titulo quieres");
            String titulo = sc.nextLine();
            writer.write("<title>"+ titulo+"</title>");
            writer.write("</head>");
            writer.write("<body>");
            System.out.println("Que mas quieres poner?: ");
            String titulo1 = sc.nextLine();
            writer.write("<h1>"+titulo1+"</h1>");
            System.out.println("Que informacion quieres dar:");
            String parrafo = sc.nextLine();
            writer.write("<p>" + parrafo + "</p>");
            writer.write("<ul>");
            System.out.print("Que puntos quieres poner: ");
            String punto = sc.nextLine();
            String punto2 = sc.nextLine();
            writer.write("<li>" + punto + "</li>");
            writer.write("<li>"+punto2+"</li>");
            writer.write("</ul>");
            writer.write("</body>");
            writer.write("</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
