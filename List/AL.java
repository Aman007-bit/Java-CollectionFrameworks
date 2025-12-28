import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AL{
    public static void main(String[] args){

        //  create Arraylist
        List<Integer> list = new ArrayList<>();

        // add function
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // Add new element on particular index
        list.add(1,50);
        System.out.println(list);

        // create new list
        List<Integer> newlist = new ArrayList<>();
        list.add(30);
        list.add(40);
        list.add(50);

        // add newlist in the current list by using "addAll" function
        list.addAll(newlist);
        System.out.println(list);

        // using "get" function we can get/access the element of a particular index
        System.out.println(list.get(1));

        // using"remove" function we can delete the element from a particular index
        list.remove(1);
        System.out.println(list);

        // we want to delete a value not a index
        list.remove(Integer.valueOf(30));
        System.out.println(list);

        // using "clear" function we can delete all the elements from array
        // list.clear();
        // System.out.println(list);

        // "Set" function is needed when you want to upgrade the value of
        // the element at a set position
        list.set(2, 1000);
        System.out.println(list);

        // "contains" function helps to check if an element is present in or not
        System.out.println(list.contains(40)); 

        // for(int i=0; i<list.size(); i++){
        //     System.out.println(list.get(i));
        // }

        // "iterator" function helps to iterate inside any collection easily
        // It has several finctionality
        Iterator<Integer> it = list.iterator();
        
        // (i) "hasNext" function tells if there is a next elemnt in the iterator
        // .next helps us to acces the next value of the iterator
        while(it.hasNext()){
            System.out.println("iterator" + it.next());
        }

    }
}