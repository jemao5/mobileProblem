// You write this.
//
// If you make Structure a class, Weight must extend it.
// If you make Structure an interface, Weight must implement it.

public class Weight implements Structure{
    // This constructor is now mandatory as we can make weights
    // real objects instead of treating them solely as numbers.
    // 
    // You have to figure out how to handle it
    double w;

    public Weight(double weight) {
        w = weight;
    }

    public double getWeight(){
        return w;
    }

    public boolean isBalanced(){
        return true;
    }
}