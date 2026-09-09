import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc =
                new Scanner(System.in);

        SearchEngine engine =
                new SearchEngine();

        while (true) {

            System.out.println(
                    "\n===== MEDISEARCH ====="
            );

            System.out.println(
                    "1. KMP Search"
            );

            System.out.println(
                    "2. Z Algorithm Search"
            );

            System.out.println(
                    "3. Trie Search"
            );

            System.out.println(
                    "4. Edit Distance Search"
            );

            System.out.println(
                    "5. Aho-Corasick Search"
            );

            System.out.println(
                    "0. Exit"
            );

            System.out.print(
                    "Choice: "
            );

            int choice =
                    sc.nextInt();

            sc.nextLine();

            if (choice == 0)
                break;

            System.out.print(
                    "Enter Query: "
            );

            String query =
                    sc.nextLine();

            switch (choice) {

                case 1:
                    engine.searchKMP(query);
                    break;

                case 2:
                    engine.searchZ(query);
                    break;

                case 3:
                    engine.searchTrie(query);
                    break;

                case 4:
                    engine.searchEditDistance(query);
                    break;

                case 5:
                    engine.searchAho(query);
                    break;

                default:
                    System.out.println(
                            "Invalid Choice"
                    );
            }
        }

        sc.close();
    }
}