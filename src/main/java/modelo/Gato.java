package modelo;

public class Gato extends Mascota implements Vacunable {

    private String color;


    public Gato() {
    }


    public Gato(int id, String nombre, int edad, String dueno, String color) {
        super(id, nombre, edad, dueno);
        this.color = color;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String aplicarVacuna() {
        return "La vacuna fue aplicada al gato " + getNombre();
    }


    public String hacerSonido() {
        return "Miau";
    }

    @Override
    public String getTipo() {
        return "Gato";
    }
}