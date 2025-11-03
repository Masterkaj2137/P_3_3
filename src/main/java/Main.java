import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Podaj wysokosc boku: ");
    int n = scanner.nextInt();

    for (int k = 0; k < n; k++){

      for(int i = 0; i <= k; i++){
      System.out.print("*");
      }
      System.out.println();
    }
    System.out.println(); 
  }
}