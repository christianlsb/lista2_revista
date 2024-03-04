public class Main{
    public static void main(String[] args) {
        DateTime data = new DateTime(1, Month.JANUARY, 2020);
        RevistaCientifica revista = new RevistaCientifica("Revista", 123456, data);
        Edicao edicao = new Edicao(1, 1, data, "Triagem");
        Artigo artigo = new Artigo("Artigo");
        System.out.println(revista.getTitulo());
        System.out.println(revista.getCodigoISSN());
        System.out.println(revista.getData().getDia());
        System.out.println(revista.getData().getMes());
        System.out.println(revista.getData().getAno());
        System.out.println(edicao.getNumero());
        System.out.println(edicao.getVolume());
        System.out.println(edicao.getData().getDia());
        System.out.println(edicao.getData().getMes());
        System.out.println(edicao.getData().getAno());
        System.out.println(edicao.getTriagem());
        System.out.println(artigo.getTitulo());
    }
}

