package modelo;

public class Mascota {

    private int id;
    private String nombre;
    private int edad;
    private String dueno;


    public Mascota() {
    }


    public Mascota(int id, String nombre, int edad, String dueno) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }


    public String mostrarInformacion() {
        return "Mascota: " + nombre +
                ", Edad: " + edad +
                ", Dueño: " + dueno;
    }

    public String getTipo() {
        return "Mascota";
    }
}
