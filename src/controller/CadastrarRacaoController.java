/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.RacaoDAO;
import domain.Racao;
import view.CadastrarRacaoView;

/**
 *
 * @author flavi
 */
public class CadastrarRacaoController extends Controller<CadastrarRacaoView> {

    private static final RacaoDAO racaoDao = new RacaoDAO();
    
    public CadastrarRacaoController() {
        super(new CadastrarRacaoView());
    }

    @Override
    void addEventListeners() {
        this.view.getjButton1().addActionListener(ev -> save(this.view.getRacao()));
        this.view.getjButton2().addActionListener(ev -> hide());
    }
    
    private void save(Racao racao) {
        racaoDao.save(racao);
        hide();
    }
}
