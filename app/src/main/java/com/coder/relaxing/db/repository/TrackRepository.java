package com.coder.relaxing.db.repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

import com.coder.relaxing.bean.Track;
import com.coder.relaxing.db.RelaxDatabase;
import com.coder.relaxing.db.dao.TrackDao;

import java.util.List;

public class TrackRepository {
    private TrackDao trackDao;
    public TrackRepository(Context context){
        trackDao=RelaxDatabase.getDatabase(context).trackDao();
    }
    public LiveData<List<Track>> getAllTracks(){
        return trackDao.getAllTracksLive();
    }
}
