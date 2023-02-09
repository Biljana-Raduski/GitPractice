import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Unesite broj");

        Scanner unos = new Scanner(System.in);

        int broj = unos.nextInt();

        boolean ilinili = (broj % 2 == 0);

        System.out.println("Uneti broj " + broj + " je " + ilinili);
//komentart
    }
}