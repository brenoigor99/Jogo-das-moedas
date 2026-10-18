# Jogo das Moedas 🪙

Um jogo desenvolvido em Java com foco em **boas práticas de Engenharia de Software**, aplicando conceitos avançados como baixo acoplamento, alta coesão, injeção de dependências, padrões de projeto (*Factory*) e internacionalização (`i18n`).

---

## 🚀 Funcionalidades

* **Internacionalização (i18n):** Suporte completo a múltiplos idiomas (Português, Inglês e Espanhol) para todas as mensagens, rótulos e ecrãs de término.
* **Arquitetura Desacoplada:** Regras de negócio totalmente independentes de interfaces gráficas, terminais ou dispositivos de entrada.
* **Múltiplos Modos de Entrada e Renderização:** Flexibilidade para alternar entre diferentes controladores e renderizadores (Terminal e GUI).
* **Carregamento de Níveis:** Gestão de mapas e fases através de ficheiros externos (`levels.txt`).

---

## 🛠️ Tecnologias e Padrões Utilizados

* **Java** (Estrutura orientada a objetos)
* **Design Patterns:** *Factory Method* (`InputsFactory`, `RendererFactory`, `LanguageFactory`)
* **Interfaces e Polimorfismo:** (`ILanguage`, `IInputs`, `IRenderer`)

---

## 📦 Como Compilar e Executar

Certifique-se de que tem o Java JDK instalado na sua máquina. Abra o terminal na raiz do projeto e siga os passos abaixo:

### 1. Compilação
No PowerShell (Windows), execute o comando para compilar todos os ficheiros do código-fonte:

```powershell
javac -d bin -sourcepath src/main/java (Get-ChildItem -Recurse -Filter *.java src/main/java).FullName
``` 

### 2. Execução
Após a compilação, execute o jogo indicando a classe principal e as opções desejadas:

```powershell
java -cp bin game.MainGame -i joystick -r terminal