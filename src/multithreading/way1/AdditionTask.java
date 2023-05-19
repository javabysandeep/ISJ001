package multithreading.way1;

public class AdditionTask {
    int start;
    int end;
    static long sum = 0;

    public AdditionTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public AdditionTask() {
    }

    void add() {
        for (long i = start; i < end; i++) {
            sum = sum + i;
        }
    }

    public static void main(String[] args) {
        AdditionTask additionTask = new AdditionTask();
        additionTask.add();
        System.out.println("Sum  " + sum);
    }
}
