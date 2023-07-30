package com.bl;

public class EmployeeWage {

    int is_full_time = 1;
    int per_hrs_rate = 20;
    int emphrs;
    int empwage;
    public static void main(String[] args) {
        EmployeeWage obj = new EmployeeWage();

      int empCheck = (int)(Math.random()*10%2);
        System.out.println(empCheck);

      if (empCheck == obj.is_full_time){
           obj.emphrs = 8;
      }else {
          obj.emphrs = 0;

      }

      obj.empwage = obj.emphrs * obj.per_hrs_rate;

        System.out.println(obj.empwage);

    }

}
