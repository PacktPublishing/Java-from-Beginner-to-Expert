package summingvalues;

public class Summingvalues {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 412, 14, -12};
        
        int sum = 0;
    
        for (int number: numbers)
        {
            sum += number;
        }
        
        System.out.println(sum);
      
    }
    
}
