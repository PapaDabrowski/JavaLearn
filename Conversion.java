
class Conversion{
  public static void main(String args[]) {
    byte b;
    int l=2523;
    double d=323.143;

    //Part Conversion
    System.out.println("Conversion from int to byte");
    b=(byte) l;
    System.out.println("Result "+ b);

    System.out.println("Conversion from double to int");
    l=(int) d;
    System.out.println("Result "+ l);

    System.out.println("Conversion from double to byte");
    b=(byte) d;
    System.out.println("Result "+ b);

    //Part Array
    int FirstArray[];
    FirstArray=new int[10];

    for(int i=0;i<10;i++)
        FirstArray[i]=20-i;

    for(int i=0;i<10;i++)
      System.out.println("Value of FirstArray["+(i+1)+"] ="+FirstArray[i]);

    int SecondArray[]={10,11,12,13,14,15,16,17,18,19};
    int ThirdArray[]=new int [10];
    int FourthArray[][]=new int [10][10];

    for(int i=0;i<10;i++)
        for(int j=0;j<10;j++)
             FourthArray[i][j]=i+j;

    for(int i=0;i<10;i++) {
      for(int j=0;j<10;j++) {
        System.out.print(FourthArray[i][j] +" ");
      }
      System.out.println("");
    }

    //diffrent dimensions array
    int DiffrentArray[][]=new int[5][];
    for(int i=0;i<5;i++) DiffrentArray[i]=new int[i+1];


    /* Here we can use this arrays but i don't want to write useless code...
       or maybe not xD
    */
    int[] num1, num2, num3; //three diffrent arrays
  }
}
