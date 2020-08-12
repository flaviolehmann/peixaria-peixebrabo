/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AlimentoDAO;
import dao.EspecieDAO;
import domain.Especie;
import view.CadastrarEspecieView;

/**
 *
 * @author flavi
 */
public class CadastrarEspecieController extends Controller<CadastrarEspecieView> {

    private static final EspecieDAO especieDAO = new EspecieDAO();
    
    public CadastrarEspecieController() {
        super(new CadastrarEspecieView());
    }
    
    @Override
    void addEventListeners() {
        this.view.getjButton1().addActionListener(ev -> this.salvar(this.view.getEspecie()));
        this.view.getjButton2().addActionListener(ev -> this.hide());
    }
    
    public void salvar(Especie especie) {
        especieDAO.save(especie);
        this.hide();
    }
}
