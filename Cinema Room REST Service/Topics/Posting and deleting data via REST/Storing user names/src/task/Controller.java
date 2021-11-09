package task;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.*;

@RestController
public class Controller {

    List<String> users = new ArrayList<>();

    @PostMapping("/users")
    public void putUsers(@RequestParam String name){
        users.add(name);
    }

    @GetMapping("/users")
    public List<String> getUsers(){
        return users;
    }

}
