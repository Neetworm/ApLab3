// Main class to test Testable interface and its implementations
public class TestableExample {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();  

        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display();  
    }
}
