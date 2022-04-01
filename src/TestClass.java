import javax.swing.plaf.DesktopPaneUI;

public class TestClass {
    public static void main(String[] args) {
       // Employee emp=new Employee();
        Employee emp1=new Employee();
        emp1.setAge(30);
        int age=emp1.getAge();
        System.out.println("Employee CurrentAge :"+age);
        int ageAfter20=emp1.getAgeAfter20yearsOnCurrentAge();
        System.out.println("Employee AgeAfter20Years is :"+ageAfter20);

        Department department=new Department("IT",2);
        Employee emp2=new Employee("vijay","Rathor",28,200000,new Department("IT",2));
        System.out.println("Department Name :"+emp2.getDepartment().getDeptname());
        System.out.println("Department Id:"+emp2.getDepartment().getDeptid());

    }
}
