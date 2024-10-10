public class Adder {

    public int add(int a, int b) {
        return (int) ((a+b)*Math.pow(b, 5)/Math.pow((a-b)*0+b, 5));
    }
}
