package StreamApi.ParalelleStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParalellStream {
    public static void main(String[] args) {

        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();
        for(int i=1; i<=size; i++){
            nums.add(ran.nextInt(100));
        }

        long startSeq = System.currentTimeMillis();
        int Sum1 = nums.stream()
                   .map(i -> {
                        try{
                        Thread.sleep(1);
                    }catch(Exception e){
                    }
                        return i*2;
                    })
                   .mapToInt(i->i)
                   .sum();
        long endSeq = System.currentTimeMillis();

        long startpara = System.currentTimeMillis();
        int Sum2 = nums.parallelStream()
                   .map(i -> {
                        try{
                        Thread.sleep(1);
                    }catch(Exception e){
                    }
                        return i*2;
                    })
                   .mapToInt(i->i)
                   .sum();
        long endPara = System.currentTimeMillis();

        System.out.println(Sum1 + " " + Sum2);
        System.out.println("seq" + (startSeq - endSeq));
        System.out.println("para" + (startpara - endPara));
    }
}
