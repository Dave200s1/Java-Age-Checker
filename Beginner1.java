import java.util.Scanner;

public class Beginner1{

    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        //int scanned = sc.nextInt();
        int mindesalter = 18;


        System.out.println("Wie alt sind Sie ?: ");
        int scanned = sc.nextInt();


        if(scanned < mindesalter){
            System.out.println("Zugriff verweigert");
        }else{
            System.out.println("Zugruff erlaubt");
        }
        
        
        //System.out.println(scanned);
    }
}


