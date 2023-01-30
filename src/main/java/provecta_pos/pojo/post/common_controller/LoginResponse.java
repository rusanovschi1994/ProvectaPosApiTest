package provecta_pos.pojo.post.common_controller;

import java.util.List;

public class LoginResponse extends LoginRequest {

    private List<String> clients;
    private Integer expiresIn;
    private String token;
    private String type;

    public LoginResponse() {
    }

    public LoginResponse(String username, String password) {
        super(username, password);
    }

    public LoginResponse(String username, String password, List<String> clients, Integer expiresIn, String token, String type) {
        super(username, password);
        this.clients = clients;
        this.expiresIn = expiresIn;
        this.token = token;
        this.type = type;
    }

    public List<String> getClients() {
        return clients;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public String getToken() {
        return token;
    }

    public String getType() {
        return type;
    }
}
