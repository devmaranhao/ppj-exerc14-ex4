## Curso: Sistemas para Internet
## Disciplina: Padrões de Projetos
## Acadêmica: Denise Vieira Maranhão


### Responda:
### Precisamos de um método que calcule o valor em R$ de todos os impostos pagos por PFs e PJs. Considerando que deve-se garantir que o cálculo inclua o valor do IR, que padrão de projeto pode ser aplicado para isto?
O padrão de projeto indicado é o Template Method, pois ele permite definir a estrutura fixa do cálculo de impostos na superclasse, garantindo que o cálculo do Imposto de Renda seja sempre executado, enquanto delega às subclasses a implementação das regras específicas de cálculo para Pessoa Física e Pessoa Jurídica.
