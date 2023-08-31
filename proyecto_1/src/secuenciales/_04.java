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

public class _04 extends JFrame {

	private static final long serialVersionUID = 1L;

//	JLabel lblpulgadas, lblPies;
	JTextField txtkilometros,txtcentimetros, txtpulgadas, txtpies, txtmillas, txtmetrosTotales, txtyardasTotales;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_04 frame = new _04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public _04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 350);
		/*contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);*/
		
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblkilometros = new JLabel("Metros: ");
		lblkilometros.setBounds(50, 50, 80, 30);
		getContentPane().add(lblkilometros);
		
		JLabel lblPies = new JLabel("Pies: ");
		lblPies.setBounds(50, 90, 80, 30);
		getContentPane().add(lblPies);
		
		JLabel lblmillas = new JLabel("Millas: ");
		lblmillas.setBounds(50, 130, 80, 30);
		getContentPane().add(lblmillas);
		
		txtkilometros = new JTextField();
		txtkilometros.setBounds(140, 50, 60, 30);
		txtkilometros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtkilometros.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtkilometros);
		
		txtpies = new JTextField();
		txtpies.setBounds(140, 90, 60, 30);
		txtpies.setHorizontalAlignment(SwingConstants.RIGHT);
		txtpies.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtpies);
		
		txtmillas = new JTextField();
		txtmillas.setBounds(140, 130, 60, 30);
		txtmillas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtmillas.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtmillas);
		
		JLabel lblmetros = new JLabel("Metros:");
		lblmetros.setBounds(55, 170, 80, 30);
		getContentPane().add(lblmetros);
		
		JLabel lblyardas = new JLabel("Yardas:");
		lblyardas.setBounds(175, 170, 80, 30);
		getContentPane().add(lblyardas);
		
		txtmetrosTotales = new JTextField();
		txtmetrosTotales.setBounds(55, 206, 60, 30);
		txtmetrosTotales.setFocusable(false);
		getContentPane().add(txtmetrosTotales);
		
		txtyardasTotales = new JTextField();
		txtyardasTotales.setBounds(175, 206, 60, 30);
		txtyardasTotales.setFocusable(false);
		getContentPane().add(txtyardasTotales);
		
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
		int kilometros = Integer.parseInt(txtkilometros.getText());
		int pies = Integer.parseInt(txtpies.getText());
		int millas = Integer.parseInt(txtmillas.getText());
		double converkilometros = kilometros / 1000;
		double converPies = pies / 3.2808;
		double convermillas = millas * 1609;
		
		double metros = converkilometros + converPies + convermillas;
		double yardas = metros * 1.094;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtmetrosTotales.setText(df.format(metros));
		txtyardasTotales.setText(df.format(yardas));
	}
}
