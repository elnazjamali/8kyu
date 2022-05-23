package Kataforloop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemovingElementTest
{

    @Test
    void tamirni() {
        Integer[] number = {7, 3, 9, 6, 2, 4, 5};
        Integer[] result = eliminate(number);

        assertEquals(7,result[0]);
        assertEquals(null,result[1]);
        assertEquals(9,result[2]);
        assertEquals(null,result[3]);
        assertEquals(2,result[4]);
        assertEquals(null,result[5]);
        assertEquals(5,result[6]);

    }
    private Integer[] eliminate(Integer[] number) {
       for (int i =1 ; i<=5;){

           number[i]= null;
           i +=2;
       }

        return number;
    }

    }


