import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Yes");
        strings.add("No");
        strings.add("Maybe");
        strings.add("Signs point to yes");
        strings.add("You can count on it!");
        strings.add("Definitely not!");
        strings.add("Unclear. Try again later.");

        Random random = new Random();
        String randomString = strings.get(random.nextInt(strings.size()));
        System.out.println(randomString);
    }
}
