import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Template.showTemplate();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        TaskManager taskManager = new TaskManager();
        InputParser parser = new InputParser(taskManager);
        parser.parse(userInput);
        taskManager.displayList();
    }
}
