package com.devco.pruebadevco.stepdefinitions;

import com.devco.pruebadevco.models.Data;
import com.devco.pruebadevco.models.FlightData;
import com.devco.pruebadevco.models.VacationRentalsInfo;
import com.devco.pruebadevco.models.HotelReservationInfo;
import com.devco.pruebadevco.questions.*;
import com.devco.pruebadevco.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class ReservationsStepDefinitions {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^the user is in the application$")
    public void theUserIsInTheApplication() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.travelocity.com/"));
    }

    @When("^he enters all the rentals information$")
    public void heEntersAllTheRentalsInformation(List<VacationRentalsInfo> vacationRentalsInfos) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchVacation.option(vacationRentalsInfos.get(1)));
    }

    @Then("^the preference option can be selected$")
    public void thePreferenceOptionCanBeSelected() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateIs.visible(), is(equalTo(true))));
    }

    @When("^entering the reservation information$")
    public void enteringTheReservationInformation(List<HotelReservationInfo> info) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.hotelReservation(info.get(1)));
    }

    @Then("^system must show the available hotels$")
    public void systemMustShowTheAvailableHotels() {
        OnStage.theActorInTheSpotlight().should(seeThat(HotelNotification.isVisible(), is(equalTo(true))));
    }

    @When("^he enters all flihgt information$")
    public void heEntersAllFlihgtInformation(List<Data> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterCar.reservation(data.get(1)));
    }


    @Then("^you can view the flight options$")
    public void youCanViewTheFlightOptions() {
        OnStage.theActorInTheSpotlight().should(seeThat(CarsSearch.notification(), is(equalTo(true))));
    }

    @When("^the user does not enter all the data$")
    public void theUserDoesNotEnterAllTheData(List<FlightData> flightData) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterData.flights(flightData.get(1)));
    }

    @Then("^the system should display an error message$")
    public void theSystemShouldDisplayAnErrorMessage() {
        OnStage.theActorInTheSpotlight().should(seeThat(Validate.error(), is(equalTo(true))));
    }

    @When("^the user selects the reservation information$")
    public void theUserSelectsTheReservationInformation() {
        OnStage.theActorInTheSpotlight().attemptsTo(Consult.cruise());
    }

    @Then("^the system should show the options$")
    public void theSystemShouldShowTheOptions() {
        OnStage.theActorInTheSpotlight().should(seeThat(CruiseSearch.option(), is(equalTo(true))));
    }



}
