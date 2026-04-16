# Capítulo 1: Ordenção por seleção

## Tópicos abordados
- Como funciona a memória.
- Arrays e Listas encadeadas.
- Ordenação por seleção.

---

## Como funciona a memória
- Toda informação armazenada no computador ocupa um espaço, cada espaço utilizado na memória contém seu endereço.
- Para armazenar mútiplos itens, há duas manerias: utilizando array e listas.

## Lista Encadeada
- É possível reservar espaço na memória.
- O item pode estar em qualquer lugar da memória. 
- Como não estao um ao lado do outro, não pode calcular instantaneamente a posição de um elemento na memória 
=> Precisa ir ao primeiro elemento para ter acesso e encontrar o segunodo

## Arrays (Lista)
- Aumenta de tamanho e espaço na memória conforme a demanda.
- Os elementos são armazenados de maneira contígua, um ao lado do outro, na memória.
- O acesso a qualquer elemento é possível de maneira instântanea.

## Arrays X Listas Encadeadas:

### Comparando o Big O nas funcionalidades:
|  | Arrays | Listas Encadeadas |
| :--- | :--- | :--- |
| Leitura | O(1) | O(n) |
| Inserção | O(n) | O(1) |
| Deleção | O(n) | O(1) |

- O(n) => Tempo de execução Linear
- O(1) => Tempo de execução Constante

- Com isso, é possível notar que Array é muito funcional para solucionar aplicações na qual haverá muita consulta de elementos, enquanto a lista Encadeade é melhor para aplicações com maior uso de adição/deleção de elementos.

### Inserção no meio da lista
- Para inserir um elemento no meio da Array é necessário mover todos os itens que possa está alocando memória do último índice ( Elemento novo ).
- Para inserir um elemento na lista Encadeada basta mudar o endereço de memória para o qual o último elemento apontará.

### Deleções de elementos
- Segue o mesmo príncipio da Inserção.
- Em arrays, é necessário tudo precisa ser movido caso delete algum elemento, enquano em listas encadeadas é necessário apenas mudar o endereço no qual o elemento anterior ao que foi deletado está apontando.