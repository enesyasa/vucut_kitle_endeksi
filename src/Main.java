import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double m,index;
        int kg;

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        m=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg=input.nextInt();
        index= kg / (m * m);
        System.out.print("Vücut Kitle İndeksiniz : "+index);
    }
}