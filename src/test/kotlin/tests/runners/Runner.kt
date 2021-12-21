package tests.runners
import io.cucumber.testng.AbstractTestNGCucumberTests
import io.cucumber.testng.CucumberOptions


@CucumberOptions(
    dryRun = true,
    features = ["src/test/resources"],
    glue = ["stepdefs"],
    plugin = ["json:target/cucumber-report.json", "html:target/cucumber-html"]
)
class Runner: AbstractTestNGCucumberTests()