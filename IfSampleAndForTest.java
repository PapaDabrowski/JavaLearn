
class IfSampleAndForTest{
  public static void main(String args[]){
    int x,y;
    x=1;y=1;
    //Testing if in for loop
    for(int i=1;i<10;i++){
      if(x==y){
        System.out.println("Case 1");
        x=3;
        y=1;
        System.out.println("LWAY");
        }

      if(x>y){
        System.out.println("Case 2");
        x=1;
        y=3;
        System.out.println("LWAY");
        }

      if(x<y){
        System.out.println("Case 3");
        x=2;
        y=2;
        System.out.println("LWAY");
        }
      }
  }
}
