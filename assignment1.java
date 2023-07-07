
class claculater {
    public int add(int num1, int num2) {
        int result = num1 + num2;

        return result;
    }

    public int add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;

        return result;
    }

    public float add(Float num1, Float num2) {
        float result = num1 + num2;

        return result;
    }
}

public class assignment1 {
    public static void main(String[] args) {

        claculater obj = new claculater();
        System.out.println(obj.add(5, 3));
        System.out.println(obj.add(5, 3, 4));
        System.out.println(obj.add(5.2f, 3.3f));

    }
}
