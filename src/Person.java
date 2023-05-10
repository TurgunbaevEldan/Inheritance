public class Person {
    private String name;
    private String designation;

    public Person(String name,String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "< Person >" +'\n'+
                "Name: " + name + '\n' +
                "Designation: " + designation + '\n';
    }
    public void learn(){
        System.out.println(getName() + " Singer");
    }
    public void walk(){
        System.out.println(getName()+" Goes");
    }
    public void eat(){
        System.out.println(getName()+" Eating");
    }
}
