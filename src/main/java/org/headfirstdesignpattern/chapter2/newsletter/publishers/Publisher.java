package org.headfirstdesignpattern.chapter2.newsletter.publishers;

import org.headfirstdesignpattern.chapter2.newsletter.subscribers.Subscriber;

public interface Publisher {

   void addSubscriber(Subscriber subscriber);
   void removeSubscriber(Subscriber subscriber);
}
