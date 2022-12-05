// Defining Test File with Noun naming Convention
public class ProjectTester {
    // Entry Point for my App to Start
    public static void main(String[] args) {
        // Project project = new Project("new name");
        // System.out.println(project.elevatorPitch());

        // Project project2 = new Project("Another project", "A Description");
        // System.out.println(project2.elevatorPitch());
        // project2.setName("Super New Name");
        // project2.setDescription("Random Description X");
        // System.out.println(project2.getName());
        // System.out.println(project2.getDescription());
        // System.out.println(project2.elevatorPitch());

        Project project3 = new Project();
        project3.setInitialCost(10.0);
        // System.out.println(project3.getInitialCost());
        // System.out.println(project3.elevatorPitch());

        Project project4 = new Project();

        Portfolio portfolio1 = new Portfolio();
        portfolio1.addProjectToPortfolio(project3);
        portfolio1.addProjectToPortfolio(project4);
        System.out.println(portfolio1.getPortfolio());
        System.out.println(portfolio1.getPortfolioCost());
        portfolio1.showPortfolio();

    }

}