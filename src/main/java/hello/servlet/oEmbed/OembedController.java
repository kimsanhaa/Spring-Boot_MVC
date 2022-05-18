package hello.servlet.oEmbed;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OembedController {

    @RequestMapping("/oembed")
    public String controller(){
        System.out.println("hi");
        return "thymeleaf/oembed";
    }
}
