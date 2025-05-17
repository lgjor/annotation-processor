# Instruções de debug do annotation processor

  1. rode o comando a seguir `./gradlew --no-daemon -Dorg.gradle.debug=true clean build`
  2. No Intellij acesse o menu Run > Attach to Process...
  3. Uma janela com processos disponíveis irá aparecer para seleção, escolha o processo do gradle e o debug irá iniciar
