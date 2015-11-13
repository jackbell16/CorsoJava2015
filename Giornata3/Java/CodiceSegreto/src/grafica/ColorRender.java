package grafica;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import gioco.ColoriDisponibili;

public class ColorRender extends JLabel implements ListCellRenderer<Color>{
	
	public ColorRender() {
		setOpaque(true);
		setHorizontalAlignment(CENTER);
		setVerticalAlignment(CENTER);
		setPreferredSize(new Dimension(150, 70));
	}
	
	@Override
	public Component getListCellRendererComponent(JList list, Color color, int index, boolean isSelected,
			boolean cellHasFocus) {
		setBackground(list.getBackground());
		setForeground(list.getForeground());
		setText(ColoriDisponibili.disponibili.getColori().get(color));
		setBackground(color);
		setForeground(color);
		return this;
	}

}
