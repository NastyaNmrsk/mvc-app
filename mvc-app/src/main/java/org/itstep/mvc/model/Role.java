package org.itstep.mvc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "descr")
    private String description;
    @ManyToMany(mappedBy = "roles")
    Set<User> users;
}
