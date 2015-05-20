package utils;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.sql.Connection;

import ui.UIdahouet;
import ui.UIsaisieProprio;
import dao.Connect;

public class AppDahouet {
	private UIdahouet mainUI;
	private UIsaisieProprio proprioUI;

	Connection c = Connect.cConnect();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					AppDahouet window = new AppDahouet();
					window.mainUI.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppDahouet() {
		initialize();
	}

	private void initialize() {

		/**
		 * init views
		 */
		// main window

		mainUI = new UIdahouet();
		mainUI.setVisible(false);

		// saisie new proprio
		proprioUI = new UIsaisieProprio();
		proprioUI.setVisible(false);

		/**
		 * subscribe controller to ui events
		 */

		// Center frames
		centerFrame(mainUI);
	}

	private void centerFrame(UIdahouet ui) {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = ui.getSize();
		if (frameSize.height > screenSize.height) {
			frameSize.height = screenSize.height;
		}
		if (frameSize.width > screenSize.width) {
			frameSize.width = screenSize.width;
		}
		ui.setLocation((screenSize.width - frameSize.width) / 2,
				(screenSize.height - frameSize.height) / 2);

	}

}
