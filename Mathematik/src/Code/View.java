package Code;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import java.awt.TextField;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class View extends JFrame {
	private JTable table;
	private Modelo modelo;
	private Control control;
	public View(Control control, Modelo modelo) {
		
		this.modelo = modelo;
		this.control = control;
		
		setResizable(false);
		
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Mathematik");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 50, 364, 92);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
					{"Jugador", null, null, null},
					{"Maquina1", null, null, null},
					{"Maquina2", null, null, null},
					{"Maquina3", null, null, null},
					},
			new String[] {
				"Participante", "Apuesta", "Carta a Jugar", "Puntos"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Integer.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		
		JTextArea txtrMathematik = new JTextArea();
		txtrMathematik.setBounds(171, 11, 94, 20);
		txtrMathematik.setEditable(false);
		txtrMathematik.setBackground(UIManager.getColor("Button.background"));
		txtrMathematik.setForeground(Color.RED);
		txtrMathematik.setFont(new Font("MS Gothic", Font.BOLD, 16));
		txtrMathematik.setText("Mathematik");
		getContentPane().setLayout(null);
		getContentPane().add(scrollPane);
		getContentPane().add(txtrMathematik);
		
		Button button = new Button("Carta1");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button.setBounds(21, 200, 70, 22);
		getContentPane().add(button);
		
		Button button_1 = new Button("Carta2");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_1.setBounds(110, 200, 70, 22);
		getContentPane().add(button_1);
		
		Button button_2 = new Button("Carta3");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_2.setBounds(200, 200, 70, 22);
		getContentPane().add(button_2);
		
		Button button_3 = new Button("Repartir");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_3.setBounds(342, 200, 70, 22);
		getContentPane().add(button_3);
		
		final TextField textField = new TextField();
		textField.setBounds(181, 162, 24, 22);
		getContentPane().add(textField);
		
		Button button_4 = new Button("Apostar");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1;
				num1 = Integer.parseInt(textField.getText());
				table.setValueAt(num1, 0, 1);
			}
		});
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button_4.setBounds(217, 162, 70, 22);
		getContentPane().add(button_4);
		
		Button button_5 = new Button("Carta4");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_5.setBounds(21, 228, 70, 22);
		getContentPane().add(button_5);
		
		Button button_6 = new Button("Carta5");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_6.setBounds(110, 228, 70, 22);
		getContentPane().add(button_6);
		
		Button button_7 = new Button("Carta6");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button_7.setBounds(200, 228, 70, 22);
		getContentPane().add(button_7);
	}
}