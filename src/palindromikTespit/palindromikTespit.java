package palindromikTespit;
import java.util.Scanner;

public class palindromikTespit {
    public static void main(String[] args) {

        System.out.print("Palindrom kontrolü yapmak istediğiniz kelimeyi giriniz : ");
        Scanner input = new Scanner(System.in);
        String kelime = input.nextLine();
        boolean kontrol=false;

        for (int i = 0; i < kelime.length() / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(kelime.length() - i - 1)) kontrol = true;
        }
        if (kontrol) System.out.println(kelime+" kelimesi palindrom değildir.");
        else System.out.println(kelime+" kelimesi palindromdur.");
    }
}

