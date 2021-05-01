package com.example.banking.DB;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.BaseColumns;

public final class TransactionContract {
    private TransactionContract() {}

    public static final class TransactionEntry implements BaseColumns {
        /**Name of database table for pets*/
        public final static String TABLE_NAME = "Transaction_table";

        /**Table Fields*/
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_FROM_NAME = "from_name";
        public final static String COLUMN_TO_NAME = "to_name";
        public final static String COLUMN_AMOUNT = "amount";
        public final static String COLUMN_STATUS = "status";
    }
}