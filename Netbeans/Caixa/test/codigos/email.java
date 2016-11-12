
package codigos;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class email 
{
      public static void main(String[] args) {
			
			Date date = new Date();
			LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			int month = localDate.getMonthValue();
			
			String meses[] = {"","Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro",
			"Outubro","Novembro","Dezembro"};
		  
            Properties props = new Properties();
            /** Parâmetros de conexão com servidor Gmail */
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(props,
                        new javax.mail.Authenticator() {
                             protected PasswordAuthentication getPasswordAuthentication() 
                             {
                                   return new PasswordAuthentication("pedroramosdiehl@gmail.com", "filhopedro@p1");
                             }
                        });
            /** Ativa Debug para sessão */
            session.setDebug(true);
            try {

                  Message message = new MimeMessage(session);
                  message.setFrom(new InternetAddress("pedroramosdiehl@gmail.com")); //Remetente

                  Address[] toUser = InternetAddress //Destinatário(s)
                             .parse("evconta1@gmail.com");  
                  message.setRecipients(Message.RecipientType.TO, toUser);
                  message.setSubject("Finalização Caixa SHOPPING DA MODA INTIMA");//Assunto
                  message.setText("Total vendas = "+1+"\nCaixa dia Anterior = "+2+"\nCaixa Atual = "+3+"\nTotal Dinheiro = "+4+""
						  + "\nTotal Cartão = "+5+"\nRetirada = "+6+"\nAcrescimo = "+7+"\nCaixa = "+6);
                  /**Método para enviar a mensagem criada*/
                  Transport.send(message);
                  System.out.println("Feito!!!");
             } catch (MessagingException e) {
                  throw new RuntimeException(e);
            }
      }
}