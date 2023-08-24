package com.testing.collection;

import java.util.*;

public class OddNumbersExterminator {


    List <Integer> numbers = new ArrayList<>();
    public List<Integer> numbers(){
        Random random = new Random();
        for  (int n = 0 ; n < 5 ; n++){
            numbers.add(random.nextInt(10));
        }
        return  numbers;
    }

    //  Solution1:
    public List<Integer> exterminate(){
        List <Integer> exterminate = new ArrayList<>();
        Random random = new Random();
        for (int n = 0 ; n < 5 ; n++){
            if (numbers.get(n) % 2 == 0){
                exterminate.add(numbers.get(n));
            }
        }
        return exterminate;
    }

}
