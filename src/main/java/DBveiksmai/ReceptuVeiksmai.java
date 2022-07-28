package DBveiksmai;

import Entity.Ingredientai;
import Entity.Receptai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.ResultSet;


public class ReceptuVeiksmai {
    public static ArrayList<Receptai> gautiVisusReceptus(Connection jungtis){
        ArrayList<Receptai> visiReceptai = new ArrayList<>();
        String sqlUzklausa = "SELECT r.* FROM receptai r WHERE 1";

        try{
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            ResultSet rezultatas = paruostukas.executeQuery();

            while (rezultatas.next()){
                visiReceptai.add(new Receptai(rezultatas.getString("pavadinimas"), rezultatas.getDouble("kaina"), rezultatas.getString("nurodymai")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return visiReceptai;
    }

    public static ArrayList<Ingredientai> grazintiIngredientus(int id, Connection jungtis){
        ArrayList<Ingredientai> visiIngredientai = new ArrayList<>();
        String SQLuzklausa = "SELECT i.* from  ingredientai_receptai ir \n" +
                "JOIN ingredientai i on i.id = ir.ingrediento_id\n" +
                "JOIN receptai r on r.id = ir.recepto_id\n" +
                "WHERE r.id = ?";

        try{
            PreparedStatement paruostukas = jungtis.prepareStatement(SQLuzklausa);
            paruostukas.setInt(1,id);
            ResultSet rezultatas = paruostukas.executeQuery();
            while (rezultatas.next()){
                visiIngredientai.add(new Ingredientai(rezultatas.getInt("id"), rezultatas.getString("pavadinimas"), rezultatas.getDouble("kaina")));

            }
        }
        catch (SQLException e){
            e.printStackTrace();
            System.out.println("nepavyko rasti ingredientu");
        }
        return visiIngredientai;
    }

    public static Receptai idetiRecepta(Connection jungtis, Receptai receptas) {
        String sqlUzklausa = "INSERT INTO receptas(pavadinimas, kaina, nurodymai) VALUES (?, ?, ?)";
        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            paruostukas.setString(1,receptas.getPavadinimas());
            paruostukas.setDouble(2,receptas.getKaina());
            paruostukas.setString(3,receptas.getNurodymai());
            paruostukas.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Nepavyko įdėti duomenų į duomenų bazę");
        }
        return receptas;
    }

    public static ArrayList<Receptai> visuReceptuIdIrPavadinimas(Connection jungtis){
        ArrayList<Receptai> visiReceptai = new ArrayList<>();
        String sqlUzklausa = "SELECT r.id, r.pavadinimas FROM receptai r WHERE 1";

        try{
            PreparedStatement paruostukas = jungtis.prepareStatement(sqlUzklausa);
            ResultSet rezultatas = paruostukas.executeQuery();

            while (rezultatas.next()){
                visiReceptai.add(new Receptai(rezultatas.getInt("id"),rezultatas.getString("pavadinimas")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return visiReceptai;
    }
}
