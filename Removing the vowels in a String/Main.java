import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String st;
    StringBuilder sb = new StringBuilder(str);
    st = str.replaceAll("[aeiouAEIOU]", "");
      System.out.println(st);
    
    
  }
}