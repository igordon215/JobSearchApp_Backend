package com.jobsearch.myapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

    private final ClientApp clientApp = new ClientApp();
    private final ApiDocs apiDocs = new ApiDocs();

    public ClientApp getClientApp() {
        return clientApp;
    }

    public ApiDocs getApiDocs() {
        return apiDocs;
    }

    public static class ClientApp {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class ApiDocs {

        private String title;
        private String description;
        private String version;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }
}
