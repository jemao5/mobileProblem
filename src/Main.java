// You will need to create something called Structure
//
// Which works better:
// * An interface called Structure that will be implemented by Mobile and Weight
//   and therefore must contain getWeight() and isBalanced() methods or
// * A class called Structure that Mobile and Weight extend and uses
//   instanceof to determine whether an object is in the Mobile or
//   Weight class

public class Main {

    public static void main(String[] args) {
        Mobile m =
                new Mobile(new Branch(5, new Weight(12)),
                        new Branch(6, new Mobile(new Branch(8, new Weight(2)),
                                new Branch(2, new Weight(8)))));

        System.out.println(m.getWeight());
        System.out.println(m.isBalanced());

         Branch b7 = new Branch(8, new Weight(1));
         Branch b8 = new Branch(2, new Weight(4));
         Mobile m4 = new Mobile(b7, b8);
         Branch b5 = new Branch(5, new Weight(2));
         Branch b6 = new Branch(2, m4);
         Mobile m3 = new Mobile(b5, b6);
         Branch b3 = new Branch(3, new Weight(  4));
         Branch b4 = new Branch(4, new Weight(3));
         Mobile m2 = new Mobile(b3,b4);
         Branch b1 = new Branch(6, m2);
         Branch b2 = new Branch(6, m3);
         Mobile m1 = new Mobile(b1, b2);

         System.out.println(m1.getWeight());
         System.out.println(m1.isBalanced());
    }
}
