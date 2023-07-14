package Entity;

public class Client {

    private static int increment = 0;

    private int clientNumber;

    private ClientStatus clientStatus;

    public Client(){
        clientNumber = increment++;
    };

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public ClientStatus getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(ClientStatus clientStatus) {
        this.clientStatus = clientStatus;
    }
}
