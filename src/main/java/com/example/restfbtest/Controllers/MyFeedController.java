package com.example.restfbtest.Controllers;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;
import com.restfb.types.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyFeedController {

    private final String MY_ACCESS_TOKEN = "EAAEyMERHZBOgBO6T8uApnpRzIgtJILyqpsSIrB0lZBCaepjju2kt6afvTfpndbIKrIwLWsqlfquNbAevjcpeRNAnW8PqtEZBOVfTVZBp3PTYd2kVAhZA4g3dwWDRiZBR4SwJZB0ZA9mDGS2p81UIvbSoqZC1YOKkH58lJEZCXHWsETa2DkJx1JMoKxZA0B2r94C4ZBrXNzaAYlMsMtrLIAZAchZBQ5XXAZD";

    @GetMapping("/myfeed")
    public String showMyFeed(Model model) {
        FacebookClient facebookClient = new DefaultFacebookClient(MY_ACCESS_TOKEN, Version.VERSION_9_0);
        Connection<Post> myfeed = facebookClient.fetchConnection("me/feed", Post.class);

        List<Post> posts = new ArrayList<>();
        for (List<Post> myFeedPage : myfeed) {
            for (Post post : myFeedPage) {
                if (post.getMessage() != null) {
                    posts.add(post);
                }
            }
        }

        model.addAttribute("posts", posts);
        return "myfeed";
    }}
