package mintu.spring.tut_pjr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@RestController
@SpringBootApplication
//@ComponentScans({})
public class TutPjrApplication {

//    @Value("${name}")
//    String name;

//    @Autowired
//    String message;

    @Autowired
    private MyMessage myMessage;

//    @RequestMapping("/")
//    public String home(){
//        return message +name;
//    }

    @RequestMapping("/anypath")
    public String viewResolver(){
        return "viewresolver";
    }

//    @RequestMapping("/welcome")
//    public int welcome(){
//        return myMessage.getMessageValue();
//    }
    @ResponseBody
    @GetMapping(value = "/data", produces = "application/xml")
    public Cat cat(){
        return new Cat("Athena","Bengal",1);
    }

//    @GetMapping(value = "/viewresolver")
//    public String hello(Model model) {
//
//        var msg = "Hello there!";
//        model.addAttribute("message", msg);
//
//        return "viewresolver";
//    }
    public static void main(String[] args) {
        SpringApplication.run(TutPjrApplication.class, args);
    }

}
