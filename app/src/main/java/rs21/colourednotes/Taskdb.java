package rs21.colourednotes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Taskdb extends SQLiteOpenHelper {
    public Taskdb(Context context) {
        super(context, "Taskdb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE task (text TEXT PRIMARY KEY, colno INTEGER);";
        db.execSQL(query);
        Log.e("TAG", "query: " + query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
