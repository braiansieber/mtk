package Code;

import java.util.Random;
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


@SuppressWarnings({ "unused", "serial" })
public class View extends JFrame {
	private JTable table;
	private Modelo modelo;
	private Control control;
	private int i = 0;
	public View(final Control control, final Modelo modelo) {
		
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
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				Object.class, Integer.class, String.class, Integer.class
			};
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(100);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		
		JTextArea txtrMathematik = new JTextArea();
		txtrMathematik.setBounds(173, 18, 114, 20);
		txtrMathematik.setEditable(false);
		txtrMathematik.setBackground(UIManager.getColor("Button.background"));
		txtrMathematik.setForeground(Color.RED);
		txtrMathematik.setFont(new Font("MS Gothic", Font.BOLD, 16));
		txtrMathematik.setText("Mathematik");
		getContentPane().setLayout(null);
		getContentPane().add(scrollPane);
		getContentPane().add(txtrMathematik);
		
		final Button button = new Button("Carta1");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String carta1;
				carta1 = button.getLabel();
				table.setValueAt(carta1, 0, 2);
				String carta;
				int numero;
				carta = control.paloCarta(1, 0);
				numero = control.numeroCarta(1, 0);
				carta = numero + carta;
				table.setValueAt(carta, 1, 2);
				
				carta = control.paloCarta(2, 0);
				numero = control.numeroCarta(2, 0);
				carta = numero + carta;
				table.setValueAt(carta, 2, 2);
				
				carta = control.paloCarta(3, 0);
				numero = control.numeroCarta(3, 0);
				carta = numero + carta;
				table.setValueAt(carta, 3, 2);
				
			}
		});
		button.setBounds(21, 200, 70, 22);
		getContentPane().add(button);
		
		final Button button_1 = new Button("Carta2");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String carta1;
				carta1 = button_1.getLabel();
				table.setValueAt(carta1, 0, 2);
				String carta;
				int numero;
				carta = control.paloCarta(1, 1);
				numero = control.numeroCarta(1, 1);
				carta = numero + carta;
				table.setValueAt(carta, 1, 2);
				
				carta = control.paloCarta(2, 1);
				numero = control.numeroCarta(2, 1);
				carta = numero + carta;
				table.setValueAt(carta, 2, 2);
				
				carta = control.paloCarta(3, 1);
				numero = control.numeroCarta(3, 1);
				carta = numero + carta;
				table.setValueAt(carta, 3, 2);
			}
		});
		button_1.setBounds(110, 200, 70, 22);
		getContentPane().add(button_1);
		
		final Button button_2 = new Button("Carta3");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String carta1;
				carta1 = button_2.getLabel();
				table.setValueAt(carta1, 0, 2);
				String carta;
				int numero;
				carta = control.paloCarta(1, 2);
				numero = control.numeroCarta(1, 2);
				carta = numero + carta;
				table.setValueAt(carta, 1, 2);
				
				carta = control.paloCarta(2, 2);
				numero = control.numeroCarta(2, 2);
				carta = numero + carta;
				table.setValueAt(carta, 2, 2);
				
				carta = control.paloCarta(3, 2);
				numero = control.numeroCarta(3, 2);
				carta = numero + carta;
				table.setValueAt(carta, 3, 2);
			}
		});
		button_2.setBounds(200, 200, 70, 22);
		getContentPane().add(button_2);
		
		final Button button_5 = new Button("Carta4");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String carta1;
				carta1 = button_5.getLabel();
				table.setValueAt(carta1, 0, 2);
				String carta;
				int numero;
				carta = control.paloCarta(1, 3);
				numero = control.numeroCarta(1, 3);
				carta = numero + carta;
				table.setValueAt(carta, 1, 2);
				
				carta = control.paloCarta(2, 3);
				numero = control.numeroCarta(2, 3);
				carta = numero + carta;
				table.setValueAt(carta, 2, 2);
				
				carta = control.paloCarta(3, 3);
				numero = control.numeroCarta(3, 3);
				carta = numero + carta;
				table.setValueAt(carta, 3, 2);
			}
		});
		button_5.setBounds(21, 228, 70, 22);
		getContentPane().add(button_5);
		
		final Button button_6 = new Button("Carta5");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String carta1;
				carta1 = button_6.getLabel();
				table.setValueAt(carta1, 0, 2);
				
				String carta;
				int numero;
				carta = control.paloCarta(1, 4);
				numero = control.numeroCarta(1, 4);
				carta = numero + carta;
				table.setValueAt(carta, 1, 2);
				
				carta = control.paloCarta(2, 4);
				numero = control.numeroCarta(2, 4);
				carta = numero + carta;
				table.setValueAt(carta, 2, 2);
				
				carta = control.paloCarta(3, 4);
				numero = control.numeroCarta(3, 4);
				carta = numero + carta;
				table.setValueAt(carta, 3, 2);
				
			}
		});
		button_6.setBounds(110, 228, 70, 22);
		getContentPane().add(button_6);
		
		final Button button_7 = new Button("Carta6");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String carta1;
				carta1 = button_7.getLabel();
				table.setValueAt(carta1, 0, 2);
				String carta;
				int numero;
				carta = control.paloCarta(1, 5);
				numero = control.numeroCarta(1,5);
				carta = numero + carta;
				table.setValueAt(carta, 1, 2);
				
				carta = control.paloCarta(2, 5);
				numero = control.numeroCarta(2, 5);
				carta = numero + carta;
				table.setValueAt(carta, 2, 2);
				
				carta = control.paloCarta(3, 5);
				numero = control.numeroCarta(3, 5);
				carta = numero + carta;
				table.setValueAt(carta, 3, 2);
			}
		});
		button_7.setBounds(200, 228, 70, 22);
		getContentPane().add(button_7);
		
		Button button_3 = new Button("Repartir");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				control.Baraja();
				control.Repartir(6);
				
				String carta;
				int numero;
				carta = control.paloCarta(0, 0);
				numero = control.numeroCarta(0, 0);
				carta = numero + carta;
				button.setLabel(carta);
				carta = control.paloCarta(0, 1);
				numero = control.numeroCarta(0, 1);
				carta = numero + carta;
				button_1.setLabel(carta);
				carta = control.paloCarta(0, 2);
				numero = control.numeroCarta(0, 2);
				carta = numero + carta;
				button_2.setLabel(carta);
				carta = control.paloCarta(0, 3);
				numero = control.numeroCarta(0, 3);
				carta = numero + carta;
				button_5.setLabel(carta);
				carta = control.paloCarta(0, 4);
				numero = control.numeroCarta(0, 4);
				carta = numero + carta;
				button_6.setLabel(carta);
				carta = control.paloCarta(0, 5);
				numero = control.numeroCarta(0, 5);
				carta = numero + carta;
				button_7.setLabel(carta);
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
				control.set_Apostar(num1, 6, 0);
				control.set_Apostar(num1, 6, 1);
				control.set_Apostar(num1, 6, 2);
				control.set_Apostar(num1, 6, 3);
				table.setValueAt(control.valorApuesta(0), 0, 1);
				table.setValueAt(control.valorApuesta(1), 1, 1);
				table.setValueAt(control.valorApuesta(2), 2, 1);
				table.setValueAt(control.valorApuesta(3), 3, 1);
				}
		});
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		button_4.setBounds(217, 162, 70, 22);
		getContentPane().add(button_4);
		
		Button button_8 = new Button("Jugar mano");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(i<6)
				{
					control.terminaRonda(i);
					table.setValueAt(control.puntosJugador(0), 0, 3);
					table.setValueAt(control.puntosJugador(1), 1, 3);
					table.setValueAt(control.puntosJugador(2), 2, 3);
					table.setValueAt(control.puntosJugador(3), 3, 3);
					i++;
				}
				else{
					control.puntosTotal();
					
					table.setValueAt(control.puntosJugador(0), 0, 3);
					table.setValueAt(control.puntosJugador(1), 1, 3);
					table.setValueAt(control.puntosJugador(2), 2, 3);
					table.setValueAt(control.puntosJugador(3), 3, 3);
					i=0;
					button_8.setLabel("Resetea...");
				}
			}
		});
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_8.setBounds(21, 161, 86, 23);
		getContentPane().add(button_8);
		
		Button button_9 = new Button("Resetear");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				control.restart();
				
				table.setValueAt(null, 0, 1);
				table.setValueAt(null, 1, 1);
				table.setValueAt(null, 2, 1);
				table.setValueAt(null, 3, 1);

				table.setValueAt(null, 0, 2);
				table.setValueAt(null, 1, 2);
				table.setValueAt(null, 2, 2);
				table.setValueAt(null, 3, 2);

				table.setValueAt(null, 0, 3);
				table.setValueAt(null, 1, 3);
				table.setValueAt(null, 2, 3);
				table.setValueAt(null, 3, 3);
				textField.setText(null);
				button_8.setLabel("Jugar mano");
			}
		});
		button_9.setBounds(326, 227, 86, 23);
		getContentPane().add(button_9);
	}
}