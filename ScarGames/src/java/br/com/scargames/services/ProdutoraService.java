package br.com.scargames.services;

import br.com.scargames.dao.ProdutoraDao;
import br.com.scargames.domain.Produtora;
import br.com.scargames.util.HashMaker;
import java.util.List;

public class ProdutoraService {
    
    private ProdutoraDao produtoraDao = new ProdutoraDao();
    
    public List<Produtora> listar(){
        return produtoraDao.listar();
    }
  
     public Produtora consultar(Integer id){
        return produtoraDao.consultar(id);
    }
   
    public Boolean inserir(Produtora produtora){
        return produtoraDao.inserir(produtora);
    }
    public Boolean alterar(Produtora produtora){
       return produtoraDao.alterar(produtora);
    }
    
    public Boolean excluir(Produtora produtora){
        return produtoraDao.excluir(produtora);
    }
    
}
