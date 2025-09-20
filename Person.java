public class Person {
    private    char type;
    private    String fname;
    private    String lname;
    private    int age;

    Person(){
        this("","",0);  //uses the constructor that matches this list
        type = 'P';
        fname = "";
        lname = "";
        age = 0;
    }
    Person(String f, String l, int a){
        type = 'P';
        fname = f;
        lname = l;
        age = a;
        totalPeople++;
    }

    //create all getters (accessors)
    public String getFName(){return fname;}
    
    //create all setters (mutators)
    public void setFName(String fname){this.fname = fname;}

    //create the print method
    public String printPerson(){
        String out = String.format("%-15s%-15s%5d\n",fname,lname, age);
        return out;
    }

    public static int totalPeople = 0;
            
}
