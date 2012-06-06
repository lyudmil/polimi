package it.polimi.models;

import android.content.res.AssetManager;
import android.test.InstrumentationTestCase;
import com.androidrecord.ActiveRecordBase;
import com.androidrecord.migrations.Migrations;

import java.util.Arrays;
import java.util.List;

public abstract class PolimiTest<T extends ActiveRecordBase> extends InstrumentationTestCase {
    protected Migrations migrations;

    protected void setUp() throws Exception {
        super.setUp();
        AssetManager applicationAssets = getInstrumentation().getTargetContext().getAssets();
        migrations = new Migrations(applicationAssets);
    }

    public void testFirstMigrationCreatesDatabaseTable() throws Exception {
        List<String> migrationStatements = Arrays.asList(migrations.loadMigrationNumber(1));
        String createTableSql = ActiveRecordBase.createSqlFor(getClassUnderTest()).replace(";", "");

        assertTrue("Create SQL missing. First migration doesn't contain: '" + createTableSql + "'", migrationStatements.contains(createTableSql));
    }

    protected abstract Class<T> getClassUnderTest();
}
