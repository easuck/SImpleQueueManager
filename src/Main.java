import Utility.ClientManager;
import Utility.CommandsManager;

public class Main {
    public static void main(String[] args) {

        ClientManager clientManager = new ClientManager();
        CommandsManager commandsManager = new CommandsManager(clientManager);
        commandsManager.doCommands();
    }
}