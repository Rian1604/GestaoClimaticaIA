# 🌱 Gestão Climática IA

## 🤖 Sistema Inteligente para Gestão e Monitoramento Ambiental

O **GestaoClimaticaIA** é um projeto acadêmico desenvolvido em **Java** que demonstra a aplicação de **Inteligência Artificial** no contexto da sustentabilidade e do monitoramento ambiental.

O sistema utiliza o algoritmo **K-Nearest Neighbors (KNN)** para realizar uma classificação de risco de desmatamento a partir de características ambientais.

> 🌎 **Tecnologia e sustentabilidade trabalhando juntas para apoiar a análise de riscos ambientais.**

---

## 🎯 Objetivo

O principal objetivo do **GestaoClimaticaIA** é demonstrar, de forma prática e didática, como técnicas de Inteligência Artificial podem ser utilizadas para analisar informações ambientais e auxiliar na identificação de áreas com diferentes níveis de risco de desmatamento.

O projeto também busca integrar conhecimentos de:

* 🤖 Inteligência Artificial
* ☕ Programação Java
* 🌳 Sustentabilidade ambiental
* 🌎 Gestão climática
* 📊 Análise e classificação de dados
* 🧠 Machine Learning
* 🖥️ Interface gráfica

---

## 🧠 Inteligência Artificial

O projeto utiliza o algoritmo **K-Nearest Neighbors (KNN)**, um método de aprendizado de máquina baseado na comparação entre dados.

De forma simplificada, o algoritmo verifica quais exemplos da base de treinamento possuem características mais próximas dos dados informados pelo usuário e, a partir dessas informações, determina uma classificação de risco.

### 🔎 Variáveis utilizadas

O sistema considera quatro características ambientais:

| Variável                     | Descrição                                                     |
| ---------------------------- | ------------------------------------------------------------- |
| 🌳 Histórico de desmatamento | Representa o histórico de desmatamento da área analisada      |
| 🛣️ Distância até estradas   | Considera a distância da área em relação às estradas          |
| 🌿 Área protegida            | Representa o percentual da área que possui proteção ambiental |
| 🔥 Focos de calor            | Indica a quantidade de focos de calor identificados           |

A partir dessas informações, o sistema realiza a classificação utilizando o algoritmo KNN.

---

## 🚦 Classificação de risco

O sistema apresenta diferentes níveis de risco ambiental:

### 🟢 Baixo risco

Área que apresenta características associadas a um menor nível de risco dentro dos dados utilizados pelo modelo.

### 🟡 Médio risco

Área que apresenta características intermediárias de risco.

### 🔴 Alto risco

Área que apresenta características associadas a um maior nível de risco dentro do modelo.

> **Observação:** as classificações são produzidas a partir de uma base de dados simplificada/fictícia utilizada para fins acadêmicos e de demonstração. O sistema não deve ser utilizado como ferramenta oficial de diagnóstico ambiental.

---

## 💻 Tecnologias utilizadas

| Tecnologia           | Utilização                   |
| -------------------- | ---------------------------- |
| ☕ **Java**           | Desenvolvimento da aplicação |
| 🧠 **KNN**           | Classificação dos dados      |
| 🖥️ **Java Swing**   | Interface gráfica            |
| 💡 **IntelliJ IDEA** | Ambiente de desenvolvimento  |
| 🔧 **Git**           | Controle de versão           |
| 🐙 **GitHub**        | Hospedagem do código         |

---

## 🖥️ Interface

A aplicação foi desenvolvida utilizando **Java Swing**, permitindo uma interação gráfica com o sistema.

A interface tem como objetivo facilitar a entrada dos dados ambientais e a visualização da classificação produzida pelo modelo.

---

## ⚙️ Funcionamento

O funcionamento básico do sistema pode ser representado pelo seguinte fluxo:

```text
       👤 Usuário
           │
           ▼
   Entrada dos dados
           │
           ▼
   ┌─────────────────┐
   │ Dados ambientais│
   └─────────────────┘
           │
           ▼
      🧠 Algoritmo
          KNN
           │
           ▼
   Análise dos dados
           │
           ▼
   🚦 Classificação
           │
     ┌─────┼─────┐
     ▼     ▼     ▼
   🟢      🟡      🔴
  Baixo   Médio   Alto
```

---

## 🚀 Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/Rian1604/GestaoClimaticaIA.git
```

### 2. Abra no IntelliJ IDEA

Abra o **IntelliJ IDEA** e selecione a pasta do projeto.

### 3. Configure o Java

Certifique-se de possuir um **JDK compatível** instalado e configurado no IntelliJ IDEA.

### 4. Execute a aplicação

Localize a classe principal do projeto e execute o método:

```java
public static void main(String[] args)
```

---

## 📂 Estrutura do projeto

A estrutura pode evoluir conforme novas funcionalidades sejam adicionadas:

```text
GestaoClimaticaIA/
│
├── src/
│   └── main/
│       └── java/
│
├── README.md
├── LICENSE
└── ...
```

---

## 🌎 Sustentabilidade e tecnologia

A Inteligência Artificial pode ser aplicada em diferentes áreas relacionadas à sustentabilidade e à gestão ambiental.

Entre suas possíveis aplicações estão:

* 🌳 Monitoramento de áreas florestais;
* 🔥 Identificação e análise de focos de calor;
* 🛰️ Análise de imagens e mudanças na cobertura vegetal;
* 💧 Gestão de recursos naturais;
* 🌱 Agricultura sustentável;
* 🌎 Monitoramento ambiental;
* 📊 Análise de grandes volumes de dados ambientais.

O **GestaoClimaticaIA** apresenta uma abordagem acadêmica e simplificada dessa aplicação, utilizando um modelo de classificação para demonstrar como dados ambientais podem ser processados por um algoritmo de Machine Learning.

---

## 🎓 Finalidade acadêmica

Este projeto foi desenvolvido com finalidade **acadêmica e educacional**.

Seu objetivo é colocar em prática conhecimentos relacionados a:

* Programação Orientada a Objetos;
* Linguagem Java;
* Interfaces gráficas;
* Inteligência Artificial;
* Machine Learning;
* Algoritmos de classificação;
* Sustentabilidade;
* Gestão ambiental.

Os dados utilizados no protótipo são simplificados e destinados à demonstração do funcionamento do sistema.

---

## 🔮 Possíveis melhorias futuras

O projeto pode ser expandido futuramente com novas funcionalidades, como:

* 📊 Dashboard com indicadores ambientais;
* 🗺️ Integração com mapas;
* 🛰️ Utilização de imagens de satélite;
* 📈 Gráficos de dados ambientais;
* 🗃️ Banco de dados;
* 🌐 Interface web;
* 🤖 Outros algoritmos de Machine Learning;
* 📱 Aplicação para dispositivos móveis;
* 🔥 Integração com dados reais de focos de calor;
* 🌳 Monitoramento de áreas de preservação.

---

## 📚 Referências acadêmicas

O projeto está relacionado a estudos sobre **Inteligência Artificial, Machine Learning, sustentabilidade, monitoramento ambiental e desmatamento**.

Entre os trabalhos considerados como referência para o desenvolvimento conceitual estão estudos de:

* Cassiano e Coelho (2022);
* Predranzini, Nishina e Freiria (2024);
* Mataveli et al. (2022).

As referências completas podem ser apresentadas conforme as normas acadêmicas utilizadas no trabalho.

---

## 👨‍💻 Autor

### Rian Monteiro Ribeiro

🎓 Projeto acadêmico de desenvolvimento em Java.

💻 **GitHub:** [Rian1604](https://github.com/Rian1604)

---

## 📄 Licença

Este projeto está disponibilizado sob a licença **MIT**.

Consulte o arquivo [`LICENSE`](LICENSE) para obter mais informações.

---

## ⭐ Projeto

Se você gostou do projeto ou achou a ideia interessante, considere deixar uma ⭐ no repositório!

**GestaoClimaticaIA — Inteligência Artificial aplicada à sustentabilidade. 🌱🤖🌎**
