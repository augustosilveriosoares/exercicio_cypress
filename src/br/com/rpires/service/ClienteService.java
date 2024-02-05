package br.com.rpires.service;

import br.com.rpires.dao.ClienteDao;
import br.com.rpires.dao.ClienteDaoMock;
import br.com.rpires.dao.IClienteDao;
import br.com.rpires.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ClienteService implements IClienteDao {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        //clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        return "Sucesso";
    }

    @Override
    public Boolean excluir() {
        return true;
    }
}
