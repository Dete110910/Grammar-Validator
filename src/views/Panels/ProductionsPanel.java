package views.Panels;

import views.ConstantsGUI;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ProductionsPanel extends JPanel {

    private final String[] HEADERS = {"Lado Izq.", " -> ", "Lado Der."};

    private DefaultTableModel defaultTableModel;
    private JTable jTable;

    public ProductionsPanel(){
        this.initComponents();
        this.setVisible(true);
    }

    private void initComponents(){
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.setBackground(Color.WHITE);
        defaultTableModel = new DefaultTableModel();
        defaultTableModel.setColumnIdentifiers(HEADERS);

        jTable = new JTable();
        jTable.setModel(this.defaultTableModel);
        jTable.getTableHeader().setReorderingAllowed(false);
        jTable.getTableHeader().setBackground(Color.decode("#22577A"));
        jTable.getTableHeader().setForeground(Color.WHITE);
        jTable.getTableHeader().setFont(ConstantsGUI.TABLE_HEADER);
        jTable.setFillsViewportHeight(true);
        jTable.setFont(ConstantsGUI.TABLE_BODY);
        jTable.setBackground(Color.WHITE);
        jTable.setOpaque(true);
        jTable.setRowHeight(25);

        JScrollPane jScrollPane = new JScrollPane(jTable);
        jScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.decode("#204051")),
                "Gramática", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, ConstantsGUI.TABLE_HEADER, Color.decode("#204051")));
        jScrollPane.setAlignmentX(Component.LEFT_ALIGNMENT);

        this.add(jScrollPane, BorderLayout.PAGE_END);
        this.setBorder(null);
    }

    public void setDefaultTableModel(DefaultTableModel defaultTableModel){
        this.defaultTableModel = defaultTableModel;
        this.jTable.setModel(defaultTableModel);

    }

}
