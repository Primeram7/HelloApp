public class HelloApp {
    public static void main(String[] args) {

        // Case 1: No arguments → Default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments present → Use String.join()
        String names = String.join(", ", args);

        // Final output
        System.out.println("Hello, " + names + "!");
    }
}
