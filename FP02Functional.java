import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numberedList = List.of(1,2,3,4);
        List<Integer> doubledNumberList =  doubleList(numberedList);
        System.out.println("Double Numbered List:"+doubledNumberList);
        List<Integer> evenList =  evenList(numberedList);
        System.out.println("Even Number List:"+evenList);

        List<String> courses = List.of("ABC","ABCD","Biology","Social","English","Tamil","Science","History");
        List<Integer> courseLengthList =  getCoursesLnList(courses);
        System.out.println("Courses Length  List:"+courseLengthList);


    }

    private static List<Integer> getCoursesLnList(List<String> courses) {
       return courses.stream().
                map(String::length).
                collect(Collectors.toList());
    }

    private static List<Integer> doubleList(List<Integer> numberedList) {
        return numberedList.stream().
                map(n -> n * n).collect(Collectors.toList());
    }

    private static List<Integer> evenList(List<Integer> numberedList) {
        return numberedList.stream().
                filter(n -> n%2 ==0).collect(Collectors.toList());
    }
}
