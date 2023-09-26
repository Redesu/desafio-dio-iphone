
![Diagrama UML](https://imgur.com/gSP619M)
1. **Classe `iPhone`**:
   - A classe `iPhone` serve como uma classe principal que representa o iPhone em seu sistema. Ela possui três instâncias privadas das classes `ReprodutorMusical`, `AparelhoTelefônico` e `NavegadorInternet` para representar os diferentes papéis do iPhone.

   - O construtor da classe `iPhone` é responsável por criar essas instâncias internas.

   - A classe `iPhone` possui métodos públicos para realizar ações específicas do iPhone, como atender chamadas (`atenderChamada()`) e pausar a música (`pausarMusica()`). Cada um desses métodos chama diretamente o método correspondente nas instâncias internas das classes de papéis específicos.

2. **Métodos de Ação**:
   - Foram criados métodos na classe `iPhone` que encapsulam as ações específicas desejadas, como atender chamadas e pausar a música. Esses métodos são responsáveis por delegar essas ações às classes internas relevantes.

3. **Uso no `main`**:
   - No método `main`, que é o ponto de entrada do programa, é criada uma instância de `iPhone` chamada `meuiPhone`.

   - Em seguida, são chamados os métodos `atenderChamada()` e `pausarMusica()` na instância `meuiPhone` para demonstrar como você pode usar esses métodos para realizar ações específicas do iPhone.

Resumindo, este código Java organiza a funcionalidade do iPhone em classes específicas para papéis como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet, e permite que você chame métodos específicos da classe `iPhone` para executar ações relacionadas a esses papéis. Isso torna o código mais modular e fácil de manter, pois cada classe interna é responsável por suas próprias funcionalidades.