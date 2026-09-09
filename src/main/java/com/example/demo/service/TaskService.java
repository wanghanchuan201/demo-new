package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    // 查全部
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // 新增
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // 删除
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
