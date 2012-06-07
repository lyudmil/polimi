package it.polimi.models;

import android.content.res.AssetManager;
import android.test.InstrumentationTestCase;
import com.androidrecord.ActiveRecordBase;
import com.androidrecord.migrations.Migrations;
import com.androidrecord.test.ModelTestCase;

import java.util.Arrays;
import java.util.List;

public abstract class PolimiTest<T extends ActiveRecordBase> extends ModelTestCase<T> {

    public void testFirstMigrationCreatesDatabaseTable() throws Exception {
        assertDatabaseTableCreated(getClassUnderTest(), 1);
    }

    protected abstract Class<T> getClassUnderTest();
}
