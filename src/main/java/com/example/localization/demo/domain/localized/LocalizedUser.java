package com.example.localization.demo.domain.localized;

import com.example.localization.demo.domain.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Chamith
 */
@Getter
@Setter
@Entity
public class LocalizedUser {

    @ManyToOne
    private User container;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String contactNo;

    private LocalDate dateOfBirth;

    private Boolean active=Boolean.TRUE;
}
