package package_home_tast;

public class Man {
    private int age;
    protected String name;
    String surname;

    private void nameClass() {
        System.out.println(Man.class);
    }

    public Man deleteAge(Man man) {
        man.age = 0;
        return man;
    }

    void testText() {
        System.out.println("Метод для вывода текста");
    }

    void PrintHelloWorld() {
        System.out.println("Hello World");
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
