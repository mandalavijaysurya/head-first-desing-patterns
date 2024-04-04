package org.headfirstdesignpattern.chapter2.newsletter.subscribers;

import org.headfirstdesignpattern.chapter2.newsletter.publishers.NewsLetter;

public class NewsLetterSubscriber implements Subscriber{
    private NewsLetter newsLetter;
    private String name;

    public NewsLetterSubscriber(NewsLetter newsLetter, String name){
        this.name = name;
        this.newsLetter = newsLetter;
        this.newsLetter.addSubscriber(this);
    }
    @Override
    public void showNews(String data) {
        System.out.println("Message sent to: " + this.name + " Message: " + data);
    }
}
