/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.TelaPrincipalView;

/**
 *
 * @author flavi
 */
public class TelaPrincipalController extends Controller<TelaPrincipalView> {

    private CadastrarEspecieController cadastrarEspecieController;
    private CadastrarPocoController cadastrarPocoController;
    private CadastrarRacaoController cadastrarRacaoController;
    private InserirPeixesController inserirPeixesController;
    private RegistrarPescaController registrarPescaController;
    private RegistrarTratacaoController registrarTratacaoController;
    private VisualizarRacoesController visualizarRacoesController;
    private VisualizarPocosController visualizarPocosController;
    private VisualizarPeixesController visualizarPeixesController;
    
    public TelaPrincipalController() {
        super(new TelaPrincipalView());
    }

    @Override
    public void addEventListeners() {
        this.view.getjMenuItem1().addActionListener(ev -> this.cadastrarEspecieController = new CadastrarEspecieController());
        this.view.getjMenuItem2().addActionListener(ev -> this.cadastrarPocoController = new CadastrarPocoController());
        this.view.getjMenuItem3().addActionListener(ev -> this.cadastrarRacaoController = new CadastrarRacaoController());
        this.view.getjMenuItem4().addActionListener(ev -> this.inserirPeixesController = new InserirPeixesController());
        this.view.getjMenuItem5().addActionListener(ev -> this.registrarPescaController = new RegistrarPescaController());
        this.view.getjMenuItem6().addActionListener(ev -> this.registrarTratacaoController = new RegistrarTratacaoController());
        this.view.getjMenuItem7().addActionListener(ev -> this.visualizarRacoesController = new VisualizarRacoesController());
        this.view.getjMenuItem8().addActionListener(ev -> this.visualizarPocosController = new VisualizarPocosController());
        this.view.getjMenuItem9().addActionListener(ev -> this.visualizarPeixesController = new VisualizarPeixesController());
    }
}
