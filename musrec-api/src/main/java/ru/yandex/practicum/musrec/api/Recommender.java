package ru.yandex.practicum.musrec.api;

import java.util.List;

public interface Recommender {
    void addLikedTracks(List<Track> tracks);
    void addLikedTrack(Track track);
    double predictMark(Track track);
}
