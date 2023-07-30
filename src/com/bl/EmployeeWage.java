package com.bl;

public class EmployeeWage {

    int is_full_time = 2;
    int is_part_time = 1;
    int per_hrs_rate = 20;
    int working_Day_per_Month = 20;
    int emphrs;
    int empwage = 0;

    int totalwage = 0;
    public static void main(String[] args) {
        EmployeeWage obj = new EmployeeWage();

        for (int i = 1; i <= obj.working_Day_per_Month; i++) {
            int empCheck = (int) (Math.random() * 10 % 3);

            if (empCheck == obj.is_full_time) {
                obj.emphrs = 8;
            } else if (empCheck == obj.is_part_time) {

                obj.emphrs = 4;

            } else {
                obj.emphrs = 0;
            }

            obj.empwage = obj.emphrs * obj.per_hrs_rate;
            obj.totalwage = obj.totalwage + obj.empwage;
            System.out.println("employee wage is :" + obj.empwage);

        }
            System.out.println("total wage :" + obj.totalwage);

        }


    }


