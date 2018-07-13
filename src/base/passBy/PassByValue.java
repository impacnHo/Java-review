package base.passBy;

public class PassByValue {
    private static void func(Dog dog) {
        System.out.println(dog.getObjectAddress());// 2. Dog@3429dbb8
        dog = new Dog("B");
        System.out.println(dog.getObjectAddress());// 3. Dog@281827c9
        System.out.println(dog.getName());// 4. B
    }

    public static void main(String[] args) {
        Dog dog = new Dog("A");
        System.out.println(dog.getObjectAddress());// 1. Dog@3429dbb8
        func(dog);
        System.out.println(dog.getObjectAddress());// 5. Dog@3429dbb8
        System.out.println(dog.getName());// 6. B
    }
    /**
     * Java的参数是以为值传递的形式传入方法，而不是引入传递
     * 将一个参数传入一个方法时，本质上是将对象的地址以值的方式传递到形参中
     */
}
