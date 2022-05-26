package ar.edu.unlp.info.oo2.accesobd;

import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class MailHandler extends Handler {
	private String from;
	private String to;
	
	public MailHandler(String from, String to) {
		this.from = from;
		this.to = to;
	}
	
	@Override
	public void publish(LogRecord record) {
		try {
			// credenciales
			String username = "8c17cd609ccc41"; // Completar con su username de mailtrap
			String password = "17556a96b1c96c"; // Completar con su password de mailtrap
			
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.mailtrap.io");
			props.put("mail.smtp.port", "587");				 
			Session session = Session.getInstance(props,
				new Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		            	return new PasswordAuthentication(username, password);
		            }
			});
	
		    Message message = new MimeMessage(session);
		    message.setFrom(new InternetAddress(this.from, "Java logging mail"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.to));
		    message.setSubject(record.getLevel().toString());
		    message.setText(record.getMessage());
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }

	}

	@Override
	public void flush() {
		this.flush();
	}

	@Override
	public void close() throws SecurityException {
		this.close();

	}

}
