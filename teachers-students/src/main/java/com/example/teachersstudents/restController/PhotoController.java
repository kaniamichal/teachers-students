package com.example.teachersstudents.restController;

import com.example.teachersstudents.model.Photo;
import com.example.teachersstudents.model.Student;
import com.example.teachersstudents.model.StudentDTO;
import com.example.teachersstudents.service.PhotoService;
import com.example.teachersstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class PhotoController {

    private final PhotoService photoService;


    @PostMapping("addPhoto")
    public String addPhoto(@ModelAttribute Photo photo,  Model model) {
        photoService.addPhoto(photo);
     //   model.addAttribute("id", photo);
//        model.addAttribute("photo", photo.getPhoto());
        return "portalParentAll";
    }
}
