package DBveiksmai;

import Entity.Receptai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.ResultSet;


public class ReceptuVeiksmai {
    public static ArrayList<Receptai> gautiVisusReceptus(Connection jungtis){
        ArrayList<Receptai> visiReceptai = new ArrayList<>();
        String sqlUzklausa = "SELECT * FROM receptai";

        try{
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            ResultSet rezultatas = paruostukas.executeQuery();

            while (rezultatas.next()){
                visiReceptai.add(new Receptai(rezultatas.getInt("id"), rezultatas.getString("pavadinimas"), rezultatas.getDouble("kaina"), rezultatas.getString("nurodymai")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return visiReceptai;
    }
}
