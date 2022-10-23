package com.example.todo.repository;

import com.example.todo.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "task")
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
