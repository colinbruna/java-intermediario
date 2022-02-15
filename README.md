# Material do curso Java Intermediário - loiane.training

## Código, exercícios e meus comentários de aula

### Enumeradores (Enum)

Aula 53 - Enumeradores (Enum)

Aula 54 - Enum como classe (construtor e métodos)

* Enums extends a classe java.lang.Enum
* Podem ser comparadas usando ==
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
* Escreva um método main para teste que realize todas as operações do enum. Dica: você pode usar o método values para iterar o enum e executar todas as operações. 

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

