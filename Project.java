import java.io.*;
import java.util.*;
class Project{
    String name, designation, password;
    float dues, paidDues, balance;
    public Project(){}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Project admin = new Project();
        Project accountant = new Project();
        Project student = new Project();


        admin.name = "Amartya Mukherjee";
        admin.designation = "admin";
        admin.password = "amartya811";
        String input;
        int a = 0;
        //System.out.println("Enter user designation: ");
        //String user = sc.nextLine();
        String password;
        do{
            System.out.println("Enter user designation: ");
            String user = sc.nextLine();
            while(user.toLowerCase().equals("admin") || user.toLowerCase().equals("accountant") || user.toLowerCase().equals("student")){
                if(user.toLowerCase().equals("admin")){
                    //while(a < 3){
                        System.out.println("Enter password for admin: ");
                        password = sc.nextLine();
                        //if(password.equals(admin.password)){
                            while(password.equals(admin.password)){
                                System.out.println("What operation would you like to perform on Accountant?\n1. Add\n2. View\n3. Edit\n4. Delete\n5. Exit");
                                input = sc.nextLine();
                                if(input.toLowerCase().equals("add")){
                                    System.out.println("Enter accountant name: ");
                                    accountant.name = sc.nextLine();
                                    accountant.designation = "accountant";
                                    accountant.password = "password";
                                }
                                else if(input.toLowerCase().equals("view")){
                                    System.out.println("Accountant Name: " + accountant.name);
                                    System.out.println("Designation: " + accountant.designation);
                                    System.out.println("Accountant Password: " + accountant.password);
                                }
                                else if(input.toLowerCase().equals("edit")){
                                    System.out.println("Enter edited accountant name: ");
                                    accountant.name = sc.nextLine();
                                    accountant.designation = "accountant";
                                    System.out.println("Enter edited accountant password: ");
                                    accountant.password = sc.nextLine();
                                }
                                else if(input.toLowerCase().equals("delete")){
                                    accountant = null;
                                }
                                else{
                                    System.out.println("Wrong input!");
                                    user = "notadmin";
                                    break;
                                }
                                //a += 1;
                            }        
                            
                        //}
                                    
                    //}
                }
                else if(user.toLowerCase().equals("accountant")){
                    //while(a < 8){
                        System.out.println("Enter password for accountant: ");
                        password = sc.nextLine();
                        //if(password.equals(accountant.password)){
                            while(password.equals(accountant.password)){
                                System.out.println("What operation would you like to perform on Student?\n1. Add\n2. View\n3. Edit\n4. Delete\n5. Exit");
                                input = sc.nextLine();
                                if(input.toLowerCase().equals("add")){
                                    System.out.println("Enter student name: ");
                                    student.name = sc.nextLine();
                                    student.designation = "student";
                                    System.out.println("Enter student password: ");
                                    student.password = sc.nextLine();
                                    System.out.println("Enter student dues: ");
                                    student.dues = sc.nextFloat();
                                    System.out.println("Enter student's paid dues: ");
                                    student.paidDues = sc.nextFloat();
                                    System.out.println("Enter student's balance dues: ");
                                    student.balance = sc.nextFloat();
                                }
                                else if(input.toLowerCase().equals("view")){
                                    System.out.println(student.name);
                                    System.out.println(student.designation);
                                    System.out.println(student.dues);
                                    System.out.println(student.paidDues);
                                    System.out.println(student.balance);
                                }
                                else if(input.toLowerCase().equals("edit")){
                                    System.out.println("Enter due amount of student: ");
                                    float dues2 = sc.nextFloat();
                                    student.dues += dues2;
                                    student.balance += student.dues;
                                }
                                else if(input.toLowerCase().equals("delete")){
                                    student = null;
                                }
                                else{
                                    System.out.println("Wrong input!");
                                    user = "notaccountant";
                                    break;
                                }
                                //a += 1; 
                            }        
                            
                        //}
                                    
                    //}
                }
                else if(user.toLowerCase().equals("student")){
                    //while(a < 15){
                        System.out.println("Enter student password: ");
                        password = sc.nextLine();
                        //if(password.equals(student.password)){
                            while(password.equals(student.password)){
                                System.out.println("What operation would you like to perform on Student?\n1. View\n2. Pay Dues\n3. Delete");
                                input = sc.nextLine();
                                
                                if(input.toLowerCase().equals("view")){
                                    System.out.println("Name of student:" + student.name);
                                    System.out.println("Designation:" + student.designation);
                                    System.out.println("Password of student:" + student.password);
                                    System.out.println("Dues to be paid of student:" + student.dues);
                                    System.out.println("Dues paid by student:" + student.paidDues);
                                    System.out.println("Balance due amount of student:" + student.balance);
                                }
                                else if(input.toLowerCase().equals("pay dues")){
                                    System.out.println("Enter amount to be paid:" );
                                    student.paidDues = sc.nextFloat();
                                    //A link can be added to here for a payment gateway which will inturn show changes in student.dues 
                                    student.balance = student.dues - student.paidDues; 

                                    
                                }
                                else{
                                    System.out.println("Wrong input!");
                                    user = "notstudent";
                                    student.balance = student.dues - student.paidDues;
                                    break;
                                }
                                //a += 1;
                            }        
                            
                        //}
                                        
                    //}
                }
            }
        }while(true);
        

        
    }
}
