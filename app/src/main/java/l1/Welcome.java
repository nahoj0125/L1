package l1;
import java.util.Scanner;
import java.util.Random;

public class Welcome {
  private Scanner scanner;

  public Welcome() {
    scanner = new Scanner(System.in);
  }

  public void run() {
    String greeting = generateGreeting();
    String color = generateColor();
    String name = getName();
    String stopColorCoding = "\u001B[0m";
    displayWelcomeMessage(greeting, color, name, stopColorCoding);
    scanner.close();
  }

  public String getName() {
    System.out.println("What is your name?");
    String name = scanner.nextLine();
    if (name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be empty.");
    }
    return name;
  }

  public String generateGreeting () {
    Random random= new Random();
    String greetings[] = {"Hello", "Hi", "Salutations", "Howdy", "Greetings"};
    int randomNumber = random.nextInt(greetings.length);
    return greetings[randomNumber];
  }

  public String generateColor() {
    Random random= new Random();
    // Colors in the following order: Red, Green, Yellow, Blue, Purple, Cyan
    String colors[] = {"\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m"};
    int randomNumber = random.nextInt(colors.length);
    return colors[randomNumber];
  }

  public String createAsciiArt() {
        return("\r\n" +
            "    \u001B[33m\\_/\r\n" +
            "  --(_)--\u001B[0m  .\r\n" +
            "    \u001B[33m/ \\\u001B[0m   /_\\\r\n" +
            "          |O|\r\n" +
            "    .-----' '-----.                                  \u001B[32m__\r\n\u001B[0m" + 
            "   /____[L N U]____\\                                \u001B[32m(())\r\n\u001B[0m" +
            "    | [] .-.-. [] |                                \u001B[32m((()))\r\n\u001B[0m" +
            "  ..|____|_|_|____|..................................||...");
  }
  
    public String createBorder() {
    return "\r\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n";
  }

  public void displayWelcomeMessage(String greeting, String color, String name, String colorCoding) {
    System.out.println(createBorder());
    System.out.println(greeting + " " + color + name + colorCoding + "!\n");
    System.out.println("Welcome to 1dv610!");
    System.out.println(createAsciiArt());
    System.out.println(createBorder());
  }
}
