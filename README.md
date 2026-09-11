# Computação Gráfica

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-blue)
![License](https://img.shields.io/badge/license-MIT-green)

Coleção de programas em Java que implementam, do zero e sem bibliotecas gráficas de alto nível, os principais algoritmos clássicos de **computação gráfica 2D**: rasterização de círculos e elipses pelo método do ponto médio (Bresenham), preenchimento de polígonos por *scanline fill* e transformações geométricas (escala, rotação, translação e espelhamento) aplicadas a um triângulo.

Cada algoritmo é um pequeno programa interativo e independente, com uma janela Swing (`JFrame`) como área de desenho e um menu via terminal (`Scanner`) para escolher a operação e informar os parâmetros.

## Funcionalidades

- **`Circulo`** — desenha um círculo por equação paramétrica e pelo algoritmo do ponto médio (Bresenham), com preenchimento por raios concêntricos; limpa a tela.
- **`Elipse`** — desenha uma elipse pelo algoritmo do ponto médio (duas regiões) e preenche a elipse por raios concêntricos decrescentes; limpa a tela.
- **`Poligono`** — desenha um polígono definido por uma lista de vértices e o preenche usando o algoritmo de *scanline fill* (varredura de linhas com paridade par/ímpar); limpa a tela.
- **`Triangulo`** — desenha um triângulo e aplica transformações geométricas 2D: escala, rotação, translação, espelhamento, escala em ponto fixo e rotação em ponto fixo.

## Tecnologias utilizadas

- **Java 21** (compatível com versões anteriores do JDK, não usa recursos exclusivos do 21)
- **Java AWT / Swing** (`JFrame`, `Graphics`) para a janela e o desenho pixel a pixel
- **`java.util.Scanner`** para entrada de dados via terminal
- Sem dependências externas, sem gerenciador de pacotes (Maven/Gradle) — projeto didático compilado diretamente com `javac`

## Como executar

### Pré-requisitos

- JDK 11 ou superior instalado (`javac` e `java` no `PATH`)
- Ambiente com suporte a interface gráfica (X11/Wayland/Windows/macOS) — os programas abrem uma janela Swing e **não funcionam em ambiente headless** (ex.: SSH sem X forwarding, contêiner sem display)

### Instalação e execução

Não há build automatizado; cada classe é compilada e executada diretamente:

```bash
# clonar o repositório
git clone https://github.com/Carolaynebarret/computacao-grafica-java.git
cd computacao-grafica-java

# compilar todas as classes respeitando o pacote "computacaografica"
javac -d . *.java

# executar o programa desejado
java -cp . computacaografica.Circulo
java -cp . computacaografica.Elipse
java -cp . computacaografica.Poligono
java -cp . computacaografica.Triangulo
```

Cada programa abre uma janela e imprime um menu numérico no terminal; digite a opção desejada e, quando solicitado, os parâmetros (raio, ângulo, coeficientes etc.).

## Como rodar os testes

O projeto não possui suíte de testes automatizados (não há JUnit nem outro framework configurado). A verificação é manual: compilar, executar cada classe e conferir visualmente o resultado desenhado na janela.

## Estrutura de pastas

```
computacao-grafica-java/
├── Circulo.java          # círculo: paramétrico, ponto médio e preenchimento
├── Elipse.java            # elipse: ponto médio e preenchimento
├── Poligono.java          # polígono: desenho e preenchimento por scanline
├── Triangulo.java         # triângulo: desenho e transformações geométricas
├── docs/
│   └── images/            # capturas de tela (pendentes, ver README da pasta)
├── LICENSE
└── README.md
```

## Roadmap

- [ ] Adicionar suíte de testes automatizados para as rotinas de rasterização (validando pontos gerados, não apenas a saída visual)
- [ ] Extrair um `build.gradle`/`pom.xml` simples para padronizar compilação e execução
- [ ] Unificar os quatro programas em uma única aplicação com um menu gráfico (em vez de quatro `main` separados)
- [ ] Adicionar capturas de tela reais de cada algoritmo em `docs/images/`
- [ ] Permitir configurar cor, espessura e resolução da janela via parâmetros

## Contribuição

Contribuições são bem-vindas:

1. Faça um fork do repositório
2. Crie uma branch para a sua alteração (`git checkout -b minha-feature`)
3. Faça commit das mudanças com uma mensagem descritiva
4. Abra um Pull Request explicando o que foi alterado e por quê

## Licença

Distribuído sob a licença [MIT](LICENSE).
