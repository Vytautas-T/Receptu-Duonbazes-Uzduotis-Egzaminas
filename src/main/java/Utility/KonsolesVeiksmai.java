package Utility;

import Entity.Receptai;

import java.sql.Connection;
import java.util.Scanner;

public class KonsolesVeiksmai {
    public static final Scanner skait = new Scanner(System.in);

    public static int meniuKonsoleja(){
        System.out.println("1. isvesti visus receptus");
        System.out.println("2. isvesti visu ingredientu kainu vidurki");
        System.out.println("3. isvesti visus ingredientus pigesnius uz X");
        System.out.println("4. isvesti ingredientus pagal kaina");
        System.out.println("5. isvesti ingredientus pagal `id` numeri");
        System.out.println("6. ideti nauja recepta");

        return skait.nextInt();
    }

    public static double isvestiSkaiciu(Scanner skait){
        double skaiciusX = 0;
        System.out.println("uz kokia kaina isvesti mazesniu kainu ingredientus");
        skaiciusX = Double.parseDouble(KonsolesVeiksmai.skait.nextLine());
        return skaiciusX;
    }

    public static Receptai nuskaitytiReceptaIsKonsoles() {
        skait.nextLine();
        System.out.println("Įveskite Recepto pavadinimą: ");
        String pavadinimas = skait.nextLine();
        System.out.println("Įveskite Recepto kainą: ");
        double kaina = skait.nextDouble();
        skait.nextLine();
        System.out.println("Įveskite nurodymus: ");
        String nurodymai = skait.nextLine();

        return new Receptai(pavadinimas, kaina, nurodymai);
    }
}
