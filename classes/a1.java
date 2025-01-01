import java.util.Scanner;

public  class a1{

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = sc.nextLine();

        System.out.println("Your name is " + name);

        System.out.println("Enter last name ");
        String name2 = sc.nextLine();

        String fullName = name + name2; // concatenation

        System.out.println("Full name is:"+ fullName);
        
        // to print each character 
        System.err.println(fullName.length());

        for(int i=0; i<fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        } 

        // compare 
        if(name.compareTo(name2) == 0) {
            System.err.println("String are equal ");
        }

        else {
            System.err.println("Strings are not equal ");
        }

        String sentence = "Hello everyone";

        String name1 = sentence.substring(4, 10);

        System.out.print(name1 + " ");
        sc.close();
    }
}