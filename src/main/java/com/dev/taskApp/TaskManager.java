package com.dev.taskApp;

import com.dev.taskApp.model.Task;
import com.dev.taskApp.service.NotificationService;

public class TaskManager {
    private NotificationService notificationService;

    public TaskManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void createTask(Task task) {
        // Lógica para crear tarea
        notificationService.sendNotification("Tarea creada: " + task.getTitle());
    }
}
