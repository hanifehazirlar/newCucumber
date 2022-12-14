package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
        features = "src/test/resources/features",
        glue = "stepDefinitions", //stepDefinitions class'inin yolunu aldip buraya attik
        // isminede glue(yapistirici) dedik
        tags = "@US009TC003",           // Runner class'ndan hangisini calistirmak istersek buraya
        // birden fazla grup çalıstıracaksak "@gp3 or @gp1" yazarız
        dryRun =false
)


public class TestRunner2 {
}
