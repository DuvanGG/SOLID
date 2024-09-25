package com.dev.taskApp;

import com.dev.taskApp.model.Task;
import com.dev.taskApp.model.TaskStatus;
import com.dev.taskApp.service.*;

public class App 
{
    public static void main( String[] args ) {
    	 NotificationService notificationService = new EmailNotificationService();
         
         // Crear un gestor de tareas
         TaskManager taskManager = new TaskManager(notificationService);
         
         // Crear una tarea
         Task task1 = new Task("Comprar leche", "Ir al supermercado a comprar leche", TaskStatus.PENDING);
         
         // Crear la tarea usando el gestor
         taskManager.createTask(task1);  // Salida esperada: Enviando email: Tarea creada: Comprar leche
         
         // Crear otra tarea
         Task task2 = new Task("Hacer ejercicio", "Ir al gimnasio por la mañana", TaskStatus.PENDING);
         
         // Crear la tarea usando el gestor
         taskManager.createTask(task2);  // Salida esperada: Enviando email: Tarea creada: Hacer ejercicio
        
    }
}
