import java.util.Scanner;
public class find {


    void evenorodd (int num){
if (num % 2== 0){
System.out.println("number is even");
 
}

else
{
    System.out.println("number is odd");
}
       // return (num);
    }
    
public static void main (String args[]){

Scanner scan = new Scanner(System.in);

System.out.println("enter num value");
int num = scan.nextInt();


find obj1 = new find();



obj1.evenorodd(num);

}


}
