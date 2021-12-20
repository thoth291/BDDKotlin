package tests.runners
import io.cucumber.testng.AbstractTestNGCucumberTests
import io.cucumber.testng.CucumberOptions


@CucumberOptions(
    dryRun = true,
    features = arrayOf("src/test/resources"),
    glue = arrayOf("stepdefs"),
    plugin = arrayOf("json:target/cucumber-report.json", "html:target/cucumber-html")
)
class Runner: AbstractTestNGCucumberTests()