package pattern.singleton;

public class CopySingleton {
    public static void main(String[] args) throws Exception {
        CopySingleton obj1 = new CopySingleton();
        CopySingleton obj2 = (CopySingleton) obj1.clone();
    }
}
