package base.objectDemo;

public class EqualsDemo {
    public static void main(String[] args) {
        /**
         * == 判断是否引用同一个对象
         * equals 判断是否等价
         */
        Integer x = new Integer(1);
        Integer y = new Integer(1);
        Integer z = new Integer(1);
        System.out.println(x == y);// false
        System.out.println(x.equals(y));// true

        // 自反性
        System.out.println(x.equals(x));// true

        // 对称性
        System.out.println(x.equals(y) == y.equals(x));// true

        // 传递性
        if (x.equals(y) && y.equals(z))
            System.out.println(x.equals(z));// true

        // 一致性
        System.out.println(x.equals(y) == x.equals(y));// true

        // 非null对象与null比较均为false
        System.out.println(x.equals(null));// false

    }
}
