package Unidad13.instituto.Modelo;

import Unidad13.instituto.Alumno;

import java.sql.*;
import java.util.Map;
import java.util.TreeMap;

public class ModeloBBDD {
    private static final String URL = "jdbc:mysql://localhost:3306/instituto";
    private static final String USER = "usuario";
    private static final String PASSWORD = "usuario";
    public static Map<Integer, Alumno> alumnos = new TreeMap<>();
    public static Map<Integer,Alumno> obtenerAlumnos() {
        try (Connection conexionBD = DriverManager.getConnection(URL,USER,PASSWORD);
             Statement informe = conexionBD.createStatement();
             ResultSet conjuntoResultados = informe.executeQuery("SELECT * FROM alumnos")) {
            while (conjuntoResultados.next()) {
                int idAlumno = conjuntoResultados.getInt("id");
                String nombreAlumno = conjuntoResultados.getString("nombre");
                String direccionAlumno = conjuntoResultados.getString("direccion");
                String matriculaAlumno = conjuntoResultados.getString("estado_matricula");
                int carnetConducirAlumno = conjuntoResultados.getInt("carnet_conducir");

                Alumno a = new Alumno(nombreAlumno,direccionAlumno,matriculaAlumno,carnetConducirAlumno);
                alumnos.put(idAlumno,a);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return alumnos;
    }
}
