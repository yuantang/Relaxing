package com.coder.relaxing;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.coder.relaxing.bean.Track;
import com.coder.relaxing.db.repository.TrackRepository;

import java.util.List;

public class DataViewModle extends AndroidViewModel {
    public TrackRepository trackRepository;
    public DataViewModle(@NonNull Application application) {
        super(application);
        trackRepository =new TrackRepository(application.getApplicationContext());
    }
    public LiveData<List<Track>> getAllTrack(){
        return trackRepository.getAllTracks();
    }
}
