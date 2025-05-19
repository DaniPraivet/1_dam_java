package Unidad13.instituto.Modelo;

import Unidad13.instituto.Alumno;
import Unidad13.instituto.Asignatura;
import Unidad13.instituto.Matricula;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ConexionDAOInstituto {
    private static final String URL = "jdbc:mysql://localhost:3306/instituto";
    private static final String USER = "usuario";
    private static final String PASSWORD = "usuario";
    public static Map<Integer, Alumno> alumnos = new TreeMap<>();
    public static List<Asignatura> asignaturas = new ArrayList<>();
    public static List<Matricula> matriculas = new ArrayList<>();

    public static Map<Integer,Alumno> obtenerAlumnos() {
        try (Connection conexionBD = conectarseBD();
             Statement informe = conexionBD.createStatement();
             ResultSet conjuntoResultados = informe.executeQuery("SELECT * FROM alumnos ORDER BY nombre;")) {
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
    public static List<Asignatura> obtenerAsignaturas() {
        try (Connection conexionBD = conectarseBD();
             Statement informe = conexionBD.createStatement();
             ResultSet conjuntoResultados = informe.executeQuery("SELECT * FROM asignaturas ORDER BY nombre;")) {
            while (conjuntoResultados.next()) {
                int idAsignatura = conjuntoResultados.getInt("id");
                String nombre = conjuntoResultados.getString("nombre");
                int curso = conjuntoResultados.getInt("curso");
                Asignatura a = new Asignatura(idAsignatura,nombre,curso);
                asignaturas.add(a);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return asignaturas;
    }

    public static List<Matricula> obtenerMatriculas() {
        try (Connection conexionBD = conectarseBD();
             Statement informe = conexionBD.createStatement();
             ResultSet conjuntoResultados = informe.executeQuery("SELECT * FROM matricula;")) {
            while (conjuntoResultados.next()) {
                int idMatricula = conjuntoResultados.getInt("id");
                Alumno alumno = obtenerAlumnoPorId(conjuntoResultados.getInt("id_alumno"));
                Asignatura asignatura = obtenerAsignatura(conjuntoResultados.getInt("id_asignatura"));
                double nota = conjuntoResultados.getDouble("nota");
                Matricula m = new Matricula(idMatricula,alumno,asignatura,nota);
                matriculas.add(m);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return matriculas;
    }

    private static Alumno obtenerAlumnoPorId(int idAlumno) {
        for (Map.Entry<Integer, Alumno> a : alumnos.entrySet()) {
            if (a.getKey().equals(idAlumno)) {
                return a.getValue();
            }
        }
        return null;
    }

    private static Asignatura obtenerAsignatura(int idAsignatura) {
        for (Asignatura a : asignaturas) {
            if (a.getId() == idAsignatura) {
                return a;
            }
        }
        return null;
    }


    public static boolean insertarAlumno(Alumno a) {
        boolean resultado = false;
        String consulta = "INSER INTO alumnos (nombre, direccion, estado_matricula, carnet_conducir) " +
                "VALUES (? , ?, ?, ?)";
        try (Connection conn = conectarseBD();
        PreparedStatement stmt = conn.prepareStatement(consulta)) {
            stmt.setString(1, a.getNombre());
            stmt.setString(2, a.getDireccion());
            stmt.setString(3, a.getEstadoMatricula());
            stmt.setInt(4, a.isCarnetConducir() ? 1 : 0);
            resultado = stmt.executeUpdate() >= 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultado;
    }

    public static boolean insertarAsignatura(Asignatura a) {
        boolean resultado = false;
        String consulta = "INSER INTO alumnos (nombre, curso) " +
                "VALUES (? , ?)";
        try (Connection conn = conectarseBD();
             PreparedStatement stmt = conn.prepareStatement(consulta)) {
            stmt.setString(1, a.getNombre());
            stmt.setInt(2, a.getCurso());
            resultado = stmt.executeUpdate() >= 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultado;
    }

    public static Connection conectarseBD() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }

    public static List<Matricula> matriculasPorAlumno(int idAlumno) {
        List<Matricula> listaMatriculasAlumno = new ArrayList<>();
        try (Connection conexionBD = conectarseBD();
             Statement informe = conexionBD.createStatement();
             ResultSet conjuntoResultados = informe.executeQuery("SELECT id FROM matricula WHERE id_alumno=" + ";")) {
            while (conjuntoResultados.next()) {
                int idMatricula = conjuntoResultados.getInt("id");
                Matricula m = obtenerMatriculaPorId(idMatricula);
                listaMatriculasAlumno.add(m);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listaMatriculasAlumno;
    }

    private static Matricula obtenerMatriculaPorId(int idMatricula) {
        for (Matricula m : matriculas) {
            if (m.getId()==idMatricula) {
                return m;
            }
        }
        return null;
    }
}
