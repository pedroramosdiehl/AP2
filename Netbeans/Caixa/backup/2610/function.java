/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package caixa;

import static caixa.gui.caixaatual;
import static caixa.gui.linha;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class function extends gui{
	
	
	public static String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	public static void sendMail(){
		
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
							 @Override
                             protected PasswordAuthentication getPasswordAuthentication() 
                             {
                                   return new PasswordAuthentication("pedroramosclash@gmail.com", "filhopedro");
                             }
                        });
            /** Ativa Debug para sessão */
            session.setDebug(true);
            try {

                  Message message = new MimeMessage(session);
                  message.setFrom(new InternetAddress("pedroramosclash@gmail.com")); //Remetente

                  Address[] toUser = InternetAddress //Destinatário(s)
                             .parse("evconta1@gmail.com");  
                  message.setRecipients(Message.RecipientType.TO, toUser);
                  message.setSubject("Loja 1 - CAIXA - "+meses[month]+" - "+getDateTime());//Assunto
                  message.setText(
							""+getDateTime()+
							"\nTotal vendas = "+totalvendas.getText()+
							"\nCaixa dia Anterior = "+caixadiaanterior.getText()+
							"\nCaixa Atual = "+caixaatual.getText()+
							"\nTotal Dinheiro = "+totaldinheiro.getText()+""
							+"\nTotal Cartão = "+totalcartao.getText()+
							"\nPedido de venda = "+ped.getText()+
							"\n Retirada 1, motivo: "+re1.getText()+", R$: "+retirada.getText()+
							"\n Retirada 2, motivo: "+re2.getText()+", R$: "+retirada1.getText()+
							"\n Retirada 3, motivo: "+re3.getText()+", R$: "+retirada2.getText()+
							"\n Retirada 4, motivo: "+re4.getText()+", R$: "+retirada3.getText()+
							"\nAcrescimo = "+acrescimo.getText()+
							"\nCaixa = "+caixa.getText());
				  
                  /**Método para enviar a mensagem criada*/
                  Transport.send(message);
                  JOptionPane.showMessageDialog(null,"Email enviado com sucesso!");
             } catch (MessagingException e) {
                  JOptionPane.showMessageDialog(null,"ERRO - O email não foi enviado");
            }
	}
	
	public static void saveDb(){
		
		File arquivo = new File("C:\\caixa\\caixa.txt" );

			arquivo.delete();

			try {

			if (!arquivo.exists()) {
			//cria um arquivo (vazio)
				arquivo.createNewFile();
			}

			//caso seja um diretório, é possível listar seus arquivos e diretórios
			File[] arquivos = arquivo.listFiles();

			//escreve no arquivo
			FileWriter fw = new FileWriter(arquivo, true);

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(caixaatual.getText());

			bw.close();
			fw.close();

			} catch (IOException ex) {
			ex.printStackTrace();
			}
	}
	
	public static void readDb(){
		File arquivo = new File("C:\\caixa\\caixa.txt" );
		File diretorio = new File("C:\\caixa"); // CRIA UM DIRETORIO NA PASTA C:
		
		if(!diretorio.exists()){
			diretorio.mkdir();
		}
		
		try {
			if (!arquivo.exists()) {
			//cria um arquivo (vazio)
				arquivo.createNewFile();
			}
		
		FileReader fr = new FileReader(arquivo);

		BufferedReader br = new BufferedReader(fr);
		
		linha = br.readLine();
		
		if(!(linha == null)){
			double dataB = Double.parseDouble(linha);
		}
		
		br.close();
		fr.close();
		
		} catch (IOException ex) {
		ex.printStackTrace();
		}
	}
	
	public static void sum(){
		
		try{
			double totalV = Double.parseDouble(totalvendas.getText().replace(",",".")); // totalvendas
			double caixaDA = Double.parseDouble(caixadiaanterior.getText().replace(",",".")); //caixa dia anterior 
			double caixaA = Double.parseDouble(caixaatual.getText().replace(",",".")); //Caixa atual
			double totalD = Double.parseDouble(totaldinheiro.getText().replace(",",".")); //Total dinheiro
			double totalC = Double.parseDouble(totalcartao.getText().replace(",",".")); //Total cartao
			double ret = Double.parseDouble(retirada.getText().replace(",",".")); // retirada 1
			double ret1 = Double.parseDouble(retirada1.getText().replace(",",".")); // retirada 2
			double ret2 = Double.parseDouble(retirada2.getText().replace(",",".")); // retirada 3
			double ret3 = Double.parseDouble(retirada3.getText().replace(",","."));// retirada 4
			double acre = Double.parseDouble(acrescimo.getText().replace(",","."));// acrescimo
			double pedidoDV = Double.parseDouble(ped.getText().replace(",",".")); // pedido de venda
			//865 - 817,59 + 5 - 50
			double soma = (totalV + caixaDA) - (caixaA + totalD + totalC) + (acre + pedidoDV) - (ret1 + ret2 + ret3 + ret)  ;
			caixa.setText(""+soma);
		}catch(java.lang.NumberFormatException e){
			JOptionPane.showMessageDialog(null,"Certifique - se que os campos vazio contenha o valor 0!");
		}
	}
}
