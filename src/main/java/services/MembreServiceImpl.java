package services;

import org.example.classes.Membre;
import org.example.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembreServiceImpl implements MembreService {

    @Autowired
    private MembreRepository membreRepository;

    @Override
    public List<Membre> getAllMembre() {
        return membreRepository.findAll();
    }

    @Override
    public Membre getMembreById(Long id) {
         return membreRepository.getMembreById(id);
    }
}
