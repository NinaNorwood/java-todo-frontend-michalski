package com.example.backend.Repository;

import com.example.backend.Model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RepositoryToDo {

    Map<Integer, ToDo> toDoList = new HashMap<>();

    public List<ToDo> list(){
        return new ArrayList<>(toDoList.values());
    }

    public ToDo add(ToDo toDo) {
        for (int i = 0; i <= toDoList.size(); i++) {
        toDo.setId(i);
        }
       return toDoList.put(toDo.getId(), toDo);
    }

    public ToDo put(ToDo toDo) {
        return toDoList.put(toDo.getId(), toDo);
    }

    public ToDo find(ToDo toDo) {
        return toDoList.put(toDo.getId(), toDo);
    }

    public ToDo delete(int id) {
        return toDoList.remove(id);
    }

}
