import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Рецепт Баскского чизкейка San Sebastian:\nнгриденты в граммах");

        System.out.print ("Творожный сыр: ");
        int sir = sc.nextInt();

        System.out.print ("Сливки 33%: ");
        int slivki = sc.nextInt();

        System.out.print ("Сахарная пудра: ");
        int sahar = sc.nextInt();

        System.out.print ("Мука: ");
        int muka = sc.nextInt();

        System.out.print ("Яйцо: ");
        int egg = sc.nextInt();

        System.out.println("Как готовить:");
        String gotovka = sc.next();


        PrintWriter pw = new PrintWriter( "recept.txt");
        pw.println("Рецепт Баскского чизкейка San Sebastian");
        pw.println("Нам понадобится");
        pw.println("Творожный сыр: " + sir + " грамм");
        pw.println("Сливки 33%: " + slivki + " грамм");
        pw.println("Сахарная пудра: " + sahar + " грамм");
        pw.println("Мука: " + muka + " грамм");
        pw.println("Яцо: " + egg + " грамм");
        pw.println("Способ приготовления: " + gotovka );

        pw.close();


    }
}