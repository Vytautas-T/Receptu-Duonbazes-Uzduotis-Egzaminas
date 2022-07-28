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

    public static ArrayList<Ingredientai> grazintiIngredientus(String pavadinimas, Connection jungtis){
        ArrayList<Ingredientai> visiIngredientai = new ArrayList<>();
        String SQLuzklausa = "SELECT i.* from  ingredientai_receptai ir \n" +
                "JOIN ingredientai i on i.id = ir.ingrediento_id\n" +
                "JOIN receptai r on r.id = ir.recepto_id\n" +
                "WHERE r.pavadinimas = ?";

        try{
            PreparedStatement paruostukas = jungtis.prepareStatement(SQLuzklausa);
            paruostukas.setString(1,pavadinimas );
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
}
