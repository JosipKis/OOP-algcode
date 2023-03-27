package primjer;

import javax.swing.JOptionPane;

// GUI vjezba

public class vj2 {

	public static void main(String[] args) {
		String ime = JOptionPane.showInputDialog("Kako se zovete?");
		JOptionPane.showMessageDialog(null, "Dobar dan "+ ime);
		
		int godine = Integer.parseInt(JOptionPane.showInputDialog(null, "Koliko vam je godina?"));
		JOptionPane.showMessageDialog(null, "Vi imate "+ godine +" godina!");

		Double visina = Double.parseDouble(JOptionPane.showInputDialog(null, "Koliko ste visoki?"));
		JOptionPane.showMessageDialog(null, "Vi ste "+ visina +"m visoki!");

		
		
		
		JOptionPane.showMessageDialog(null, "You fool, thunder cross split attack");
	}

}
