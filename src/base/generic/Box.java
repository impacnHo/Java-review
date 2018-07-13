package base.generic;

public class Box<T> {
    // T stand for "type"
    // private String object 这样的话就得不到复用
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
