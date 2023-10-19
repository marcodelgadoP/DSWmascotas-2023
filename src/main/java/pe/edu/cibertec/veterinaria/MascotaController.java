package pe.edu.cibertec.veterinaria;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import pe.edu.cibertec.veterinaria.controladores.MascotaRepository;
import pe.edu.cibertec.veterinaria.entidades.Mascota;
//listado-- primer serviciorest
@RestController
@AllArgsConstructor
public class MascotaController {

    MascotaRepository mascotaRepository;

    @RequestMapping("obtenerMascotas")
    public List<Mascota> listarMascotas(){
        return mascotaRepository.findAll();
    }
}
