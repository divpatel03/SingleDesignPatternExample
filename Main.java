public class Main {
    public static void main(String[] args) {
        //Creating 1 singleton instance
        Singleton instance = Singleton.getInstance();

        //Using that instance to use printer method
        instance.printer();
    }
}
