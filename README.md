# Material do curso Java Intermediário - loiane.training

## Código, exercícios e meus comentários de aula

### Enumeradores (Enum)

Aula 53 - Enumeradores (Enum)

Aula 54 - Enum como classe (construtor e métodos)

* Enums extends a classe java.lang.Enum
* Podem ser comparadas a usar ==
* Não podem ser instanciadas com new
* Podem implementar interfaces
* Pode ser declarado separadamente ou dentro da classe

Aula 55 - Enum: métodos value e valueof

Aula 56 - Enum: métodos abstratos

* Os métodos abstratos podem ser através de uma interface ou também podem ser declarados dentro do próprio enum

Exercício - Calculadora com Enum
* Escreva um enum que represente as quatro operações matemáticas: somar, subtrair, multiplicar e dividir;
* O enum deve ter um construtor que receba o símbolo da operação (+,-,*,/);
* Sobescreva o método toString que retorne somente o símbolo da operação;
* Implemente um método abstrato com a seguinte assinatura double executarOperacao (double x, double y). Cada opção do enum deve implementar esse método realizando a operação de acordo com sua descrição;
* Escreva um método main para teste que realize todas as operações do enum. Dica: pode usar o método values para iterar o enum e executar todas as operações. 

###Elementos básicos da linguagem Java

Aula 57 - Wrappers: classes de tipos primitivos

Aula 58 - Autoboxing e auto-unboxing

Aula 59 - Importação estática (static import)

Aula 60 - Escopo de variáveis

Aula 61 - Passagem de parâmetros por valor e referência

* Tipos primitivos: passagem por valor
* Tipos classe, enum, array: passagem por referência

Aula 62 - Varargs: é um facilitador, ao invés de criar um array ou lista e colocar os valores dentro dele para depois chamar o método, o mesmo pode ser chamado diretamente passando os n valores e os parâmetros enviados são automaticamente adicionados em um array do mesmo tipo do varargs.

Aula 63 - printf

Aula 64 - Classes aninhadas: internas, locais e anonimas.

Aula 65 - Annotations: recurso que permite embutir informações complementares no código fonte
* Informações para o compilador
* Runtime (tempo de execução)
* Compile ou Deploy-time (tempo de compilação ou deploy-web)
* As anotações são precedidas de um @ Ex.: @override

Aula 66 - Garbage Collector (Coletor de Lixo)

### Programação multitarefas: Threads

Aula 67 - Criando Threads + métodos start, run e sleep
* Existem dois tipos de multitarefas: Processos e Threads
    * Processo é um programa que está sendo executado
    * Thread é a menor unidade de código que pode ser executada. Dentro de um processo (programa) pode ter várias Threads, ou seja, dentro de um programa pode-se executar duas ou mais tarefas ao mesmo tempo.
* Vantagens de usar Threads em programas:
    * Programas mais eficientes
* Maneiras de criar uma Thread:
    * Extender a classe Thread;
    * Implementar a interface Runnable.
* Métodos mais importantes no ciclo de vida de uma Thread
    * start: inicia a Thread e deixa ela pronta para execução;
    * run: vai deixar a Thread em execução;
    * sleep: vai colocar a Thread para dormir por alguns milissegundos.

Aula 68 - Interface Runnable

Aula 69 - Criando várias Threads + métodos isAlive e join

Aula 70 - Definindo prioridades

Aula 71 - Métodos e blocos sincronizados (synchronized)
* Sincronização é o ato de coordenar as atividades de duas ou mais threads, quando, por exemplo, precisam acessar um recurso compartilhado, e somente uma thread pode usar o recurso por vez.
* No Java é usada a palavra-chave synchronized em métodos (assinatura) ou num bloco de código.

Aula 72 - Notify, wait e notifyAll
* Ambiente: Uma thread A está sendo executada dentro de um método sincronizado e precisa de acesso a um recurso R que no momento está indisponível. Se a thread A ficar esperando por R, irá bloquear o objeto impedindo que outras threads acessem o mesmo. Nesse caso a melhor solução para não causar problemas é liberar temporariamente o controle do objeto permitindo que outra thread seja executada.

Aula 73 - Resume, suspend e stop

Aula 74 - Deadlocks

Exercício - Crie um semáforo (sinal de trânsito) usando Threads. O semáforo deve ficar verde por x segundos, depois brevemente amarelo e seguido de y segundos na cor vermelha.

### Trabalhando com Strings

Aula 75 - Construtores

* O ASCII é um código numérico que representa os caracteres, usando uma escala decimal de 0 a 127. Esses números decimais são então convertidos pelo computador para binários e ele processa o comando. Sendo assim, cada uma das letras que você digitar vai corresponder a um desses códigos.

String java = new String("Java"); --> quando usamos o operador new é criada uma referência de memória;

String java2 = "Java"; == String java3 = "Java"; --> não cria referência de memória, então essas duas Strings criadas através de atribuição simples terão o mesmo espaço na memória.

Aula 76 - Concatenação

As Strings em Java são IMUTÁVEIS, ou seja, o seu valor NÃO muda. Quando contatenamos uma String com outra, não mudaremos o valor dela e sim criaremos uma nova String que faz com que a referência dessa variável aponte para uma nova. 

Aula 77 - Extraindo chars (charAt, getChars, getBytes, toCharArray)

O método charAt é o mais utilizado no dia-a-dia.

Aula 78 - 