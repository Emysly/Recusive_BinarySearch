package com.company;

public class Recursive_BinarySearch {

        public static void binarySearch(int arr[], int key){
            int first = 0;
            int last = arr.length - 1;
            int mid = (first + last)/2;
            while( first <= last ){
                if ( arr[mid] < key ){
                    first = mid + 1;
                }else if ( arr[mid] == key ){
                    System.out.println("found the number at index " + mid);
                    break;
                }else{
                    last = mid - 1;
                }
                mid = (first + last)/2;
            }
            if ( first > last ){
                System.out.println(-1);
            }
        }
        public static void main(String args[]){
            binarySearch(new int[]{10,20,30,40,50}, 50);
        }

}
