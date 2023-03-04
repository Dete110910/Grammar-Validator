package views.Panels;

import javax.swing.*;
import java.awt.*;


public class ElementsGrammarPanel extends JPanel {

    private JLabel vLabel, sigmaLabel, axiomaticLabel, vValueLabel, sigmaValueLabel, axiomaticValueLabel;

    private final int WIDTH = 400;
    private final int HEIGHT = 300;


    public ElementsGrammarPanel(){
        this.setSize(WIDTH, HEIGHT);
        this.setBackground(Color.decode("#ff00ff"));
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setLayout(new GridBagLayout());
        this.initComponents();
        this.setVisible(true);
    }

    private void initComponents(){
        this.vLabel = new JLabel("V = ");
        this.addLabel(vLabel, 0, 0, false);
        this.vValueLabel = new JLabel(" a");
        this.addLabel(vValueLabel, 0, 1, true);

        this.sigmaLabel = new JLabel("Σ = ");
        this.addLabel(sigmaLabel, 1, 0, false);
        this.sigmaValueLabel = new JLabel(" a");
        this.addLabel(sigmaValueLabel, 1, 1, true);

        this.axiomaticLabel = new JLabel("S");
        this.addLabel(axiomaticLabel, 2, 0, false);
        this.axiomaticValueLabel = new JLabel(" a");
        this.addLabel(axiomaticValueLabel, 2, 1, true);

    }

    private void addLabel(JComponent jComponent,int gridX, int gridY, boolean fills){
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = gridX;
        gridBagConstraints.gridy = gridY;

        if(fills)
            gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;

        this.add(jComponent, gridBagConstraints);
    }

}
