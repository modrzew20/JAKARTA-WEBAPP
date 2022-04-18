package com.example.jakartawebapp.model;


import com.example.jakartawebapp.common.AbstractEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "addedService")
@ToString
@NamedQueries({
        @NamedQuery(name="AddedService.findAll", query = "SELECT a FROM AddedService a"),
})
@AllArgsConstructor @NoArgsConstructor
public class AddedService extends AbstractEntity implements Serializable {

    @JoinColumn(name = "reservation_id", referencedColumnName = "id", updatable = false)
    @ManyToOne(optional = false)
    @Getter @Setter
    private Reservation reservation;

    @JoinColumn(name = "service_id", referencedColumnName = "id", updatable = false)
    @ManyToOne(optional = false)
    @Getter @Setter
    private Service service;

    @Basic(optional = false)
    @Column(name = "amount", nullable = false)
    @Getter @Setter
    private int amount;

    @Basic(optional = false)
    @Column(name = "forMany", nullable = false)
    @Getter @Setter
    private int forMany;

    @Basic(optional = false)
    @Column(name = "startDate", nullable = false)
    @Getter @Setter
    private Date startDate;

    @Column(name = "endDate")
    @Getter @Setter
    private Date endDate;
}
