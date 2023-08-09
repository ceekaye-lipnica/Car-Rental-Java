package carRental;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class carSpecification extends JFrame {

	private JFrame frame;
	private final JLabel lblNewLabel_1 = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carSpecification window = new carSpecification();
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
	public carSpecification() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 598, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel labelCarSpecification = new JLabel("Car Specification");
		labelCarSpecification.setBounds(170, 27, 110, 14);
		frame.getContentPane().add(labelCarSpecification);
		
		JLabel carModel = new JLabel("Car Model:");
		carModel.setBounds(21, 58, 89, 14);
		frame.getContentPane().add(carModel);
		
		JLabel labelSpecifications = new JLabel("Specifications:");
		labelSpecifications.setBounds(21, 83, 79, 14);
		frame.getContentPane().add(labelSpecifications);
		
		JLabel lblNewLabel = new JLabel("Dimension and Weight:");
		lblNewLabel.setBounds(52, 108, 148, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel overallDimension = new JLabel("Overall Dimensions (mm): ");
		overallDimension.setBounds(54, 133, 146, 14);
		frame.getContentPane().add(overallDimension);
		
		JLabel dimensionDesc = new JLabel("4, 885 x 1,840 x 1,445");
		dimensionDesc.setBounds(235, 133, 148, 14);
		frame.getContentPane().add(dimensionDesc);
		
		JLabel wheelbase = new JLabel("Wheelbase (mm):");
		wheelbase.setBounds(52, 158, 123, 14);
		frame.getContentPane().add(wheelbase);
		
		JLabel wheelbaseDesc = new JLabel("2,825");
		wheelbaseDesc.setBounds(234, 158, 46, 14);
		frame.getContentPane().add(wheelbaseDesc);
		
		JLabel seatingCapacity = new JLabel("Seating Capacity: ");
		seatingCapacity.setBounds(54, 183, 121, 14);
		frame.getContentPane().add(seatingCapacity);
		
		JLabel seatingDesc = new JLabel("5");
		seatingDesc.setBounds(235, 183, 46, 14);
		frame.getContentPane().add(seatingDesc);
		
		JLabel lblNewLabel_2 = new JLabel("Engine:");
		lblNewLabel_2.setBounds(21, 208, 89, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel engineType = new JLabel("Engine Type:");
		engineType.setBounds(64, 233, 111, 14);
		frame.getContentPane().add(engineType);
		
		JLabel engineDesc = new JLabel("4-Cylinder In-Line, 16 Valve, DOHC, Dual VVT-i");
		engineDesc.setBounds(235, 233, 285, 14);
		frame.getContentPane().add(engineDesc);
		
		JLabel engineDisplacement = new JLabel("Engine Displacement (cc):");
		engineDisplacement.setBounds(62, 258, 148, 14);
		frame.getContentPane().add(engineDisplacement);
		
		JLabel displacementDesc = new JLabel("2,494");
		displacementDesc.setBounds(235, 258, 46, 14);
		frame.getContentPane().add(displacementDesc);
		
		JLabel maxOutput = new JLabel("Maximum Output (ps/rpm):");
		maxOutput.setBounds(64, 287, 157, 14);
		frame.getContentPane().add(maxOutput);
		
		JLabel maxOutputDesc = new JLabel("184ps/6,000rpm");
		maxOutputDesc.setBounds(235, 287, 170, 14);
		frame.getContentPane().add(maxOutputDesc);
		
		JLabel maxTorque = new JLabel("Maximum Torque (Nm/Rpm):");
		maxTorque.setBounds(64, 312, 157, 14);
		frame.getContentPane().add(maxTorque);
		
		JLabel maxTorqueDesc = new JLabel("231Nm/4,100rpm");
		maxTorqueDesc.setBounds(234, 312, 171, 14);
		frame.getContentPane().add(maxTorqueDesc);
		
		JLabel fuel = new JLabel("Fuel Capacity(L): ");
		fuel.setBounds(64, 337, 146, 14);
		frame.getContentPane().add(fuel);
		
		JLabel lblTransmission = new JLabel("Transmission:");
		lblTransmission.setBounds(21, 361, 154, 14);
		frame.getContentPane().add(lblTransmission);
		
		JLabel powerTransmission = new JLabel("Power Trasmission: ");
		powerTransmission.setBounds(64, 386, 146, 14);
		frame.getContentPane().add(powerTransmission);
		
		JLabel powerDesc = new JLabel("6-Speed Automatic");
		powerDesc.setBounds(235, 386, 170, 14);
		frame.getContentPane().add(powerDesc);
		
		JLabel lblFrontBrakerearBrake = new JLabel("Front Brake/Rear Brake: ");
		lblFrontBrakerearBrake.setBounds(65, 403, 156, 14);
		frame.getContentPane().add(lblFrontBrakerearBrake);
		
		JLabel brakeDesc = new JLabel("Ventilated Disc / Solid Disc");
		brakeDesc.setBounds(235, 403, 157, 14);
		frame.getContentPane().add(brakeDesc);
		
		JLabel lblTires = new JLabel("Tires: ");
		lblTires.setBounds(64, 425, 46, 14);
		frame.getContentPane().add(lblTires);
		
		JLabel tiresDesc = new JLabel("235/45R18");
		tiresDesc.setBounds(234, 425, 128, 14);
		frame.getContentPane().add(tiresDesc);
		lblNewLabel_1.setBounds(97, 54, 98, 23);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
