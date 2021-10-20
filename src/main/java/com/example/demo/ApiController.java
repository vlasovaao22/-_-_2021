package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ApiController {
    private List<String> messages = new ArrayList<>();
    @GetMapping("messages")
    public List<String> getMessages() {
        return messages;
    }
    /* curl -X POST http://localhost:8080/messages -H 'Content-Type:
   text/plain' -d 'text' */
    @PostMapping("messages")
    public void addMessage(@RequestBody String text) {
        messages.add(text);
    }
    @GetMapping("messages/{index}")
    public String getMessage(@PathVariable("index") Integer index) {
        return messages.get(index);
    }
    @DeleteMapping("messages/{index}")
    public void deleteText(@PathVariable("index") Integer index) {
        messages.remove((int) index);
    }
    @PutMapping("messages/{index}")
    public void updateMessage(
            @PathVariable("index") Integer i,
            @RequestBody String message) {
        messages.remove((int) i);
        messages.add(i, message);
    }
}


