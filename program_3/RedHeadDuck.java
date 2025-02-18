public class RedHeadDuck extends Duck implements Quackable, Flyable {
    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks loudly!");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck flies high!");
    }
}
