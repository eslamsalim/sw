package Model;
import java.util.Date;


public class MessageModel {
private UserModel sender;
private ConversationModel conversation;
private String content;
private Date time;
	public MessageModel() {
		// TODO Auto-generated constructor stub
		sender=new UserModel();
		conversation=new ConversationModel();
		content="";
		time=new Date();
	}
	public MessageModel(UserModel sender, ConversationModel conversation,
			String content, Date time) {
		this.sender = sender;
		this.conversation = conversation;
		this.content = content;
		this.time = time;
	}
	public UserModel getSender() {
		return sender;
	}
	public void setSender(UserModel sender) {
		this.sender = sender;
	}
	public ConversationModel getConversation() {
		return conversation;
	}
	public void setConversation(ConversationModel conversation) {
		this.conversation = conversation;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

}
