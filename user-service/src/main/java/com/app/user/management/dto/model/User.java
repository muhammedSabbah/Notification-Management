package com.app.user.management.dto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String firstName;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private UUID businessUserId;
    private String lastName;
    private String email;
    private String address;
    @NotNull
    private String roleCode;
}
