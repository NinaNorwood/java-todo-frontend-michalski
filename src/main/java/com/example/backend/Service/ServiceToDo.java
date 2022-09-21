package com.example.backend.Service;

import com.example.backend.Model.ToDo;
import com.example.backend.Repository.RepositoryToDo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceToDo {

    private RepositoryToDo repository;

    public ServiceToDo(RepositoryToDo repository) {
        this.repository = repository;
    }

    public List<ToDo> listTD() {
        return repository.list();
    }

    public ToDo addTD (ToDo toDo) {
        return repository.add(toDo);
    }


    public ToDo putTD(ToDo toDo) {
        return repository.put(toDo);
    }

    public ToDo findTD(ToDo toDo) {
        return repository.find(toDo);
    }

    public ToDo deleteTD(ToDo toDo) {
        return repository.delete(toDo.getId());
    }
}
