package Utility;

import java.sql.Connection;
import java.util.Scanner;

public class KonsolesVeiksmai {
    private static final Scanner skait = new Scanner(System.in);

    public void meniuKonsoleja(Connection jungtis){
        skait.nextLine();
        System.out.println("isvesti visus receptus");
        skait.nextLine();
        System.out.println("isvesti visu ingredientu kainu vidurki");
        skait.nextLine();
        System.out.println("isvesti visus ingredientus pirgesnius uz X");
        skait.nextLine();
        System.out.println("isvesti ingredientai yra n-ajame recepte");
    }

    public static double isvestiSkaiciu(Scanner skait){
        double skaiciusX = 0;
        System.out.println("uz kokia kaina isvesti mazesniu kainu ingredientus");
        skaiciusX = Double.parseDouble(KonsolesVeiksmai.skait.nextLine());
        return skaiciusX;
    }
}
