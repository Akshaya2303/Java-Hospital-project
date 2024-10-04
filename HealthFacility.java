import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner; 
class Employee { 
    String employeeId, employeeName, role, gender; 
    int salary; 
    void registerEmployee(Scanner input) { 
        System.out.print("ID: "); 
        employeeId = input.nextLine(); 
        System.out.print("Name: "); 
        employeeName = input.nextLine(); 
        System.out.print("Role: "); 
        role = input.nextLine(); 
        System.out.print("Gender: "); 
        gender = input.nextLine(); 
        System.out.print("Salary: "); 
        salary = Integer.parseInt(input.nextLine());  // Use nextLine() and parse to integer to prevent 
// InputMismatchException 
    } 
    void displayEmployeeInfo() { 
        System.out.println(employeeId + " " + employeeName + " " + role + " " + gender + " " + salary); 
    } 
} 
class Specialist { 
    String specialistId, specialistName, specialization, availability, qualification; 
    int roomNumber; 
    void registerSpecialist(Scanner input) { 
        System.out.print("ID: "); 
        specialistId = input.nextLine(); 
        System.out.print("Name: "); 
        specialistName = input.nextLine(); 
        System.out.print("Specialization: "); 
        specialization = input.nextLine(); 
        System.out.print("Availability: "); 
        availability = input.nextLine(); 
        System.out.print("Qualification: "); 
        qualification = input.nextLine(); 
        System.out.print("Room No.: "); 
        roomNumber = Integer.parseInt(input.nextLine());  // Use nextLine() and parse to integer 
    } 
    void displaySpecialistInfo() { 
        System.out.println(specialistId + " " + specialistName + " " + specialization + " " + availability 
+ " " + qualification + " " + roomNumber); 
    } 
} 
class Client { 
    String clientId, clientName, ailment, gender, admissionStatus; 
    int age; 
    void registerClient(Scanner input) { 
        System.out.print("ID: "); 
        clientId = input.nextLine(); 
        System.out.print("Name: "); 
        clientName = input.nextLine(); 
        System.out.print("Ailment: "); 
        ailment = input.nextLine(); 
        System.out.print("Gender: "); 
        gender = input.nextLine(); 
        System.out.print("Admission Status: "); 
        admissionStatus = input.nextLine(); 
        System.out.print("Age: "); 
        age = Integer.parseInt(input.nextLine());  // Use nextLine() and parse to integer 
    } 
    void displayClientInfo() { 
        System.out.println(clientId + " " + clientName + " " + ailment + " " + gender + " " + 
admissionStatus + " " + age); 
    } 
} 
public class HealthFacility { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.println("\n--------------------------------------------------------------------------------"); 
        System.out.println("            *** Welcome to Advanced Health Management System ***"); 
        System.out.println("--------------------------------------------------------------------------------"); 
        Calendar calendar = Calendar.getInstance(); 
        System.out.print("Date: " + (calendar.get(Calendar.MONTH) + 1) + "-" + 
calendar.get(Calendar.DATE) + "-" + calendar.get(Calendar.YEAR)); 
        System.out.println("\t\tTime: " + calendar.get(Calendar.HOUR_OF_DAY) + ":" + 
calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND)); 
        ArrayList<Employee> employees = new ArrayList<>(); 
        ArrayList<Specialist> specialists = new ArrayList<>(); 
        ArrayList<Client> clients = new ArrayList<>(); 
        boolean continueLoop = true; 
        while (continueLoop) { 
            System.out.println("\nMain Menu"); 
            System.out.println("1. Employee Management"); 
            System.out.println("2. Specialist Services"); 
            System.out.println("3. Client Services"); 
            System.out.println("4. Exit"); 
            System.out.print("Enter your choice: "); 
            int choice = Integer.parseInt(input.nextLine());  // Read choice using nextLine and parse to 
            switch (choice) { 
                case 1: // Employee Management 
                    System.out.println("1. Register new employee"); 
                    System.out.println("2. Display all employees"); 
                    int subChoice = Integer.parseInt(input.nextLine()); 
                    if (subChoice == 1) { 
                        Employee newEmployee = new Employee(); 
                        newEmployee.registerEmployee(input); 
                        employees.add(newEmployee); 
                    } else if (subChoice == 2) { 
                        for (Employee emp : employees) { 
                            emp.displayEmployeeInfo(); 
                        } 
                    } 
                    break; 
                case 2: // Specialist Services 
                    System.out.println("1. Register new specialist"); 
                    System.out.println("2. Display all specialists"); 
                    subChoice = Integer.parseInt(input.nextLine()); 
                    if (subChoice == 1) { 
                        Specialist newSpecialist = new Specialist(); 
                        newSpecialist.registerSpecialist(input); 
                        specialists.add(newSpecialist); 
                    } else if (subChoice == 2) { 
                        for (Specialist spec : specialists) { 
                            spec.displaySpecialistInfo(); 
                        } 
                    } 
                    break; 
                case 3: // Client Services 
                    System.out.println("1. Register new client"); 
                    System.out.println("2. Display all clients"); 
                    subChoice = Integer.parseInt(input.nextLine()); 
                    if (subChoice == 1) { 
                        Client newClient = new Client(); 
                        newClient.registerClient(input); 
                        clients.add(newClient); 
                    } else if (subChoice == 2) { 
                        for (Client client : clients) { 
                            client.displayClientInfo(); 
                        } 
                    } 
                    break; 
                case 4: // Exit 
                    continueLoop = false; 
                    break; 
                default: 
                    System.out.println("Invalid choice. Please try again."); 
            } 
        } 
        input.close(); 
    } 
} 
 