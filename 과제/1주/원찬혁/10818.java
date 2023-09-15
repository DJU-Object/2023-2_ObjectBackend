import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 5, max=-1000000, min = 1000000;
        int[] ary = {20,10,35,30,7};

        for(int it : ary) {
            if(max < it) max = it;
            if(min > it) min = it;
        }
        System.out.println(min + " " + max);
    }
}