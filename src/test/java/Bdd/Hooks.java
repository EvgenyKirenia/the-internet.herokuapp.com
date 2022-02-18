package Bdd;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageObject.projectData.ProjectData;
import utils.Log;

public class Hooks {
    private ProjectData projectData;

    @Before
    public void beforeTest(Scenario scenario) {
        Log.info("Start scenario- " + scenario.getName() + "---");

    }

    @After
    public void afterTest(Scenario scenario) {
        Log.info("Scenario- " + scenario.getName() + "--" + scenario.getStatus() + "---");

    }
}
