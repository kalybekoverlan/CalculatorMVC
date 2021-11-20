import javax.management.modelmbean.ModelMBean;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Model modelObj;

    public Controller(Viewer viewer) {
        modelObj = new Model(viewer);
    }

    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        modelObj.doAction(command);
    }
    
}
