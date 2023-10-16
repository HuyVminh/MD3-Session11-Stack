package ThucHanh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập tên :");
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi :");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập trạng thái :");
            boolean status = scanner.nextLine().isEmpty();
            addStudent(students, new Student(name, age, status));
        }

    }

    public static void addStudent(List<Student> studentList, Student student) {
        studentList.add(student);
        // Sắp xếp danh sách sinh viên theo tên
        studentList.sort(Comparator.comparing(Student::getName));
        displayStudentList(studentList);
    }

    public static void displayStudentList(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("{ Mã sinh viên : " + student.getId() +
                    " , Tên sinh viên : " + student.getName() +
                    " , Tuổi : " + student.getAge() +
                    " , Trạng thái : " + (student.isStatus() ? "Đang hoạt động }" : "Đang khóa }"));
        }
    }
}
