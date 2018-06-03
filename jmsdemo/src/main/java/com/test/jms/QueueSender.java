package com.test.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class QueueSender {

	public static void main(String[] args) throws Exception {
		
		//Connection Factory
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(); // Default Port tcp://localhost:61616
		
		// Create a Connection
        Connection connection = connectionFactory.createConnection();
        connection.start();

        // Create a Session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        // Create the destination (Topic or Queue)
        Destination destination = session.createQueue("demo.requestq");

        // Create a MessageProducer from the Session to the Topic or Queue
        MessageProducer producer = session.createProducer(destination);
        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

        for(int i=1;i<20;i++) {
        	 // Create a messages
            String text = "  Text Msg  :    " + i ;
            TextMessage message = session.createTextMessage(text);

            // Tell the producer to send the message
            System.out.println(text);
            producer.send(message);
        }
       

        // Clean up
        session.close();
        connection.close();

	}

}
