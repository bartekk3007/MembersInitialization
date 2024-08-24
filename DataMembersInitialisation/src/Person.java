public class Person
{
    private String name = "Jan";
    private int age;
    {
        surname = "Kowalski";
    }
    Person()
    {
        age = 30;
    }

    @Override
    public String toString()
    {
        return "My name is " + name + " " + surname + " and I am " + age + " years old\n";
    }

    private String surname;
}
