package comparing_objects;

public class ComparingObjects {
    public static void main(String[] args) {
        Student s1=new Student(23,12);
        Student s2=new Student(99,68);
        if(s1.compareTo(s2)<0){
            System.out.println("s2 greater than s1");
        }
    }
}

class Student implements Comparable<Student>{
    int marks;
    int rollno;

    public Student(int marks, int rollno) {
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public int compareTo(Student o) {
        int diff= (int)(this.marks - o.marks);

        return diff;
    }
}