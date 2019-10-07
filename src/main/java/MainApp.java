
import com.github.javafaker.Faker;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered " + userInput);
        if(!StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is not a number!");
        } else {
            System.out.println(userInput + " is a number!");
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));


        Faker faker = new Faker();

        String character = faker.rickAndMorty().character();
        String quote = faker.rickAndMorty().quote();
        String location = faker.rickAndMorty().location(); // Barton

        System.out.println(character);
        System.out.println(quote);
        System.out.println(location);

    }
}
