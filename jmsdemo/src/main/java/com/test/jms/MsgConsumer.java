package com.test.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MsgConsumer {

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
        MessageConsumer consumer = session.createConsumer(destination);
        consumer.setMessageListener(new MsgListener() );
        
      /*  Message msg = consumer.receive();
        
        while(msg!=null) {
        	 TextMessage txtMsg = (TextMessage)  msg;
             System.out.println(txtMsg);
             msg = consumer.receive();
        }*/
       
       

        // Clean up
       // session.close();
       // connection.close();

	}

}
