public class TestBranch {

    public void add(int a, int b) {
        int a1 = a;
        int b1 = b;
        System.out.println("addition of two numbers : "+a1+b1);

    }

    public static void main(String[] args) {
        System.out.println("Hello Test");
        new TestBranch().add(10,10);
    }
}
