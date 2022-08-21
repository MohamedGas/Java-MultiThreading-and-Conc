import java.util.ArrayList;
import java.util.List;

/***
 * In this exercise we are going to implement a  MultiExecutor .
 *
 * The client of this class will create a list of Runnable tasks and provide that list into MultiExecutor's constructor.
 *
 * When the client runs the  executeAll(),  the MultiExecutor,  will execute all the given tasks.
 *
 * To take full advantage of our multicore CPU, we would like the MultiExecutor to execute all the tasks in parallel, by passing each task to a different thread.
 * Please implement the MultiExecutor below
 */
public class MultiExecutor {
    private List<Runnable> tasks;

    public MultiExecutor(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    public void executeAll() {
        List<Thread> threads = new ArrayList<>();
        for (Runnable task : tasks) {
            Thread thread = new Thread(task);
            threads.add(thread);
        }
        for (Thread thread : threads) {
            thread.start();
        }
    }
}
