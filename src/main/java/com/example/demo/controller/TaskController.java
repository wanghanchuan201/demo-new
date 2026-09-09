package com.example.demo.controller;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")  // 这就是你访问的路径前缀
public class TaskController {

    @Autowired
    private TaskService taskService;

    // 查询所有任务：GET http://localhost:8080/tasks
    @GetMapping
    public List<Task> getAll() {
        return taskService.getAllTasks();
    }

    // 新增任务：POST http://localhost:8080/tasks (Body里传JSON)
    @PostMapping
    public Task add(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    // 删除任务：DELETE http://localhost:8080/tasks/1
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        taskService.deleteTask(id);
    }
}