package me.jmll.utm.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Notification implements Serializable{

	private static final long serialVersionUID = 1L;
		private String subject;
		private String message;
		private List<String> toAddress;
		private List<String> ccAddress;
		private String messageld;
		private String status;
		
		
		public Notification(){
			
			List<String> ccAddress = new ArrayList<String>();

			List<String> toAddress = new ArrayList<String>();
			this.subject = "";
			this.message = "";
			this.ccAddress = ccAddress;
			this.toAddress= toAddress;
			this.messageld = UUID.randomUUID().toString();
			this.status = "1";
		}
		
		public Notification(String subject, String message,List<String> toAddress,List<String> ccAddress){
			this.subject = subject;
			this.message = message;
			this.ccAddress=ccAddress;
			this.toAddress= toAddress;
			this.messageld = UUID.randomUUID().toString();
			this.status = "1";
		}
		public Notification(String subject, String message,List<String> toAddress){

			List<String> ccAddress = new ArrayList<String>();
			this.subject = subject;
			this.message = message;
			this.ccAddress= ccAddress;
			this.toAddress= toAddress;
			this.messageld = UUID.randomUUID().toString();
			this.status = "1";
		}
		public String getsubject() {
			return subject;
		}
		
		public void setsubject(String subject) {
			this.subject = subject;
		}
		public String getmessage() {
			return message;
		}
		public void setmessage(String message) {
			this.message = message;
		}
		public List<String> getToAddress() {
			return toAddress;
		}
		public void setToAddress(List<String> toAddress) {
			this.toAddress = toAddress;
		}
		
		public List<String> getCcAddress() {
			return ccAddress;
		}
		public void setCcAddress(List<String> ccAddress) {
			this.ccAddress = ccAddress;
		}
		
		public String toString(){
			return String.format("Subject: %s;message: %s; toAddrres: %s; ccAddrres: %s",
					this.getsubject(),
					this.getCcAddress(),
					this.getmessage(),
					this.getToAddress());
		}

}
