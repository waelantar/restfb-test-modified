package com.example.restfbtest;

import com.restfb.Facebook;
import lombok.Data;

@Data
public class MyPhotoTag {
    @Facebook("tag_uid")
    private String tagUid;

    @Facebook("tag_text")
    private String tagText;

    @Facebook
    private Double x;

    @Facebook
    private Double y;

    // add getter and setter here
}
