package Commands;

import Utility.ClientManager;

public class InfoCommand implements Command{

    private ClientManager clientManager;

    public InfoCommand(ClientManager clientManager) {
        this.clientManager = clientManager;
    }

    public InfoCommand(){};

    @Override
    public void execute() {
        System.out.println("current queue size: " + clientManager.getQueue().size());
    }
}
