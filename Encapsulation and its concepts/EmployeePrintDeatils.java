package com.company;

public class EmployeePrintDeatils {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.setEmpId(101512031); E1.setEmpFirstName("Sushil");
        E1.setEmpSecondName("Kumar"); E1.setEmpSalary(45000.58);
        Employee E2 = new Employee();
        E2.setEmpId(101512032); E2.setEmpFirstName("Tara");
        E2.setEmpSecondName("Sharma");E2.setEmpSalary(51000.99);

        System.out.println("employee full name "+E1.getEmpFirstName()+" "+E1.getEmpSecondName());
        System.out.println("employee annual package " + E1.getEmpSalary()*12);
    }
}
class Employee {

    public int getEmpId() {
        return empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpSecondName() {
        return empSecondName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    private int empId;
    private String empFirstName;
    private String empSecondName;
    private double empSalary;

    public void setEmpId(int empId){
        this.empId = empId;
    }
    public void setEmpFirstName(String empFirstName)
    {
        this.empFirstName = empFirstName;
    }
    public void setEmpSecondName(String empSecondName)
    {
        this.empSecondName = empSecondName;
    }
    public void setEmpSalary(double empSalary)
    {
        this.empSalary = empSalary;
    }

}
