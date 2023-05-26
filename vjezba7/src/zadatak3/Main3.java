package zadatak3;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main3 {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        queue.add(12);
        queue.add(69);
        queue.add(784);
        queue.add(9001);
        queue.add(1979);
        System.out.println(queue);
        try{
            queue.add(1982);
        }catch (RuntimeException e){
            System.out.println("It is not possible to add more elements than determined...");
        }
        removeElement(queue,1);
        System.out.println(queue);
        addNewElement(queue, 777);
        System.out.println(queue);
        removeElement(queue, 0);
        addNewElement(queue, 9999);
        System.out.println(queue);

    }

    public static boolean removeElement(Queue<Integer> queue, int flag){
        boolean status = false;
        try{
            if (flag == 1){
                System.out.println("The element at index position 0 is being processed...");
                queue.remove(queue.remove());
                System.out.println(queue);
                status = true;
            } else if (flag == 0) {
                System.out.println("The queue is in waiting stage....");
            }
        }catch (RuntimeException e){
            System.out.println("Enter 1 or 0 to see something happen");

        }
        return status;
    }

    public static void addNewElement(Queue<Integer> queue, int newEl){
        try{
            queue.add(newEl);
            System.out.println("Adding a new element to the queue...");
        }catch (RuntimeException e){
            System.out.println("There is no space in the queue!");
        }
    }
}
