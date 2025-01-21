package Unidad7.ejercicioProfesora;

public class Cerdo {
    int id;
    String raza;
    boolean sexo; // true = M -- false = F
    char sexoChar = ' ';

    public Cerdo (int id, String raza, boolean sexo) {
        this.id = id;
        this.raza = raza;
        this.sexo = sexo;
        sexoHM(sexo);
    }

    private void sexoHM (boolean sexo) {if (sexo) {sexoChar = '♂';} else {sexoChar = '♀';}}

    @Override
    public String toString() {
        return "Cerdo{" +
                "id='" + id + '\'' +
                ", raza=" + raza +
                ", sexo=" + sexoChar +
                '}';
    }

}


