package dev.slys.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, String> index() {
        return Map.of("Hello", "World");
    }

    @GetMapping("/items/{item_id}")
    public Map<String, String> item(@PathVariable Integer item_id) {
        return Map.of("item_id", item_id.toString());
    }

}