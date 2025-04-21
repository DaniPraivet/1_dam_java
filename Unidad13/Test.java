package Unidad13;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        try {
            Connection conexionDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
            Statement informeConsultaEmpleados = conexionDB.createStatement();
            ResultSet conjuntoDeResultados = informeConsultaEmpleados.executeQuery("SELECT * FROM personas;");
            while (conjuntoDeResultados.next()) {
                System.out.println(conjuntoDeResultados);
            }
            conjuntoDeResultados.close();
            informeConsultaEmpleados.close();
            conexionDB.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
