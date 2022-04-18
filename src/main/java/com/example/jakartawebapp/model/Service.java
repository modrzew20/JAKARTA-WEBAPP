package com.example.jakartawebapp.model;

import com.example.jakartawebapp.common.AbstractEntity;
import jakarta.json.bind.annotation.JsonbTransient;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "service")
@ToString
@NamedQueries({
        @NamedQuery(name="Service.findAll", query = "SELECT a FROM Service a"),
})
@AllArgsConstructor @NoArgsConstructor
public class Service extends AbstractEntity implements Serializable {

    @Basic(optional = false)
    @Size(min = 3, max = 20)
    @Column(name = "name", nullable = false)
    @Getter @Setter
    private String name;

    @Basic(optional = false)
    @Column(name = "price", nullable = false)
    @Getter @Setter
    private int price;

    @Basic(optional = false)
    @Column(name = "maxAmount", nullable = false)
    @Getter @Setter
    private int maxAmount;

    @JsonbTransient
    @OneToMany(cascade = {CascadeType.REMOVE,CascadeType.PERSIST}, mappedBy = "service", fetch = FetchType.LAZY)
    @Getter
    public Collection<AddedService> reservationCollection;


}
