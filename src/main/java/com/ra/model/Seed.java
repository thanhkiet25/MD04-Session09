package com.ra.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.catalog.Catalog;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "Seed")
public class Seed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seed_id")
    private Long    id;
    @Column(name = "seed_name")
    private String  seedName;
    private String quantity;
@ManyToOne
    @JoinColumn(name = "catalog_id",referencedColumnName = "catalog_id")
    private Category catalog;



}
