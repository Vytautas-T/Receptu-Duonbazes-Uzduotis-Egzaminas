package Utility;

import DBveiksmai.ReceptuVeiksmai;

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
}
