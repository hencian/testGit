package com.ixxus.gitTest.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.ixxus.gitTest.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	// comment added
	@Steps
	public EndUserSteps anna;

	@Test
	public void searching_by_keyword_apple_should_display_the_corresponding_article() {
		// comment added here
		anna.is_the_home_page();
		anna.is_the_home_page();
		// comment added here
		anna.looks_for("apple");
		anna.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");

	}

	@Test
	public void searching_by_keyword_banana_should_display_the_corresponding_article() {
		// comment added here
		anna.is_the_home_page();
		anna.looks_for("pear");
		anna.should_see_definition("An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.");

	}

	// this test will not run
	@Pending
	@Test
	public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
		anna.is_the_home_page();
		anna.is_the_home_page();
		anna.is_the_home_page();
		//comment from local 
		//another commit 
	}
}
