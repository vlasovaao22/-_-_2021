package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
class ApiController {
    private List<String> theme = new ArrayList<String>();
///curl -X GET http://localhost:8080/messages
"messages"
    public List<String> getMessages() {
        return theme;
    }
/* curl -X POST http://localhost:8080/messages -H 'Content-Type:
text/plain' -d 'text' */
"messages"
    public void addMessage(@RequestBody String text) {
        theme.add(text);
    }
/* curl -X POST http://localhost:8080/messages -H 'Content-Type:
text/plain' -d 'text' */
"messages/{index}"
    public String getMessage("index" Integer index) {
        return theme.get(index);
    }
    /* curl -X Delete http://localhost:8080/messages -H 'Content-Type:
    text/plain' -d 'text' */
    @DeleteMapping("messages/{index}")
    public void deleteText("index" Integer index) {
        theme.remove((int) index);
    }
"messages/{index}"
    public void updateMessage(
"index" Integer i,
@RequestBody String message) {
        theme.remove((int) i);
        theme.add(i, message);
    }
    /* curl -X Delete http://localhost:8080/messages */
    @DeleteMapping("messages/{index}")
    public void DeleteAll() {
        theme.clear();
    }

    public Integer ColTheme() {
        Integer a= theme.size();
        return a;
    }

    public List ListTheme() {
        return theme;
    }
}
