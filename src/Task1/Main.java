package Task1;// TODO: we need to add the missing classes!

// OK, I will add 'Task1.Adder' and s31140 will add 'Task1.Substractor'.

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));

        Substractor substractor = new Substractor();
        System.out.println(substractor.substract(6, 3));
    }
}
