package Unidad13;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conexionBD = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","usuario","usuario");
            Statement informe = conexionBD.createStatement();
            ResultSet conjuntoResultados = informe.executeQuery("SELECT * FROM personas");
            while (conjuntoResultados.next()) {
                System.out.println(conjuntoResultados.getString("nombre"));
            }
            conjuntoResultados.close();
            informe.close();
            conexionBD.close();
        } catch (
                SQLException e) {
            System.out.println(e);
        }
    }
}
