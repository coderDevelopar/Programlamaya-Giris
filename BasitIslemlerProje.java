package proje4;
import java.util.Scanner;


public class Proje4{

  public static void main(String args[]){
  
  Scanner scan = new Scanner(System.in);
        int s1 = 0;
        int s2 = 0;
        
        System.out.println("\t\t\t\t-------------------------");
        System.out.println("\t\t\t\tBasit Matematik İşlemleri");
        System.out.println("\t\t\t\t-------------------------\n");
        
        System.out.print("Bir Sayı Giriniz :");
        s1 = scan.nextInt();
        
        System.out.print("Bir Sayı Giriniz :");
        s2 = scan.nextInt();
        System.out.println("\t\t\t\t-----------------------------------");
        System.out.println("\t\t\t\tBasit Matematik İşlemleri Sonuçları");
        System.out.println("\t\t\t\t-----------------------------------\n");
        
        System.out.println("Toplama : " + (s1 + s2));
        System.out.println("Çıkarma : " + (s1 - s2));
        System.out.println("Çarpma  : " + (s1 * s2));
        System.out.println("Bölme   : " + (float)(s1 / s2));
  
  }

}
