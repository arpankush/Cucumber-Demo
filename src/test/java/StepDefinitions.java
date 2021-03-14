import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	@Given("^Cucumber should be setup$")
	public void cucumber_should_be_setup() {
	    System.out.println("1. Cucumber should be setup");
	}

	@When("^I run the runner file$")
	public void i_run_the_runner_file() {
		System.out.println("2. I run the runner file");
	}

	@Then("^Feature file should run$")
	public void feature_file_should_run() {
		System.out.println("3. Feature file should run");
	}
}
