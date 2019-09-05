package com.alvaro.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.alvaro.domain.Categoria;

@Mapper
public interface EstatisticaMapper {

	List<Categoria> pesquisarEstatistica(Long idCliente, Integer agrupamento, Date dataInicial, Date dataFinal,
			Integer qtdeItensCategoria, String tpEstatistica, Integer filtroAdquirente,
			Integer agrupamentoMensal, Long idEstabelecimento, Boolean gerarPdfComUmaAdquirente, Integer acessaTodosEstabelecimentos);

}
