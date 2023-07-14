package Commands;

import Entity.Client;
import Utility.ClientManager;

public class ShowCommand implements Command{

    private ClientManager clientManager;

    public ShowCommand(ClientManager clientManager) {
        this.clientManager = clientManager;
    }

    public ShowCommand(){};

    @Override
    public void execute() {
        System.out.println("served clients and their statuses:");
        for (Client client : clientManager.getServicedClients()){
            System.out.println("client with number " + client.getClientNumber()
                    + " was served with status " + client.getClientStatus());
        }
    }
}
