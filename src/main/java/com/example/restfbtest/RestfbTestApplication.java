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
        SpringApplication.run(RestfbTestApplication.class,args);
        int counter = 0;
//        String MY_ACCESS_TOKEN = "EAAEyMERHZBOgBO6T8uApnpRzIgtJILyqpsSIrB0lZBCaepjju2kt6afvTfpndbIKrIwLWsqlfquNbAevjcpeRNAnW8PqtEZBOVfTVZBp3PTYd2kVAhZA4g3dwWDRiZBR4SwJZB0ZA9mDGS2p81UIvbSoqZC1YOKkH58lJEZCXHWsETa2DkJx1JMoKxZA0B2r94C4ZBrXNzaAYlMsMtrLIAZAchZBQ5XXAZD";
//        FacebookClient facebookClient = new DefaultFacebookClient(MY_ACCESS_TOKEN, Version.VERSION_9_0);
//        Connection<Post> myfeed = facebookClient.fetchConnection("me/feed", Post.class);
//        for(List<Post> myFeedPage :myfeed)
//        {
//            for(Post post : myFeedPage)
//            {
//                String message=post.getMessage();
//                Date date=post.getCreatedTime();
//                if(post.getMessage()!=null) {
//                    System.out.println(post.getApplication());
//                }
//            }
//        }
//        Connection<Insight> insightsConnection =
//                facebookClient.fetchConnection("136720779840416/insights",
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
//        facebookClient.publish("136720779840416/feed", FacebookType.class, Parameter.with("message", Integer.toString(counter) + ": Hello, facebook World!"));
//        counter++;

//        InputStream imageStream = RestfbTestApplication.class.getClassLoader().getResourceAsStream("/home/wael/Downloads/fb integration second try/restfb test/src/main/resources/Assets/website.jpg");        FacebookType photo = facebookClient.publish( "136720779840416/photos" , FacebookType.class,
//                BinaryAttachment.with("photoName", imageStream));
//        Link photoLink = facebookClient.fetchObject(photo.getId(), Link.class);
//        FacebookType post =  facebookClient.publish("136720779840416/feed", FacebookType.class,
//                Parameter.with("message", "your message"),Parameter.with("type", "photo"),
//                Parameter.with("link", photoLink.getLink()));
//        SpringApplication.run(RestfbTestApplication.class, args);
//    }
//        FacebookType publishMessageResponse = null;
//        String imagePath = "/home/wael/Downloads/fb integration second try/restfb test/src/main/resources/Assets/website.jpg";
//        String pageId = "136720779840416";
//
//        try {
//            publishMessageResponse = facebookClient.publish(pageId + "/photos",
//                    FacebookType.class,
//                    BinaryAttachment.with("website.jpg", new FileInputStream(imagePath))
//
//            );
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        long seconds = 1709568811;
//        LocalDateTime dateTime = LocalDateTime.ofEpochSecond(seconds, 0, ZoneOffset.UTC);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,MMMM d,yyyy h:mm,a", Locale.ENGLISH);
//        String formattedDate = dateTime.format(formatter);
//        System.out.println(formattedDate);
    }
}
