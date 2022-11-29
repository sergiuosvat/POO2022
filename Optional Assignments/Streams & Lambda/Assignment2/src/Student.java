import java.util.List;

public class Student {
    String name;
    Double averageGrade;
    List<String> courseList;
    public Student(String name, Double averageGrade, List<String> courseList)
    {
        this.name = name;
        this.averageGrade = averageGrade;
        this.courseList = courseList;
    }

    public String getName() {
        return name;
    }

    public int getCourseList() {
        return courseList.size();
    }
}
