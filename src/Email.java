import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternativeEmail;

    //Constructor to receive the first and last name
    public Email (Scanner in) {
        System.out.println("Enter your first name:");
        this.firstName = in.nextLine();
        System.out.println("Enter your last name:");
        this.lastName = in.nextLine();
        System.out.println("Email created :" + this.firstName + " " + this.lastName);
        // Call a method for the department - return the department
        this.department = setDepartment();
        System.out.println("Department :" + this.department);
    }

    //Ask for the department

    private String setDepartment () {
        System.out.println("Enter the department: \n 1 for Sales \n2 for development \n 3 foir accounting");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if ( departmentChoice == 1 ) {return "Sales";}
        else if (departmentChoice == 2 ) {return "Development";}
        else if (departmentChoice == 3 ) {return "Accounting";}
        else {return "";}
    }

    //Generate a random password

    //Set mailboxCapacity

    //Set an alternate email

     //Change the password

}
