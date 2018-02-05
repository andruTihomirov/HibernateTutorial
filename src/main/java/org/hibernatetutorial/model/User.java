package org.hibernatetutorial.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernatetutorial.model.embedded.UserDetail;
import org.hibernatetutorial.model.manytomany.Vehicle;
import org.hibernatetutorial.model.onetomany.Comment;
import org.hibernatetutorial.model.onetoone.Address;
import org.hibernatetutorial.model.onetoone.Partner;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "users")
// @NamedQuery(name = "User.byId", query = "from User where id = ?")
// @NamedNativeQuery(name = "User.byLogin", query = "select * from users where id = ?", resultClass = User.class)
// @Cacheable
// @Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Embedded
    private UserDetail userDetail;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "user_partner",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "partner_id")
    )
    private Partner partner;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

    @ManyToMany
    private List<Vehicle> vehicles;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
