package com.dmaila.dojo.marmitadelivery;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MarmitaDeliveryTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void verificaBotaoNaTela() {
        onView(withId(R.id.send_button)).check(matches(withText("Enviar por email")));
    }

    @Test
    public void tocarBotaoGerarRecibo() {
        onView(withText("Gerar recibo")).perform(click());
    }

    @Test
    public void preencheDadosTocaBotaoEnviarEmail() {
        onView(withId(R.id.name)).perform(typeText("Android"), closeSoftKeyboard());

        onView(withId(R.id.medium_size)).perform(click());
        onView(withId(R.id.main_meal)).perform(typeText("Frango empanado"), closeSoftKeyboard());
        onView(withId(R.id.side_dish)).perform(typeText("Creme de milho"), closeSoftKeyboard());

        onView(withId(R.id.send_button)).perform(click());
    }

    @Test
    public void preencheDadosEGeraRecibo() {
        onView(withId(R.id.name)).perform(typeText("Android"), closeSoftKeyboard());

        onView(withId(R.id.medium_size)).perform(click());
        onView(withId(R.id.main_meal)).perform(typeText("Frango empanado"), closeSoftKeyboard());
        onView(withId(R.id.side_dish)).perform(typeText("Creme de milho"), closeSoftKeyboard());

        onView(withText("Gerar recibo")).perform(click());

        onView(withId(R.id.voucher_title)).check(matches(withText("Recibo")));
    }

    @Test
    public void tamanhoPSelecionadoDefault() {
        onView(withId(R.id.small_size)).check(matches(isChecked()));
        onView(withId(R.id.medium_size)).check(matches(isNotChecked()));
        onView(withId(R.id.large_size)).check(matches(isNotChecked()));

    }
}
