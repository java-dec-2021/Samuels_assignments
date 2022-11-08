public class Project {
    private String name;
    private String description;
    private double initialCost;


    public Project() {
        this.name="I need a name!!";
        this.description="Give me a description!";
    }

    public Project(String name) {
        this.name=name;
        this.description="Give me a description!";
    }

    public Project(String name, String description) {
        this.name=name;
        this.description=description;
    }

    public String elevatorPitch() {
        return this.getName() + " " + (this.getInitialCost()) + " : " + this.getDescription();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public double getInitialCost() {
        return this.initialCost;
    }

    public void setInitialCost(double initialCost) {
        this.initialCost=initialCost;
    }

}