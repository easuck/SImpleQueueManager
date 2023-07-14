package Commands;

import Entity.Client;
import Utility.ClientManager;

public class AddCommand implements Command{

    private ClientManager clientManager;

    public AddCommand(ClientManager clientManager) {
        this.clientManager = clientManager;
    }

    public AddCommand(){};

    @Override
    public void execute() {
        Client client = new Client();
        clientManager.addClient(client);
        System.out.println("client successfully added to the queue");
    }
}
