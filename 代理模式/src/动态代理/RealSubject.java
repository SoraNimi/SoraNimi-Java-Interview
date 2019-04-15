package 动态代理;

public class RealSubject implements Subject {
    public void request() {
        System.out.println("From real subject.");
    }
}
