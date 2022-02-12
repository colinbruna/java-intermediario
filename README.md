# Material do curso Java Intermediário - loiane.training

## Código e meus comentários de aula

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
###A
