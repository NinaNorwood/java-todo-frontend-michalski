package com.example.backend.Service;

import com.example.backend.Model.ToDo;
import com.example.backend.Repository.RepositoryToDo;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.Mockito.*;

class ServiceToDoTest {

    private RepositoryToDo repository = mock(RepositoryToDo.class);

    private ServiceToDo service = new ServiceToDo(repository);


//    @Test
//    void listTD() {
//        //GIVEN
//    when(repository.find()).thenReturn(Map.of(
//                new ToDo (5, "Wäsche waschen", "IN_PROGRESS"),
//                new ToDo(6, "Boden wischen", "OPEN")));
//
//        //WHEN
//        Map<Integer, ToDo> toDoList = new HashMap<>();
//
//        //THEN
//        assertEquals(toDoList, contains()
//                new ToDo (5, "Wäsche waschen", "IN_PROGRESS"),
//                new ToDo(6, "Boden wischen", "OPEN");
//        );
//    }

    @Test
    void addTD() {
    }

    @Test
    void putTD() {
    }

    @Test
    void findTD() {
    }

//    @Test
//    void deleteTD() {
//        //WHEN
//        service.deleteTD(5);
//
//        //THEN
//        verify(repository).delete(5);
//    }
}