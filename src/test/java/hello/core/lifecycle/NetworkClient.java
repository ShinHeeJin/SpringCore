package hello.core.lifecycle;


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

    public void connect(){
        System.out.println("NetworkClient.connect");
        System.out.println("connect = " + url);
    }

    public void call(String message){
        System.out.println("NetworkClient.call");
        System.out.println("url = " + url + "message = " + message);
    }

    public void disconnect(){
        System.out.println("NetworkClient.disconnect");
        System.out.println("close = " + url);
    }

    public void init() {
        // 스프링 의존관계 주입 모두 끝난 후 호출됨
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    public void close() {
        // 스프링 빈이 소멸될 때 호출됨
        System.out.println("NetworkClient.close");
        disconnect();
    }
}