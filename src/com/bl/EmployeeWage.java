package com.bl;

public class EmployeeWage {

    int is_full_time = 1;
    public static void main(String[] args) {
        EmployeeWage obj = new EmployeeWage();
      int empCheck = (int)(Math.random()*10%2);
        System.out.println(empCheck);
      if (empCheck == obj.is_full_time){
          System.out.println("employee is present");
      }else {
          System.out.println("employee not present");
      }

    }

}
