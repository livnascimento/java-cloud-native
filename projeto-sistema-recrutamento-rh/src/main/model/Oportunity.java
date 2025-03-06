package main.model;

public class Oportunity {

    private Integer salaryBudget;
    private Integer careerLevel;
    private String department;

    public Oportunity(Integer salaryBudget, Integer careerLevel, String department) {
        this.salaryBudget = salaryBudget;    
        this.careerLevel = careerLevel;    
        this.department = department;  
    }

    public Integer getCareerLevel(){ return careerLevel; }
    public Integer getSalaryBudget(){ return salaryBudget; }
    public String getDepartment(){ return department; }
    
}
