package secuenciales;
import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class _02 extends JFrame {

	private static final long serialVersionUID = 1L;

//	JLabel lblpulgadas, lblPies;
	JTextField txtmetros,txtcentimetros, txtpulgadas, txtpies, txtyardas;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_02 frame = new _02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		/*contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);*/
		
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblmetros = new JLabel("Metros: ");
		lblmetros.setBounds(50, 50, 80, 30);
		getContentPane().add(lblmetros);
		
		JLabel lblcentimetros = new JLabel("Centimetros: ");
		lblcentimetros.setBounds(50, 90, 80, 30);
		getContentPane().add(lblcentimetros);
		
		JLabel lblpulgadas = new JLabel("Pulgadas");
		lblpulgadas.setBounds(50, 130, 80, 30);
		getContentPane().add(lblpulgadas);
		
		JLabel lblPies = new JLabel("Pies");
		lblPies.setBounds(50, 170, 80, 30);
		getContentPane().add(lblPies);
		
		JLabel lblyardas = new JLabel("Yardas");
		lblyardas.setBounds(50, 210, 80, 30);
		getContentPane().add(lblyardas);
		
		txtmetros = new JTextField();
		txtmetros.setBounds(140, 50, 60, 30);
		txtmetros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtmetros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtmetros);
		
		txtcentimetros = new JTextField();
		txtcentimetros.setBounds(140, 90, 60, 30);
		txtcentimetros.setFocusable(false);
		getContentPane().add(txtcentimetros);
		
		txtpulgadas = new JTextField();
		txtpulgadas.setBounds(140, 130, 60, 30);
		txtpulgadas.setFocusable(false);
		getContentPane().add(txtpulgadas);
		
		txtpies = new JTextField();
		txtpies.setBounds(140, 170, 60, 30);
		txtpies.setFocusable(false);
		getContentPane().add(txtpies);
		
		txtyardas = new JTextField();
		txtyardas.setBounds(140, 210, 60, 30);
		txtyardas.setFocusable(false);
		getContentPane().add(txtyardas);
		
		JButton btncalcular = new JButton("Calcular");
		btncalcular.setBounds(100, 260, 100, 30);
		btncalcular.setMnemonic('a');
		getContentPane().add(btncalcular);
		
		btncalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btncalcular_actionPerformed();
				
			}
		});
	}

	protected void btncalcular_actionPerformed() {
		int metros = Integer.parseInt(txtmetros.getText());
		double centimetros = metros * 100.0;
		double pulgadas = centimetros / 2.54;
		double pies = pulgadas / 12.0;
		double yardas = pies / 3.0;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtcentimetros.setText(df.format(centimetros));
		txtpulgadas.setText(df.format(pulgadas));
		txtpies.setText(df.format(pies));
		txtyardas.setText(df.format(yardas));
	}
}
