# desenvolvimento-de-sistemas-para-a-Internet

Abstração
Muito simplesmente, a abstração é o conceito de envolver ações complexas em verbos simples. Descreva cada coisa que você abstraiu claramente e esconda a complexidade. Alguém sempre pode abrir o capô se precisar.

Para usar uma metáfora culinária: a massa folhada é incrivelmente difícil de fazer. Mesmo os profissionais não fazem sua própria massa folhada. Não preciso saber como é feita a massa folhada para comprá-la e usá-la.

Encapsulamento
Tanto quanto você puder, mantenha o estado e a lógica internos. Isso pode significar ter o menor número possível de leitores attr ou o menor número possível de vars de instância. Quanto menos você tiver que acompanhar a qualquer momento, melhor.

Para usar uma metáfora culinária: você já viu uma receita em que eles dividem alguns dos ingredientes em outras receitas. Talvez você esteja assando um bolo e, em vez da manteiga e do açúcar em pó fazerem parte da receita do bolo, o bolo simplesmente pede “glacê” e vincula a outra receita para fazer o glacê.

Herança
As classes podem ter classes pai. As classes filhas herdarão todo o comportamento e atributos da classe pai. As classes filhas podem então optar por substituir algumas delas conforme necessário.

Para usar uma metáfora culinária: toda omelete segue basicamente o mesmo processo. Quebre alguns ovos, cozinhe esses ovos, adicione alguns ingredientes, sirva. Tudo omelete Mas uma omelete de Denver não é o mesmo que uma omelete du fromage.

Polimorfismo
Definido como “a condição de ocorrer em várias formas diferentes”. Basicamente, significa apenas que podemos chamar o mesmo método em objetos diferentes.


java


public class Pessoa {
		private String primeiroNome;
		private String ultimoNome;
		private String nomesDoMeio;


		public Pessoa(String primeiro, String meio, String ultimo) {
		  primeiroNome = primeiro;
		  ultimoNome = ultimo;
		  nomesDoMeio = meio;
		}


		public String getNomeCompleto() {
		  String nomeCompleto = primeiroNome + " " + nomesDoMeio + " " + ultimoNome;
		  return nomeCompleto;
		}

	  }



kotlin 


class Pessoa(private val primeiroNome: String, private val nomesDoMeio: String, private val ultimoNome: String) {

    val nomeCompleto: String
        get() = "$primeiroNome $nomesDoMeio $ultimoNome"
}
