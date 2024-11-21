package services;

import org.example.classes.Membre;

import java.util.List;

public interface MembreService {
    List<Membre> getAllMembre();
    Membre getMembreById(Long id);
}
