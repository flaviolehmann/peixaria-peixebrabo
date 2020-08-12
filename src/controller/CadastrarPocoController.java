/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PocoDAO;
import domain.Poco;
import view.CadastrarPocoView;

/**
 *
 * @author flavi
 */
public class CadastrarPocoController extends Controller<CadastrarPocoView>{

    private static final PocoDAO pocoDAO = new PocoDAO();
    
    public CadastrarPocoController() {
        super(new CadastrarPocoView());
    }

    @Override
    void addEventListeners() {
        this.view.getjButton1().addActionListener(ev -> this.save(this.view.getPoco()));
        this.view.getjButton2().addActionListener(ev -> this.hide());
    }
    
    public void save(Poco poco) {
        pocoDAO.save(poco);
        this.hide();
    }
}
