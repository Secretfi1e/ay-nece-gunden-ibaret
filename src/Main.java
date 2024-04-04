import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("ayin adin daxil et");
        String ad= scanner.nextLine();
         switch (ad){

             case "aprel","iyun","sentyabr","noyabr":
                 System.out.println(30);
                 break;
             case "ekabr,yanvar,mart,may,iyul,avqust,oktyabr,":
                 System.out.println(31);
                 break;
             case "febral":
                 System.out.println("28,29");
                 break;
             default:
















         }








    }
}