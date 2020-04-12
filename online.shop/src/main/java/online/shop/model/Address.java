package online.shop.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Address {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "address_line_one")
    @NotBlank(message = "Please enter address line one!")
    private String addressLineOne;

    @Column(name = "address_line_two")
    private String addressLineTwo;


    @Column(name = "city")
    @NotBlank(message = "Please enter city name!!!")
    private String city;

    @Column(name = "country")
    @NotBlank(message = "Please enter country name!!!")
    private String country;

    @Column(name = "postal_code")
    @NotBlank(message = "Please enter Postal Code")
    private String postalCode;

    @Column(name = "is_shipping")
    private boolean shipping;

    @Column(name = "is_billing")
    private boolean billing;

    public Integer getId() {
        return id;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public boolean isShipping() {
        return shipping;
    }

    public void setShipping(boolean shipping) {
        this.shipping = shipping;
    }

    public boolean isBilling() {
        return billing;
    }

    public void setBilling(boolean billing) {
        this.billing = billing;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", userId=" + userId +
                ", addressLineOne='" + addressLineOne + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", shipping='" + shipping + '\'' +
                ", billing=" + billing +
                '}';
    }
}
