package app;


public class Person {

    private final String name;
    private final int age;
    private  String profession;


    public static void main(String[] args) {

        Person person1 = new Person("John Snow", 27, "engineer");
        Person person2 = new Person("Daenerys Targaryen", 25, "doctor");
        Person person3 = new Person("Cersey Lannister", 35, "teacher");

        person1.info();
        person2.info();
        person3.info();

        person1.setProfession("soldier");

        System.out.println("Updated information about the person");
        person1.info();
    }

    public Person (String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
    public void info () {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Profession: " + profession);
        System.out.println();
    }

    public void setProfession (String newProfession) {
        this.profession = newProfession;
    }
}