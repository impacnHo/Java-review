package base.objectDemo.cloneDemo;
/**
 * 普通拷贝示例
 *
 * 1.需要重写clone()方法 ->依然抛出异常
 * 2.需要拓展Cloneable接口
 *
 * */
public class CloneExample implements Cloneable {
    private int a;
    private int b;

    @Override
    protected CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample) super.clone();
    }
}
