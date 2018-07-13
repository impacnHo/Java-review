package base.generic;

public class Test {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.setT(1);
        System.out.println(integerBox.getT());

        stringBox.setT("a");
        System.out.println(stringBox.getT());
    }
}
