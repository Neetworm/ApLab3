public class Person {
    int age;
    String name;
    void setAge(int age) {
        this.age = age;
    }
    void  setName(String name) {
        this.name=name;
    }
    int getAge(){
        return this.age;    
    }
    String getName(){
        return this.name;
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Ajay");
        p.setAge(4);
        System.out.println(p.getName() +" " + p.getAge());
    }
}
