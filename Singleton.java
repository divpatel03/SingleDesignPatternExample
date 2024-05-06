public class Singleton {
    private int data = 1;
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void printer() {
        System.out.println(data);
    }
}
