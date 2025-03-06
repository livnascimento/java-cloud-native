package main.model;


public class Candidate {
    private String fullName;
    private Integer age;
    private Integer salaryExpectationInCents;
    private Integer careerLevel;
    private String department;


    public Candidate (String fullName, Integer age, Integer salaryExpectationInCents, Integer careerLevel, String department) {
        this.fullName = fullName;
        this.age = age;
        this.salaryExpectationInCents = salaryExpectationInCents;
        this.careerLevel = careerLevel;    
        this.department = department;    
    }

    public Integer getAge(){ return age; }
    public Integer getCareerLevel(){ return careerLevel; }
    public Integer getSalaryExpectationInCents(){ return salaryExpectationInCents; }
    public String getFullName(){ return fullName; }
    public String getDepartment(){ return department; }

    public boolean validateCandidate(Candidate candidate, Oportunity vaga) {

        if (vaga.getSalaryBudget() < candidate.getSalaryExpectationInCents()) return false;
        if (vaga.getCareerLevel() != candidate.getCareerLevel()) return false;
        if (vaga.getDepartment() != candidate.getDepartment()) return false;

        return true;
    }

}
