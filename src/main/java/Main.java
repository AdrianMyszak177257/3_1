// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę wierszy gwiazdek:");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}

Maciasek kutasek
ALE BYM MACIASKA MATULE WYLIZAL
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
