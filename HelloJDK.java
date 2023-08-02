public class HelloJDK {
    public static void main(String[] args) {
        String[] names = {"Alex", "Zhan", "Vika", "Chris"};

        for ( String name: names){
            System.out.println(name + ", Hello!");
        }
    }
}