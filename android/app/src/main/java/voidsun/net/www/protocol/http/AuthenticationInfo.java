package voidsun.net.www.protocol.http;

public class AuthenticationInfo {
    public static Object getProxyAuth(String host, int port) {
        return null;
    }

    public boolean supportsPreemptiveAuthorization() {
        return false;
    }

    public String getHeaderName() {
        return "";
    }

    public String getHeaderValue(java.net.URL url, String method) {
        return "";
    }
}
