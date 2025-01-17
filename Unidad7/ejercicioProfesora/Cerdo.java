package Unidad7.ejercicioProfesora;

public class Cerdo {
    int id;
    String raza;
    boolean sexo;

    public Cerdo (int id, String raza, boolean sexo) {
        this.id = id;
        this.raza = raza;
        this.sexo = sexo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

}


