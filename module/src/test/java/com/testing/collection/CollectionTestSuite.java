package com.testing.collection;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName ("check how program behave if List is empty")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List <Integer> numbers = new ArrayList<>();
        List <Integer> exterminate = new ArrayList<>();
        Random random = new Random();

        System.out.println(exterminate);

        //When


        //Then
        Assertions.assertTrue(exterminate.isEmpty());


    }

    @DisplayName ("check if program sort for even numbers" +
            "from the List")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        List <Integer> numbers = new ArrayList<>();
        List <Integer> exterminate = new ArrayList<>();
        Random random = new Random();

        //Whem
        for  (int n = 0 ; n < 5 ; n++){
            numbers.add(random.nextInt(10));
        }
        System.out.println(numbers);

        for (int n = 0 ; n < 5 ; n++){
            if (numbers.get(n) % 2 == 0){
                exterminate.add(numbers.get(n));
            }
        }
        System.out.println(exterminate);

        //Then
        for (int n = 0 ; n < exterminate.size() ; n++){
            Assertions.assertTrue(exterminate.get(n) % 2 == 0);
        }


        }









}
