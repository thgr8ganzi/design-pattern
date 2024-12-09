package org.example.designpattern._03_behavioral.observer._03_java;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class FlowInJava {
    public static void main(String[] args) {
//        Flow.Publisher<String> publisher = new Flow.Publisher<String>() {
//            @Override
//            public void subscribe(Flow.Subscriber<? super String> subscriber) {
//                subscriber.onNext("Hello");
//                subscriber.onComplete();
//            }
//        };
        Flow.Publisher<String> publisher = new SubmissionPublisher<>();

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<String>() {

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("Sub!");
                this.subscription = subscription;
                this.subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("onNext");
                System.out.println(item);
                System.out.println(Thread.currentThread().getName());
            }

            @Override
            public void onError(Throwable throwable) {}

            @Override
            public void onComplete() {
                System.out.println("Done");
            }
        };
        publisher.subscribe(subscriber);

        ((SubmissionPublisher) publisher).submit("Hello");
        ((SubmissionPublisher) publisher).submit("World");

        System.out.println("End called");
    }
}
