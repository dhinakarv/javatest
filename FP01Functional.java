import java.util.List;
import java.util.function.Predicate;

public class FP01Functional {
    public static void main(String[] args) {
        System.out.println("Hello FP01 Structured");
        //printListFunctional(List.of(1,2,5,7,2,4,12,500,23));
        //printEvenListFunctional(List.of(1,2,20,304,5,7,2,4,12,500,23));
        //printSquaresOfEvenListFunctional(List.of(1,3,4,5,6));
        //printCubesOfOddList(List.of(1,3,4,5,6,7));
        System.out.println("Sum of List:"+printSumOfListFunctional(List.of(1,2,5,7,2,4,12,500,23)));
        System.out.println("Squared Sum of List:"+printSquaredSumOfListFunctional(List.of(1,2,3)));

        System.out.println("Sum of Odd Number in List:"+printSumOfOddNumberInListFunctional(List.of(1,2,5,5,7,2,4,12,2,500,23)));

        printDistinctNumberInList(List.of(1,2,5,5,7,2,4,12,2,500,23));

        System.out.println("Sum of Distinct Number in List:"+printDistinctNumberAddInList(List.of(1,2,5,5)));



    }

    private static void printDistinctNumberInList(List<Integer> integers) {
         integers.stream().distinct().forEach(x ->System.out.println("Distinct Number:"+x));
    }

    private static int printDistinctNumberAddInList(List<Integer> integers) {
        return integers.stream().distinct().reduce(0,Integer::sum);
    }




    private static int printSumOfOddNumberInListFunctional(List<Integer> integers) {
        return integers.stream().filter(n -> n % 2 ==1).
                reduce(0, Integer::sum);
    }

    private static int sumOf(int aggregate, int nextNumber){
        return aggregate+nextNumber;
    }

    private static int printSumOfListFunctional(List<Integer> integers) {
        //Combine all into 1 results
        return integers.stream().
                // reduce(0, FP01Functional::sumOf);
                //reduce(0,(x,y)->x+y);
                        reduce(0, Integer::sum);
    }
    private static int printSquaredSumOfListFunctional(List<Integer> integers) {
            //Combine all into 1 results
            return integers.stream().
                            map(n -> n * n).
                            reduce(0,Integer::sum);


    }

    private static void printCubesOfOddList(List<Integer> integers) {
        integers.stream().
                filter(n -> n %2 !=0).
                map(n -> n * n * n).
                forEach(System.out::println);
    }

    private static void printListFunctional(List<Integer> numbers) {
        //numbers.stream().forEach(FP01Functional::printNumbers);
        numbers.stream().
                forEach(System.out::println);
    }

    private static void printNumbers(Integer integer) {
        System.out.println(integer);
    }

    private static boolean isEven(int i){
        return i%2 ==0;
    }

    private static void printEvenListFunctional(List<Integer> numbers) {
        //numbers.stream().forEach(FP01Functional::printNumbers);
        Predicate<Integer> integerPredicate = n -> n % 2 == 0;
        numbers.stream().
        //filter(FP01Functional::isEven).
                //Lambda expression: simpler way to create method
                // To check number is divisible by 2 n -> n% 2 ==0
                filter(integerPredicate).//Lambda expression
                forEach(System.out::println);//Method Reference
    }

    private static void printSquaresOfEvenListFunctional(List<Integer> numbers) {
        //numbers.stream().forEach(FP01Functional::printNumbers);
        numbers.stream().
                //filter(FP01Functional::isEven).
                //Lambda expression: simpler way to create method
                // To check number is divisible by 2 n -> n% 2 ==0
                        filter(n -> n%2 ==0).//Lambda expression
                map(x->x*x).//mapping a number into number
                forEach(System.out::println);//Method Reference
    }
}
