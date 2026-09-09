package algorithms;

import java.util.HashMap;

public class Trie {

    static class Node {

        HashMap<Character, Node> children =
                new HashMap<>();

        boolean endOfWord = false;
    }

    private Node root = new Node();

    public void insert(String word) {

        Node current = root;

        for(char ch : word.toCharArray()) {

            current.children.putIfAbsent(
                    ch,
                    new Node()
            );

            current =
                    current.children.get(ch);
        }

        current.endOfWord = true;
    }

    public boolean search(String word) {

        Node current = root;

        for(char ch : word.toCharArray()) {

            if(!current.children.containsKey(ch))
                return false;

            current =
                    current.children.get(ch);
        }

        return current.endOfWord;
    }
}