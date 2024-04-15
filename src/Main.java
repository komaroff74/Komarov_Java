import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        CalculatorService calc = new CalculatorService();
        int a = 3;
        int b = 9;
        String max = calc.max(a, b);
        System.out.println("a = " + a + " b = " + b);
        System.out.println(max);
        System.out.println(a + " + " + b + " = " + calc.addition(a, b));
        System.out.println(a + " - " + b + " = " + calc.subtraction(a, b));
        System.out.println(a + " * " + b + " = " + calc.multiplication(a, b));
        System.out.println(a + " / " + b + " = " + calc.division(a, b));


        StringsService string = new StringsService();
        String firstLine = "test string";
        String secondLine = "test string";
        String thirdLine = "testString";
        System.out.println(string.compare(firstLine, secondLine));
        System.out.println(string.compare(firstLine, thirdLine));


        ArrayService array = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array.getEvenNumbers(arr)));

    }
}





