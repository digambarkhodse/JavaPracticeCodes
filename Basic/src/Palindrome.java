public class Palindrome {
    public static void main(String[] args){
        int num=12121, r,temp,palindrome=0;
        temp=num;
int count=0;
        while(num>0){
            r=num%10;
count++;
            palindrome=r+(palindrome*10);
            num=num/10;
        }
        System.out.println(count);
        if(palindrome==temp)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");

    }
}
