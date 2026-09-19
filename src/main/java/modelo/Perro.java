package modelo;

public class Perro extends Mascota implements Vacunable {

    private String raza;


    public Perro() {
    }


    public Perro(int id, String nombre, int edad, String dueno, String raza) {
        super(id, nombre, edad, dueno);
        this.raza = raza;
    }


    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


    @Override
    public String aplicarVacuna() {
        return "La vacuna fue aplicada al perro " + getNombre();
    }


    public String hacerSonido() {
        return "Guau";
    }
    @Override
    public String getTipo() {
        return "Perro";
    }
}

