package Java;

import java.io.FileNotFoundException;
import java.util.LinkedList; //can be used for queues


public class QuickStart{
 
    public static void main(String[] args){
        
        LinkedList<String> shit_list = new LinkedList<String>();
        shit_list.push("Bitch"); //pushing to queue
        shit_list.push("cunt");
        shit_list.push("dick");
        
        System.out.println(shit_list.pop()); 
        System.out.println(shit_list.removeFirst()); //diff ways to remove/dequeue as a stack
        System.out.println(shit_list.remove());

    
    }
    


}