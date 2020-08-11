package club.wlqzz.blog.service.impl;

import club.wlqzz.blog.mapper.ImageMapper;
import club.wlqzz.blog.pojo.Image;
import club.wlqzz.blog.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageMapper imageMapper;

    @Override
    public boolean insertImage(Image image) throws Exception {
        return imageMapper.insertImg(image);
    }
}
