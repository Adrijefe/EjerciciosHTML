package CrearHTML;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (PrintWriter writer = new PrintWriter("arxiu.html", "UTF-8")) {
            writer.println("<html>");
            writer.println("<head>");
            System.out.println("Que titulo quieres");
            String titulo = sc.nextLine();
            writer.println("<title>"+ titulo+"</title>");
            writer.println("</head>");
            writer.println("<body>");
            System.out.println("Que mas quieres poner?: ");
            String titulo1 = sc.nextLine();
            writer.println("<h1>"+titulo1+"</h1>");
            System.out.println("Que informacion quieres dar:");
            String parrafo = sc.nextLine();
            writer.println("<p>" + parrafo + "</p>");
            writer.println("<ul>");
            System.out.print("Que puntos quieres poner: ");
            String punto = sc.nextLine();
            String punto2 = sc.nextLine();
            writer.println("<li>" + punto + "</li>");
            writer.println("<li>"+punto2+"</li>");
            writer.println("</ul>");
            writer.println("</body>");
            writer.println("</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
