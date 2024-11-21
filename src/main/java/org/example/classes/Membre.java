package org.example.classes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Membre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private Integer codePostal;
    private String email;

    @ManyToOne
    private Groupe groupe;

    @OneToMany(mappedBy = "membre")
    private List<Commande> commandes;
}
