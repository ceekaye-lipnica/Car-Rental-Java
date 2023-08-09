package carRental;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class carModels extends JFrame implements ActionListener{

	private JFrame frame;
	private JButton btnView;  
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carModels window = new carModels();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public carModels() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnView = new JButton("View");
		btnView.addActionListener(this);	
		btnView.setActionCommand("open");
		pack();
		setVisible(true);
	
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCarModels = new JLabel("Car Models");
		lblCarModels.setBounds(165, 22, 105, 14);
		frame.getContentPane().add(lblCarModels);
		
		JLabel Toyota = new JLabel("Toyota Camry 2.5 V");
		Toyota.setBounds(32, 46, 117, 14);
		frame.getContentPane().add(Toyota);
		
		
		btnView.setBounds(164, 42, 89, 23);
		frame.getContentPane().add(btnView);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(32, 71, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnView_1 = new JButton("View");
		btnView_1.setBounds(165, 76, 89, 23);
		frame.getContentPane().add(btnView_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(32, 111, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnView_2 = new JButton("View");
		btnView_2.setBounds(164, 110, 89, 23);
		frame.getContentPane().add(btnView_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(32, 147, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnView_3 = new JButton("View");
		btnView_3.setBounds(165, 143, 89, 23);
		frame.getContentPane().add(btnView_3);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(32, 177, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.setBounds(165, 173, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if(cmd.equals("open")) {
			dispose();
			new carSpecification();
		}
	}
}
