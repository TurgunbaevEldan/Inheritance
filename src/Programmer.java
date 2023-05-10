public class Programmer extends Person {
    private String name;
    private String designation;
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name,designation);
        this.name = name;
        this.designation = designation;
        this.companyName = companyName;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println(getName()+" Likes to code");
    }

    @Override
    public String toString() {
        return "< Programmer >" +'\n'+
                "Name: " + name + '\n' +
                "Designation: " + designation + '\n' +
                "CompanyName: " + companyName + '\n';
    }
}
