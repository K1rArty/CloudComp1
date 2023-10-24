package com.example.demo.repositories;

import com.example.demo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByTask(String task);
    List<Task> findByCompletedTrue();
    List<Task> findByCompletedFalse();
    List<Task> findAll();
    Task getById(Long id);
}

