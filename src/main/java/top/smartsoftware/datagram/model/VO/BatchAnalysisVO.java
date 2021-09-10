package top.smartsoftware.datagram.model.VO;

public class BatchAnalysisVO {
    private String dateTime;
    private String data;

    public BatchAnalysisVO() {
    }

    public BatchAnalysisVO(String dateTime, String data) {
        this.dateTime = dateTime;
        this.data = data;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BatchAnalysisVO{" +
                "dateTime='" + dateTime + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
