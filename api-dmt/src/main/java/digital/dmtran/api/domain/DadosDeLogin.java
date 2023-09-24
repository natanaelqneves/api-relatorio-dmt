package digital.dmtran.api.domain;

public class DadosDeLogin {

    private Long idPessoa;
    private String nomeDeUsuario;
    private String senhaDoUsuario;

    public boolean efetuaLogin(String usuario, String senha){
        if(usuario.equals(nomeDeUsuario) && senha.equals(senhaDoUsuario)){
            return true;
        } else {
            return false;
        }
    }
}
