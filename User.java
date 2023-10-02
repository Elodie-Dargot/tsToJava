import java.util.Date;

public class User {
    private Date birthdate;
    private Number size;
    private Photo[] photos;
    private Address address;

    public Date getBirthdate() {return this.birthdate;}
    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}

    public Number getSize() {return this.size;}
    public void setSize(Number size) {this.size = size;}

    public Photo[] getPhotos() {return this.photos;}
    public void setPhotos(Photo[] photos) {this.photos = photos;}

    public Address getaddress() {return this.address;}
    public void setAddress(Address address) {this.address = address;}
}