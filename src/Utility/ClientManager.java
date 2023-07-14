package Utility;

import Entity.Client;
import Entity.ClientStatus;

import java.util.*;

public class ClientManager {

    private Comparator<Client> comparator = new ClientsComparator();
    private Queue<Client> queue = new PriorityQueue<>(comparator);

    private List<Client> servicedClients = new ArrayList<>();

    public ClientManager(){};

    public Queue<Client> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Client> queue) {
        this.queue = queue;
    }

    public List<Client> getServicedClients() {
        return servicedClients;
    }

    public void setServicedClients(List<Client> servicedClients) {
        this.servicedClients = servicedClients;
    }

    public void addClient(Client client){
        queue.add(client);
    }

    public void serve(Client client, ClientStatus clientStatus){
        client.setClientStatus(clientStatus);
        servicedClients.add(client);
    }
}
