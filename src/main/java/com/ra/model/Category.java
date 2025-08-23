package com.ra.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "Category")
public class Category {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catalog_id")
    private Long catalogId;
    @Column(name = "catalog_name", nullable = false)
    private  String catalogName;
    @Column(name = "description")
    private  String description;
@OneToMany(mappedBy = "catalog")
@Builder.Default
    private List<Seed>  listSeeds =  new ArrayList<>();

}
