package com.todo;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static List<String> tasks = new ArrayList<>();

    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    public static List<String> getTasks() {
        return tasks;
    }

    public static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        addTask("Learn DevOps");
        addTask("Build To-Do App");
        listTasks();
    }
}