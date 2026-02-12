package CloningObjects;


public class Main {
    static void main(String[] args) throws CloneNotSupportedException {
        Person p1= new Person(34,23);


        Person p2= (Person)p1.clone();
        System.out.println(p2.age);




    }




}

class  Person implements Cloneable{
    int age;
    int roll;



    public Person(int age, int roll) {
        this.age = age;
        this.roll = roll;

    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }



}