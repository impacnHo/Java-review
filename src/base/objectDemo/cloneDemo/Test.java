package base.objectDemo.cloneDemo;

public class Test {
    public static void main(String[] args) {
        CloneExample e1 = new CloneExample();
        try {
            CloneExample e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // 重写前：提示没有权限
    }
}
