package org.itstep.mvc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name")
    String userName;
    @Column(name = "user_lastname")
    String userLastName;
    @Column(name = "password", length = 164)
    String password;
    @Column(name = "email")
    String email;
    @ManyToOne
    @JoinColumn(name = "office_id")
    private Office office;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )

    private Set<Role> roles;

    public User(String userName, String userLastName, String email) {
        this.userName = userName;
        this.userLastName = userLastName;
        this.email = email;
    }

}
