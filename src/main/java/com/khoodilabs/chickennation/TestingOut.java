package com.khoodilabs.chickennation;

import java.util.Arrays;

/**
 * @author Muyinda Rogers
 * @Date 2024-11-26
 * @Email moverr@gmail.com
 */
public class TestingOut {

    public static void main(String[] args) {
        System.out.println("May the Lord limit me AMEN");

        TestingOut out = new TestingOut();
        out.binarySearch();

    }


    //todo: given an array find the sum of all elements between indices
    // i and j


//    2 pointer problem



    public void binarySearch(){
        int[] nums = {1,2,3,4,5,6,7};
        int target = 3;

        //find target : binary search ::

        int low =0;
        int high = nums.length -1;
        for(low =0;low<= high; low ++){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                System.out.println("------"+nums[mid]);
            }

            if(nums[mid] > target){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }

    }
    //todo: shifiting the window ::
    public  void solution4(){

        int nums [] = {2,1,5,1,33,2};
        int k = 3;

         int maximum = 0;

         //todo: first calcucate the window
        int end = k;
        int start = 0;

        for(int i =0; i < nums.length-k; i ++) {
            int windowsum = 0;

            for (int index = start; index < end; index++) {

                windowsum += nums[index];

            }
            if(windowsum > maximum){
                maximum = windowsum;
            }

            end = end + 1;
            start = start + 1;
        }


        System.out.println("Maxium : "+maximum);

    }


    public void solution3(){

        int nums[] = {1,2,3,4,6};

         Arrays.stream(nums).sorted();

        int target = 5;

        int left = 0;
        int right = nums.length-1;

        int index = 0;

        int values[] = new int[2];
        for( index = 0; index < right; index ++){

            int result =  nums[left] + nums[right];
            if(result == target){
                values[0] = nums[left];
                values[1] = nums[right];

                break;
            }
            if(result > target){
                right --;
            }
            else
                left ++;


        }

        System.out.println(values[0]+" THEN " +values[1]);
    }

    //solution 2
    public void solution2(){
        int nums[] = {1,2,3,4,5,6};
        int i = 1;
        int j = 3;

        int sum = 0;
int index ;
        for(index = i;     index <= j; index ++){


                sum += nums[index];

        }

        System.out.println("Result :"+sum);

    }


    public void solution1(){
        int nums[] = {1,2,3,4,5,6};
        int i = 1;
        int j = 3;

        int sum = 0;

        for(int index = 0; index <nums.length; index ++){

            if(index >= i && index <= j){
               sum += nums[index];
            }
        }

        System.out.println("Result :"+sum);

    }

    public  void   simpleArray(){
        //todo: loop through elements

        int x[] = {1,2,3,4,5};

        for(int index = 0; index < x.length; index++){
            System.out.println(x[index]);
        }

    }
}
