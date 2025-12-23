package com.example.todomanager.service;

import com.example.todomanager.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final List<Todo> todos = new ArrayList<>();
    private long currentId = 1L;

    public Todo create(String title) {
        Todo todo = new Todo(currentId++, title, false);
        todos.add(todo);
        return todo;
    }

    public List<Todo> findAll() {
        return todos;
    }

    public Optional<Todo> findById(Long id) {
        return todos.stream()
            .filter(t -> t.getId().equals(id))
            .findFirst();
    }

    public boolean markAsCompleted(Long id) {
        return findById(id)
            .map(todo -> {
                todo.setCompleted(true);
                return true;
            })
            .orElse(false);
    }

    public boolean delete(Long id) {
        return todos.removeIf(t -> t.getId().equals(id));
    }
}
