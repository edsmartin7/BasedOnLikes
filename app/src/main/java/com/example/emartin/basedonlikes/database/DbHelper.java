package com.example.emartin.basedonlikes.database;

//    https://www.quora.com/What-are-the-best-ways-to-implement-an-SQLite-database-in-Android
//http://www.androidauthority.com/use-sqlite-store-data-app-599743/
//http://www.vogella.com/tutorials/AndroidSQLite/article.html
//http://www.androidhive.info/
//http://androiddeft.com/2017/05/06/android-storing-data-using-sqlite-database/
//http://www.blazin.in/2016/02/understanding-sqlite-database-in-android.html
//https://www.youtube.com/playlist?feature=plcp&list=PL2F07DBCDCC01493A
//    https://stackoverflow.com/questions/33054988/what-is-good-way-to-create-android-database
//http://learnzone.info/android-database-example-beginners/
//    https://stackoverflow.com/questions/513084/ship-an-application-with-a-database?rq=1
//https://github.com/jgilfelt/android-sqlite-asset-helper
//https://stackoverflow.com/questions/2008528/static-database-class-to-use-with-any-activity/20052152#20052152
//http://www.tutorialspoint.com/android/android_sqlite_database.htm
//https://developer.android.com/training/basics/data-storage/databases.html
//https://developer.android.com/guide/topics/data/data-storage.html#db
//https://www.youtube.com/watch?v=_vQaOvPsLko
//https://blog.reigndesign.com/blog/using-your-own-sqlite-database-in-android-applications/

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//https://developer.android.com/training/basics/data-storage/databases.html#DbHelper

/**
 *  Implement methods that create and maintain the database and tables.
 */
public class DbHelper extends SQLiteOpenHelper{

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
