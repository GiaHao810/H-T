package Courses.Week02;

public class StudentTestDrive {
    public static void main(String[] args) {
        Student nameStudent = new Student(false, 20, "Hao", "CNTT", 7);

        nameStudent.inThongTin();

        Student tuanInfo = new Student();

        tuanInfo.inThongTin();

        nameStudent.hoc();
    }
}
