//compile time polymorphism
class Add{

    int sum(int a , int b){
        return a+b;
    }

    int sum(int a , int b , int c){
        return a+b+c;
    }


}
public class opps003 {
    public static void main(String[] args) {
        Add a1 = new Add();
        System.out.println(a1.sum(5,5));
        System.out.println(a1.sum(5,5,5));


    }
}
