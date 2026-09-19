package controlador;

import org.springframework.web.bind.annotation.PathVariable;
import modelo.Perro;
import modelo.Gato;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import modelo.Mascota;
import servicio.MascotaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MascotaController {

    private final MascotaService mascotaService;


    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }


    @GetMapping("/mascotas")
    public String listarMascotas(Model model) {

        model.addAttribute("mascotas", mascotaService.listarMascotas());

        return "mascotas";
    }
    @PostMapping("/registrar")
    public String registrarMascota(
            @RequestParam String nombre,
            @RequestParam int edad,
            @RequestParam String dueno,
            @RequestParam String tipo) {


        if(tipo.equals("perro")) {

            mascotaService.agregarMascota(
                    new Perro(
                            3,
                            nombre,
                            edad,
                            dueno,
                            "Sin raza"
                    )
            );

        } else {

            mascotaService.agregarMascota(
                    new Gato(
                            4,
                            nombre,
                            edad,
                            dueno,
                            "Sin color"
                    )
            );
        }


        return "redirect:/mascotas";
    }
    @GetMapping("/vacunar/{id}")
    public String vacunar(@PathVariable int id, Model model) {

        String mensaje = mascotaService.vacunarMascota(id);

        model.addAttribute("mensaje", mensaje);

        model.addAttribute("mascotas", mascotaService.listarMascotas());

        return "mascotas";
    }
}
