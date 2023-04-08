package com.steven.fizzbuzz;

public class Game {


    public String getOutput(int number) {
        if (isMultipleOfThreeAndFive(number)) {
            return "FizzBuzz";
        } else if (isMultipleOfThree(number)) {
            return "Fizz";
        } else if (isMultipleOfFive(number)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    public String[] play(int end) {
        String[] output = new String[end];
        for (int i = 0; i < end; i++) {
            output[i] = getOutput(i + 1);
        }
        return output;
    }

    private static boolean isMultipleOfThreeAndFive(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    private static boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private static boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }
}
