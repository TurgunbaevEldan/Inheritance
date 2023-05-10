public class Dancer extends Person{
    private String name;
    private String designation;
    private String bandName;

    public Dancer(String name, String designation, String bandName) {
        super(name,designation);
        this.name = name;
        this.designation = designation;
        this.bandName = bandName;
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

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void dancing(){
        System.out.println(getName()+" likes dancing");
    }

    @Override
    public String toString() {
        return "< Dancer >" +'\n'+
                "Name: " + name + '\n' +
                "Designation: " + designation + '\n' +
                "BandName: " + bandName + '\n';
    }
}
