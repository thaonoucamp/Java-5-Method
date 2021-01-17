public class Method {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        int sub = sub(x, y);
        System.out.println(sub);

        System.out.println(sum());

        hello();

        float area = pi() * 2;
        System.out.println(area);
    }
    public static int sum() {
        int x = 10;
        int y = 15;

        int sum = x + y;

       return sum;
    }

    // Ham co doi so truyen vao;
    public static int sub(int x, int y) {
        int sub = x - y;

        return sub;
    }

    // Ham ko co return;
    public static void hello() {
        System.out.println("Hello Java !");
    }

    // Ko co doi so truyen vao nhung co return;
    public static float pi() {
        return 3.14f;
    }
}
