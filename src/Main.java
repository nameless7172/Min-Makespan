import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField Valeurdmax;
	private JTextField Valeurdmin;
	private JTextField Valeurm;
	private JTextField Valeurn;
	private JTextField Valeurk;
	private JTextField ValeurdeP;

	/**
	 * TESTGITasiednaoidnasdinuoasdoasdina
	 * Launch the application.
	 * 
	 *testgit 4
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Entries", null, panel_1, null);
		panel_1.setLayout(null);
		
		Valeurdmax = new JTextField();
		Valeurdmax.setText("");
		Valeurdmax.setToolTipText("");
		Valeurdmax.setBounds(297, 168, 86, 20);
		panel_1.add(Valeurdmax);
		Valeurdmax.setColumns(10);
		
		Valeurdmin = new JTextField();
		Valeurdmin.setText("");
		Valeurdmin.setColumns(10);
		Valeurdmin.setBounds(297, 137, 86, 20);
		panel_1.add(Valeurdmin);
		
		Valeurm = new JTextField();
		Valeurm.setText("");
		Valeurm.setColumns(10);
		Valeurm.setBounds(297, 44, 86, 20);
		panel_1.add(Valeurm);
		
		Valeurn = new JTextField();
		Valeurn.setText("");
		Valeurn.setColumns(10);
		Valeurn.setBounds(297, 75, 86, 20);
		panel_1.add(Valeurn);
		
		Valeurk = new JTextField();
		Valeurk.setText("");
		Valeurk.setColumns(10);
		Valeurk.setBounds(297, 106, 86, 20);
		panel_1.add(Valeurk);
		
		JLabel lblNewLabel = new JLabel("m");
		lblNewLabel.setBounds(128, 44, 92, 20);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("n");
		lblNewLabel_1.setBounds(128, 75, 92, 20);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("k");
		lblNewLabel_2.setBounds(128, 106, 92, 20);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("dmin");
		lblNewLabel_3.setBounds(128, 137, 92, 20);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("dmax");
		lblNewLabel_4.setBounds(128, 168, 92, 20);
		panel_1.add(lblNewLabel_4);
		
	
		ValeurdeP = new JTextField();
		ValeurdeP.setToolTipText("");
		ValeurdeP.setText("");
		ValeurdeP.setColumns(10);
		ValeurdeP.setBounds(297, 316, 86, 20);
		panel_1.add(ValeurdeP);
		
		JLabel lblNewLabel_4_1 = new JLabel("p");
		lblNewLabel_4_1.setBounds(128, 316, 92, 20);
		panel_1.add(lblNewLabel_4_1);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Results", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("LSA");
		lblNewLabel_3_1.setBounds(65, 114, 92, 20);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("LPT");
		lblNewLabel_3_2.setBounds(65, 165, 92, 20);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("RSA");
		lblNewLabel_3_3.setBounds(65, 216, 92, 20);
		panel.add(lblNewLabel_3_3);
		
		JLabel ValeurLSA = new JLabel("?");
		ValeurLSA.setBounds(247, 117, 92, 20);
		panel.add(ValeurLSA);
		
		JLabel ValeurLPT = new JLabel("?");
		ValeurLPT.setBounds(247, 168, 92, 20);
		panel.add(ValeurLPT);
		
		JLabel ValeurRSA = new JLabel("?");
		ValeurRSA.setBounds(247, 216, 92, 20);
		panel.add(ValeurRSA);
		
		JLabel Errorp0 = new JLabel("Invalid value");
		Errorp0.setForeground(Color.RED);
		Errorp0.setVisible(false);
		Errorp0.setBounds(406, 319, 62, 14);
		panel_1.add(Errorp0);
	
		
		// algorithmes du projet
		
		JButton btnNewButton = new JButton("Generate results");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				// Si p est entree, il a la priorite.
				
				int p = Integer.parseInt(ValeurdeP.getText());
				
				if (p<=0) {Errorp0.setVisible(true);}
				
				int tempLPT = (((4*p+2*p*(p-1)*2+2*p))/(2*p));
				ValeurLPT.setText(String.valueOf(tempLPT));
				int tempLSA = 4*p;
				ValeurLSA.setText(String.valueOf(tempLSA));
			}
		});
		
		
		
		btnNewButton.setBounds(156, 354, 147, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Please choose the mode before generating results ");
		lblNewLabel_5.setBounds(42, 11, 412, 14);
		panel_1.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("random instance");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ValeurdeP.setEditable(false);
				
			}
		});
		rdbtnNewRadioButton.setBounds(6, 105, 116, 39);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Instance \"2p\"");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Valeurm.setEditable(false);
				Valeurk.setEditable(false);
				Valeurn.setEditable(false);
				Valeurdmin.setEditable(false);
				Valeurdmax.setEditable(false);
				
			}
		});
		rdbtnNewRadioButton_1.setBounds(6, 315, 111, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		

		
		
		
		
		
		
		
		

	}
}
