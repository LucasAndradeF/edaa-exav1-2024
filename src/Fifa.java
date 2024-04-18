import java.util.Collections;
import java.util.List;

public class Fifa {
    private String country;
    private String confederation;
    private Double populationShare;
    private Double tvAudienceShare;
    private Double gdpWeightedShare;

    public Fifa() {

    }
    
    public Fifa(String country, String confederation, Double populationShare, Double tvAudienceShare,
            Double gdpWeightedShare) {
        this.country = country;
        this.confederation = confederation;
        this.populationShare = populationShare;
        this.tvAudienceShare = tvAudienceShare;
        this.gdpWeightedShare = gdpWeightedShare;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getConfederation() {
        return confederation;
    }

    public void setConfederation(String confederation) {
        this.confederation = confederation;
    }

    public Double getPopulationShare() {
        return populationShare;
    }

    public void setPopulationShare(Double populationShare) {
        this.populationShare = populationShare;
    }

    public Double getTvAudienceShare() {
        return tvAudienceShare;
    }

    public void setTvAudienceShare(Double tvAudienceShare) {
        this.tvAudienceShare = tvAudienceShare;
    }

    public Double getGdpWeightedShare() {
        return gdpWeightedShare;
    }

    public void setGdpWeightedShare(Double gdpWeightedShare) {
        this.gdpWeightedShare = gdpWeightedShare;
    }

    @Override
    public String toString() {
        return country + ", " + confederation + ", " + populationShare
                + ", " + tvAudienceShare + ", " + gdpWeightedShare;
    }
    
    public static void sortCountryes(List<Fifa> list) {
        Collections.sort(list, (countyOne, countryTwo) -> countyOne.getCountry().compareTo(countryTwo.getCountry()));
        list(list);
    }

    public static void sortAudience(List<Fifa> list) {
        Collections.sort(list, (AudienceOne, AudienceTwo) -> AudienceTwo.getTvAudienceShare().compareTo(AudienceOne.getTvAudienceShare()));
        list(list);
    }
    public static void list(List<Fifa> list) {
        for(Fifa f : list) {
            System.out.println(f);
        }
    }
}

 