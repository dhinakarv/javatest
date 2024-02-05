import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        System.out.println("Hello FP01 Structured");
        //printListStructured(List.of(1,2,5,7,2,4,12,500,23));
        printEvenListStructured(List.of(1,2,5,7,2,4,12,500,23));
    }

    private static void printListStructured(List<Integer> numbers) {
        for(int i : numbers){
            System.out.println(i);
        }
    }

    private static void printEvenListStructured(List<Integer> numbers) {
        for(int i : numbers){
            if(i % 2==0)
            System.out.println(i);
        }
    }
}
