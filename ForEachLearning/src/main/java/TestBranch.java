public class TestBranch {

    public void add(int a, int b) {
        int a1 = a;
        int b1 = b;
        System.out.println("addition of two numbers : " + a1 + b1);

    }

    public void mutliply(int a, int b) {
        int a1 = a;
        int b1 = b;
        System.out.println("addition of two numbers : " + a1 * b1);

    }

    public void sub(int a, int b) {
        int a1 = a;
        int b1 = b;
        System.out.println("addition of two numbers : " + (a1 - b1));

    }

    public void div(int a, int b) {
        int a1 = a;
        int b1 = b;
        System.out.println("addition of two numbers : " + (a1 / b1));
    }

    public void mod(int a, int b) {
        int a1 = a; 
        int b1 = b;
        System.out.println("addition of two numbers : " + (a1 % b1));

    }

    public static void main(String[] args) {
        System.out.println("Hello Test");
        new TestBranch().add(10, 10);
        new TestBranch().mutliply(10, 10);
        new TestBranch().mutliply(10, 2);
        new TestBranch().sub(10, 10);

    }
}
