public class Task {
    private String title;
    private State state;

    public Task(String title, State state){
        this.title = title;
        this.state = state;
    }
    public Task(String title){
        this.title = title;
        state = State.TODO;
    }
    public void setState(State state) {
        this.state = state;
    }
    public void setTitle(String title){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String getTitle(){
        return title;
    }
}
