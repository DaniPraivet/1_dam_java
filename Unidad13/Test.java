package Unidad13;

import java.sql.*;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexionDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/instituto?serverTimezone=UTC", "admin_rodriguez", "admin123");

            Statement informeConsultaEmpleados = conexionDB.createStatement();
            ResultSet conjuntoDeResultados = informeConsultaEmpleados.executeQuery("SELECT * FROM producto;");

            while (conjuntoDeResultados.next()) {
                int codigo = conjuntoDeResultados.getInt("codigo");
                String nombre = conjuntoDeResultados.getString("nombre");
                double precio = conjuntoDeResultados.getDouble("precio");
                int codigoFabricante = conjuntoDeResultados.getInt("codigo_fabricante");

                System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Precio: " + precio + ", Código Fabricante: " + codigoFabricante);
            }

            conjuntoDeResultados.close();
            informeConsultaEmpleados.close();
            conexionDB.close();
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error cargando el driver: " + e.getMessage());
        }
    }
}
