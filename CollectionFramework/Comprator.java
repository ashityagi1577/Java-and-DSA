import java.util.*;
class StudentInformation{
    String name;
    int id;
    int marks;

    StudentInformation(String name,int id, int marks){
       this.id=id;
       this.name=name;
       this.marks=marks;

    }
    @Override
    public String toString(){
        return id+" "+name+" "+marks;
    }
}
class MarksComparator implements Comparator<StudentInformation>{
@Override
    public int compare(StudentInformation s1,StudentInformation s2){
    return s1.marks - s2.marks;
}
}
public class Comprator{
    public static void main(String[] args){
        List<StudentInformation>students=new ArrayList<>();
        StudentInformation s=new StudentInformation("Ashi",1,92);
        students.add(s);
        students.add(new StudentInformation("Bittu",2,91));
        System.out.println(students);
    Collections.sort(students,(s1,s2)->(s1.marks-s2.marks));
    System.out.println(students);
    }
}
