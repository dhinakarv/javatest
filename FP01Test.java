import java.util.Comparator;
import java.util.List;

public class FP01Test {
    public static void main(String[] args) {
        //Print Even Numbers in a given list
        //printEvenNumberFunctional(List.of(3,4,5,7,2,3,5,78,54));
        //printOddNumberFunctional(List.of(3,4,5,7,2,3,5,78,54));
        printCourse(List.of("ABC","ABCD","Biology","Social","English","Tamil","Science","History"));
        //printLengthOfCourse(List.of("Social","Englishes","Tamil","Science","History"));
        printSortedWithLengthOfCourse(List.of("ABC","ABCD","Biology","Social","English","Tamil","Science","History"));


    }

    private static void printSortedWithLengthOfCourse(List<String> courses) {
        courses.stream().
                sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

    private static void printLengthOfCourse(List<String> courses) {
        courses.stream().
                map(String::length).
                forEach(System.out::println);
    }

    private static void printCourse(List<String> courses) {
        courses.stream().sorted(Comparator.reverseOrder()).
                //filter(s1 -> s1.contains("Eng")).
//                        filter(s1->s1.length()>5).
                forEachOrdered(x ->System.out.println("Output:"+x));
    }

    private static void printOddNumberFunctional(List<Integer> integers) {
        integers.stream().filter(i -> i %2 ==1)
                .forEach(System.out::println);
    }

    private static void printEvenNumberFunctional(List<Integer> integers) {
        integers.stream().
                filter(i -> i % 2 == 0).
                forEach(System.out::println);
    }
}
