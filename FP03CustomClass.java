import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Course {

    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }
    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }


    @Override
    public String toString() {
        return name+":"+noOfStudents+":"+reviewScore;
    }

}

public class FP03CustomClass {

    public static void main(String[] args) {
       List<Course> courses =  List.of(
                new Course("Spring","Framework",98,2000),
                new Course("Spring Boot","Framework",98,1800),
        new Course("MicroServices","MicroServices",89,1000),
        new Course("Azure","Cloud",90,5000),
        new Course("Docker","Cloud",95,6000),
        new Course("Kubernetes","Cloud",92,2000),
        new Course("Amazon","Cloud",94,1000)

        );

       List<Integer> l1 = List.of(1,2,3);
      //  filter(n -> n %2 !=0).

        l1.stream().map(i -> i*i ).forEach(System.out::println);
       //courses.stream().filter(c -> c.get)
        courses.stream().allMatch(c -> c.getReviewScore()>95);
       System.out.println(courses.get(0));
        System.out.println(
        courses.stream()
                .allMatch(course -> course.getReviewScore()>=89));

        System.out.println(
                courses.stream()
                        .map(Course::getNoOfStudents).count());

        System.out.println(
                courses.stream()
                        .sorted(Comparator.comparing(Course::getCategory)).collect(Collectors.toList()));

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory)));

        Map<String, List<Course>> hmCourse =
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory));
        Map<String, Long> hmCourseCount =
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,Collectors.counting()));
        System.out.println("Final Map content:"+hmCourseCount);

        Map<String, List<String>> hmCourseCategoryName =
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getName,Collectors.toList())));
        System.out.println("Final Map content with Name and category:"+hmCourseCategoryName);

    }
}
