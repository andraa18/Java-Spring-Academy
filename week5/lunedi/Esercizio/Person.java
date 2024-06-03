package lunedi.Esercizio;

@Info(author = "Andra", version = 1.0)
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @DeprecatedCustom(deprecated = true)
    public int getAge() {
        return age;
    }

    public String getInfo() {
        Info info = this.getClass().getAnnotation(Info.class);
        return "Nome: " + getName() + ", Età: " + getAge() + ", Autore: " + info.author() + ", Versione: "
                + info.version();
    }
}
