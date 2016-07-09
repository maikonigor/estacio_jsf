package br.estacio.frameworks.service;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


@MessageDriven(mappedName = "java:/topic/MyTopic", activationConfig = {
		@ActivationConfigProperty(propertyName = "acknowledgeMode", 
				propertyValue = "Auto-acknowledge"),
		@ActivationConfigProperty(propertyName = "destination", 
				propertyValue = "java:/topic/MyTopic"),
		@ActivationConfigProperty(propertyName = "destinationType", 
				propertyValue = "javax.jms.Topic") })
public class MessagerReceiver  implements MessageListener {
	
	@Resource
	private MessageDrivenContext mdc;
	
	@Override
	public void onMessage(Message arg0) {
		if (arg0 instanceof TextMessage) {
			TextMessage message = (TextMessage) arg0;
			
			try {
				String texto = message.getText();
				
				System.out.println("Pedido: " +	texto + " Recebido");
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}

}
