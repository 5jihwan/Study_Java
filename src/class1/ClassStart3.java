package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 실제 붕어빵 x001에 생성
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // 실제 붕어빵 x002에 생성
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}