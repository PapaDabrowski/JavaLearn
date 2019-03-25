//In this file i will check all of types avaliable in Java

 class Types{
   public static void main(String args[]){
     //Lets insert all Types
    int Lightspeed=3*(10^6); //Km/s
    long Distance;
    short hours=24;
    int seconds=3600;

    Distance=hours*seconds*Lightspeed;

    //print
    System.out.print("Real distance in space = ");
    System.out.println(Distance);

    //DynInit
    double a =3.0,b=4.0;
    double c= Math.sqrt(a*a+b*b); // xD
    System.out.println(c);
    //Scope
    int test=10;
    for(int i=1;i<4;i++){
      test+=5;
      int y=1;
      System.out.println("Value of test , Value of y");
      System.out.println(test+" "+ y);
      y+=100;
    }
    //y does not exist.
    System.out.println("Value of test stayed changed");
    System.out.println(test);



   }
 }
