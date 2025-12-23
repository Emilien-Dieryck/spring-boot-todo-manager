package com.example.todomanager.controller;

import com.example.todomanager.model.Todo;
import com.example.todomanager.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    @PostMapping
    public Todo create(@RequestParam String title) {
        return todoService.create(title);
    }

    @GetMapping
    public List<Todo> getAll() {
        return todoService.findAll();
    }

    @PutMapping("/{id}/complete")
    public String complete(@PathVariable Long id) {
        return todoService.markAsCompleted(id)
            ? "Todo completed"
            : "Todo not found";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return todoService.delete(id)
            ? "Todo deleted"
            : "Todo not found";
    }
}
