package pedroscy.padroesdio.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pedroscy.padroesdio.model.Usuario;
import pedroscy.padroesdio.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioService {

    @Autowired
    private final UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public void atualizarUsuario(Long id, Usuario usuarioAtualizado) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);
        if (usuarioExistente.isPresent()) {
            Usuario usuario = usuarioExistente.get();
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setANascimento(usuarioAtualizado.getANascimento());
            usuario.setStudent(usuarioAtualizado.isStudent());
            usuarioRepository.save(usuario);
        }
    }

    public boolean verificarExistenciausuario(Usuario user){
        for(Usuario u : listarUsuarios()){
            if(user.equals(u)){
                return true;
            }
        }
        return false;
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
