package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Countdown {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;       // 事件名称，如"实验室面试"
    private String targetDate;  // 目标日期，如"2026-09-11"

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getTargetDate() { return targetDate; }
    public void setTargetDate(String targetDate) { this.targetDate = targetDate; }
}