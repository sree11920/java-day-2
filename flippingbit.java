import java.util.*;
public class flippingbit{
    public static void main(String args[]){
        //flipping bits
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a^(1<<b));
    }
}