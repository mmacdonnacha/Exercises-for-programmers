import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class WebsiteGenerator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Site name: ");
        String siteName = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Do you want a folder for Javascript? ");
        boolean javascript = scanner.nextLine().equals("y") ? true : false;

        System.out.print("Do you want a folder for CSS? ");
        boolean css = scanner.nextLine().equals("y") ? true : false;

        scanner.close();


        // create folder siteName
        File file = new File(siteName);
        file.mkdir();
        System.out.println("Created ./" + siteName + "/");

        // create index.html
        String path = siteName + "/index.html";
        try(PrintWriter writer = new PrintWriter(path)){
            String html = 
            "<html>\n"
            + "<head>\n" 
            + "<meta charset=\"UTF-8\">\n"
            + "<meta name=\"keywords\" content=\"HTML, CSS, JavaScript\">\n"
            + "<meta name=\"author\" content=\"" + author + "\">\n"
            + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
            + "<title>" + siteName + "</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "</body>\n"
            + "</html>";

            writer.println(html);
            writer.close();
            System.out.println("Created ./" + path);

        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }


        // if javascript create js
        if(javascript){
            file = new File(siteName + "/js");
            file.mkdir();
            System.out.println("Created ./" + siteName + "/js/");
        }

        // if css create css 
        if(css){
            file = new File(siteName + "/css");
            file.mkdir();
            System.out.println("Created ./" + siteName + "/css/");
        }
    }
}