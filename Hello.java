import java.util.Scanner;
class Hello{

  public static void main (String args[]){
for (int i =1 ; i<=10; i++){
System.out.println(i +" X 2 = " + i*2);


}

Scanner scan = new Scanner(System.in);

System.out.println("enter the size of the array");
int size = scan.nextInt();


int a[] = new int[size];

for ( int x = 0; x <= (size -1); x++ ){
  System.out.println("enter array value" + "a[" +x + "]");
  a[x] = scan.nextInt();
  
}

for (int x = 0; x < size; x++ ){

System.out.println("a" + "[" + x+"] = " + a[x]);
}
int half = ((size/2) );

System.out.println("middle of the array a is " + half + " value is "+ a[half]);

  }
}