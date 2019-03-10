package rocks.zipcode.assessment2.objectorientation;

import java.util.Comparator;

/**
 * @author leon on 28/11/2018.
 */
public class Address implements AddressToString {
    String addressLine1;
    String addressLine2;
    String city;
    String state;
    String zipcode;
    public Address() {
        this.addressLine1 = "";
        this.addressLine2 = "";
        this.city = "";
        this.state = "";
        this.zipcode = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString(){
        StringBuilder address = new StringBuilder();
        address.append("Address{addressLine1='" + addressLine1 + "', ");
        address.append("addressLine2='" + addressLine2 + "', ");
        address.append("city='" + city + "', ");
        address.append("state='" + state + "', ");
        address.append("zipcode='" + zipcode + "'}");
        return address.toString();
    }


    @Override
    public boolean equals(Object o) {
//        Comparator<Address> comparator = (o1, o2) -> 0;
//        return comparator.equals(o);
        if (o == null) {
            return false;
        }

        if (!(o instanceof Address)) {
            return false;
        }

        Address otherAddress = (Address)o;

        return isEqualField(this.addressLine1, otherAddress.addressLine1)
                && isEqualField(this.addressLine2, otherAddress.addressLine2)
                && isEqualField(this.city, otherAddress.city)
                && isEqualField(this.state, otherAddress.state)
                && isEqualField(this.zipcode, otherAddress.zipcode);
    }

    private boolean isEqualField(Object object1, Object object2) {
        if (object1 == null && object2 != null) {
            return false;
        } else if (!object1.equals(object2)) {
            return false;
        }
        return true;
    }
}
