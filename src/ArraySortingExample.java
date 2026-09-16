import java.time.LocalDate;
import java.util.Arrays;

import static edu.upc.eetac.dsa.utils.Utils.sort;

public class ArraySortingExample {
    public static void main(String[] args) {

        System.out.println("Hello, World!");


        String[] v1 = {"1", "3", "4", "1000", "20", "33"};
        Integer[] v2 = {1, 3, 4, 1000, 20, 33};
        int[] v3 = {1, 3, 4, 1000, 20, 33};
        LocalDate[] v4 = {
                LocalDate.of(2023, 12, 10),
                LocalDate.of(2024, 1, 20),
                LocalDate.of(2022, 6, 5),
                LocalDate.of(1980, 3, 30)
        };

        String[] v5 = {
                "15/03/1980",
                "10/12/1980",
                "20/01/1980",
                "05/06/2022"
        };


        sort(v1);
        sort(v2);
        sort(v3);
        sort(v4);
        sort(v5);

    }



}