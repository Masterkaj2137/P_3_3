import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Podaj wysokosc boku: ");
    int n = scanner.nextInt();
    
//Pierwszy trójkąt
    
    for (int k = 0; k < n; k++){

      for(int i = 0; i <= k; i++){
      System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();

//Drugi trójkąt
    
    for (int k = 0; k < n; k++){

    for(int i = 0; i <= k; i++){
      if(i==0||i==k || k == n-1){
        System.out.print("*");
      }
      else{
        System.out.print(" ");
      }
    }
    System.out.println();
  }
    System.out.println();

//Trzeci trójkąt
    
    for (int k = 0; k < n; k++){

      for(int i = 0; i <(n-k-1); i++){
      System.out.print(" ");
      }
      for (int j = 0; j < k+1; j++){
      System.out.print("*");
      }
      System.out.println();
    }
    System.out.println();

    //Czwarty trójkąt

    for (int k = 0; k < n; k++){

      for(int i = 0; i <(n-k-1); i++){
        System.out.print(" ");
      }
      for(int i =0; i<=k; i++){
        if(i==0 || i==k || k == n-1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    
  
  }
}