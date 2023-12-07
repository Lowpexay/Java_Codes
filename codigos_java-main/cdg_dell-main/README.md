# cdg_dell
Vamos lá, esse código é um programa em Java que realiza uma análise das vendas de produtos da Dell em um período de 3 trimestres do ano de 2022. O programa utiliza métodos para organizar e calcular diferentes informações relacionadas às vendas. Vou explicar cada parte do código com base nas letras do exercício:

A. Entrada de Dados:

O método vendasobtém um vetor de nomes de produtos como parâmetro.
Dentro do método, é criada uma matriz arrayVendas(4x3) para armazenar as vendas de cada produto em cada trimestre.
O programa então solicita ao usuário que digite a quantidade de vendas de cada produto para cada trimestre.
A matriz preenchida é devolvida.

B. Total de Vendas por Linha de Produto:

O método vendasTotalrecebe uma matriz de vendas como parâmetro.
Ele calcula o total de vendas por linha (produto) somando as vendas de todos os trimestres.
Um vetor com os totais de vendas é retornado.

C. Total de Vendas por Trimestre:

O método vendasTrimestretambém recebe uma matriz de vendas como parâmetro.
Ele calcula o total de vendas por trimestre, somando as vendas de todos os produtos.
Um vetor com os totais de vendas por trimestre é retornado.

D. Verificação se Atingiu a Meta:

O método verificarMetarecebe dois vetores como parâmetros: o vetor de metas ( arrayMeta) e o vetor de totais de vendas por linha de produto ( arrayVendasTotal).
Ele compara cada elemento do vetor de vendas totais com a meta correspondente.
Um vetor de strings é retornado rebaixado se cada linha atingida ou não a meta.
Nenhum método main:

São declarados um vetor arrayProdutoscom os nomes dos produtos e um vetor vendasMetacom as metas de venda para cada produto.
É chamado o método vendaspara obter a matriz de vendas.
São chamados os métodos vendasTotal, vendasTrimestre, e verificarMetapara obter informações sobre as vendas.
Um loop é utilizado para imprimir as informações sobre cada produto, incluindo se atingido a meta ou não.
Em resumo, o código realiza uma análise completa das vendas de produtos em relação às metas condicionais.




