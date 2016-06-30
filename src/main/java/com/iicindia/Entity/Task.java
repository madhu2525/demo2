package com.iicindia.Entity;

import javax.persistence.*;

/**
 * Created by madhu on 28/06/16.
 */


@Entity
@Table(name = "task_list")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id")
    private int id;
    @Column(name = "task_name")
    private String taskName;
    @Column(name = "task_desc")
    private String taskDesc;
    @Column(name = "task_prir")
    private String taskPrir;
    @Column(name = "task_status")
    private String taskStatus;
    @Column(name = "task_achv")
    private int taskAchv;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String getTaskPrir() {
        return taskPrir;
    }

    public void setTaskPrir(String taskPrir) {
        this.taskPrir = taskPrir;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public int getTaskAchv() {
        return taskAchv;
    }

    public void setTaskAchv(int taskAchv) {
        this.taskAchv = taskAchv;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", taskDesc='" + taskDesc + '\'' +
                ", taskPrir='" + taskPrir + '\'' +
                ", taskStatus='" + taskStatus + '\'' +
                ", taskAchv=" + taskAchv +
                '}';
    }
}
