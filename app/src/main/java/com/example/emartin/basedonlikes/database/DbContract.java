package com.example.emartin.basedonlikes.database;

import android.provider.BaseColumns;

/**
 * Contract class for database
 * A contract class is a container for constants that define names for URIs, tables, and columns.
 * Explicitly specifies the layout of your schema in a systematic and self-documenting way.
 */
public final class DbContract {

    private DbContract() {
        //stays empty
    }

    //Inner class that defines the table contents
    public static class FeedEntry implements BaseColumns {
        public static final String LOGIN_TABLE = "logins";
        public static final String USER_NAME = "username";
        public static final String PASSWORD = "password";
    }

    //user profile table

    //create table query?

    private static final String SIGN_UP =
            "INSERT INTO " + FeedEntry.LOGIN_TABLE +
                    " (username, password) VALUES (" +
                    FeedEntry.USER_NAME + ", " +
                    FeedEntry.PASSWORD + ");";


    private static final String LOGIN_LOOKUP =
            "SELECT * FROM " + FeedEntry.LOGIN_TABLE +
                    "WHERE username='" + FeedEntry.USER_NAME +
                    "' AND password='" + FeedEntry.PASSWORD + "'; ";



}
