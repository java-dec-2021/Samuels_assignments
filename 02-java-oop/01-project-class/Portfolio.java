// Importing the Imports I need
import java.util.ArrayList;
import java.util.Arrays;
// Defining Class with Noun name
public class Portfolio {
// Member Variable
    private ArrayList<Project> projects;

// Constructor
public Portfolio() {
    this.projects = new ArrayList<Project>();
}

// Member Methods
public void addProjectToPortfolio(Project project) {
    projects.add(project);
}

public double getPortfolioCost() {
    double total = 0;
    for (Project project : projects) {
        total += project.getInitialCost();
    }
    return total;
}

public void showPortfolio() {
    System.out.println("All Projects in Portfolio:");
    for (Project project : projects) {
        System.out.println(project.elevatorPitch());
    }
    // System.out.printf("Total Cost: %f", this.getPortfolioCost());
}

// Getter Instance Method that shows all the projects that are contained in a portfolio
public String getPortfolio() {
    return this.projects.toString();
}

}