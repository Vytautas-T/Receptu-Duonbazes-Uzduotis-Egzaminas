import DBveiksmai.DuonbazesVeiksmai;
import DBveiksmai.ReceptuVeiksmai;

import java.sql.Connection;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Connection jungtis = DuonbazesVeiksmai.prisijungtiPrieDuombazes();

        ReceptuVeiksmai.gautiVisusReceptus(jungtis);
    }
}
