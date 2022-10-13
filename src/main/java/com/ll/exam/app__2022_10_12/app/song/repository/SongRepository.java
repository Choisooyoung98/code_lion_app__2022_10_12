package com.ll.exam.app__2022_10_12.app.song.repository;

import com.ll.exam.app__2022_10_12.app.song.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}