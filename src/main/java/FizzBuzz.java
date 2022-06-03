public class FizzBuzz {
    /* Write a program that prints the numbers from 1 to 100.
    But for multiples of three print “Fizz” instead of the number
    and for the multiples of five print “Buzz”.
    For numbers which are multiples of both three and five print “FizzBuzz”.
     */

    enum FizzBuzzEnum {
        Fizz, Buzz, FizzBuzz;
    }

    public String print(int number) {

        String output;
        if (estMultipleDeTrois(number) && estMultipleDeCinq(number)) {
            output = FizzBuzzEnum.FizzBuzz.name();
        } else if (estMultipleDeTrois(number)) {
            output = FizzBuzzEnum.Fizz.name();
        } else if (estMultipleDeCinq(number)) {
            output = FizzBuzzEnum.Buzz.name();
        } else {
            output = Integer.toString(number);
        }

        return output;
    }

    private boolean estMultipleDeTrois(int number) {
        return (number % 3 == 0);
    }

    private boolean estMultipleDeCinq(int number) {
        return (number % 5 == 0);
    }

}
