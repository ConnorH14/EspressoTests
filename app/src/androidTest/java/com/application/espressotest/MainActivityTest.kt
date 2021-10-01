package com.application.espressotest

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    // This test sees if the activity is in view and launches
    @Test
    fun test_isActivityInView() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    // Tests if title and button are visible
    @Test
    fun test_visibility_title_nextButton() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.activity_main_title))
            .check(matches(isDisplayed()))
        onView(withId(R.id.button_next_activity))
            .check(matches(isDisplayed()))
        // Alternate
        // .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun test_isTitleTextDisplayed() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.activity_main_title))
            .check(matches(withText(R.string.text_mainactivity)))
    }
}