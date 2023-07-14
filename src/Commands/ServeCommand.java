package Commands;

import Entity.Client;
import Entity.ClientStatus;
import Utility.ClientManager;

import java.util.Scanner;

public class ServeCommand implements Command{

    private ClientManager clientManager;

    public ServeCommand(ClientManager clientManager) {
        this.clientManager = clientManager;
    }

    public ServeCommand(){};

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("was current client served successfully?: ");
            String status = scanner.nextLine();
            if (status.toLowerCase().trim().equals("yes") || status.toLowerCase().trim().equals("no")){
                Client client = clientManager.getQueue().poll();
                if (status.toLowerCase().trim().equals("yes")){
                    clientManager.serve(client, ClientStatus.SUCCESS);
                }
                else{
                    clientManager.serve(client, ClientStatus.FAILURE);
                }
                break;
            }
            else{
                System.out.println("incorrect input, try enter yes or no");
            }
        }
    }
}
