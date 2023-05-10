public class Singer extends Person {
    private String name;
    private String designation;
    private String groupName;

    public Singer(String name, String designation, String groupName) {
        super(name,designation);
        this.name = name;
        this.designation = designation;
        this.groupName = groupName;
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

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void singing() {
        System.out.println(getName() + "always singing");
    }

    public void playGitar() {
        System.out.println(getName() + " likes to play the guitar");
    }

    @Override
    public String toString() {
        return "< Singer >" + '\n' +
                "Name: " + name + '\n' +
                "Designation: " + designation + '\n' +
                "GroupName: " + groupName + '\n';
    }
}
