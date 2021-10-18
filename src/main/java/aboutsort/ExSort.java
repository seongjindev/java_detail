package aboutsort;

import java.util.*;
import java.util.stream.IntStream;

public class ExSort {
    public static void main(String[] args){
        System.out.println("1차원 배열 오름차순 sort");
        //1차원 배열 오름차순 sort
        int[] nums = {9,8,1,3,2};
        Arrays.sort(nums);
        for(int i : nums){
            System.out.print(i+" ");
        }
        System.out.println("----------");





        System.out.println("1차원 배열 오름차순 sort - compare 사용");
        //1차원 배열 오름차순 sort - compare 사용
        Integer[] nums3 = {9,8,1,3,2};
        Arrays.sort(nums3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for(int i : nums3){
            System.out.print(i+" ");
        }
        System.out.println("----------");





        System.out.println("1차원 배열 오름차순 sort - compareTo 사용");
        //1차원 배열 오름차순 sort - compareTo 사용
        Integer[] nums5 = {9,8,1,3,2};
        Arrays.sort(nums5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for(int i : nums5){
            System.out.print(i+" ");
        }
        System.out.println("----------");





        System.out.println("1차원 배열 내림차순 sort");
        //1차원 배열 내림차순 sort
        Integer[] nums2 = {9,8,1,3,2};
        Arrays.sort(nums2, Collections.reverseOrder());
        for(int i : nums2){
            System.out.print(i+" ");
        }
        System.out.println("----------");





        System.out.println("1차원 배열 내림차순 sort - compare 사용");
        //1차원 배열 내림차순 sort - compare 사용
        Integer[] nums4 = {9,8,1,3,2};
        Arrays.sort(nums4, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i : nums4){
            System.out.print(i+" ");
        }
        System.out.println("----------");





        System.out.println("1차원 배열 내림차순 sort - compareTo 사용");
        //1차원 배열 내림차순 sort - compareTo 사용
        Integer[] nums6 = {9,8,1,3,2};
        Arrays.sort(nums6, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i : nums6){
            System.out.print(i+" ");
        }
        System.out.println("----------");





        System.out.println("2차원 배열 오름차순 sort");
        //2차원 배열 오름차순 sort
        int[][] numsArray2 = {{1,3},{1,2},{3,4},{2,2},{5,1}};
//        Arrays.sort(numsArray2, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] == o2[0]) {
//                    return o1[1] - o2[1];
//                } else {
//                    return o1[0] - o2[0];
//                }
//            }
//        });

        Arrays.sort(numsArray2, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        for(int i=0; i<numsArray2.length; i++){
            System.out.println(numsArray2[i][0] + " " + numsArray2[i][1]);
        }
        System.out.println("----------");





        System.out.println("2차원 배열 오름차순 sort - Integer.compare 사용");
        int[][] numsArray = {{1,3},{1,2},{3,4},{2,2},{5,1}};
        //2차원 배열 오름차순 sort
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




        System.out.println("2차원 배열 내림차순 sort");
        //2차원 배열 내림차순 sort
        Arrays.sort(numsArray, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o2[1] - o1[1];
                } else {
                    return o2[0] - o1[0];
                }
            }
        });

        Arrays.sort(numsArray, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o2[1] - o1[1];
            } else {
                return o2[0] - o1[0];
            }
        });

        for(int i=0; i<numsArray.length; i++){
            System.out.println(numsArray[i][0] + " " + numsArray[i][1]);
        }
        System.out.println("----------");


        

        System.out.println("2차원 배열 내림차순 sort - Integer.compare 사용");
        //2차원 배열 내림차순 sort
//        Arrays.sort(numsArray, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] == o2[0]) {
//                    return Integer.compare(o2[1], o1[1]);
//                } else {
//
//                    return Integer.compare(o2[0], o1[0]);
//                }
//            }
//        });

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
        int cnt = 2000;
        int[] numbers = new int[2000];
        Random random = new Random();

        for(int i=0; i<cnt; i++){
            numbers[i] = random.nextInt();
        }
        long start = System.nanoTime();
        Arrays.sort(numbers); //DualPivotQuicksort
        System.out.println("serial sorting took " + (System.nanoTime() - start));

        for(int i=0; i<cnt; i++){
            numbers[i] = random.nextInt();
        }
        start = System.nanoTime();
        Arrays.parallelSort(numbers); //Merge Sort
        System.out.println("parallel sorting took " + (System.nanoTime() - start));

    }

}
