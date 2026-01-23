class Firstcode {

    static void sound(String animal) {
        System.out.println("this animal is : " + animal);
    }

    static int sound(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) throws Exception {

        // sound("donkey");
        System.out.println("the result is : " + sound(45, 23));

    }
}
