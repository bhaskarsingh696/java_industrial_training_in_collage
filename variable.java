class StaticVariableExample {
    static int count = 0;   // static variable

    StaticVariableExample() {
        count++;
        System.out.println("Count = " + count);
    }
}
public class variable{
    public static void main(String[] args) {

        int x = 10;   // local variable
        int y = 20;   // local variable

        int sum = x + y;
        System.out.println("Sum = " + sum);

        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();
    }
}