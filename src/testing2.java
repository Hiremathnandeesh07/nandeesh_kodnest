
class demoo{
    static {
        System.out.println("this is static area");
    }
    demoo(){
        System.out.println("this is constructor");
    }
}
public class testing2 {
    static void main(String[] args) {
        demoo d1=new demoo();

    }
}
