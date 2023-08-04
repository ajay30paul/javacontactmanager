import java.util.*;

public class Main {
    public static ContactManager contactManager;
    static Scanner sc = new Scanner(System.in);
    public static Contact[] contactData() {
        return new Contact[] {
                new Contact("John Doe", "555-123-4567", "1985-01-01"),
                new Contact("Jane Smith", "555-987-6543", "1990-02-14"),
                new Contact("Alice Johnson", "555-345-6789", "1975-03-30"),
                new Contact("Bob Brown", "555-567-8910", "2000-12-25"),
                new Contact("Charlie Davis", "555-111-2222", "1983-07-04"),
                new Contact("Diana White", "555-333-4444", "1997-11-18"),
                new Contact("Ethan Green", "555-555-6666", "1988-05-22"),
                new Contact("Fiona Black", "555-777-8888", "2002-10-31")
        };
    }

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager(contactData());
        System.out.println("Y**************** Y Soorya Namashkaaram Y *******************Y");
        displayContacts(contactManager);


        


        System.out.println(" You have 8 contacts. Enter 'continue' to edit them ");

        String status = sc.nextLine();

        while (status.equals("continue")) {
            System.out.println("Enter the index (from 0-7) which you wanna edit");
            int indexEdit = sc.nextInt();
            if (indexEdit >7 ) {
                throw new IndexOutOfBoundsException("Please enter Value inBetween 0-7");
                
    
            }
            
            sc.nextLine();
            Contact editedContact = editContact();
            contactManager.setContact(editedContact, indexEdit);
            for (int i = 0 ; i < contactData().length ; i++ ){
                System.out.println(contactManager.getContact(i));
            }

            
            System.out.println("Enter 'continue' (case sensitive) to edit them or any other button to terminate");
            status = sc.next();


            
        }
        


    }
    public static void displayContacts (ContactManager contactManager){
        
        for (int i = 0 ; i < contactData().length ; i++ ){
            System.out.println(contactManager.getContact(i));
        }
    }

    public static Contact editContact (){
        
        System.out.println("\t Name : ");
        String name = sc.nextLine();
        System.out.println("\t Phone Number : ");
        String phNumber = sc.nextLine();
        System.out.println("\t Date Of Birth in 'yyyy-MM-dd' format : ");
        String dateOB = sc.nextLine();


        
     
        
        return new Contact(name, phNumber, dateOB);
        

        
        




    }

}
