public class Patient extends Person {
    private int id;

    public Patient(int id, String name, int age) {
        super(name, age);
        this.id = id;
    }

    public int getId() { return id; }

    @Override
    public void display() {
        System.out.println("ID: " + id + ", Name: " + getName() + ", Age: " + getAge());
    }
}