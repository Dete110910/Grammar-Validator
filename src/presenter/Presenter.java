package presenter;

import views.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter implements ActionListener {

    private MainFrame mainFrame;

    public Presenter(){
        this.mainFrame = new MainFrame(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Enter Grammar":
                this.enterGrammar();
                break;
        }
    }

    private void enterGrammar(){

    }

    public static void main(String[] args) {
        new Presenter();
    }
}
