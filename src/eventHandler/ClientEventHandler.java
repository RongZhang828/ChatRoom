package eventHandler;

import javax.swing.JFrame;
import javax.swing.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;  
import java.net.Socket;  
import setLayout.ClientLayout;
import setLayout.SetLayout;

public class ClientEventHandler {
	
	public static Socket socket;

	public void clientEvent() {
		ClientLayout clo = new ClientLayout();
		SetLayout lo = clo.getClientLayout();
		JFrame window = lo.getWindow();

		window.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				if (socket != null && socket.isConnected()) {
					
				}
			}
		}

		);

	}
}
