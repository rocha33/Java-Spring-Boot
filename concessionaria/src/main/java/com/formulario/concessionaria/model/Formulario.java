package com.formulario.concessionaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Formulario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Local idLocal;
	private Vendedor idVendedor;
	private boolean clienteUtilizouBanheiro;
	private boolean banheiroLimpo;
	private String descricaoCondicaoBanheiro;
	private int condicaoBanheiroPontuacao;
	private String descricaoEstacionamento;
	private int estacionamentoPontuacao;
	private String outroComentarioInstalacoes;

	private boolean vendedorAtendeuEmAteCincoMinutos;
	private int tempoParaAtendimento;
	private boolean atendimentoDentroDeVinteMinutos;
	private int tempoParaEncontrarVendedor;
	private int tempoTotalParaAtendimento;
	private boolean vendedorCumprimentou;
	private boolean vendedorVestidoProfissionalmente;
	private boolean vendedorUsandoCracha;
	private String momentoPerguntaNomeCliente;

	private boolean vendedorUsouDispositivo;
	private boolean vendedorPerguntouSobreVeiculoAnterior;
	private boolean vendedorPerguntouQuandoComprar;
	private boolean vendedorPerguntouOutrasMarcas;
	private boolean vendedorPerguntouHabitosDirecao;
	private boolean vendedorPerguntouMetodoPagamento;
	private boolean vendedorPerguntouSobreVeiculoUsado;
	private boolean vendedorPerguntouPesquisaAnterior;
	private boolean vendedorPerguntouCaracteristicaMaisImportante;
	private String descricaoCaracteristicaImportante;
	private String descricaoEsforcoVendedor;

	private boolean convidouClienteSentarNoVeiculo;
	private int pontuacaoExplicacaoConsumoCombustivel;
	private int pontuacaoExplicacaoSeguranca;
	private int pontuacaoExplicacaoPotencia;
	private int pontuacaoExplicacaoConforto;
	private int pontuacaoExplicacaoInfoEntretenimento;
	private int pontuacaoExplicacaoQualidade;
	private String descricaoEsforcoDemonstração;

	private boolean testDriveOferecido;
	private int pontuacaoProcedimentosAntesTestDrive;
	private boolean clienteAcompanhadoNoTestDrive;
	private String quemAcompanhou;
	private boolean problemaNoTestDrive;
	private int pontuacaoDirecaoVariedade;
	private int duracaoTestDrive;

	private boolean planoFinanciamentoFornecido;
	private int tempoContratoFinanciamento;
	private String formatoInformacaoPreco;
	private boolean permissaoLevarInformacaoPreco;
	private int pontuacaoVontadeFornecimentoPreco;
	private int pontuacaoEsforcoVendedorFornecimentoPreco;

	private boolean clienteDeixadoSozinho;
	private int vezesDeixadoSozinho;
	private int tempoTotalDeixadoSozinho;
	private boolean vendedorOfereceuBebida;
	private boolean vendedorForneceuBrochuras;
	private boolean requisitouInformacaoContato;
	private boolean clienteApresentadoGerente;
	private int momentoApresentacaoGerente;

	private boolean vendedorMencionouBeneficiosConcessionaria;
	private String descricaoBeneficiosConcessionaria;
	private boolean funcionarioMencionouIncentivos;
	private String descricaoIncentivos;
	private int pontuacaoEsforcoMostrarPósVenda;
	private int tentativaFechamentoVenda;

	private boolean experienciaNaoProfissional;
	private boolean experienciaPositiva;
	private int grauAtencao;
	private int grauEntusiasmo;	
	

	public Formulario(Long id, Local idLocal, Vendedor idVendedor, boolean clienteUtilizouBanheiro,
			boolean banheiroLimpo, String descricaoCondicaoBanheiro, int condicaoBanheiroPontuacao,
			String descricaoEstacionamento, int estacionamentoPontuacao, String outroComentarioInstalacoes,
			boolean vendedorAtendeuEmAteCincoMinutos, int tempoParaAtendimento, boolean atendimentoDentroDeVinteMinutos,
			int tempoParaEncontrarVendedor, int tempoTotalParaAtendimento, boolean vendedorCumprimentou,
			boolean vendedorVestidoProfissionalmente, boolean vendedorUsandoCracha, String momentoPerguntaNomeCliente,
			boolean vendedorUsouDispositivo, boolean vendedorPerguntouSobreVeiculoAnterior,
			boolean vendedorPerguntouQuandoComprar, boolean vendedorPerguntouOutrasMarcas,
			boolean vendedorPerguntouHabitosDirecao, boolean vendedorPerguntouMetodoPagamento,
			boolean vendedorPerguntouSobreVeiculoUsado, boolean vendedorPerguntouPesquisaAnterior,
			boolean vendedorPerguntouCaracteristicaMaisImportante, String descricaoCaracteristicaImportante,
			String descricaoEsforcoVendedor, boolean convidouClienteSentarNoVeiculo,
			int pontuacaoExplicacaoConsumoCombustivel, int pontuacaoExplicacaoSeguranca,
			int pontuacaoExplicacaoPotencia, int pontuacaoExplicacaoConforto, int pontuacaoExplicacaoInfoEntretenimento,
			int pontuacaoExplicacaoQualidade, String descricaoEsforcoDemonstração, boolean testDriveOferecido,
			int pontuacaoProcedimentosAntesTestDrive, boolean clienteAcompanhadoNoTestDrive, String quemAcompanhou,
			boolean problemaNoTestDrive, int pontuacaoDirecaoVariedade, int duracaoTestDrive,
			boolean planoFinanciamentoFornecido, int tempoContratoFinanciamento, String formatoInformacaoPreco,
			boolean permissaoLevarInformacaoPreco, int pontuacaoVontadeFornecimentoPreco,
			int pontuacaoEsforcoVendedorFornecimentoPreco, boolean clienteDeixadoSozinho, int vezesDeixadoSozinho,
			int tempoTotalDeixadoSozinho, boolean vendedorOfereceuBebida, boolean vendedorForneceuBrochuras,
			boolean requisitouInformacaoContato, boolean clienteApresentadoGerente, int momentoApresentacaoGerente,
			boolean vendedorMencionouBeneficiosConcessionaria, String descricaoBeneficiosConcessionaria,
			boolean funcionarioMencionouIncentivos, String descricaoIncentivos, int pontuacaoEsforcoMostrarPósVenda,
			int tentativaFechamentoVenda, boolean experienciaNaoProfissional, boolean experienciaPositiva,
			int grauAtencao, int grauEntusiasmo, Veiculo idVeiculo) {
		super();
		this.id = id;
		this.idLocal = idLocal;
		this.idVendedor = idVendedor;
		this.clienteUtilizouBanheiro = clienteUtilizouBanheiro;
		this.banheiroLimpo = banheiroLimpo;
		this.descricaoCondicaoBanheiro = descricaoCondicaoBanheiro;
		this.condicaoBanheiroPontuacao = condicaoBanheiroPontuacao;
		this.descricaoEstacionamento = descricaoEstacionamento;
		this.estacionamentoPontuacao = estacionamentoPontuacao;
		this.outroComentarioInstalacoes = outroComentarioInstalacoes;
		this.vendedorAtendeuEmAteCincoMinutos = vendedorAtendeuEmAteCincoMinutos;
		this.tempoParaAtendimento = tempoParaAtendimento;
		this.atendimentoDentroDeVinteMinutos = atendimentoDentroDeVinteMinutos;
		this.tempoParaEncontrarVendedor = tempoParaEncontrarVendedor;
		this.tempoTotalParaAtendimento = tempoTotalParaAtendimento;
		this.vendedorCumprimentou = vendedorCumprimentou;
		this.vendedorVestidoProfissionalmente = vendedorVestidoProfissionalmente;
		this.vendedorUsandoCracha = vendedorUsandoCracha;
		this.momentoPerguntaNomeCliente = momentoPerguntaNomeCliente;
		this.vendedorUsouDispositivo = vendedorUsouDispositivo;
		this.vendedorPerguntouSobreVeiculoAnterior = vendedorPerguntouSobreVeiculoAnterior;
		this.vendedorPerguntouQuandoComprar = vendedorPerguntouQuandoComprar;
		this.vendedorPerguntouOutrasMarcas = vendedorPerguntouOutrasMarcas;
		this.vendedorPerguntouHabitosDirecao = vendedorPerguntouHabitosDirecao;
		this.vendedorPerguntouMetodoPagamento = vendedorPerguntouMetodoPagamento;
		this.vendedorPerguntouSobreVeiculoUsado = vendedorPerguntouSobreVeiculoUsado;
		this.vendedorPerguntouPesquisaAnterior = vendedorPerguntouPesquisaAnterior;
		this.vendedorPerguntouCaracteristicaMaisImportante = vendedorPerguntouCaracteristicaMaisImportante;
		this.descricaoCaracteristicaImportante = descricaoCaracteristicaImportante;
		this.descricaoEsforcoVendedor = descricaoEsforcoVendedor;
		this.convidouClienteSentarNoVeiculo = convidouClienteSentarNoVeiculo;
		this.pontuacaoExplicacaoConsumoCombustivel = pontuacaoExplicacaoConsumoCombustivel;
		this.pontuacaoExplicacaoSeguranca = pontuacaoExplicacaoSeguranca;
		this.pontuacaoExplicacaoPotencia = pontuacaoExplicacaoPotencia;
		this.pontuacaoExplicacaoConforto = pontuacaoExplicacaoConforto;
		this.pontuacaoExplicacaoInfoEntretenimento = pontuacaoExplicacaoInfoEntretenimento;
		this.pontuacaoExplicacaoQualidade = pontuacaoExplicacaoQualidade;
		this.descricaoEsforcoDemonstração = descricaoEsforcoDemonstração;
		this.testDriveOferecido = testDriveOferecido;
		this.pontuacaoProcedimentosAntesTestDrive = pontuacaoProcedimentosAntesTestDrive;
		this.clienteAcompanhadoNoTestDrive = clienteAcompanhadoNoTestDrive;
		this.quemAcompanhou = quemAcompanhou;
		this.problemaNoTestDrive = problemaNoTestDrive;
		this.pontuacaoDirecaoVariedade = pontuacaoDirecaoVariedade;
		this.duracaoTestDrive = duracaoTestDrive;
		this.planoFinanciamentoFornecido = planoFinanciamentoFornecido;
		this.tempoContratoFinanciamento = tempoContratoFinanciamento;
		this.formatoInformacaoPreco = formatoInformacaoPreco;
		this.permissaoLevarInformacaoPreco = permissaoLevarInformacaoPreco;
		this.pontuacaoVontadeFornecimentoPreco = pontuacaoVontadeFornecimentoPreco;
		this.pontuacaoEsforcoVendedorFornecimentoPreco = pontuacaoEsforcoVendedorFornecimentoPreco;
		this.clienteDeixadoSozinho = clienteDeixadoSozinho;
		this.vezesDeixadoSozinho = vezesDeixadoSozinho;
		this.tempoTotalDeixadoSozinho = tempoTotalDeixadoSozinho;
		this.vendedorOfereceuBebida = vendedorOfereceuBebida;
		this.vendedorForneceuBrochuras = vendedorForneceuBrochuras;
		this.requisitouInformacaoContato = requisitouInformacaoContato;
		this.clienteApresentadoGerente = clienteApresentadoGerente;
		this.momentoApresentacaoGerente = momentoApresentacaoGerente;
		this.vendedorMencionouBeneficiosConcessionaria = vendedorMencionouBeneficiosConcessionaria;
		this.descricaoBeneficiosConcessionaria = descricaoBeneficiosConcessionaria;
		this.funcionarioMencionouIncentivos = funcionarioMencionouIncentivos;
		this.descricaoIncentivos = descricaoIncentivos;
		this.pontuacaoEsforcoMostrarPósVenda = pontuacaoEsforcoMostrarPósVenda;
		this.tentativaFechamentoVenda = tentativaFechamentoVenda;
		this.experienciaNaoProfissional = experienciaNaoProfissional;
		this.experienciaPositiva = experienciaPositiva;
		this.grauAtencao = grauAtencao;
		this.grauEntusiasmo = grauEntusiasmo;
		this.idVeiculo = idVeiculo;
	}

	public Local getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Local idLocal) {
		this.idLocal = idLocal;
	}

	public Vendedor getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Vendedor idVendedor) {
		this.idVendedor = idVendedor;
	}

	private Veiculo idVeiculo;

	public Veiculo getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(Veiculo idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isClienteUtilizouBanheiro() {
		return clienteUtilizouBanheiro;
	}

	public void setClienteUtilizouBanheiro(boolean clienteUtilizouBanheiro) {
		this.clienteUtilizouBanheiro = clienteUtilizouBanheiro;
	}

	public boolean isBanheiroLimpo() {
		return banheiroLimpo;
	}

	public void setBanheiroLimpo(boolean banheiroLimpo) {
		this.banheiroLimpo = banheiroLimpo;
	}

	public String getDescricaoCondicaoBanheiro() {
		return descricaoCondicaoBanheiro;
	}

	public void setDescricaoCondicaoBanheiro(String descricaoCondicaoBanheiro) {
		this.descricaoCondicaoBanheiro = descricaoCondicaoBanheiro;
	}

	public int getCondicaoBanheiroPontuacao() {
		return condicaoBanheiroPontuacao;
	}

	public void setCondicaoBanheiroPontuacao(int condicaoBanheiroPontuacao) {
		this.condicaoBanheiroPontuacao = condicaoBanheiroPontuacao;
	}

	public String getDescricaoEstacionamento() {
		return descricaoEstacionamento;
	}

	public void setDescricaoEstacionamento(String descricaoEstacionamento) {
		this.descricaoEstacionamento = descricaoEstacionamento;
	}

	public int getEstacionamentoPontuacao() {
		return estacionamentoPontuacao;
	}

	public void setEstacionamentoPontuacao(int estacionamentoPontuacao) {
		this.estacionamentoPontuacao = estacionamentoPontuacao;
	}

	public String getOutroComentarioInstalacoes() {
		return outroComentarioInstalacoes;
	}

	public void setOutroComentarioInstalacoes(String outroComentarioInstalacoes) {
		this.outroComentarioInstalacoes = outroComentarioInstalacoes;
	}

	public boolean isVendedorAtendeuEmAteCincoMinutos() {
		return vendedorAtendeuEmAteCincoMinutos;
	}

	public void setVendedorAtendeuEmAteCincoMinutos(boolean vendedorAtendeuEmAteCincoMinutos) {
		this.vendedorAtendeuEmAteCincoMinutos = vendedorAtendeuEmAteCincoMinutos;
	}

	public int getTempoParaAtendimento() {
		return tempoParaAtendimento;
	}

	public void setTempoParaAtendimento(int tempoParaAtendimento) {
		this.tempoParaAtendimento = tempoParaAtendimento;
	}

	public boolean isAtendimentoDentroDeVinteMinutos() {
		return atendimentoDentroDeVinteMinutos;
	}

	public void setAtendimentoDentroDeVinteMinutos(boolean atendimentoDentroDeVinteMinutos) {
		this.atendimentoDentroDeVinteMinutos = atendimentoDentroDeVinteMinutos;
	}

	public int getTempoParaEncontrarVendedor() {
		return tempoParaEncontrarVendedor;
	}

	public void setTempoParaEncontrarVendedor(int tempoParaEncontrarVendedor) {
		this.tempoParaEncontrarVendedor = tempoParaEncontrarVendedor;
	}

	public int getTempoTotalParaAtendimento() {
		return tempoTotalParaAtendimento;
	}

	public void setTempoTotalParaAtendimento(int tempoTotalParaAtendimento) {
		this.tempoTotalParaAtendimento = tempoTotalParaAtendimento;
	}

	public boolean isVendedorCumprimentou() {
		return vendedorCumprimentou;
	}

	public void setVendedorCumprimentou(boolean vendedorCumprimentou) {
		this.vendedorCumprimentou = vendedorCumprimentou;
	}

	public boolean isVendedorVestidoProfissionalmente() {
		return vendedorVestidoProfissionalmente;
	}

	public void setVendedorVestidoProfissionalmente(boolean vendedorVestidoProfissionalmente) {
		this.vendedorVestidoProfissionalmente = vendedorVestidoProfissionalmente;
	}

	public boolean isVendedorUsandoCracha() {
		return vendedorUsandoCracha;
	}

	public void setVendedorUsandoCracha(boolean vendedorUsandoCracha) {
		this.vendedorUsandoCracha = vendedorUsandoCracha;
	}

	public String getMomentoPerguntaNomeCliente() {
		return momentoPerguntaNomeCliente;
	}

	public void setMomentoPerguntaNomeCliente(String momentoPerguntaNomeCliente) {
		this.momentoPerguntaNomeCliente = momentoPerguntaNomeCliente;
	}

	public boolean isVendedorUsouDispositivo() {
		return vendedorUsouDispositivo;
	}

	public void setVendedorUsouDispositivo(boolean vendedorUsouDispositivo) {
		this.vendedorUsouDispositivo = vendedorUsouDispositivo;
	}

	public boolean isVendedorPerguntouSobreVeiculoAnterior() {
		return vendedorPerguntouSobreVeiculoAnterior;
	}

	public void setVendedorPerguntouSobreVeiculoAnterior(boolean vendedorPerguntouSobreVeiculoAnterior) {
		this.vendedorPerguntouSobreVeiculoAnterior = vendedorPerguntouSobreVeiculoAnterior;
	}

	public boolean isVendedorPerguntouQuandoComprar() {
		return vendedorPerguntouQuandoComprar;
	}

	public void setVendedorPerguntouQuandoComprar(boolean vendedorPerguntouQuandoComprar) {
		this.vendedorPerguntouQuandoComprar = vendedorPerguntouQuandoComprar;
	}

	public boolean isVendedorPerguntouOutrasMarcas() {
		return vendedorPerguntouOutrasMarcas;
	}

	public void setVendedorPerguntouOutrasMarcas(boolean vendedorPerguntouOutrasMarcas) {
		this.vendedorPerguntouOutrasMarcas = vendedorPerguntouOutrasMarcas;
	}

	public boolean isVendedorPerguntouHabitosDirecao() {
		return vendedorPerguntouHabitosDirecao;
	}

	public void setVendedorPerguntouHabitosDirecao(boolean vendedorPerguntouHabitosDirecao) {
		this.vendedorPerguntouHabitosDirecao = vendedorPerguntouHabitosDirecao;
	}

	public boolean isVendedorPerguntouMetodoPagamento() {
		return vendedorPerguntouMetodoPagamento;
	}

	public void setVendedorPerguntouMetodoPagamento(boolean vendedorPerguntouMetodoPagamento) {
		this.vendedorPerguntouMetodoPagamento = vendedorPerguntouMetodoPagamento;
	}

	public boolean isVendedorPerguntouSobreVeiculoUsado() {
		return vendedorPerguntouSobreVeiculoUsado;
	}

	public void setVendedorPerguntouSobreVeiculoUsado(boolean vendedorPerguntouSobreVeiculoUsado) {
		this.vendedorPerguntouSobreVeiculoUsado = vendedorPerguntouSobreVeiculoUsado;
	}

	public boolean isVendedorPerguntouPesquisaAnterior() {
		return vendedorPerguntouPesquisaAnterior;
	}

	public void setVendedorPerguntouPesquisaAnterior(boolean vendedorPerguntouPesquisaAnterior) {
		this.vendedorPerguntouPesquisaAnterior = vendedorPerguntouPesquisaAnterior;
	}

	public boolean isVendedorPerguntouCaracteristicaMaisImportante() {
		return vendedorPerguntouCaracteristicaMaisImportante;
	}

	public void setVendedorPerguntouCaracteristicaMaisImportante(
			boolean vendedorPerguntouCaracteristicaMaisImportante) {
		this.vendedorPerguntouCaracteristicaMaisImportante = vendedorPerguntouCaracteristicaMaisImportante;
	}

	public String getDescricaoCaracteristicaImportante() {
		return descricaoCaracteristicaImportante;
	}

	public void setDescricaoCaracteristicaImportante(String descricaoCaracteristicaImportante) {
		this.descricaoCaracteristicaImportante = descricaoCaracteristicaImportante;
	}

	public String getDescricaoEsforcoVendedor() {
		return descricaoEsforcoVendedor;
	}

	public void setDescricaoEsforcoVendedor(String descricaoEsforcoVendedor) {
		this.descricaoEsforcoVendedor = descricaoEsforcoVendedor;
	}

	public boolean isConvidouClienteSentarNoVeiculo() {
		return convidouClienteSentarNoVeiculo;
	}

	public void setConvidouClienteSentarNoVeiculo(boolean convidouClienteSentarNoVeiculo) {
		this.convidouClienteSentarNoVeiculo = convidouClienteSentarNoVeiculo;
	}

	public int getPontuacaoExplicacaoConsumoCombustivel() {
		return pontuacaoExplicacaoConsumoCombustivel;
	}

	public void setPontuacaoExplicacaoConsumoCombustivel(int pontuacaoExplicacaoConsumoCombustivel) {
		this.pontuacaoExplicacaoConsumoCombustivel = pontuacaoExplicacaoConsumoCombustivel;
	}

	public int getPontuacaoExplicacaoSeguranca() {
		return pontuacaoExplicacaoSeguranca;
	}

	public void setPontuacaoExplicacaoSeguranca(int pontuacaoExplicacaoSeguranca) {
		this.pontuacaoExplicacaoSeguranca = pontuacaoExplicacaoSeguranca;
	}

	public int getPontuacaoExplicacaoPotencia() {
		return pontuacaoExplicacaoPotencia;
	}

	public void setPontuacaoExplicacaoPotencia(int pontuacaoExplicacaoPotencia) {
		this.pontuacaoExplicacaoPotencia = pontuacaoExplicacaoPotencia;
	}

	public int getPontuacaoExplicacaoConforto() {
		return pontuacaoExplicacaoConforto;
	}

	public void setPontuacaoExplicacaoConforto(int pontuacaoExplicacaoConforto) {
		this.pontuacaoExplicacaoConforto = pontuacaoExplicacaoConforto;
	}

	public int getPontuacaoExplicacaoInfoEntretenimento() {
		return pontuacaoExplicacaoInfoEntretenimento;
	}

	public void setPontuacaoExplicacaoInfoEntretenimento(int pontuacaoExplicacaoInfoEntretenimento) {
		this.pontuacaoExplicacaoInfoEntretenimento = pontuacaoExplicacaoInfoEntretenimento;
	}

	public int getPontuacaoExplicacaoQualidade() {
		return pontuacaoExplicacaoQualidade;
	}

	public void setPontuacaoExplicacaoQualidade(int pontuacaoExplicacaoQualidade) {
		this.pontuacaoExplicacaoQualidade = pontuacaoExplicacaoQualidade;
	}

	public String getDescricaoEsforcoDemonstração() {
		return descricaoEsforcoDemonstração;
	}

	public void setDescricaoEsforcoDemonstração(String descricaoEsforcoDemonstração) {
		this.descricaoEsforcoDemonstração = descricaoEsforcoDemonstração;
	}

	public boolean isTestDriveOferecido() {
		return testDriveOferecido;
	}

	public void setTestDriveOferecido(boolean testDriveOferecido) {
		this.testDriveOferecido = testDriveOferecido;
	}

	public int getPontuacaoProcedimentosAntesTestDrive() {
		return pontuacaoProcedimentosAntesTestDrive;
	}

	public void setPontuacaoProcedimentosAntesTestDrive(int pontuacaoProcedimentosAntesTestDrive) {
		this.pontuacaoProcedimentosAntesTestDrive = pontuacaoProcedimentosAntesTestDrive;
	}

	public boolean isClienteAcompanhadoNoTestDrive() {
		return clienteAcompanhadoNoTestDrive;
	}

	public void setClienteAcompanhadoNoTestDrive(boolean clienteAcompanhadoNoTestDrive) {
		this.clienteAcompanhadoNoTestDrive = clienteAcompanhadoNoTestDrive;
	}

	public String getQuemAcompanhou() {
		return quemAcompanhou;
	}

	public void setQuemAcompanhou(String quemAcompanhou) {
		this.quemAcompanhou = quemAcompanhou;
	}

	public boolean isProblemaNoTestDrive() {
		return problemaNoTestDrive;
	}

	public void setProblemaNoTestDrive(boolean problemaNoTestDrive) {
		this.problemaNoTestDrive = problemaNoTestDrive;
	}

	public int getPontuacaoDirecaoVariedade() {
		return pontuacaoDirecaoVariedade;
	}

	public void setPontuacaoDirecaoVariedade(int pontuacaoDirecaoVariedade) {
		this.pontuacaoDirecaoVariedade = pontuacaoDirecaoVariedade;
	}

	public int getDuracaoTestDrive() {
		return duracaoTestDrive;
	}

	public void setDuracaoTestDrive(int duracaoTestDrive) {
		this.duracaoTestDrive = duracaoTestDrive;
	}

	public boolean isPlanoFinanciamentoFornecido() {
		return planoFinanciamentoFornecido;
	}

	public void setPlanoFinanciamentoFornecido(boolean planoFinanciamentoFornecido) {
		this.planoFinanciamentoFornecido = planoFinanciamentoFornecido;
	}

	public int getTempoContratoFinanciamento() {
		return tempoContratoFinanciamento;
	}

	public void setTempoContratoFinanciamento(int tempoContratoFinanciamento) {
		this.tempoContratoFinanciamento = tempoContratoFinanciamento;
	}

	public String getFormatoInformacaoPreco() {
		return formatoInformacaoPreco;
	}

	public void setFormatoInformacaoPreco(String formatoInformacaoPreco) {
		this.formatoInformacaoPreco = formatoInformacaoPreco;
	}

	public boolean isPermissaoLevarInformacaoPreco() {
		return permissaoLevarInformacaoPreco;
	}

	public void setPermissaoLevarInformacaoPreco(boolean permissaoLevarInformacaoPreco) {
		this.permissaoLevarInformacaoPreco = permissaoLevarInformacaoPreco;
	}

	public int getPontuacaoVontadeFornecimentoPreco() {
		return pontuacaoVontadeFornecimentoPreco;
	}

	public void setPontuacaoVontadeFornecimentoPreco(int pontuacaoVontadeFornecimentoPreco) {
		this.pontuacaoVontadeFornecimentoPreco = pontuacaoVontadeFornecimentoPreco;
	}

	public int getPontuacaoEsforcoVendedorFornecimentoPreco() {
		return pontuacaoEsforcoVendedorFornecimentoPreco;
	}

	public void setPontuacaoEsforcoVendedorFornecimentoPreco(int pontuacaoEsforcoVendedorFornecimentoPreco) {
		this.pontuacaoEsforcoVendedorFornecimentoPreco = pontuacaoEsforcoVendedorFornecimentoPreco;
	}

	public boolean isClienteDeixadoSozinho() {
		return clienteDeixadoSozinho;
	}

	public void setClienteDeixadoSozinho(boolean clienteDeixadoSozinho) {
		this.clienteDeixadoSozinho = clienteDeixadoSozinho;
	}

	public int getVezesDeixadoSozinho() {
		return vezesDeixadoSozinho;
	}

	public void setVezesDeixadoSozinho(int vezesDeixadoSozinho) {
		this.vezesDeixadoSozinho = vezesDeixadoSozinho;
	}

	public int getTempoTotalDeixadoSozinho() {
		return tempoTotalDeixadoSozinho;
	}

	public void setTempoTotalDeixadoSozinho(int tempoTotalDeixadoSozinho) {
		this.tempoTotalDeixadoSozinho = tempoTotalDeixadoSozinho;
	}

	public boolean isVendedorOfereceuBebida() {
		return vendedorOfereceuBebida;
	}

	public void setVendedorOfereceuBebida(boolean vendedorOfereceuBebida) {
		this.vendedorOfereceuBebida = vendedorOfereceuBebida;
	}

	public boolean isVendedorForneceuBrochuras() {
		return vendedorForneceuBrochuras;
	}

	public void setVendedorForneceuBrochuras(boolean vendedorForneceuBrochuras) {
		this.vendedorForneceuBrochuras = vendedorForneceuBrochuras;
	}

	public boolean isRequisitouInformacaoContato() {
		return requisitouInformacaoContato;
	}

	public void setRequisitouInformacaoContato(boolean requisitouInformacaoContato) {
		this.requisitouInformacaoContato = requisitouInformacaoContato;
	}

	public boolean isClienteApresentadoGerente() {
		return clienteApresentadoGerente;
	}

	public void setClienteApresentadoGerente(boolean clienteApresentadoGerente) {
		this.clienteApresentadoGerente = clienteApresentadoGerente;
	}

	public int getMomentoApresentacaoGerente() {
		return momentoApresentacaoGerente;
	}

	public void setMomentoApresentacaoGerente(int momentoApresentacaoGerente) {
		this.momentoApresentacaoGerente = momentoApresentacaoGerente;
	}

	public boolean isVendedorMencionouBeneficiosConcessionaria() {
		return vendedorMencionouBeneficiosConcessionaria;
	}

	public void setVendedorMencionouBeneficiosConcessionaria(boolean vendedorMencionouBeneficiosConcessionaria) {
		this.vendedorMencionouBeneficiosConcessionaria = vendedorMencionouBeneficiosConcessionaria;
	}

	public String getDescricaoBeneficiosConcessionaria() {
		return descricaoBeneficiosConcessionaria;
	}

	public void setDescricaoBeneficiosConcessionaria(String descricaoBeneficiosConcessionaria) {
		this.descricaoBeneficiosConcessionaria = descricaoBeneficiosConcessionaria;
	}

	public boolean isFuncionarioMencionouIncentivos() {
		return funcionarioMencionouIncentivos;
	}

	public void setFuncionarioMencionouIncentivos(boolean funcionarioMencionouIncentivos) {
		this.funcionarioMencionouIncentivos = funcionarioMencionouIncentivos;
	}

	public String getDescricaoIncentivos() {
		return descricaoIncentivos;
	}

	public void setDescricaoIncentivos(String descricaoIncentivos) {
		this.descricaoIncentivos = descricaoIncentivos;
	}

	public int getPontuacaoEsforcoMostrarPósVenda() {
		return pontuacaoEsforcoMostrarPósVenda;
	}

	public void setPontuacaoEsforcoMostrarPósVenda(int pontuacaoEsforcoMostrarPósVenda) {
		this.pontuacaoEsforcoMostrarPósVenda = pontuacaoEsforcoMostrarPósVenda;
	}

	public int getTentativaFechamentoVenda() {
		return tentativaFechamentoVenda;
	}

	public void setTentativaFechamentoVenda(int tentativaFechamentoVenda) {
		this.tentativaFechamentoVenda = tentativaFechamentoVenda;
	}

	public boolean isExperienciaNaoProfissional() {
		return experienciaNaoProfissional;
	}

	public void setExperienciaNaoProfissional(boolean experienciaNaoProfissional) {
		this.experienciaNaoProfissional = experienciaNaoProfissional;
	}

	public boolean isExperienciaPositiva() {
		return experienciaPositiva;
	}

	public void setExperienciaPositiva(boolean experienciaPositiva) {
		this.experienciaPositiva = experienciaPositiva;
	}

	public int getGrauAtencao() {
		return grauAtencao;
	}

	public void setGrauAtencao(int grauAtencao) {
		this.grauAtencao = grauAtencao;
	}

	public int getGrauEntusiasmo() {
		return grauEntusiasmo;
	}

	public void setGrauEntusiasmo(int grauEntusiasmo) {
		this.grauEntusiasmo = grauEntusiasmo;
	}

}
