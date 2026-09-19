package servicio;
import modelo.Gato;
import modelo.Mascota;
import modelo.Perro;
import modelo.Vacunable;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MascotaService {

    private List<Mascota> mascotas = new ArrayList<>();

    public MascotaService() {

        mascotas.add(new Perro(
                1,
                "Rocky",
                3,
                "Carlos",
                "Labrador"
        ));


        mascotas.add(new Gato(
                2,
                "Luna",
                2,
                "Ana",
                "Blanco"
        ));

    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }


    public List<Mascota> listarMascotas() {
        return mascotas;
    }
    public String vacunarMascota(int id) {

        for(Mascota mascota : mascotas) {

            if(mascota.getId() == id) {

                if(mascota instanceof Vacunable) {

                    return ((Vacunable) mascota).aplicarVacuna();

                }

            }

        }

        return "Mascota no encontrada";
    }
}
