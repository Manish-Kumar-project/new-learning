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
    public void testStashFromLocal(int a, int b) {
        int a1 = a;
        int b1 = b;
        System.out.println("addition of two numbers : " + (a1 % b1));

    }
     public void testStashFromRepo(int a, int b) {
        int a1 = a;
        int b1 = b;
        System.out.println("addition of two numbers : "+(a1/b1));

    }
     public void testStashFromRepo1(int a, int b) {
        int a1 = a;
        int b1 = b;
        System.out.println("addition of two numbers : "+(a1/b1));

    }
    
    public void testStashFromLocal1(int a, int b) {
        int a1 = a;
        int b1 = b;
        System.out.println("addition of two numbers : " + (a1 % b1));

    }
     public void testStashFromRepo2(int a, int b) {
         int a1 = a;
         int b1 = b;
         System.out.println("addition of two numbers : " + (a1 / b1));
     }
    public void testStashFromLocal2(int a, int b) {
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
        new TestBranch().testStashFromRepo2(10, 10);
        new TestBranch().testStashFromLocal2(10, 10);

    }
}
