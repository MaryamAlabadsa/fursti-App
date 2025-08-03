package com.example.myapplication.api;
public class Job {
    private String title;
    private String company;
    private String location;
    private String salary;

    public Job(String title, String company, String location, String salary) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public String getSalary() {
        return salary;
    }
}
