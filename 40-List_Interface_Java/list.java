
import java.util.ArrayList;
import java.util.List;

public class list {

    public static void main(String[] args)
     {
    ArrayList<Integer> numbers =new ArrayList<>();
    ArrayList<Integer> numbers1 =new ArrayList<>();

       numbers.add(21);
       numbers.add(22);
       numbers.add(23);

       System.out.println(numbers);

      // methods of the Collection interface that's also available in the List interface are: GET,SET,REMOVE,ADD;
       int element =numbers.get(0);
       System.out.println(element);

       

       int removeElement =numbers.remove(0);
       System.out.println(removeElement);

          

       int changeElement=numbers.set(1,32);
       System.out.println(changeElement);

        numbers.add(33);

        System.out.println(numbers);

        numbers1.addAll(numbers);
        System.out.println(numbers1);

       System.out.println(  numbers.size());

       
     System.out.println(numbers.contains(32));
      
       


    }
}







      
