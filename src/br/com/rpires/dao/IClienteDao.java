package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public interface IClienteDao {

    public String salvar();


    String buscar();

    String atualizar();

    Boolean excluir();
}
