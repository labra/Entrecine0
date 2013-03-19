package es.uniovi.asw.entrecine.jbehave;
import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import es.uniovi.asw.entrecine.Reservation;
import static org.fest.assertions.Assertions.*;

public class ReservationSteps {
	
	Reservation r;

@Given("a running system")
public void runningSystem() {
  // Initialize the system
}
 
@When("I do a reservation of $seats tickets with price $price euros")
public void iDoReservation(int seats, double price) {
    r = new Reservation(seats,price);
}
 
@Then("the total price is $total")
public void theTotalpriceIs(double total) {
    assertThat(r.getPrice()).isEqualTo(total);
}

}
