# Capítulo 1: Introdução a Algoritmos

## Tópicos abordados
- Tempo de execução de um algoritmo na notação **Big O**.
- Lógica da **Pesquisa Binária**.

---

## Pesquisa Binária
- **Entrada:** Requer obrigatoriamente uma **Lista Ordenada**.
- **Saída:** Se encontrado, retorna a posição (índice) do elemento. Caso contrário, retorna um valor nulo (em Java, utilizei -1, já que a linguagem é tipada e não possui None como o Python).
- **Lógica:** Elimina metade das possibilidades a cada etapa até localizar o item ou esgotar a lista.
- **Complexidade de tempo:** $\log_2 n$.
- **Big O:** $O(\log n)$.

---

## Notação Big O
- A notação Big O informa o quão rápido é um algoritmo, medindo como o tempo de execução cresce conforme o número de elementos aumenta.
- Rapidez do algoritmo não é medida em segundos, mas pelo crescimento do número de operações.
- Não pode converter um tempo de execução na notação Big O para um número de operações.

### Pesquisa Simples Pesquisa Binária
| Elementos | Pesquisa Simples | Pesquisa Binária |
| :--- | :--- | :--- |
| 100 | 100 ms | 7 ms |
| 10.000 | 10 segundos | 14 ms |
| 1.000.000.000 | 11 dias | 32 ms |

#### => Conforme o número de elementos cresce, a Pesquisa Binária aumenta apenas alguns ms, enquanto a Pesquisa Simples escala de forma que fique muito lenta.

### Conceitos Importantes:
- **Formato:** $O(n)$, onde $n$ é o número de operações.
- **Pior Hipótese:** O Big O é estabelecido levando em conta o cenário mais lento possível. Isso garante que o algoritmo nunca será mais lento do que o tempo definido por sua notação.

### Exemplos comuns de tempo de execução Big O ( Ordenados mais rápido > mais lentos)
- **O (log n)**: Tempo logarítimo ( Busca binária ).
- **O(n)**: Tempo linear ( Busca Simples).
- **O(n * log n)**: Algoritmo rápido de ordenação ( Quicksort ). => Será explicado no cap.4
- **O(n ao quadrado)**: Algoritmo lento de ordenação ( Seleção ). => Será explicado no cap2
- **(O n!)**: Alogitmo muito lento (Caixeiro viajante).

### Caxeiro viajante
- Famoso problema da ciência da computação => " O problema do caixeiro-viajante "
- **Desafio:** Encontrar a rota mais curta entre n cidades:
- Para poucas cidades é fácil, mas para um número grande de cidades, é impossível para qualquer computador atual calcular a solução perfeita em tempo perfeito.
- Para esse tipo de Problema, não existe algoritmo mais rápido. Acreditam ser impossível melhorá-lo, o máximo que pode ser feito é uma solução aproximada para não passar todas as etapas, porém não será a solução "perfeita".
