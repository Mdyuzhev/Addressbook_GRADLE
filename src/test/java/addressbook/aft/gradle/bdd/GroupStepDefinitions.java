package addressbook.aft.gradle.bdd;

import addressbook.aft.gradle.appmanager.ApplicationManager;
import addressbook.aft.gradle.model.GroupData;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GroupStepDefinitions {

    private ApplicationManager app;


    @Before
    public void init(){
        app = new ApplicationManager();
        app.init();

    }

    @After
    public void stop(){
        app.stop();
        app = null;

    }

    @Given("^a set of groups$")
    public void loadGroups(){
        app.goTo().groupPage();
    }

    @When("^I create a new group with name (.+), header (.+) and footer (.+)$")
    public void createGroups(String name, String header, String footer){
        GroupData newGroup = new GroupData().withName(name).withHeader(header).withFooter(footer);
        app.group().create(newGroup);

    }

    @Then("^the new set of groups is equal to the old set with the added group$")
    public void verifyCreateGroups(){

    }

}
