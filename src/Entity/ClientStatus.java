package Entity;

public enum ClientStatus {
    SUCCESS("success"),
    FAILURE("failure");

    private String title;

    ClientStatus(String title) {
        this.title = title;
    }

    //tostring нужен
}
