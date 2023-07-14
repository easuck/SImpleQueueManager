package Utility;

import Commands.*;

import java.util.HashMap;
import java.util.Scanner;

public class CommandsManager {

    private HashMap<String, Command> commands = new HashMap<>();

    public CommandsManager(ClientManager clientManager){
        commands.put("add", new AddCommand(clientManager));
        commands.put("info", new InfoCommand(clientManager));
        commands.put("show", new ShowCommand(clientManager));
        commands.put("serve", new ServeCommand(clientManager));
    }

    public void doCommands(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("available commands are \"add\", \"info\", \"show\", \"serve\"");
        System.out.print("enter command: ");

        while(scanner.hasNextLine()){
            String command = scanner.nextLine().trim();
            if (commands.containsKey(command)){
                commands.get(command).execute();
                System.out.print("enter command: ");
            }
            else{
                System.out.println("no such command, try again");
                System.out.print("enter command: ");
            }
        }
    }
}
