package com.example.backend.Controller;


import com.example.backend.Model.ToDo;
import com.example.backend.Service.ServiceToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ControllerToDo {

    private final ServiceToDo serviceToDo;

    @Autowired
    public ControllerToDo(ServiceToDo serviceToDo) {
        this.serviceToDo = serviceToDo;
    }

    @GetMapping("/todo")
    public List<ToDo> getAllTodos () {
        return serviceToDo.listTD();
    }

    @PostMapping ("/todo")
    public ToDo postTodo (@RequestBody ToDo toDo) {
        return serviceToDo.addTD(toDo);
    }

    @PutMapping("/todo/{id}")
    public ToDo putTodo (@RequestBody ToDo toDo) {
        return serviceToDo.putTD(toDo);
    }

    @GetMapping("/todo/{id}")
    public ToDo getToDoById(ToDo toDo) {
        return serviceToDo.findTD(toDo);
    }

    @DeleteMapping("/todo/{id}")
    public ToDo deleteToDo(ToDo toDo) {
        return serviceToDo.deleteTD(toDo);
    }

}
