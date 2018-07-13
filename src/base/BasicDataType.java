package base;

public class BasicDataType {
    public static void main(String[] args) {
        /**
         * 八种基本数据类型
         * boolean / 1
         * byte / 8
         * char / 16
         * short / 16
         * int / 32
         * float / 32
         * long / 64
         * double /64
         *
         * 基本类型都有对应的包装类型，基本类型和对应的包装类型之间的赋值使用自动装箱和拆箱完成
         */

        // 1.Integer之间的比较 new不同的对象，因此不同
        Integer a = new Integer(1);
        Integer b = new Integer(1);
        System.out.println(a == b); //false

        // 2.Integer与int比较 Integer会自动拆包成为int
        Integer a2 = new Integer(1);
        int b2 = 1;
        System.out.println(a2 == b2); //true

        // 3.非new生成的Integer与new生成的Integer
        Integer a3 = 1;
        Integer b3 = new Integer(3);
        System.out.println(a3 == b3); //false

        // 4.对于两个非new生成的Intefer对象，若值在-128~127之间则相同，否则不同
        Integer a4 = 1;
        Integer b4 = 1;
        System.out.println(a4 == b4);// true
        Integer c4 = 128;
        Integer d4 = 128;
        System.out.println(c4 == d4);// false

        // 5.
        Integer a5 = Integer.valueOf(1);
        Integer b5 = Integer.valueOf(1);
        System.out.println(a5 == b5);// true

        // 6.
        Integer a6 = 3;
        Integer b6 = a6;
        System.out.println(a6 == b6);// true

        /**
         * 原因：Java对于Integer有一个缓冲池，大小在-128~127之间
         * 当编译Integer i = 100，会翻译成Integer i = Integer.valueOf(100)
         * 此时则直接在缓冲池中获取不需要new
         * valueOf()的实现：先判断值是否在缓冲池内，若在，直接返回缓冲池内容，否则new
         */

        /**
         * Java还会将其他基本类型放入缓冲池
         * boolean values true and false
         * all byte values
         * short values between -128~127
         * int values between -128~127
         * char in the range \u0000 to \u007F
         * */
    }
}
