package model;

public class Resource {
    private int resourceId;
    private String type;
    private String configuration;

    public Resource(int resourceId, String type, String configuration) {
        this.resourceId = resourceId;
        this.type = type;
        this.configuration = configuration;
    }

    public int getResourceId() { return resourceId; }
    public String getType() { return type; }
    public String getConfiguration() { return configuration; }
}
