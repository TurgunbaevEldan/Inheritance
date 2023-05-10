public class Human extends Builder {
    private String name;
    private int age;

    public Human(String name, int age, String name1, int age1) {
        super(name, age);
        this.name = name1;
        this.age = age1;
    }

    public Human(String name, int age) {
        super(name, age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void humanMethode(){
        System.out.println("My name is "+name+"I'm "+age);

    }
    @Override
    public String toString() {
        return "Human:" +'\n'+
                "name: " + name + '\n' +
                "age: " + age ;
    }
}
