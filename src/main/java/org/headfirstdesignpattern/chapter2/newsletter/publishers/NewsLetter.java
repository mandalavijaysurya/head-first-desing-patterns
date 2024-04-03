package org.headfirstdesignpattern.chapter2.newsletter.publishers;

import org.headfirstdesignpattern.chapter2.newsletter.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewsLetter implements Publisher{

    List<Subscriber> subscribers;
    String data;
    public NewsLetter(){
        subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    private void publishNews(String data) {
        subscribers.forEach(subscriber -> subscriber.showNews(data));
    }

    public void setData(String data){
        this.data = data;
        publishNews(data);
    }
}
