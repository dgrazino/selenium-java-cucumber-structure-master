#language: pt
#encoding: utf-8
#@run
Funcionalidade: Pesquisa

  Contexto:
    Dado que acesso o site

  @run
  Cenario: Preencher Formulario
    Quando preencho todo o formulario
    Entao uma janela com agradecimento deve ser exibida
    E devo clicar em close

