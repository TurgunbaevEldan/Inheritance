public class Builder {
    private String firstName;
    private int age;

    public Builder(String name, int age) {
        this.firstName = name;
        this.age = age;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Human:" +'\n'+
                "name: " + firstName + '\n' +
                "age: " + age;
    }
}

