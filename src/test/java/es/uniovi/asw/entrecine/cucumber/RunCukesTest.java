package es.uniovi.asw.entrecine.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.java.es.*;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
public class RunCukesTest {
}