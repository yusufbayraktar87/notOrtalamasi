import java.util.Scanner;

public class notOrtalamasi {

    public static void main(String[] args){
/* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak... */

        int mat, fiz, kim, tur, tar, muz;
        double ortalama;

        Scanner not = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :");
        mat = not.nextInt();

        System.out.print("Fizik Notunuzu Giriniz :");
        fiz = not.nextInt();

        System.out.print("Kimya Notunuzu Giriniz :");
        kim = not.nextInt();

        System.out.print("Türkçe Notunuz Giriniz :");
        tur = not.nextInt();

        System.out.print("Tarih Notunuzu Giriniz :");
        tar = not.nextInt();

        System.out.print("Müzik Notunuzu Giriniz :");
        muz = not.nextInt();

        ortalama =( (mat + fiz + kim + tur + tar + muz) / 6);
        System.out.println("Ortalamanız = " + ortalama);

        String sonuc = (ortalama > 60) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız!";
        System.out.println(sonuc);

























}
}