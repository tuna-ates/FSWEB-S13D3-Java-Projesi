public class Main {
    public static void main(String[] args) {
        Person person=new Person("John","Doe",20);
        System.out.println(person.firstname+" "+person.lastName+" "+person.age);
        System.out.println("width= " + person.isTeen());
        System.out.println("----------------------------");
        Wall wall=new Wall(5,4);
        System.out.println("area:"+wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }

}