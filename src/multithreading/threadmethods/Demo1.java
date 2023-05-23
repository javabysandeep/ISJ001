package multithreading.threadmethods;

public class Demo1 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("Custom thread");
        },"thread");
        thread.setName("custom");
        thread.setPriority(5);
        thread.setDaemon(true);
        thread.start();

// 1. start() : it is used to start the execution of a thread
        // restarting a thread will cause an exception : IllegalThreadStateException

// 2. run(): it is used to call the subclass run method
// 3. setName(): it is used to set the name of thread
// 4. getName(): it returns the name of a thread
// 5. setPriority(): it is used to set the priority of thread
        //MIN : 0
        //MAX: 10
// If priority is not within range we get : //IllegalArgumentException
// By default priority is  : 5
// There are three constants are also created
    //MIN_PRIORITY = 1
    //NORM_PRIORITY = 5
    //MAX_PRIORITY = 10




    }
}
