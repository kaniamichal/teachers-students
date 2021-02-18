package com.example.teachersstudents.service;

import com.example.teachersstudents.model.Photo;
import com.example.teachersstudents.repository.PhotoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PhotoService {
    private PhotoRepository repository;

    public Photo addPhoto(Photo photo){
        repository.save(photo);
        return photo;
    }
}
