package za.co.currency.project.model.response;

public class currencyResponse {
    
    private query query;
    private currencyData data;
    
    public query getQuery() {
        return query;
    }
    public void setQuery(query query) {
        this.query = query;
    }
    public currencyData getData() {
        return data;
    }
    public void setData(currencyData data) {
        this.data = data;
    }
}
