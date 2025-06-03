public class Swap {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        int temp;

        System.out.println("Before swaping A= " + a + ", B = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping A= " + a + ", B = " + b);


        int num1 = 0, num2 = 1, num3 = 0;
        System.out.print(num1 + " " + num2);
        for (int i = 0; i <= 10; i++) {
            num3 = num1 + num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;


        }
    }
}