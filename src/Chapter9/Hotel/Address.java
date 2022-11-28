package Chapter9.Hotel;

public class Address {

    private String houseNumber;
    private String streetName;
    private String cityName;
    private String stateName;
    private String countryName;

    public Address(String houseNumber, String streetName, String cityName, String stateName, String countryName) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.countryName = countryName;
    }

    public Address(Address address) {
        this(address.getHouseNumber(), address.getStreetName(), address.getCityName(), address.getStateName(),
                address.getCountryName());
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
