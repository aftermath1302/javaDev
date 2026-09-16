// Imagine a video player has these threads:
// Video decoding       → Priority 10
// Audio processing     → Priority 10
// Downloading subtitles → Priority 5
// Checking for updates  → Priority 1
// If the CPU becomes busy, you'd rather it spend time on decoding the video and processing audio than checking for updates.


// class A implements Runnable{                        //since thread implements Runnable which has the run method thus implement run but we dont have start in runnable
//     public void run() {                             //why runnable because then we can extend another class while we cant in thread class
//         for (int i = 0; i < 10; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
//implementing use anonymous inner class and lambda function


class B extends Thread {
    public void run() { // start in thread class executes run method
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threadDemo {
    public static void main(String a[]) {

        //runnable is functional interface(single) hence can use lambda function 
        Runnable obj = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        B obj1 = new B();

        obj1.setPriority(Thread.MAX_PRIORITY);               //highest priority is 10 lowest is 1 and normal is 5 by default
        System.out.println(obj1.getPriority());
        
        Thread t = new Thread(obj);
        t.start();                                           //they start and run
        try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        obj1.start();                                         //creates the thread
    }
}
