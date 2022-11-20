package oops.encapsulation;

public class Movie {

    //data hiding (variable)
    private String rate;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        if (rate == "G" || rate == "PG" || rate == "PG-13"){
            this.rate = rate;
        }else {
            this.rate = "NR";
        }

    }
}
