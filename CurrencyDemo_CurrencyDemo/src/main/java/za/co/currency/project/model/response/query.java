package za.co.currency.project.model.response;

public class query {
    
    private String apikey;
    private int timestamp;
    private String base_currency;
    
    public String getApikey() {
        return apikey;
    }
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }
    public int getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
    public String getBase_currency() {
        return base_currency;
    }
    public void setBase_currency(String base_currency) {
        this.base_currency = base_currency;
    }
}
