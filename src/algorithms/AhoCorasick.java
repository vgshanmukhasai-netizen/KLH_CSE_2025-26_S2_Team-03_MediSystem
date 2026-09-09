package algorithms;

import java.util.*;

public class AhoCorasick {

    static class Node {

        HashMap<Character, Node> children =
                new HashMap<>();

        Node failure;
        List<String> output =
                new ArrayList<>();
    }

    private Node root = new Node();

    public void addPattern(String pattern) {

        Node current = root;

        for (char ch : pattern.toCharArray()) {

            current.children.putIfAbsent(
                    ch,
                    new Node()
            );

            current =
                    current.children.get(ch);
        }

        current.output.add(pattern);
    }

    public void buildFailureLinks() {

        Queue<Node> queue =
                new LinkedList<>();

        root.failure = root;

        for (Node child :
                root.children.values()) {

            child.failure = root;
            queue.add(child);
        }

        while (!queue.isEmpty()) {

            Node current =
                    queue.poll();

            for (char ch :
                    current.children.keySet()) {

                Node child =
                        current.children.get(ch);

                Node fail =
                        current.failure;

                while (fail != root &&
                        !fail.children.containsKey(ch)) {

                    fail = fail.failure;
                }

                if (fail.children.containsKey(ch)
                        && fail.children.get(ch) != child) {

                    child.failure =
                            fail.children.get(ch);

                } else {

                    child.failure = root;
                }

                child.output.addAll(
                        child.failure.output
                );

                queue.add(child);
            }
        }
    }

    public List<String> search(String text) {

        List<String> matches =
                new ArrayList<>();

        Node current = root;

        for (char ch :
                text.toCharArray()) {

            while (current != root &&
                    !current.children.containsKey(ch)) {

                current =
                        current.failure;
            }

            if (current.children.containsKey(ch)) {

                current =
                        current.children.get(ch);
            }

            matches.addAll(
                    current.output
            );
        }

        return matches;
    }
}