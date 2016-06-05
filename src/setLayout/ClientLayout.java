package setLayout;

public class ClientLayout {
	public static String windowName = "客户端";
	public static String serverLabel = "主机IP:";
	public static String portLabel = "端口号:";
	public static String userLabel = "用户名:";
	public static String userListLabel = "用户列表";
	public static String serverText = "127.0.0.1";
	public static String portText = "30000";
	public static String clientText = "客户端1";
	public static String connBtnName = "连接";
	public static String exitBtnName = "退出";
	public static String sendBtnName = "发送";
	
	SetLayout lo = new SetLayout();

	public void init() {
		lo.init(windowName);
		lo.setBounds(200, 200, 500, 400);
	}

	public void setServerLabel(String serverLabel) {
		lo.setLabel(serverLabel, 10, 8, 50, 30);
	}

	public void setPortLabel(String portLabel) {
		lo.setLabel(portLabel, 125, 8, 50, 30);
	}

	public void setUserLabel(String userLabel) {
		lo.setLabel(userLabel, 220, 8, 55, 30);
	}

	public void setUserListLabel(String userListLabel) {
		lo.setLabel(userListLabel, 40, 40, 80, 30);
	}

	public void setServerTField(String serverText) {
		lo.setTextField(serverText, 55, 8, 60, 30);
	}
	
	public void setPortTField(String portText){
		lo.setTextField(portText, 170, 8, 40, 30);
	}
	
	public void setUserTField(String clientText){
		lo.setTextField(clientText, 265, 8, 60, 30);
	}
	
	public void setConnBtn(String connBtnName){
		lo.setButton(connBtnName,335, 8, 75, 30);
	}

	public void setExitBtn(String exitBtnName){
		lo.setButton(exitBtnName, 415, 8, 75, 30);
	}
	
	public void setSendBtn(String sendBtnName){
		lo.setButton(sendBtnName, 380, 305, 70, 40);
	}
	
	public void setUserList(){
		lo.setList(10, 70, 120, 220);
	}
	
	public void setTextArea(){
		lo.setTextArea(135, 70, 340, 220);
	}
	
	public void setMessageArea(){
		lo.setTextField(10, 300, 360, 50);
	}
	
	public void setVisibility(){
		lo.setVisibility();
	}
	
	public static void main(String args[]){
	
		ClientLayout cl = new ClientLayout();
		cl.init();
		cl.setServerLabel(serverLabel);
		cl.setPortLabel(portLabel);
		cl.setUserLabel(userLabel);
		cl.setUserListLabel(userListLabel);
		cl.setServerTField(serverText);
		cl.setPortTField(portText);
		cl.setUserTField(clientText);
		cl.setConnBtn(connBtnName);
		cl.setExitBtn(exitBtnName);
		cl.setSendBtn(sendBtnName);
		cl.setUserList();
		cl.setTextArea();
		cl.setMessageArea();
		cl.setVisibility();
		
	}
	
}
