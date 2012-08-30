package belajar.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Anggi
 */
@Controller
public class HalloSpringMvc {

    @RequestMapping("/hallo")
    public ModelMap halo(@RequestParam(required=false) String nama) {
        ModelMap mm = new ModelMap();
        mm.addAttribute("tamu",nama);

        return mm;

    }
}
