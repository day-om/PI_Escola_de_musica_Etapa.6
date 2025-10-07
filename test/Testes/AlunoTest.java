package Testes;

import Classes.Aluno;
import org.junit.Test;
import static org.junit.Assert.*;  // <- JUnit 4 usa org.junit.Assert

public class AlunoTest {

    @Test
    public void testAlunoPresente() {
        Aluno aluno = new Aluno();
        String[] registros = {"Maria", "João", "Dayanne"};
        boolean presente = aluno.verificarPresenca(registros, "Dayanne");
        assertTrue(presente);
    }

    @Test
    public void testAlunoAusente() {
        Aluno aluno = new Aluno();
        String[] registros = {"Maria", "João", "Lucas"};
        boolean presente = aluno.verificarPresenca(registros, "Ana");
        assertFalse(presente);
    }

    @Test(expected = IllegalArgumentException.class) // <- JUnit 4 usa este formato para exceções
    public void testParametrosInvalidos() {
        Aluno aluno = new Aluno();
        aluno.verificarPresenca(null, "Maria");
    }
}
