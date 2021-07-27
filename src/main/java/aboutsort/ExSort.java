package aboutsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public class ExSort {
    public static void main(String[] args){
        //1차원 배열 오름차순 sort
        int[] nums = {9,8,1,3,2};
        Arrays.sort(nums);
        for(int i : nums){
            System.out.print(i+" ");
        }
        System.out.println("----------");

        //1차원 배열 내림차순 sort
        Integer[] nums2 = {9,8,1,3,2};
        Arrays.sort(nums2, Collections.reverseOrder());
        for(int i : nums2){
            System.out.print(i+" ");
        }
        System.out.println("----------");

        //2차원 배열 오름차순 sort
        int[][] numsArray = {{1,3},{1,2},{3,4},{2,2},{5,1}};
//        Arrays.sort(numsArray, new Comparator<int[]>() { //@FunctionalInterface 함수형 인터페이스이다
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0]==o2[0]){
//                    return Integer.compare(o1[1],o2[1]);
//                }else{
//                    return Integer.compare(o1[0],o2[0]);
//                }
//            }
//        });

        Arrays.sort(numsArray, (o1, o2) -> { //람다 표현식으로 바꿀 수 있다
            if(o1[0]==o2[0]){
                return Integer.compare(o1[1],o2[1]);
            }else{
                return Integer.compare(o1[0],o2[0]);
            }
        });

        for(int i=0; i<numsArray.length; i++){
            System.out.println(numsArray[i][0] + " " + numsArray[i][1]);
        }

        System.out.println("----------");

        //2차원 배열 내림차순 sort
        Arrays.sort(numsArray, (o1, o2) -> {
            if(o1[0] == o2[0]){
                return Integer.compare(o2[1], o1[1]);
            }else{
                return Integer.compare(o2[0], o1[0]);
            }
        });

        for(int i=0; i<numsArray.length; i++){
            System.out.println(numsArray[i][0] + " " + numsArray[i][1]);
        }


        //효율성은 같다 - 시간 O(nlogN) 공간 O(n)
        int size = 1500;
        int[] numbers = new int[size];
        Random random = new Random();

        IntStream.range(0,size).forEach(i -> numbers[i] = random.nextInt());
        long start = System.nanoTime();
        Arrays.sort(numbers); //DualPivotQuicksort
        System.out.println("serial sorting took " + (System.nanoTime() - start));

        IntStream.range(0, size).forEach(i -> numbers[i] = random.nextInt());
        start = System.nanoTime();
        Arrays.parallelSort(numbers); //Merge Sort
        System.out.println("parallel sorting took " + (System.nanoTime() - start));
    }
}
