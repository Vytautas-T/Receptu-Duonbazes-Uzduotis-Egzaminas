package DBveiksmai;

import Entity.Ingredientai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class IngredientuVeiksmai {
    public static double ingredientuKainuKainuVidurkis(Connection jungtis) {
        double kainuVidurkis = 0;
        String SQLuzklausa = "SELECT AVG(kaina) AS vidurkis FROM ingredientai";

        try {
            PreparedStatement paruostukas = jungtis.prepareStatement(SQLuzklausa);
            ResultSet rezultatas = paruostukas.executeQuery();

            while(rezultatas.next()){
                kainuVidurkis = rezultatas.getDouble("vidurkis");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kainuVidurkis;
    }

    public static ArrayList<Ingredientai> grazintiIngredientusKuriuKainosMazesnesUzX(double x,Connection jungtis){
        ArrayList<Ingredientai> pigesniIngredientai = new ArrayList<>();
        String SQLuzklausa = "SELECT kaina FROM ingredientai WHERE kaina < ?";

        try{
            PreparedStatement paruostukas = jungtis.prepareStatement(SQLuzklausa);
            paruostukas.setDouble(1, x);
            ResultSet rezultatas = paruostukas.executeQuery();
            while (rezultatas.next()){
                pigesniIngredientai.add(new Ingredientai(rezultatas.getInt("id"), rezultatas.getString("pavadinimas"), rezultatas.getDouble("kaina")));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return pigesniIngredientai;
    }
}
