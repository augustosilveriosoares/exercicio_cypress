package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
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
        return true;
    }
}
