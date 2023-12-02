import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

// جایپشت های یک رشته ورودی
public class Q1 {
    public static void main(String[] args) {
        String str = getStringFromUser();

        Set<String> perm = getPermutationOfAString("ABC");
        Iterator<String> itr = perm.iterator();

        while (itr.hasNext()) {

        }

    }
    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }

    private static Set<String> getPermutationOfAString(String str) {
        Set<String> permutation = new HashSet<>();

        permutation.add("Hassan");
        permutation.add(str);
        return permutation;
    }
}
