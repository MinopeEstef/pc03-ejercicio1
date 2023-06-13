package com.example.app_firebase_ejercicio01;

public class Task {
    private String name;
    private String createdAt;

    public Task() {
        // Constructor vacío requerido por Firebase
    }

    public Task(String name, String createdAt) {
        this.name = name.toUpperCase();
        this.createdAt = createdAt;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
