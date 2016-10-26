package org.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apitesting.HttpConnector;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class RecommendationsBasedOnBookmarksAreReturned {
	static HttpConnector server = null;
	static HttpConnector server2 = null;

	String response = null;
	JSONObject jsonResponse = null;
	JSONObject pref_prd = null;
	JSONArray resultsArray = null;
	JSONArray likeArray = null;
	JSONArray newlikeArray = null;
	JSONArray neutralArray = null;
	JSONArray newneutralArray = null;

	static List<String> like_values = new ArrayList<String>();
	static List<String> neutral_values = new ArrayList<String>();
	int like_count = 0;
	int neutral_count = 0;
	boolean like_present = false;
	boolean neutral_present = false;

	@Given("^an activity or excursion has been bookmarked$")
	public void an_activity_or_excursion_has_been_bookmarked() throws Throwable {
	}

	@When("^I make a recommendations call$")
	public void i_make_a_recommendations_call() throws Throwable {
		URL urlneutral = new URL(
				"http://recs.richrelevance.com/rrserver/api/user/preference?apiKey=364113acb8e80040&s=3859677&u=8557859740&targetType=product&p=1606:SLU-115A&actionType=neutral");
		
		URL url = new URL(
				"http://recs.richrelevance.com/rrserver/api/user/preference?apiKey=364113acb8e80040&s=3859677&u=8557859740&targetType=product&p=20-RCP10348&actionType=like");
		server = new HttpConnector(urlneutral);
		response = server.getResponse();

		server2 = new HttpConnector(urlneutral);
		response = server2.getResponse();


		server = new HttpConnector(url);
		response = server.getResponse();

		server2 = new HttpConnector(url);
		response = server2.getResponse();

		System.out.println("Recommendation call made");

	}

	@Then("^I should get recommendations back based on the bookmarked product$")
	public void i_should_get_recommendations_back_based_on_the_bookmarked_product() throws Throwable {
		// server.printResponse(response);
		jsonResponse = new JSONObject(response);
		pref_prd = jsonResponse.getJSONObject("pref_product");
		// resultsArray = jsonResponse.getJSONArray("pref_product");
		for (int j = 0; j < pref_prd.length(); j++) {
			// JSONObject addressObject = likeArray.getJSONObject(j);
			Iterator key = pref_prd.keys();
			while (key.hasNext()) {
				String k = key.next().toString();
				if (k.equals("LIKE")) {
					like_present = true;

				} else if (k.equals("NEUTRAL")) {
					neutral_present = true;

				}

			}
		}
		if (like_present) {
			likeArray = pref_prd.getJSONArray("LIKE");
			//System.out.println(likeArray);
			/* */
			System.out.println("The bookmarked values are " + likeArray);
		}

		if (neutral_present) {
			neutralArray = pref_prd.getJSONArray("NEUTRAL");
			//System.out.println(neutralArray);
			/* */
			//System.out.println("The neutral values are " + neutralArray);
		}

	}

	@Then("^I add another bookmark$")
	public void i_add_another_bookmark() throws Throwable {
		URL url2 = new URL(
				"http://recs.richrelevance.com/rrserver/api/user/preference?apiKey=364113acb8e80040&s=3859677&u=8557859740&targetType=product&p=1606:SLU-115A&actionType=like");
		server = new HttpConnector(url2);
		response = server.getResponse();
		response = server.getResponse();

		server2 = new HttpConnector(url2);
		response = server2.getResponse();


		System.out.println("Another bookmark added");
	}

	@Then("^the recommendations returned are not identical to the initial recommendations set$")
	public void the_recommendations_returned_are_not_identical_to_the_initial_recommendations_set() throws Throwable {
		// server.printResponse(response);
		jsonResponse = new JSONObject(response);
		pref_prd = jsonResponse.getJSONObject("pref_product");
		// resultsArray = jsonResponse.getJSONArray("pref_product");
		neutral_present = false;
		like_present = false;
		for (int j = 0; j < pref_prd.length(); j++) {
			// JSONObject addressObject = likeArray.getJSONObject(j);
			Iterator key = pref_prd.keys();
			while (key.hasNext()) {
				String k = key.next().toString();
				if (k.equals("LIKE")) {
					like_present = true;

				} else if (k.equals("NEUTRAL")) {
					neutral_present = true;

				}

			}
		}
		if (like_present) {
			newlikeArray = pref_prd.getJSONArray("LIKE");
			//System.out.println(newlikeArray);
			/* */
			System.out.println("The new bookmarked values are " + newlikeArray);
		}

		if (neutral_present) {
			newneutralArray = pref_prd.getJSONArray("NEUTRAL");
			//System.out.println(newneutralArray);
			/* */
			//System.out.println("The new neutral values are " + newneutralArray);
		}
		Assert.assertNotSame(newlikeArray, likeArray);
		System.out.println("the recommendations returned are not identical to the initial recommendations set");
	}

	@And("^bookmarked products are higher in the response$")
	public void bookmarked_products_are_higher_in_the_response() throws Throwable {
		Assert.assertTrue(newlikeArray.length() > likeArray.length());
		System.out.println("bookmarked products are higher in the response");
}}
