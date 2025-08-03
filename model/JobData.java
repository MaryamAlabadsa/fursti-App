package com.example.myapplication.model;

public class JobData {
    public int id;
    public String title;
    public String employment_type;
    public String work_place;
    public String summary;
    public int salary_show;
    public int work_experience;
    public String job_valid_unite;
    public String create_time;
    public WorkField work_field;
    public Country country_of_employment;
    public BusinessMan business_man;
    public ExperienceYear experience_year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployment_type() {
        return employment_type;
    }

    public void setEmployment_type(String employment_type) {
        this.employment_type = employment_type;
    }

    public String getWork_place() {
        return work_place;
    }

    public void setWork_place(String work_place) {
        this.work_place = work_place;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getSalary_show() {
        return salary_show;
    }

    public void setSalary_show(int salary_show) {
        this.salary_show = salary_show;
    }

    public int getWork_experience() {
        return work_experience;
    }

    public void setWork_experience(int work_experience) {
        this.work_experience = work_experience;
    }

    public String getJob_valid_unite() {
        return job_valid_unite;
    }

    public void setJob_valid_unite(String job_valid_unite) {
        this.job_valid_unite = job_valid_unite;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public WorkField getWork_field() {
        return work_field;
    }

    public void setWork_field(WorkField work_field) {
        this.work_field = work_field;
    }

    public Country getCountry_of_employment() {
        return country_of_employment;
    }

    public void setCountry_of_employment(Country country_of_employment) {
        this.country_of_employment = country_of_employment;
    }

    public BusinessMan getBusiness_man() {
        return business_man;
    }

    public void setBusiness_man(BusinessMan business_man) {
        this.business_man = business_man;
    }

    public ExperienceYear getExperience_year() {
        return experience_year;
    }

    public void setExperience_year(ExperienceYear experience_year) {
        this.experience_year = experience_year;
    }
}

