package club.wlqzz.blog.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Diary implements Serializable {
    private int id;
    private String title;
    private String context;
    private int userId;
    private Date date;
}
