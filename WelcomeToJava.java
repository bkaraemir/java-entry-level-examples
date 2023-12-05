public class WelcomeToJava {

    public static void printWelcomeMessage() {
        String welcomeText = "Java'ya hoş geldiniz";

        for (int i = 0; i < 5; i++) {
            System.out.println(welcomeText);
        }
    }

    public static void main(String[] args) {
        // Call the method to print the welcome message five times
        printWelcomeMessage();
    }
}
