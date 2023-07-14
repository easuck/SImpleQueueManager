package Utility;

import Entity.Client;

import java.util.Comparator;

public class ClientsComparator implements Comparator<Client> {

    @Override
    public int compare(Client client1, Client client2) {
        if (client1.getClientNumber() > client2.getClientNumber()){
            return 1;
        }
        else if (client1.getClientNumber() < client2.getClientNumber()) {
            return -1;
        }
        else{
            return 0;
        }
    }
}
