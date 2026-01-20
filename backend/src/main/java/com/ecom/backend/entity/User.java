package com.ecom.backend.entity;

import jakarta.persistence.*;

// Lombok to avoid writing getter/setter manually
import lombok.*;
import com.ecom.backend.entity.Role;

@Entity
@Table(name = "users")
@Getter // auto generates getName(), getEmail(), etc.
@Setter // auto generates setter methods
@NoArgsConstructor // creates empty constructor
@AllArgsConstructor  // creates full constructor
@Builder //  // allows builder pattern (nice for creating objects)


public class User {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // // auto increment

    private long id;
    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING) // // store enum as text
    private Role role;

    private Boolean isActive;
}
