class StudentInfo{
    String name;
    int rollNo;
    int marks;

}
public class ClassAndObjectDemo {
    public static void main(String[] args){
        StudentInfo student1=new StudentInfo();
        student1.name="A";
        student1.rollNo=35;
        student1.marks=90;

        System.out.println(student1.name);


        StudentInfo student2=new StudentInfo();
        student2.name="B";
        student2.rollNo=3;
        student2.marks=95;
      
        System.out.println(student2.name);
        System.out.println(student2.rollNo);
        System.out.println(student2.marks);


    }
}
