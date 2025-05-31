package projects;

import java.util.List;

public class ProjectsApp {

	public static void main(String args[]) {
		
	new ProjectsApp().processUserSelection();	

	}
	// @formatter:off
	private List<String> operations = List.of(
			"1) Add a project"
			);
	// @formatter:on
	
	private Scanner scanner = new Scanner (System.in);
	

	
}
