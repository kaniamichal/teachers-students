package com.example.teachersstudents.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "files")
@Data
@NoArgsConstructor
public class ImageFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    private Long idParent;
    private String fileName;
    private byte[] img;

    public ImageFile(Long idParent, String fileName, byte[] img) {
        this.idParent = idParent;
        this.fileName = fileName;
        this.img= img;
    }
}
