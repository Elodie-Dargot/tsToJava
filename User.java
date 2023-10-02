import java.util.Date;

public class User {
    private Date birthdate;
    private Float size;
    private Photo[] photos;
    private Address address;

    public Date getBirthdate() {return this.birthdate;}
    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}

    public Float getSize() {return this.size;}
    public void setSize(Float size) {this.size = size;}

    public Photo[] getPhotos() {return this.photos;}
    public void setPhotos(Photo[] photos) {this.photos = photos;}

    public Address getAddress() {return this.address;}
    public void setAddress(Address address) {this.address = address;}
}