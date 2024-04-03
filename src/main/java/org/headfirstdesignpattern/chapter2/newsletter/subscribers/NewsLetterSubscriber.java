package org.headfirstdesignpattern.chapter2.newsletter.subscribers;

public class NewsLetterSubscriber implements Subscriber{

    private String name;

    public NewsLetterSubscriber(String name){
        this.name = name;
    }
    @Override
    public void showNews(String data) {
        System.out.println("Message sent to: " + this.name + " Message: " + data);
    }
}
