package kata8kyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareOrSquareRootTest {
    @Test
    void Square_SquareRoot() {
        int[] numbers = {4,3,9,7,2,1};
        int[] result = new_numbers(numbers);

        assertEquals(2,result[0]);
        assertEquals(9,result[1]);
        assertEquals(3,result[2]);
        assertEquals(49,result[3]);
        assertEquals(4,result[4]);
    }
    private int[] new_numbers (int[] numbers){

        for(int i = 0 ; i <= 5; i++){
            if( Math.sqrt(numbers[i]) % 1 ==0) {
                numbers[i] = (int) Math.sqrt(numbers[i]);
            } else{
                numbers[i] = numbers[i] * numbers[i];
            }
        }
        return numbers;
    }
}
