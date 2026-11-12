# Sistema financeiro reengenheirado

Projeto do Grupo 5 de Dinâmica de Evolução de Software, da Biopark Educação. O aplicativo Java 21 calcula valores de cobrança por tipo de atendimento. O código-fonte foi importado do [repositório da reengenharia do grupo](https://github.com/WillianQuincozes/reengenharia-software-grupo-5/tree/2548f18e64fe7afa66021a769993188c1aeb35f6).

## Executar localmente

Com Java 21 e Maven instalados:

```
mvn --batch-mode --no-transfer-progress verify
java -jar target/sistema-financeiro.jar
```

O programa de linha de comando executa exemplos de cobrança. Os testes de regressão cobrem os descontos, o acréscimo de convênio e o limite do desconto para atendimento particular.

## Esteira de lançamento

O workflow começa no push de uma tag de versão, como `v1.0.0`. O SonarQube Cloud analisa o código compilado, importa a cobertura JaCoCo e aplica o Quality Gate do Grupo 5. O Trivy verifica as dependências e depois verifica a imagem candidata. Um achado de severidade alta ou crítica bloqueia a publicação. A última etapa publica no Docker Hub a mesma imagem aprovada pelo Trivy.

- [Execuções no GitHub Actions](https://github.com/MickaelBernardino/sistema-reengenheirado/actions)
- [Análise no SonarQube Cloud](https://sonarcloud.io/project/overview?id=MickaelBernardino_sistema-reengenheirado)
- [Tags no Docker Hub](https://hub.docker.com/r/mickaelbernardinofernandes/sistema-reengenheirado/tags)
