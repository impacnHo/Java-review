package base;

public class StringDemo {
    public static void main(String[] args) {
        /**
         * 概览
         * String被声明为final，因而不能被继承
         * 内部使用char数组存储数据，该数组被声明为final，意味着初始化之后就不能再引用其他数组
         * String内没有方法去改变数组，保证String不变
         *
         * String不可变的好处
         * 1.可以缓存hash值
         * 2.因为String是不变的，如果一个String已经被创建，那么就能从String Pool中获取
         * 3.线程安全，可以在多个线程中使用
         *
         * String,StringBuffer and StringBuider
         * 1.可变性：String不可变；String Buffer 和 String Builder可变
         * 2.线程安全：String 安全；String Buider 不安全；String Buffer 安全，内部使用synchronized来同步
         * */

        // 使用String.intern() 可以保证相同的字符串变量引用相同的内存对象
        String a1 = new String("a");
        String a2 = new String("a");
        System.out.println(a1 == a2);// false
        String a3 = a1.intern();
        System.out.println(a1.intern() == a3);// true

        // 若直接创建对象（不使用new），Java将自动将对象放入String Pool
        String a4 = "z";
        String a5 = "z";
        System.out.println(a4 == a5);// true
    }
}
