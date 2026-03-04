import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Yes");
        strings.add("No");
        strings.add("Maybe");
        strings.add("You can count on it!");
        strings.add("Definitely not!");
        strings.add("Unclear. Try again later.");
        /* added new output for the 8-ball below */
        strings.add("You have to be kidding me bro");
        strings.add("Only if you can pay my");
        strings.add("In your dreams dumb dumb");
        strings.add("Maybe . . . got 20 bucks?");




        Random random = new Random();
        String randomString = strings.get(random.nextInt(strings.size()));
        System.out.println(randomString);
    }
}
