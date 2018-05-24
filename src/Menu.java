import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class Menu extends JFrame{
	
	JMenuBar barra = new JMenuBar();
	
	JMenu menu1 = new JMenu("Clientes");
	JMenu menu2 = new JMenu("Fornecedores");
	JMenu menu3 = new JMenu("Sair");
	
	JMenuItem item1 = new JMenuItem("Add Cliente");
	JMenuItem item2 = new JMenuItem("Add Fornecedor");
	JMenuItem item3 = new JMenuItem("Exit");
	
	
	public Menu() {
		
		setJMenuBar(barra);
		barra.add(menu1);
		barra.add(menu2);
		barra.add(menu3);
		
		menu1.add(item1);
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nome: ");
				JOptionPane.showMessageDialog(null, "Endereço: ");
				JOptionPane.showMessageDialog(null, "Telefone: ");
			}
		}
				
				);
		
		menu2.add(item2);
		item1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		}
				
				);
		menu3.add(item3);
		item3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("Menu");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Menu();
		
	}
}
