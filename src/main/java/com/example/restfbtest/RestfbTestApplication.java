package com.example.restfbtest;

import com.restfb.*;
import com.restfb.json.JsonObject;
import com.restfb.types.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static java.lang.System.out;

@SpringBootApplication
public class RestfbTestApplication {

    public static void main(String[] args) {
        int counter = 0;
        String MY_ACCESS_TOKEN = "EAAEyMERHZBOgBO2ZCDiA28ZBu6BBBERp5d7ZB2qGZAivTZAubsAfXtZBYeI8D47b4vt6jy5w8ghp2Flus4y8BkCZC2qDWokhZBeD3BRlUhVNzPGetVwrEwa9sPFk1XWtgmiVFStTS3uaYUN4Fr4bjZAO4zeLm1MX7i8uqezJNBbFXwcZCGZAImDZBrWfpzHZCVFzGgWAkZD";
        FacebookClient facebookClient = new DefaultFacebookClient(MY_ACCESS_TOKEN, Version.VERSION_9_0);
        Connection<Post> myfeed = facebookClient.fetchConnection("me/feed", Post.class);
//        for(List<Post> myFeedPage :myfeed)
//        {
//            for(Post post : myFeedPage)
//            {
//                String message=post.getMessage();
//                Date date=post.getCreatedTime();
//                if(post.getMessage()!=null) {
//                    System.out.println(post.getId()+"this content"+post.getMessage());
//                }
//            }
//        }}
//        Connection<Insight> insightsConnection =
//                facebookClient.fetchConnection("worldoucar/insights",
//                        Insight.class, // the insight type
//                        Parameter.with("metric", "page_fan_adds_unique,page_fan_adds"));
//
//        for (List<Insight> insights : insightsConnection) {
//            for (Insight insight : insights) {
//                System.out.println(insight.getDescription()+"    "+"    "+insight.getValues());
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
//        out.println(post.getComments());//136720779840416_502997274971059
//        Connection<Comment> allComments = facebookClient.fetchConnection("136720779840416_502997274971059"+"/comments", Comment.class);
//        for(List<Comment> postcomments : allComments){
//            for (Comment comment : postcomments){
//                out.println(comment.getMessage());
//            }
//        }
//        facebookClient.publish("worldoucar/feed", FacebookType.class, Parameter.with("message", Integer.toString(counter) + ": Hello, facebook World!"));
//        counter++;

//        InputStream imageStream = RestfbTestApplication.class.getClassLoader().getResourceAsStream("/home/wael/Downloads/fb integration second try/restfb test/src/main/resources/Assets/website.jpg");        FacebookType photo = facebookClient.publish( "worldoucar/photos" , FacebookType.class,
//                BinaryAttachment.with("photoName", imageStream));
//        Link photoLink = facebookClient.fetchObject(photo.getId(), Link.class);
//        FacebookType post =  facebookClient.publish("worldoucar/feed", FacebookType.class,
//                Parameter.with("message", "your message"),Parameter.with("type", "photo"),
//                Parameter.with("link", photoLink.getLink()));
//        SpringApplication.run(RestfbTestApplication.class, args);
//    }
        FacebookType publishMessageResponse = null;
        String imagePath = "/home/wael/Downloads/fb integration second try/restfb test/src/main/resources/Assets/website.jpg";
        String pageId = "worldoucar";

        try {
            publishMessageResponse = facebookClient.publish(pageId + "/photos",
                    FacebookType.class,
                    BinaryAttachment.with("website.jpg", new FileInputStream(imagePath))
                    ,Parameter.with("message", "sechudel"),
                    Parameter.with("published", false),
                    Parameter.with("scheduled_publish_time", 1709569531),
                    Parameter.with("unpublished_content_type", "SCHEDULED")
            );
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        long seconds = 1709568811;
        LocalDateTime dateTime = LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.UTC);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,MMMM d,yyyy h:mm,a", Locale.ENGLISH);
        String formattedDate = dateTime.format(formatter);
        System.out.println(formattedDate);
    }
}
