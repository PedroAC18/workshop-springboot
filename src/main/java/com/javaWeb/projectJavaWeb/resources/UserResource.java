package com.javaWeb.projectJavaWeb.resources;

import com.javaWeb.projectJavaWeb.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//indica que o dado retornado será escrito diretamente no corpo do texto
@RequestMapping(value = "/users")
public class UserResource {


    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Pedro", "pedro@gmail.com", "999999", "1234");
        return ResponseEntity.ok().body(u);//retorna um JSON com esses dados

    }
}
