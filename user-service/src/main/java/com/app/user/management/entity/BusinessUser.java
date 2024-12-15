package com.app.user.management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Table(name = "business_user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BusinessUser implements Persistable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "business_user_id")
    private UUID businessUserId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;
    @Column(name = "created_at")
    private ZonedDateTime createdAt;
    @Transient
    private boolean isNew = true;

    @Override
    public boolean isNew() {
        return isNew;
    }

    @PostLoad
    @PrePersist
    public void trackAsNotNew() {
        this.isNew = false;
    }
}
