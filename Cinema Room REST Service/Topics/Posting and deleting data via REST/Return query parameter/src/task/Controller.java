package task;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @PostMapping("/test")
    public String getValue(@RequestParam String param){
        return param;
    }
}
