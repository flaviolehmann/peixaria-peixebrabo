/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EspecieDAO;
import dao.PocoDAO;
import domain.Cardume;
import domain.Especie;
import domain.Poco;
import java.util.List;
import view.InserirPeixesView;

/**
 *
 * @author flavi
 */
public class InserirPeixesController extends Controller<InserirPeixesView> {

    private static final PocoDAO pocoDAO = new PocoDAO();
    private static final EspecieDAO especieDAO = new EspecieDAO();
    
    public InserirPeixesController() {
        super(new InserirPeixesView());
        
        
        Poco novoPoco = new Poco();
        novoPoco.setNome("POCO NOVO");
        pocoDAO.save(novoPoco);
        
        Especie novaEspecie = new Especie();
        novaEspecie.setNome("TABACU BRABO");
        especieDAO.save(novaEspecie);
        
        this.inicializarCombos();
    }
    
    public void inicializarCombos() {
        especieDAO.findAll().stream().forEach(poco -> this.view.getjComboBox1().addItem(poco.toString()));
        pocoDAO.findAll().stream().forEach(poco -> this.view.getjComboBox2().addItem(poco.toString()));
    }

    @Override
    void addEventListeners() {
        this.view.getjButton1().addActionListener(ev -> {
            List<Poco> pocos = pocoDAO.findAll();
            List<Especie> especies = especieDAO.findAll();
            
            Poco pocoSelecionado = pocos.get(this.view.getjComboBox2().getSelectedIndex());
            Especie especieSelecionada = especies.get(this.view.getjComboBox1().getSelectedIndex());
            
            Cardume novoCardume = new Cardume();
            novoCardume.setEspecie(especieSelecionada);
            novoCardume.setQuantidade(new Long((int) this.view.getjSpinner1().getValue()));
            
            List<Cardume> cardumes = pocoSelecionado.getCardumes();
            cardumes.add(novoCardume);
            
            pocoSelecionado.setCardumes(cardumes);
            pocoDAO.save(pocoSelecionado);
            this.hide();
        });
    }
}
