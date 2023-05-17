package hello.core.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("NetworkClient.NetworkClient");
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url) {
        System.out.println("NetworkClient.setUrl");
        this.url = url;
    }

    @PostConstruct
    public void connect(){
        System.out.println("NetworkClient.connect");
        System.out.println("connect = " + url);
    }

    public void call(String message){
        System.out.println("NetworkClient.call");
        System.out.println("url = " + url + "message = " + message);
    }

    @PreDestroy
    public void disconnect(){
        System.out.println("NetworkClient.disconnect");
        System.out.println("close = " + url);
    }
}