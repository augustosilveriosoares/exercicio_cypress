package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public class ClienteDao implements IClienteDao {

    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
        //return "Sucesso";
    }

    @Override
    public String buscar() {
        return null;
    }

    @Override
    public String atualizar() {
        return null;
    }

    @Override
    public Boolean excluir() {
        return null;
    }
}
