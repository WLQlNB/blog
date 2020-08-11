package club.wlqzz.blog.mapper;

import club.wlqzz.blog.pojo.Blog;
import club.wlqzz.blog.pojo.Image;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageMapper {

    @Insert("insert into t_img(img_url,blog_id) values(#{imgUrl},#{blogId}")
    boolean insertImg(Image image)throws Exception;

}
