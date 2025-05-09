import java.util.Scanner;

class Hello{

  public static void main (String arg[]){

    int a[] = new int[5];


    Scanner scan = new Scanner(System.in);
for (int i = 0; i<5 ; i++)
{
  System.out.println("enter value "+ i);
a[i] = scan.nextInt();

}

for (int j =0 ; j<5; j++)
System.out.println("A" + j + "=" +a[j]);
  }
}