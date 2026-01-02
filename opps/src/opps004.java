//Inheritence
class Parent {
    String name;
    int age;

    Parent(String n , int a){ // constructor
        this.name = n;
        this.age = a;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class child extends Parent{
    child(String n, int a) {
        super(n, a); // we are calling parent constructor
    }
    void study(){ // child hasts own method
        System.out.println("the child goes to school");
    }

}

public class opps004 {
    public static void main(String[] args) {
        Parent p1 = new Parent("ganya" , 50);
        p1.display();

        child c1 = new child("omkar",21);
        c1.display();
        c1.study();
    }
}
