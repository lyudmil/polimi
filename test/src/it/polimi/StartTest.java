package it.polimi;

import android.test.ActivityInstrumentationTestCase2;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class it.polimi.StartTest \
 * it.polimi.tests/android.test.InstrumentationTestRunner
 */
public class StartTest extends ActivityInstrumentationTestCase2<Start> {

    public StartTest() {
        super("it.polimi", Start.class);
    }

}
