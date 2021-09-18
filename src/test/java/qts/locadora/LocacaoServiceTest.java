package qts.locadora;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

import qts.locador.execption.JogoSemEstoqueException;
import qts.locadora.service.LocacaoService;
import qts.locadora.util.DataUtil;

public class LocacaoServiceTest {
	@Test
		public void teste() throws Exception{
			Cliente cliente = new Cliente("Antonio");
			Jogo jogo = new Jogo("Harry Potter",15.00,0);
			LocacaoService locacaoService = new LocacaoService();
			Locacao locacao;
			
		//try {
			locacao = locacaoService.alugarJogo(cliente, jogo);
			Assert.assertTrue(locacao.getJogo().getNome().equals(jogo.getNome()));
			Assert.assertTrue(locacao.getCliente().getNome().equals(cliente.getNome()));
			Assert.assertTrue("Erro no valor do jogo",locacao.getValor()==jogo.getValor());
			Assert.assertTrue(new DataUtil().verificarDatasIguais(locacao.getRetirada(), new Date()));
		//}
		//catch(Exception e) {
		//	e.printStackTrace();
		//	Assert.fail();
		//}
			
	}
	@Test (expected = JogoSemEstoqueException.class)
	  public void testSemEstoque () throws Exception{
		Cliente cliente1 = new Cliente("Antonio");
		Jogo jogo1 = new Jogo("Harry Potter",15.00,0);
	
		LocacaoService locacaoService1 = new LocacaoService();
		Locacao locacao1;
		locacao1 = locacaoService1.alugarJogo(cliente1, jogo1);
	}
	
}
