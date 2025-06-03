public class Main {
    public static void main(String[] args) {
int num=154, r, temp,arm=0;

temp=num;
while(num>0){
    r=num%10;
    num=num/10;
    arm=arm+(r*r*r);
}
if(arm==temp){
    System.out.println("numebr is Armstrong");
}
else
    System.out.println("numebr is not Armstrong");

    }
}