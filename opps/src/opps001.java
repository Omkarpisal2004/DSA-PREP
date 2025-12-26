class student {
    String name; // properties
    String city;
    int age;

    void details(){ // methods
        System.out.println("i am " +name+ " from " +city+ " and my age is " +age);
    }
}

public class Main {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "omkar";
        s1.age = 21;
        s1.city = "pune";
        s1.details();
    }
}