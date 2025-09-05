package abstracao.ex2.model.aplicativo;

public class Aplicativo {
    public String nome, categoria, desenvolvedor, versao;
    public double tamanho ;
    public boolean ativo = false;

    public void instalador() {
        if(!ativo){
            System.out.println("O app está sendo instalado!");
            ativo = true;
        }else{
            System.out.println("O app já está instalado.");
        }
    }

    public void desinstalador(){
        if (ativo) {     
            System.out.println("O app está sendo desinstalado!");
            ativo = false;
        }else{
            System.out.println("Esse app não está instalado.");
        }
    }

    public void executar() {
        if(ativo){
            System.out.println("O app está inciando...");
            System.out.println("App Executado com sucesso.");
        }else {
            System.out.println("Você precisa instalar o app para inciar");
        }
    }

    public void detalhes(){
        System.out.println("Nome do app: " + nome);
        System.out.println("Categoria do app: " + categoria);
        System.out.println("Desenvolvedor do app: " + desenvolvedor);
        System.out.println("Tamanho do app: " + tamanho + "GBs");
        System.out.println("Versão do app: " + versao);
    }
    
}