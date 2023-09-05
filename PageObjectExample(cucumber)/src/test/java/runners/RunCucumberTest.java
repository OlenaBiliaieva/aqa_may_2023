package runners;


import org.junit.platform.suite.api.*;

import static io.cucumber.core.options.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.EXECUTION_DRY_RUN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;


@Suite
@SuiteDisplayName("Login test suite runner")
@IncludeEngines("cucumber")
@SelectClasspathResource("steps")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdefs")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@SmokeTest")
@IncludeTags({"SmokeTest"})
public class RunCucumberTest {
}
