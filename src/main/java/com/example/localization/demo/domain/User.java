package com.example.localization.demo.domain;

import com.example.localization.demo.domain.localized.LocalizedUser;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * @author Chamith
 */
@Getter
@Setter
@Entity
public class User {

    @Id
    private Long id;

    @OneToMany(mappedBy="container")
    private Set<LocalizedUser> localizedUsers;

}
