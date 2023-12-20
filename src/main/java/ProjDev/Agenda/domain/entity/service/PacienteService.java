package ProjDev.Agenda.domain.entity.service;

import ProjDev.Agenda.domain.entity.Paciente;
import ProjDev.Agenda.domain.entity.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository repository;

    @PostMapping
    public Paciente salvar(@RequestBody Paciente paciente){
        return repository.save(paciente);

    }
    @GetMapping
    public List<Paciente> findAll(){
        // Todo: para validar se o cpf já existe
        return repository.findAll();
    }
    @GetMapping("{id}")
    public Optional<Paciente>  findById(Long id){
        return repository.findById(id);
    }

    @DeleteMapping("{id}")
    public void deletar(Long id){
        repository.deleteById(id);
    }
}
