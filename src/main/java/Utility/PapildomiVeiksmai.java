package utility;

import Entity.Receptai;

import java.util.ArrayList;

public class PapildomiVeiksmai {
    public PapildomiVeiksmai() {
    }

    public static <T> void isvestiListaEilutemis(ArrayList<T> objektas) {
        for (T t : objektas) {
            System.out.println("Receptas = " + t);
        }
    }

    public static  void isvestiReceptusEilutemisTikPavadinimus(ArrayList<Receptai> objektas) {
        for (Receptai t : objektas) {
            System.out.println("Receptas = " + t.beNurodimuIrKainu());
        }
    }

    public static void bruksniukai(){
        System.out.println("--------------------------------------------");
    }


}
