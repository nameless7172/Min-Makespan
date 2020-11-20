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
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.util.Random;
public class Main extends JFrame {
// On genere des taches aleatoire on on les repartie entre chaque machien d'une instance
	private JPanel contentPane;
	private JTextField Valuedmax;
	private JTextField Valuedmin;
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
		
		Valuedmax = new JTextField();
		Valuedmax.setText("");
		Valuedmax.setToolTipText("");
		Valuedmax.setBounds(297, 168, 86, 20);
		panel_1.add(Valuedmax);
		Valuedmax.setColumns(10);
		
		Valuedmin = new JTextField();
		Valuedmin.setText("");
		Valuedmin.setColumns(10);
		Valuedmin.setBounds(297, 137, 86, 20);
		panel_1.add(Valuedmin);
		
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
		
		JLabel lblNewLabel_3_1_3 = new JLabel("RMA ratio");
		lblNewLabel_3_1_3.setBounds(65, 234, 92, 20);
		panel.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Lower bound ''average''");
		lblNewLabel_3_1_1.setBounds(65, 52, 144, 20);
		panel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_5 = new JLabel("LSA ratio");
		lblNewLabel_3_1_5.setBounds(65, 134, 92, 20);
		panel.add(lblNewLabel_3_1_5);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Lower bound ''maximum''");
		lblNewLabel_3_1_2.setBounds(65, 27, 144, 20);
		panel.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_4 = new JLabel("LPT ratio");
		lblNewLabel_3_1_4.setBounds(65, 185, 92, 20);
		panel.add(lblNewLabel_3_1_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("LSA result");
		lblNewLabel_3_1.setBounds(65, 114, 92, 20);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("LPT result");
		lblNewLabel_3_2.setBounds(65, 165, 92, 20);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("RMA result");
		lblNewLabel_3_3.setBounds(65, 216, 92, 20);
		panel.add(lblNewLabel_3_3);
		
		JLabel ValueLSAresult = new JLabel("?");
		ValueLSAresult.setBounds(247, 117, 92, 20);
		panel.add(ValueLSAresult);
		
		JLabel ValueLPTresult = new JLabel("?");
		ValueLPTresult.setBounds(247, 168, 92, 20);
		panel.add(ValueLPTresult);
		
		JLabel ValueRMAresult = new JLabel("?");
		ValueRMAresult.setBounds(247, 216, 92, 20);
		panel.add(ValueRMAresult);
		
		JLabel ValueRMAratio = new JLabel("?");
		ValueRMAratio.setBounds(247, 237, 92, 20);
		panel.add(ValueRMAratio);
		
		JLabel ValueLPTratio = new JLabel("?");
		ValueLPTratio.setBounds(247, 188, 92, 20);
		panel.add(ValueLPTratio);
		
		JLabel ValueLSAratio = new JLabel("?");
		ValueLSAratio.setBounds(247, 137, 92, 20);
		panel.add(ValueLSAratio);
		
		JLabel Valeurmoy = new JLabel("?");
		Valeurmoy.setBounds(247, 55, 92, 20);
		panel.add(Valeurmoy);
		
		JLabel Valeurmaxi = new JLabel("?");
		Valeurmaxi.setBounds(247, 30, 92, 20);
		panel.add(Valeurmaxi);
		
		JLabel Errorp0 = new JLabel("Invalid value");
		Errorp0.setForeground(Color.RED);
		Errorp0.setVisible(false);
		Errorp0.setBounds(406, 319, 62, 14);
		panel_1.add(Errorp0);
		
		JLabel lblNewLabel_5 = new JLabel("Please choose the mode before generating results ");
		lblNewLabel_5.setBounds(42, 11, 412, 14);
		panel_1.add(lblNewLabel_5);
		
		JRadioButton Mode1 = new JRadioButton("random instance");
		Mode1.setBounds(6, 105, 116, 39);
		panel_1.add(Mode1);
		JRadioButton Mode2 = new JRadioButton("Instance \"2p\"");
		Mode2.setSelected(true);

		
		// Radio bouton selection
		
		Mode1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				ValeurdeP.setEnabled(false);
				Mode2.setSelected(false);
				Valeurm.setEnabled(true);
				Valuedmax.setEnabled(true);
				Valuedmin.setEnabled(true);
				Valeurk.setEnabled(true);
				Valeurn.setEnabled(true);	
				lblNewLabel_3_3.setVisible(false);
				lblNewLabel_3_1.setVisible(false);
				lblNewLabel_3_2.setVisible(false);
				ValueLSAresult.setVisible(false);
				ValueLPTresult.setVisible(false);
				ValueRMAresult.setVisible(false);
			}
			
			
			
		});
		Mode2.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
				ValeurdeP.setEnabled(true);
				Mode1.setSelected(false);
				Valeurm.setEnabled(false);
				Valuedmax.setEnabled(false);
				Valuedmin.setEnabled(false);
				Valeurk.setEnabled(false);
				Valeurn.setEnabled(false);
				lblNewLabel_3_3.setVisible(true);
				lblNewLabel_3_1.setVisible(true);
				lblNewLabel_3_2.setVisible(true);
				ValueLSAresult.setVisible(true);
				ValueLPTresult.setVisible(true);
				ValueRMAresult.setVisible(true);
				
			}
			
		});
		// algorithmes du projet
		
		JButton btnNewButton = new JButton("Generate results");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random random = new Random();
				if(Mode2.isSelected() && !Mode1.isSelected()){
					int j ;
					int sommesTaches = 0;
					int p = Integer.parseInt(ValeurdeP.getText());
					int nbmachine = 2*p;
					if (p<=0) {Errorp0.setVisible(true);}
					// algo LPT
					int tempLPT = (((4*p+2*p*(p-1)*2+2*p))/(2*p));
					ValueLPTresult.setText(String.valueOf(tempLPT));
					
					//algo LSA
					int tempLSA = 4*p;
					ValueLSAresult.setText(String.valueOf(tempLSA));
					
					
					
					//algo RMA
					ArrayList<Integer> listeMachine = new ArrayList<Integer>();
					for(int i =0; i<nbmachine; i++) {
						listeMachine.add(0);
					}
					//repartition tache 1
					
					for(int i =0; i<4*p; i++) {
						j = random.nextInt(nbmachine);
						Integer tempValeurMachine = listeMachine.get(j);
						tempValeurMachine +=  1;
						listeMachine.set(j , tempValeurMachine);
						sommesTaches += 1 ;
						
					}
					System.out.println(listeMachine);
					for(int i =0; i<2*p *(p-1); i++) {
						j = random.nextInt(nbmachine);
						Integer tempValeurMachine = listeMachine.get(j);
						tempValeurMachine +=  2;
						listeMachine.set(j , tempValeurMachine);
						sommesTaches += 2 ;
					
					}
					
					System.out.println(listeMachine);
					j = random.nextInt(nbmachine);
					Integer tempValeurMachine = listeMachine.get(j);
					tempValeurMachine +=  2*p;
					sommesTaches += 2*p ;
					listeMachine.set(j , tempValeurMachine);
					System.out.println(listeMachine);
					double valeurmoyenne = sommesTaches/nbmachine;
					int valeurmax = 2*p;
					double B = Math.max(valeurmoyenne,valeurmax);
					ValueRMAresult.setText(String.valueOf(Collections.max(listeMachine)));
					Valeurmoy.setText(String.valueOf(valeurmoyenne));
					Valeurmaxi.setText(String.valueOf(valeurmax));
					ValueRMAratio.setText(String.valueOf(Collections.max(listeMachine)/ B));
					ValueLSAratio.setText(String.valueOf(tempLSA/B));
					ValueLPTratio.setText(String.valueOf(tempLPT/B));
				}
				if(!Mode2.isSelected() && Mode1.isSelected()){		
					Integer m = Integer.parseInt(Valeurm.getText());
					Integer n = Integer.parseInt(Valeurn.getText());
					Integer k = Integer.parseInt(Valeurk.getText());
					Integer dmin = Integer.parseInt(Valuedmin.getText());
					Integer dmax = Integer.parseInt(Valuedmax.getText());
					ArrayList<ArrayList<Integer>> listeInstanceLSA = new ArrayList<ArrayList<Integer>>();
					ArrayList<ArrayList<Integer>> listeInstanceLPT = new ArrayList<ArrayList<Integer>>();
					ArrayList<ArrayList<Integer>> listeInstanceRMA = new ArrayList<ArrayList<Integer>>();

					ArrayList<Double> listeRatioLSA = new ArrayList<Double>();
					ArrayList<Double> listeRatioLPT = new ArrayList<Double>();
					ArrayList<Double> listeRatioRMA = new ArrayList<Double>();

					double B ;
					double valeurmoyenneLSA;
					double valeurmoyenneLPT;
					double valeurmoyenneRMA;
					
					double valeurmaxLSA;
					double valeurmaxLPT;
					double valeurmaxRMA;
					
					double dureetachetotalLSA;
					double dureetachetotalLPT;
					double dureetachetotalRMA;

					for(int i = 0 ; i < k ; i++) {
						dureetachetotalLSA = 0 ;
						dureetachetotalLPT = 0 ;
						dureetachetotalRMA = 0 ;

						ArrayList<Integer> instanceLPT = new ArrayList<Integer>();
						ArrayList<Integer> instanceLSA = new ArrayList<Integer>();
						ArrayList<Integer> instanceRMA = new ArrayList<Integer>();

						ArrayList<Integer> listeTachesLSA = new ArrayList<Integer>();
						ArrayList<Integer> listeTachesLPT = new ArrayList<Integer>();
						ArrayList<Integer> listeTachesRMA = new ArrayList<Integer>();

						//creation de la liste de tache
						for(int j = 0 ; j < n ; j ++) {
							int rand = random.nextInt(dmax-dmin)+dmin ;
							listeTachesLSA.add(rand);
							listeTachesLPT.add(rand);
							listeTachesRMA.add(rand);

						}
						Collections.sort(listeTachesLPT, Collections.reverseOrder());
						// ajout des machines au sein de l'instance
						for(int j = 0 ; j < m ; j++ ) {
							instanceLSA.add(0);
							instanceLPT.add(0);
							instanceRMA.add(0);

						}
						// On place en utilisant le modele LSA
						for(int j = 0; j < listeTachesLSA.size(); j++) {
							
							int indexLSA = instanceLSA.indexOf(Collections.min(instanceLSA));
							int indexLPT = instanceLPT.indexOf(Collections.min(instanceLPT));
							int indexRMA = random.nextInt(instanceRMA.size());
							
							int dureeLSA = instanceLSA.get(indexLSA);
							int dureeLPT = instanceLPT.get(indexLPT);
							int dureeRMA = instanceRMA.get(indexRMA);
							
							dureeLSA += listeTachesLSA.get(j);
							dureeLPT += listeTachesLPT.get(j);
							dureeRMA += listeTachesRMA.get(j);
							
							instanceLPT.set(indexLPT, dureeLPT);
							instanceLSA.set(indexLSA, dureeLSA);
							instanceRMA.set(indexRMA, dureeRMA);
							
							dureetachetotalLSA += listeTachesLSA.get(j);
							dureetachetotalLPT += listeTachesLPT.get(j);
							dureetachetotalRMA += listeTachesRMA.get(j);

						}
					
						valeurmoyenneLPT = dureetachetotalLPT/instanceLPT.size();
						valeurmoyenneLSA = dureetachetotalLSA/instanceLSA.size();
						valeurmoyenneRMA = dureetachetotalRMA/instanceRMA.size();

						valeurmaxLPT = Collections.max(listeTachesLPT);
						valeurmaxLSA = Collections.max(listeTachesLSA);
						valeurmaxRMA = Collections.max(listeTachesLSA);

						B = Math.max(valeurmoyenneLSA,valeurmaxLSA);
						listeRatioLSA.add(Collections.max(instanceLSA)/B);
						B=  Math.max(valeurmoyenneLPT,valeurmaxLPT);
						listeRatioLPT.add(Collections.max(instanceLPT)/B);
						B=  Math.max(valeurmoyenneRMA,valeurmaxRMA);
						listeRatioRMA.add(Collections.max(instanceRMA)/B);
						
						listeInstanceLSA.add(instanceLSA);
						listeInstanceLPT.add(instanceLPT);
						listeInstanceRMA.add(instanceRMA);

					}
					
					for(double ratio : listeRatioLPT) {
						
					}
					for(double ratio : listeRatioLSA) {
						
					}
					System.out.println("listeInstanceLSA" + listeInstanceLSA);
					System.out.println("listeRatioLSA" +listeRatioLSA);
					System.out.println("listeInstanceLPT" +listeInstanceLPT);
					System.out.println("listeRatioLPT" +listeRatioLPT);
					System.out.println("listeInstanceRMA" +listeInstanceRMA);
					System.out.println("listeRatioRMA" +listeRatioRMA);
					
				}
				
			}
		});
		
		
		
		btnNewButton.setBounds(156, 354, 147, 23);
		panel_1.add(btnNewButton);
	
		Mode2.setBounds(6, 315, 111, 23);
		panel_1.add(Mode2);
		
		Mode1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((Mode1.getModel().isPressed())&&(!(Mode2.getModel().isPressed()))) {
					ValeurdeP.setEditable(false); 
				}
			}
		});
	
	
	
		
		
		
		
		
		

	}
}
