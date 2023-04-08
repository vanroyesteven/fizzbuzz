package com.steven.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    public void createGame() {
        Game g = new Game();
    }

    @Test
    public void getOutputForNumberMultipleOfThreeAndFive() {
        Game g = new Game();
        String output = g.getOutput(15);

        Assertions.assertThat(output).isEqualTo("FizzBuzz");
    }

    @Test
    public void getOutputForNumberMultipleOfThreeButNotOfFive() {
        Game g = new Game();
        String output = g.getOutput(9);

        Assertions.assertThat(output).isEqualTo("Fizz");
    }

    @Test
    public void getOutputForNumberMultipleOfFiveButNotOfThree() {
        Game g = new Game();
        String output = g.getOutput(5);

        Assertions.assertThat(output).isEqualTo("Buzz");
    }

    @Test
    public void getOutputForNumberNotMultipleOfThreeOrFive() {
        Game g = new Game();
        String output = g.getOutput(2);

        Assertions.assertThat(output).isEqualTo("2");
    }

    @Test
    public void playGame() {
        Game g = new Game();
        String[] output = g.play(15);

        String[] expectedOutput = new String[]{
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"
        };

        Assertions.assertThat(output).containsExactly(expectedOutput);

    }
}
