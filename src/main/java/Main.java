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

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }

    Zadanie 25. Obliczanie sumy cyfr liczby całkowitej

    Opis zadania:
    Napisz program w języku Java, który:

    1. Wczyta od użytkownika liczbę całkowitą (może być dodatnia lub ujemna).
    2. Obliczy sumę wszystkich cyfr tej liczby (ignorując znak minus, jeśli występuje).

        Przykład: dla liczby `-1234` → suma cyfr to `1 + 2 + 3 + 4 = 10`.
    3. Wyświetli wynik w formacie:

        „Suma cyfr: 10".

MASZ TTUTAJ 
        
import java.util.Scanner;

public class SumaCyfr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wczytanie liczby od użytkownika
        System.out.print("Podaj liczbę całkowitą: ");
        int liczba = scanner.nextInt();

        // Zamiana liczby na wartość bezwzględną (ignorowanie znaku minus)
        liczba = Math.abs(liczba);

        int suma = 0;

        // Obliczanie sumy cyfr
        while (liczba > 0) {
            suma += liczba % 10;  // dodaj ostatnią cyfrę
            liczba /= 10;         // usuń ostatnią cyfrę
        }

        // Wyświetlenie wyniku
        System.out.println("Suma cyfr: " + suma);
    }
}
