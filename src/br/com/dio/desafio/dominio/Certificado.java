package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado {

    private String nomeDev;
    private String nomeBootcamp;
    private LocalDate dataConclusao;

    public Certificado(String nomeDev, String nomeBootcamp) {
        this.nomeDev = nomeDev;
        this.nomeBootcamp = nomeBootcamp;
        this.dataConclusao = LocalDate.now();
    }

    public void imprimirCertificado() {
        System.out.println("========== CERTIFICADO ==========");
        System.out.println("Desenvolvedor: " + nomeDev);
        System.out.println("Bootcamp: " + nomeBootcamp);
        System.out.println("Data de Conclusão: " + dataConclusao);
        System.out.println("=================================");
    }
}
