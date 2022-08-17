package queueuse;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args){
        Queue<Integer> queue=new ArrayDeque<>();
        for(int i=1;i<=5;i++)
            queue.add(i);
        System.out.println(queue);
        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
