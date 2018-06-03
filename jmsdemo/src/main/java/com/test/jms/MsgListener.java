package com.test.jms;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MsgListener implements MessageListener {

	public void onMessage(Message message) {
		 TextMessage txtMsg = (TextMessage)  message;
         System.out.println(txtMsg);
	}

}
