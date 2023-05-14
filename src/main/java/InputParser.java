import java.lang.reflect.Array;
import java.util.Arrays;

public class InputParser {
    private final TaskManager taskManager;

    public InputParser(TaskManager taskManager){
        this.taskManager = taskManager;
    }

    public void parse(String userInput){
        String[] inputArr = userInput.split("\\s+");
        String command = inputArr[0];
        String content = withoutFirst(inputArr); // = somehowCalucalte123zzxc();
        switch (command){
            case "add":
                taskManager.addTask(new Task(content));
                break;
//            case "remove"
        }
    }
    private String withoutFirst(String[] inputArr){
        String result = "";
        for(int i=1; i<inputArr.length; i++){
            result += inputArr[i];
        }
        return result;
    }
}
