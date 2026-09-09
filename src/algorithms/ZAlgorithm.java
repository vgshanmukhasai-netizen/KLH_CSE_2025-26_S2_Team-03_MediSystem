package algorithms;

public class ZAlgorithm {

    public static boolean search(String text, String pattern) {

        String combined =
                pattern + "$" + text;

        int n = combined.length();
        int[] Z = new int[n];

        int L = 0;
        int R = 0;

        for(int i=1;i<n;i++) {

            if(i<=R)
                Z[i] = Math.min(
                        R-i+1,
                        Z[i-L]);

            while(i+Z[i] < n &&
                  combined.charAt(Z[i])
                  ==
                  combined.charAt(i+Z[i])) {

                Z[i]++;
            }

            if(i+Z[i]-1 > R) {

                L=i;
                R=i+Z[i]-1;
            }

            if(Z[i]==pattern.length())
                return true;
        }

        return false;
    }
}