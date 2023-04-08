package com.steven.fizzbuzz;

public class Game {


    public String getOutput(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
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
}
