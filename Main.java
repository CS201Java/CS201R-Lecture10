import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to classes!");
        
        //CREATE A PERSON OBJECT USING OVERLOADED CONSTRUCTOR
        Person p1 = new Person("Einstien","Albert", 144);


        //PRINT OBJECT 
         System.out.println(p1.printPerson());

        try {
            //define file values
            ArrayList<Person> people = new ArrayList<>();

            File inFile = new File("people.txt");
            Scanner scanner = new Scanner(inFile);

            //input values from a file & add to people
            if (loadArrayList(people, scanner) == -1){
                System.out.println("Input is not valid");
            }
            
            for (Person p : people){
                System.out.printf(p.printPerson());
            }
            System.out.println("Total People: " + Person.totalPeople);
            scanner.close();
        }

        catch (FileNotFoundException e){
            System.out.println("Unable to open file");
            return;
        }

        /*
        //CHECKING UNDERSTANDING
        Other f = new Other();
        System.out.println(f.i);   
        System.out.println(f.s);     
        f.imethod();
        f.smethod();
        F is not an object
        System.out.println(F.i);  
        System.out.println(F.s);
        F.imethod();
        F.smethod();
        */ 
    }

    public static int loadArrayList(ArrayList<Person> people, Scanner input){

        String inputLine;
        char t;
        int a;
        String f, l;

 
        while (input.hasNextLine()){
            //get the next line of input from the file
            inputLine = input.nextLine();
            String[] tokens = inputLine.split(",");
            //check that the number of tokens includes row & colum
            if (tokens.length < 4){
                return -1;
            } 
            f = tokens[1];
            l = tokens[2];

            try{
                a = Integer.parseInt(tokens[3]);
                Person newPerson = new Person(f,l,a);
                people.add(newPerson);

            }
            catch(NumberFormatException e){
                System.out.println("Error in the line: " + inputLine);
            }

       }
                   
       return 1;
    }
}

