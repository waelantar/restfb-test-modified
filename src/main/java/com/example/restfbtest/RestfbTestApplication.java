package com.example.restfbtest;

import com.restfb.*;
import com.restfb.json.JsonObject;
import com.restfb.types.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.System.out;

@SpringBootApplication
public class RestfbTestApplication {

    public static void main(String[] args) {
        String MY_ACCESS_TOKEN="EAAEyMERHZBOgBO2ZCDiA28ZBu6BBBERp5d7ZB2qGZAivTZAubsAfXtZBYeI8D47b4vt6jy5w8ghp2Flus4y8BkCZC2qDWokhZBeD3BRlUhVNzPGetVwrEwa9sPFk1XWtgmiVFStTS3uaYUN4Fr4bjZAO4zeLm1MX7i8uqezJNBbFXwcZCGZAImDZBrWfpzHZCVFzGgWAkZD";
        FacebookClient facebookClient=new DefaultFacebookClient(MY_ACCESS_TOKEN, Version.VERSION_9_0);
        Connection<Post> myfeed=facebookClient.fetchConnection("me/feed",Post.class);
//        for(List<Post> myFeedPage :myfeed)
//        {
//            for(Post post : myFeedPage)
//            {
//                String message=post.getMessage();
//                Date date=post.getCreatedTime();
//
//
//                Reactions reactions=post.getReactions();
//                System.out.println(post.getId());
//            }
//        }
//        Connection<Insight> insightsConnection =
//                facebookClient.fetchConnection("worldoucar/insights",
//                        Insight.class, // the insight type
//                        Parameter.with("metric", "page_fan_adds_unique,page_fan_adds"));
//
//        for (List<Insight> insights: insightsConnection) {
//            for (Insight insight : insights) {
//                //System.out.println(insight.getName());
//            }
//        }
//        Boolean deleted = facebookClient.deleteObject("136720779840416_617769743045646");
//        out.println("Deleted object? " + deleted);
//        FacebookClient client = new DefaultFacebookClient(MY_ACCESS_TOKEN, Version.LATEST);
//        JsonObject picture =
//                client.fetchObject("me/picture",
//                        JsonObject.class, Parameter.with("redirect","false"));
//        System.out.println(picture);
//        Post post = facebookClient.fetchObject("136720779840416_502997274971059",
//                Post.class,
//                Parameter.withFields("from,to,likes.limit(0).summary(true),comments.limit(0).summary(true),shares.limit(0).summary(true)"));
//
//        out.println("Likes count: " + post.getLikesCount());
//        out.println("Shares count: " + post.getSharesCount());
//        out.println("Comments count: " + post.getCommentsCount());
//        Post post = facebookClient.fetchObject("136720779840416_502997274971059", Post.class);
//        out.println(post.getComments());136720779840416_502997274971059
        Connection<Comment> allComments = facebookClient.fetchConnection("136720779840416_502997274971059"+"/comments", Comment.class);
        for(List<Comment> postcomments : allComments){
            for (Comment comment : postcomments){
                out.println(comment.getMessage());
            }
        }
        SpringApplication.run(RestfbTestApplication.class, args);
    }

}
