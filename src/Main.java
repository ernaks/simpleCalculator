import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        double a = sc.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double b = sc.nextDouble();
        System.out.println("İşlem Seçiniz: \n 1)Toplama \n 2)Çıkarma \n 3)Çarpma \n 4)Bölme");
        int secim = sc.nextInt();
        switch (secim){
            case 1:
                System.out.println("Sonuç: " + (a + b));
                break;
            case 2:
                System.out.println("Sonuç: " + (a - b));
                break;
            case 3:
                System.out.println("Sonuç: " + (a * b));
                break;
            case 4:
                if(b == 0)
                    System.out.println("Sayı sıfıra bölünemez");
                else
                    System.out.println("Sonuç: " + (a / b));
                break;
            default:
                System.out.println("Hatalı seçim yaptınız. Tekrar deneyin.");
                break;
        }
    }
}