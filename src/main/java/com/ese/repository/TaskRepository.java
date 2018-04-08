package com.ese.repository;

import com.ese.model.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long>{ // Repository used for managing Task objects

    List<Task> findAllByOrderByUrgentDesc(); // orders all tasks by urgency
}

