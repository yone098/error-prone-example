package example;

/**
 * @author yone098
 */
public class Main {

    /**
     * main function.
     *
     * @param args program args.
     */
    public static void main(String[] args) {
        System.out.println("----- hello error prone -----");

        String[] nameArray = new String[]{"yone098", "mopemope"};
        System.out.println(nameArray);
        /*
        for (final String name : nameArray) {
            System.out.println(name);
        }
        */
    }
}
