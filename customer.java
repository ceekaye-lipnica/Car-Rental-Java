package carRental;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customerForm extends JFrame implements ActionListener{

	private JFrame frame;
	private JTextField nameTextfield;
	private JTextField addressTextfield;
	private JTextField contactsTextfield;
	private JTextField emailTextfield;
	private JButton submitBttn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerForm window = new customerForm();
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
	public customerForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		submitBttn = new JButton("Submit");
		submitBttn.addActionListener(this);
		submitBttn.setActionCommand("submit");
		pack();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel customerLabel = new JLabel("Customer Information");
		customerLabel.setBounds(147, 23, 121, 14);
		frame.getContentPane().add(customerLabel);
		
		JLabel name = new JLabel("Name:");
		name.setBounds(25, 55, 46, 14);
		frame.getContentPane().add(name);
		
		nameTextfield = new JTextField();
		nameTextfield.setBounds(105, 52, 86, 20);
		frame.getContentPane().add(nameTextfield);
		nameTextfield.setColumns(10);
		
		JLabel address = new JLabel("Address:");
		address.setBounds(25, 80, 46, 14);
		frame.getContentPane().add(address);
		
		addressTextfield = new JTextField();
		addressTextfield.setBounds(105, 83, 86, 20);
		frame.getContentPane().add(addressTextfield);
		addressTextfield.setColumns(10);
		
		JLabel contacts = new JLabel("Contact Number:");
		contacts.setBounds(10, 117, 97, 14);
		frame.getContentPane().add(contacts);
		
		contactsTextfield = new JTextField();
		contactsTextfield.setBounds(105, 114, 86, 20);
		frame.getContentPane().add(contactsTextfield);
		contactsTextfield.setColumns(10);
		
		JLabel email = new JLabel("Email:");
		email.setBounds(25, 142, 46, 14);
		frame.getContentPane().add(email);
		
		emailTextfield = new JTextField();
		emailTextfield.setBounds(105, 139, 86, 20);
		frame.getContentPane().add(emailTextfield);
		emailTextfield.setColumns(10);
		
		submitBttn.setBounds(177, 195, 89, 23);
		frame.getContentPane().add(submitBttn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		
		if (cmd.equals("submit")) {
			dispose();
			new carModels();
		}
		
	}
}
