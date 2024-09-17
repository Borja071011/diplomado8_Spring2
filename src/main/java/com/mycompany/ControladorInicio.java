package com.mycompany;
/*
LA clase controlador incio se encarga de dar incio y el mapeo de loq ue ara la pagina
*/
import com.mycompany.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        var mensaje = "mensaje con thymeleaf.";

        var persona = new Persona();
        persona.setNombre("pedro");
        persona.setApellido("y Pablo");
        persona.setEmail("eranhermanos@");
        persona.setTelefono("222234556");
        
        var persona2 = new Persona();
        persona.setNombre("Pablo");
        persona.setApellido("eran hermanos");
        persona.setEmail("yamigosinseparables@");
        persona.setTelefono("554960346");

        log.info("ejecutando rl controlador springMVC");
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);
        return "index";
    }
}
