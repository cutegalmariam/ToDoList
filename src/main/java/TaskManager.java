import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> taskList;

    public TaskManager(){
        taskList = new ArrayList<>();
    }

    public void addTask(Task task){
        taskList.add(task);
    }
    public void displayList(){
        taskList.forEach(task -> {
            System.out.println(task.getTitle());
        });
    }
}
