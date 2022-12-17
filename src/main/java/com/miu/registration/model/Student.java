package com.miu.registration.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long studentId;

    private String email;


    @OneToMany
    @JoinColumn
    private List<Address> addressList = new ArrayList<Address>();

}
