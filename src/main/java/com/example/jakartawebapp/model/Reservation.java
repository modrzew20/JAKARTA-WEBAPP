package com.example.jakartawebapp.model;

import com.example.jakartawebapp.common.AbstractEntity;
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name="reservation")
@ToString
@NamedQueries({
        @NamedQuery(name="Reservation.findAll", query = "SELECT a FROM Reservation a"),
        @NamedQuery(name="Reservation.findBySurname", query = "SELECT a FROM Reservation a WHERE a.surname = :surname"),
        @NamedQuery(name="Reservation.findByPhoneNumber", query = "SELECT a FROM Reservation a WHERE a.phoneNumber = :phoneNumber"),
        @NamedQuery(name="Reservation.findByRegistration", query = "SELECT a FROM Reservation a WHERE a.registration = :registration"),
})

@AllArgsConstructor @NoArgsConstructor
public class Reservation extends AbstractEntity implements Serializable {

    @Basic(optional = false)
    @Size(min = 3, max = 20)
    @Column(name = "name", nullable = false)
    @Getter @Setter
    private String name;

    @Basic(optional = false)
    @Size(min = 3, max = 20)
    @Column(name = "surname", nullable = false)
    @Getter @Setter
    private String surname;

    @Basic(optional = false)
    @Size(min = 9, max = 14)
    @Column(name = "phoneNumber", nullable = false, length = 9)
    @Getter @Setter
    private String phoneNumber;

    @Basic(optional = false)
    @Size(min = 5, max = 12)
    @Column(name = "registration", nullable = false)
    @Getter @Setter
    private String registration;

    @Basic(optional = false)
    @Column(name = "startDate", nullable = false)
    @Getter @Setter
    private Date startDate;

    @Column(name = "endDate")
    @Getter @Setter
    private Date endDate;

    @JsonbTransient
    @OneToMany(cascade = {CascadeType.REMOVE,CascadeType.PERSIST}, mappedBy = "reservation", fetch = FetchType.EAGER)
    @Getter
    public Collection<AddedService> addedServiceCollection;

    public Reservation(String name, String surname, String phoneNumber, String registration, Date startDate, Date endDate) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.registration = registration;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
