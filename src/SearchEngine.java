import algorithms.*;
import java.util.*;

public class SearchEngine {

    private List<Patient> patients;

    public SearchEngine() {
        patients = CorpusLoader.loadCorpus();
    }

    public void searchKMP(String query) {

        System.out.println("\nKMP Results:");

        for (Patient p : patients) {

            if (KMP.search(
                    p.toString(),
                    query)) {

                System.out.println(p);
            }
        }
    }

    public void searchZ(String query) {

        System.out.println("\nZ Results:");

        for (Patient p : patients) {

            if (ZAlgorithm.search(
                    p.toString(),
                    query)) {

                System.out.println(p);
            }
        }
    }

    public void searchTrie(String disease) {

        Trie trie = new Trie();

        for (Patient p : patients) {
            trie.insert(
                    p.getDisease()
            );
        }

        System.out.println(
                "\nTrie Search Result = "
                + trie.search(disease)
        );
    }

    public void searchEditDistance(String query) {

        System.out.println(
                "\nClosest Matches:"
        );

        for (Patient p : patients) {

            int dist =
                    EditDistance.calculate(
                            query,
                            p.getDisease()
                    );

            if (dist <= 2) {

                System.out.println(
                        p + " | Distance="
                        + dist
                );
            }
        }
    }

    public void searchAho(String query) {

        AhoCorasick aho =
                new AhoCorasick();

        aho.addPattern(query);

        aho.buildFailureLinks();

        System.out.println(
                "\nAho-Corasick Results:"
        );

        for (Patient p : patients) {

            List<String> matches =
                    aho.search(
                            p.toString()
                    );

            if (!matches.isEmpty()) {

                System.out.println(p);
            }
        }
    }
}