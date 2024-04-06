import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in); 
       
        try {
            System.out.println("CMS da depressão");
            System.out.println("### Menu ###");

       } catch (Exception e) {
        System.out.println("Erro: " + e.getMessage());
       }

       sc.close();
    }
}
