package model;

public class SupportRequest {
    private int requestId;
    private String issue;
    private String status;

    public SupportRequest(int requestId, String issue, String status) {
        this.requestId = requestId;
        this.issue = issue;
        this.status = status;
    }
}
