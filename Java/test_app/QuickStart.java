package Java;

import java.io.FileNotFoundException;
import java.util.LinkedList; //can be used for queues


public class QuickStart{
 
    public static void main(String[] args) throws   FileNotFoundException{
        
        LinkedList<String> shit_list = new LinkedList<String>();
        shit_list.add("Bitch"); //adding to queue
        shit_list.add("cunt");
        shit_list.add("dick");
        
        System.out.println(shit_list.remove()); //remove from queue FIFO
        System.out.println(shit_list.remove());
        System.out.println(shit_list.remove());

        /*
        System.out.println(shit_list.removeLast()); //remove from queue FILO
        System.out.println(shit_list.removeLast());
        System.out.println(shit_list.removeLast());
        */

    }
    


}