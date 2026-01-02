import java.util.*;
// Run time Polymorphism(method overriding)
class Payment{
    void pay(){
        System.out.println("the payment is being processs....");
    }
}

class Creditcard extends Payment{
    void pay() {
        System.out.println("payment is done through creditcard");
    }
}

class upi extends Payment{
    void pay(){
        System.out.println("payment is done through upi");
    }
}

class COD extends Payment{
    void pay() {
        System.out.println("payment is done through cash on delivehry");
    }
}

public class opps002 {
    public static void main(String[] args) {
        Payment p1;

        p1 = new Creditcard();
        p1.pay();

        p1 = new upi();
        p1.pay();

        p1 = new COD();
        p1.pay();


    }
}
