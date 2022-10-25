package Builder;

public class HttpClient {
    private String method;
    private String url;
    private String username;
    private String password;
    private String headers;
    private String body;

    public HttpClient(HttpClientBuilder builder) {
        this.method = builder.method;
        this.url = builder.url;
        this.username = builder.username;
        this.password = builder.password;
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static class HttpClientBuilder {
        private String method;
        private String url;
        private String username;
        private String password;
        private String headers;
        private String body;

        public HttpClientBuilder method(String method) {
            this.method = method;
            return this;
        }

        public HttpClientBuilder url(String url) {
            this.url = url;
            return this;
        }

        public HttpClientBuilder secure(String username, String password) {
            this.username = username;
            this.password = password;
            return this;
        }

        public HttpClientBuilder headers(String headers) {
            this.headers = headers;
            return this;
        }

        public HttpClientBuilder body(String body) {
            this.body = body;
            return this;
        }

        public HttpClient build() {
            return new HttpClient(this);
        }
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getHeaders() {
        return this.headers;
    }

    public String getBody() {
        return this.body;
    }

    @Override
    public String toString() {
        return "{" +
            " method='" + getMethod() + "'" +
            ", url='" + getUrl() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", headers='" + getHeaders() + "'" +
            ", body='" + getBody() + "'" +
            "}";
    }

}