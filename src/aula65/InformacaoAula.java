package aula65;

@interface InformacaoAula {

    String autor();

    int aulaNumero();

    String blog() default "http://loiane.com"; //pode ser usado um valor padrão

    String site() default "http://loiane.training";
}