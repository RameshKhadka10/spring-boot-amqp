package com.ramesh.amqp.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    /**
     * Assigns a Consumer to receive the messages whenever there is one.
     *
     * @param message
     */
    @RabbitListener(queues = "queue.ex")
    public void receiveMessage(String message) {
        System.out.println("Received Message:" + message);
        System.out.println();
    }

}
