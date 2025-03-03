import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int passwordlenght = 10;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternativeEmail;

    //Constructor to receive the first and last name
    public Email (Scanner in) {
        System.out.println("Enter your first name:");
        this.firstName = in.nextLine();
        System.out.println("Enter your last name:");
        this.lastName = in.nextLine();
        System.out.println("Your name is :" + this.firstName + " " + this.lastName);
        // Call a method for the department - return the department
        this.department = setDepartment();
        System.out.println("Department :" + this.department);
        // Call a method to generate a random password
        this.password = randomPassword(passwordlenght);
        System.out.println("Your password is:\t" + this.password);
        //Combine elements to generate e-mails:
        this.email = (this.firstName + "." + this.lastName + "@" + this.department + ".com");
        System.out.println("Your email is:\t" + email);
        //Call a method for changing the mail box capacity:
        this.setMailboxCapacity(500);


    }

    //Ask for the department

    private String setDepartment () {
        System.out.println("Enter the department: \n 1 for sales \n2 for development \n 3 for accounting \n 0 for none");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if ( departmentChoice == 1 ) {return "sales";}
        else if (departmentChoice == 2 ) {return "development";}
        else if (departmentChoice == 3 ) {return "accounting";}
        else {return "";}
    }

    //Generate a random password
    private String randomPassword (int lenght) {
        String PasswordSet = "ABCDEFGHIJKLMNOPQRDTUWXYZ0123456789!#$%";
        char [] password = new char[lenght];
        for (int i = 0; i < lenght; i++) {
            int rand = (int) (Math.random() * PasswordSet.length());
            password[i] = PasswordSet.charAt(rand);
        }
        return new String(password);
    }


    //Set mailboxCapacity
    public void setMailboxCapacity (int capacity) {
        this.mailboxCapacity = capacity;
    }

    /* private int defineMailBoxCapacity (Scanner in) {
        System.out.println("What's the new mail box capacity");
        mailboxCapacity = in.nextInt();
        System.out.println(mailboxCapacity);
        return mailboxCapacity;
    } My solution to the mailbox capacity */

    //Set an alternate email
    public void setAlternativeEmail (String altEmail){
        this.alternativeEmail =altEmail;
    }
     //Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternativeEmail() {return alternativeEmail;}
    public String getPassword() {return password;}

}


