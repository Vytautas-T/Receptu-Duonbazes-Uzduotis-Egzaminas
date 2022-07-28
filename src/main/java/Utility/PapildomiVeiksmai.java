package utility;

import java.util.ArrayList;

public class PapildomiVeiksmai {
    public PapildomiVeiksmai() {
    }

    public static <T> void isvestiListaEilutemis(ArrayList<T> knygos) {
        for (T t : knygos) {
            System.out.println("Receptas = " + t);
        }
    }

    public static void bruksniukai(){
        System.out.println("--------------------------------------------");
    }
}