package org.headfirstdesignpattern.chapter2.newsletter;

import org.headfirstdesignpattern.chapter2.newsletter.publishers.NewsLetter;
import org.headfirstdesignpattern.chapter2.newsletter.subscribers.NewsLetterSubscriber;

public class NewsLetterSimulator {
    public static void main(String[] args) {
        NewsLetter newsLetter = new NewsLetter();
        NewsLetterSubscriber newsLetterSubscriber = new NewsLetterSubscriber("Dustin");
        newsLetter.addSubscriber(newsLetterSubscriber);
        NewsLetterSubscriber vls1 = new NewsLetterSubscriber("Bob");
        newsLetter.addSubscriber(vls1);
        // ===== Data is being sent to all the subscribers ====
        newsLetter.setData("Something");
    }
}
