import DBveiksmai.DuonbazesVeiksmai;
import DBveiksmai.IngredientuVeiksmai;
import DBveiksmai.ReceptuVeiksmai;
import Utility.KonsolesVeiksmai;

import java.sql.Connection;
import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Connection jungtis = DuonbazesVeiksmai.prisijungtiPrieDuombazes();

        utility.PapildomiVeiksmai.isvestiListaEilutemis(ReceptuVeiksmai.gautiVisusReceptus(jungtis));
        System.out.println(IngredientuVeiksmai.ingredientuKainuKainuVidurkis(jungtis));
        utility.PapildomiVeiksmai.isvestiListaEilutemis(IngredientuVeiksmai.grazintiIngredientusKuriuKainosMazesnesUzX(5.47,jungtis));
    }
}
