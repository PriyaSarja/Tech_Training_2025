package vvce;

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp= new Employee[5];

        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            
            sc.nextLine(); 
            
            emp[i] = new Employee(name, id, salary);
            sc.close();
        }

        Employee.sortEmployees(emp);

        System.out.println("\nEmployee Details (Sorted by Salary - Descending):");
        for (Employee ep : emp) {
            ep.display();
            System.out.println();
        }
    }
}

class Employee {
    public String name;  
    public int id;      
    public double salary; 
    
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void sortEmployees(Employee[] emp) {
        int n = emp.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (emp[j].salary < emp[j + 1].salary) {
                    Employee temp = emp[j];
                    emp[j] = emp[j + 1];
                    emp[j + 1] = temp;
                }
            }
        }
    }
}