package Unidad13;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class Test{
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexionDB = DriverManager.getConnection("jdbc:mysql://172.26.12.94:3306/tienda","dani","usuario");
            Statement informeConsultaEmpleados = conexionDB.createStatement();
            ResultSet conjuntoDeResultados = informeConsultaEmpleados.executeQuery("SELECT * FROM producto;");
            while (conjuntoDeResultados.next()) {
                System.out.println(conjuntoDeResultados);
            }
            conjuntoDeResultados.close();
            informeConsultaEmpleados.close();
            conexionDB.close();
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
