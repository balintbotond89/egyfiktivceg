package net.ddns.egyfiktivceg.egyfiktivceg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Web controller szolgáltatás a webes forgalmat irányítja
 */
@Controller
public class HomeController {

    /**
     * Url argumentumának megadása
     * Útvonalak meghatározására használjuk
     * Ebben az esetben a "/" a weblap gyökere - innen megadjuk hova navigáljon tovább a program
     */
    @RequestMapping("/")
    public String index() {
        String viewNev = getViewName();
        //System.out.println("a");
        return viewNev;
    }

    private String getViewName() {
        return "index.html";
    }

}
