@RunWith(Cucumber.class)
@Cucumber.Options(
		feature = "sample.feature",
		glue = {"StepDefinitions"}
		format={"pretty","html:report/test-report"},
		tags="CucumberTest"
		)
public class RunnerClass {

	public static void main(String[] args) {
		System.out.println("Runner Class");
	}

}