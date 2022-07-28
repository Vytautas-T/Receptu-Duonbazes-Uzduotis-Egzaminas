import DBveiksmai.DuonbazesVeiksmai;
import DBveiksmai.IngredientuVeiksmai;
import DBveiksmai.ReceptuVeiksmai;
import Entity.Ingredientai;
import Entity.Receptai;
import Utility.KonsolesVeiksmai;
import com.sun.source.tree.SwitchTree;
import Utility.*;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Connection jungtis = DuonbazesVeiksmai.prisijungtiPrieDuombazes();

        ArrayList<Receptai> receptas = new ArrayList<>();
        ArrayList<Ingredientai> ingredientas = new ArrayList<>();

        utility.PapildomiVeiksmai.isvestiListaEilutemis(ReceptuVeiksmai.gautiVisusReceptus(jungtis));
        utility.PapildomiVeiksmai.bruksniukai();
        System.out.println(IngredientuVeiksmai.ingredientuKainuKainuVidurkis(jungtis));
        utility.PapildomiVeiksmai.bruksniukai();
        utility.PapildomiVeiksmai.isvestiListaEilutemis(IngredientuVeiksmai.grazintiIngredientusKuriuKainosMazesnesUzX(4.47,jungtis));
        utility.PapildomiVeiksmai.bruksniukai();
        utility.PapildomiVeiksmai.isvestiListaEilutemis(IngredientuVeiksmai.grazintiTopXingredientus(3,jungtis));
        utility.PapildomiVeiksmai.bruksniukai();
        utility.PapildomiVeiksmai.isvestiListaEilutemis(ReceptuVeiksmai.grazintiIngredientus(1,jungtis));
        utility.PapildomiVeiksmai.bruksniukai();
        //utility.PapildomiVeiksmai.isvestiListaEilutemis(ReceptuVeiksmai.idetiRecepta(jungtis,ReceptuVeiksmai.idetiRecepta(jungtis,new Receptai("Chernobilis",86354654.64,"pasistaitai jagaine ir buna baikta tada kai sprogsta rectorius"))));

        int pasirinkimas = KonsolesVeiksmai.meniuKonsoleja();
       switch (pasirinkimas){
           case 1:
              receptas = ReceptuVeiksmai.gautiVisusReceptus(jungtis);
               utility.PapildomiVeiksmai.isvestiListaEilutemis(receptas);
               break;

           case 2:
               double ing = IngredientuVeiksmai.ingredientuKainuKainuVidurkis(jungtis);
               System.out.println("ingredientu kainu vidurkis yra " + ing);
               break;
           case 3:
               double x;
               System.out.println("iveskite uzkokia kaina ingredientai turetu buti pigesni 0.00");
               KonsolesVeiksmai.skait.nextLine();
               x = KonsolesVeiksmai.skait.nextDouble();
               ingredientas = IngredientuVeiksmai.grazintiIngredientusKuriuKainosMazesnesUzX(x,jungtis);
               utility.PapildomiVeiksmai.isvestiListaEilutemis(ingredientas);
               break;
           case 4:
               int skaiciusX;
               System.out.println("us kiek pigesnius?");
               skaiciusX = KonsolesVeiksmai.skait.nextInt();
               utility.PapildomiVeiksmai.isvestiListaEilutemis(IngredientuVeiksmai.grazintiTopXingredientus(skaiciusX,jungtis));
               break;
           case 5:
               int id;
               System.out.println("iveskite kelinta recepta. Esami receptai duomenu bazeja yra: " );
               utility.PapildomiVeiksmai.isvestiListaEilutemis(ReceptuVeiksmai.visuReceptuIdIrPavadinimas(jungtis));
               id = KonsolesVeiksmai.skait.nextInt();
               utility.PapildomiVeiksmai.isvestiListaEilutemis(ReceptuVeiksmai.grazintiIngredientus(id,jungtis));

       }

    }
}
