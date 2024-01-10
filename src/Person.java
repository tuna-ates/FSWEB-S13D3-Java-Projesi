public class Person {
    String firstname;
    String lastName;
    int age;
    String gender;
    int salary;
    String email;


    public Person(String firstname,String lastName,int age){
        this.firstname=firstname;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(String gender,int salary,String email,String firstname,String lastName,int age){
        this(firstname,lastName,age);
        this.gender=gender;
        this.salary=salary;
        this.email=email;
    }
    public String getFirstName(){
        return this.firstname;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){
        return (age>=13&&age<=19);
    }
}
