import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PessoaTest {

    @Test
    public void test(){

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setSexo("M");
        Pessoa pessoa1 = new Pessoa();
        pessoa.setNome("João");
        pessoa.setSexo("M");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa1);

        for (Pessoa p : pessoas) {
            Assert.assertEquals("F",p.getSexo());
        }



    }

}