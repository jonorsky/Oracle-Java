import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double x,y;
    x = in.nextDouble();
    y = in.nextDouble();
    System.out.println("MEDIA = " + String.format("%.5f",((x+y)/2)));
  }
}
