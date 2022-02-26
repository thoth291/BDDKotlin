package stepdefs
import io.cucumber.java8.Scenario
import io.cucumber.java8.En
import org.testng.Assert

fun toString(scenario:Scenario): String {
    return  """Name: ${scenario.name}
            ID: ${scenario.id}
            Status: ${scenario.status}
            Line: ${scenario.line}
            URI: ${scenario.uri}:${scenario.line}
            SrcTags: ${scenario.sourceTagNames}""".trimIndent()
}

class GoogleSteps : En {
    var arg1=0
    var arg2=0
    var arg3=false
    init {

        Before { scenario:Scenario ->
            arg1 = 5
            println(scenario.javaClass)
            println(scenario.name)
        }

        Given("^User is on Google search page$") { arg2=4 }

        Given("number is {int} while name is {string}") { int1:Int, string:String ->
            println("I've got $int1 and $string")
        }

        Given("new line") {
            println("Gularochka")
        }

        When("^User searches for Selenium$") { arg3=true }

        Then("^User can see Selenium results$") { Assert.assertTrue(arg3) }

        After("@edge-cases") { scenario: Scenario ->
            println("Edge: ${toString(scenario)}")
        }

        After { scenario:Scenario ->
            arg2 = arg1 + arg2
            println(arg2)
            println(scenario.name)
        }
    }
}