package classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matériel {
    private Long numeroSerie;
    private String marque;
    private String modele;
    private Type type;
    private Double prix;
}

