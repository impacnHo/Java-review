package base.objectDemo.cloneDemo;

/**
 * 深浅拷贝对比demo
 */
public class Test2 {
    public static void main(String[] args) {
        ShallowCloneExample e1 = new ShallowCloneExample();
        ShallowCloneExample e2 = null;
        try {
            e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        e1.set(2, 222);
        System.out.println(e2.get(2));// e2的数组同样被更改

        DeepCloneExample e3 = new DeepCloneExample();
        DeepCloneExample e4 = null;
        try {
            e4 = e3.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        e3.set(2, 222);
        System.out.println(e4.get(2));// e4的数组不变
    }
}
