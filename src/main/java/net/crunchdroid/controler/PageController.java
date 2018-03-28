package net.crunchdroid.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author CrunchDroid
 */
@Controller
public class PageController {

	/** @GetMapping("/CadastroPessoa")
    public String plainPage() {
        return "CadastroPessoa";
    }

    public String pricingTables() {
        return "ListarPessoa";
    } */
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
