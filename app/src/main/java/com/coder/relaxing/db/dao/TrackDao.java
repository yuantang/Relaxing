package com.coder.relaxing.db.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.coder.relaxing.bean.Track;

import java.util.List;

import io.reactivex.Maybe;
import io.reactivex.Single;

@Dao
public interface TrackDao {

    @Insert
    Single insertTracks(Track...tracks);

    @Query("SELECT * FROM Track ORDER BY ID DESC")
    LiveData<List<Track>> getAllTracksLive();

}
