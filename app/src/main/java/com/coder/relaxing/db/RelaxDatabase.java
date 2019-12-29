package com.coder.relaxing.db;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.coder.relaxing.bean.Track;
import com.coder.relaxing.db.dao.TrackDao;

@Database(entities = {Track.class},version = 1,exportSchema = false)
public abstract class RelaxDatabase extends RoomDatabase {
    private static RelaxDatabase INSTANCE;
    public static synchronized RelaxDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),RelaxDatabase.class,"relaxing_db")
                    .build();
        }
        return INSTANCE;
    }
    public abstract TrackDao trackDao();

}
