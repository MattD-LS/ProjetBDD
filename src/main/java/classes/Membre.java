package classes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Membre {
    private Long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private Integer codePostal;
    private String email;
}
