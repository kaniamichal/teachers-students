package com.example.teachersstudents.service;

import com.example.teachersstudents.model.User;
import com.example.teachersstudents.model.ImageFile;
import com.example.teachersstudents.repository.ImageFileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ImageFileService {

    private static final String UPLOAD_DIR = "./uploads/";

    private final ImageFileRepository repository;

    public String uploadFile(User user, MultipartFile file) {
        // normalize the file path
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        //TODO store files
//        try {
//            Path path = Paths.get(UPLOAD_DIR + fileName);
//            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
//            var img = file.getInputStream().readAllBytes();
//            ImageFile imageFile = new ImageFile(user.getId(), fileName, img);
//            repository.save(imageFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        return fileName;
    }

    @Nullable
    public byte[] getImagePath(Long idParent) {
        var img = repository.findByIdParent(idParent);
        return img.isPresent() ?
                img.map(ImageFile::getImg).orElseThrow() :
                null;
    }
}
