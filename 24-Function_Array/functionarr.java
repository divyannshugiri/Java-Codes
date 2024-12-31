// Array as Function Arguments

public class functionarr
{
    public static void update(int marks[],int nonchangeable)
    {
        nonchangeable=22;
        
        for(int i=0;i<marks.length;i++){
        marks[i] =marks[i] + 1;
    }
    }
    
    public static void main(String[] args) {
        int marks[] = {92,93,94};                  //Passed By Reference - will change
        int nonchangeable=19;                      //Passed By Value     - does not change  The reason 19 is not changed is because nonchangeable is passed by value. 
                                                                                            //So the modification inside the method only affects the local copy of nonchangeable inside the update method, not the original variable in the main method.

        update(marks,nonchangeable);
        System.out.println(nonchangeable);
       
        for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
        
        
        }

    }
}