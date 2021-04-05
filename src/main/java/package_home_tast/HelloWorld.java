package package_home_tast;

public class HelloWorld {
    int year;

    void printHelloWorld() {
        System.out.println("Hello World");
    }

    @AcademyInfo
    public int methodWithAnnotation(int year) {
        this.year = year;
        return this.year;
    }


    public int methodWithoutAnnotation(int year) {
        this.year = year;
        return this.year;
    }
}
