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
        utility.PapildomiVeiksmai.bruksniukai();
        System.out.println(IngredientuVeiksmai.ingredientuKainuKainuVidurkis(jungtis));
        utility.PapildomiVeiksmai.bruksniukai();
        utility.PapildomiVeiksmai.isvestiListaEilutemis(IngredientuVeiksmai.grazintiIngredientusKuriuKainosMazesnesUzX(4.47,jungtis));
        utility.PapildomiVeiksmai.bruksniukai();
        utility.PapildomiVeiksmai.isvestiListaEilutemis(IngredientuVeiksmai.grazintiTopXingredientus(3,jungtis));
        utility.PapildomiVeiksmai.bruksniukai();
        utility.PapildomiVeiksmai.isvestiListaEilutemis(ReceptuVeiksmai.grazintiIngredientus("bulviu kose",jungtis));
    }
}
