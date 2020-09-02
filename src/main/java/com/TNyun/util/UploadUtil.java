package com.TNyun.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by kyq on 2020/9/2 12:09
 */
public class UploadUtil {
    public MultipartFile getImage() {
        return image;
    }

    public void setImage(org.springframework.web.multipart.MultipartFile image) {
        this.image = image;
    }

    /*
            这里的字段image必须和上传页面upload.jsp中的image
            <input type="file" name="image" accept="image/*" />一样的名字
        */
    private MultipartFile image;

}
