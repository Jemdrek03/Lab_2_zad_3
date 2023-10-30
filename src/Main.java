import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Tworzenie obu typow map
        Map<String, String> hash = new HashMap<>();
        Map<String, String> tree = new TreeMap<>();

        //petla, ktora dodaje klucze i wartosci do map
        while(true)
        {
            System.out.println("Wpisz klucz lub 'zakoncz' jezeli chcesz zakonczyc");
            String key = scanner.nextLine();

            if(key.equals("zakoncz"))
            {
                break;
            }
            System.out.println("Wpisz wartosc dla podanego przed chwila klucza");
            String value = scanner.nextLine();

            hash.put(key,value);
            tree.put(key,value);
        }

        //Wyswietlanie HashMapy
        System.out.println("Wyswietlanie HashMapy");
        for(String key : hash.keySet())
        {
            System.out.println("Klucz: " + key + " , Wartosc: " + hash.get(key));
        }
        System.out.println();

        //Wyswietlanie TreeMapy
        System.out.println("Wyswietlanie TreeMapy");
        for(String key : tree.keySet())
        {
            System.out.println("Klucz: " + key + " , Wartosc: " + tree.get(key));
        }


        scanner.close();
    }
}