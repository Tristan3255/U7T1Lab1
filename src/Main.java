import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*
        ArrayList<String> trees = new ArrayList<String>();
        trees.add("pine");
        trees.add("maple");
        trees.add("frasier fir");

        System.out.println(trees.size());
        System.out.println(trees);
        System.out.println(trees.get(1));
         */

        ArrayList<String> names = new ArrayList<String>();
        names.add("Benji");
        names.add("Andy");
        String[] moreNames = {"Crystal", "Monica", "Toby"};
        int lengths = names.size() + moreNames.length + moreNames[0].length() + names.get(0).length();
                System.out.println(lengths);

    }
}
