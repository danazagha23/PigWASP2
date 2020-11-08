package first;


import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class WebEmailService {
	public void sendEmail(String email , List <Houses> homes) throws Exception {



	      // Get system properties
	      Properties properties = new Properties();
	      properties.put("mail.smtp.auth", "true");
	      properties.put("mail.smtp.starttls.enable", "true");
	      properties.put("mail.smtp.host", "smtp.gmail.com");
	      properties.put("mail.smtp.port", "587");
	      properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");

	      final String myAccount="hayaanddanaz@gmail.com";
	      final String password="test1234test";
	      String recepient=email; 
	      Session session =Session.getInstance(properties, new Authenticator() {
	    	  @Override
	    	  protected PasswordAuthentication getPasswordAuthentication() {
	    	  return new PasswordAuthentication(myAccount, password);
	    		
	    	}
	    	  
	      }
	    	 );
	      Message msg= prepareMessage(session,myAccount, recepient, homes);
	      Transport.send(msg);
	      System.out.println("Senttttt");
	    		  
	   }
	private Message prepareMessage(Session session, String myAccount, String recepient, List<Houses> r) {
		Message message= new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(myAccount));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			message.setSubject("Results");
			String resultMsg="The Result of your Search are:\n";
			for (int i=0; i<r.size();i++) {
				Houses h1= r.get(i);
				resultMsg+=(h1.getType()+"\t" + h1.getMaterial()+"\t"+ h1.getPlacement()+"\t"+h1.getPets()+"\t"+h1.getTemp()+"\t"+h1.getPrice()+"\t"+h1.getArea()+"\t"+h1.getBathrooms()+"\t"+h1.getBedrooms()+"\t"+h1.getLease()+"\n");
			}
			message.setText(resultMsg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return message;
		
}
}