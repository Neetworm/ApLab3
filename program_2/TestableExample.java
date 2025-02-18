// Main class to test Testable interface and its implementations
public class TestableExample {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();  // This will print: "This is a concrete class implementing Testable interface."

        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display();  // This will print: "This is a concrete subclass of AbsTest implementing display method."
    }
}
