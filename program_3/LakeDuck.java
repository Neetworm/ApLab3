// Lake Duck (LD) can fly and quack
public class LakeDuck extends Duck implements Quackable, Flyable {
    @Override
    public void quack() {
        System.out.println("Lake Duck quacks softly.");
    }

    @Override
    public void fly() {
        System.out.println("Lake Duck flies gracefully.");
    }
}
