package com.ese.controller;

import com.ese.model.Task;
import com.ese.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class TaskController { // class to route Task objects


    private final TaskRepository tasks; // object that interacts with the Task database

    @Autowired // dependency injection
    public TaskController(TaskRepository tasks){ // constructor for the TaskController object
        this.tasks = tasks;
    }


    @RequestMapping("/") // Handles requests made for the home page
    public ModelAndView addTask(){
        return new ModelAndView("createTask.html", "task", new Task());
    }


    @RequestMapping(value = "/addTask", method = RequestMethod.POST) // handles requests made for the /addTask page
    public RedirectView addNewTask(Task task){
        tasks.save(task); // saves the task
        return new RedirectView("/allTasks");
    }


    @RequestMapping("/allTasks") // handles requests made for the /allTasks page
    public ModelAndView allTasks(ModelMap modelMap){
        modelMap.addAttribute("tasks", tasks.findAllByOrderByUrgentDesc());
        return new ModelAndView("taskList.html", modelMap);
    }

}