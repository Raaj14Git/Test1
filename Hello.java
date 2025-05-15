public class Hello{


  String yourname(String name){

    return name;
  }

  public static void main (String args[]){

Hello obj1 = new Hello();

String name = obj1.yourname("raaj");


System.out.println(name);
  }
}