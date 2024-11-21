package classes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Groupe {
    private String numero;
    private String nom;
    private String ville;
    private Integer codePostal;
}
