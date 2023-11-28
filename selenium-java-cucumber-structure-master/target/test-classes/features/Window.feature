#language: pt
#encoding: utf-8
#@run
Funcionalidade: Nova Janela

  Contexto:
    Dado que acesso o site

  @run
  Cenario: Validar Nova Janela
    Quando clico no botão nova janela
    Entao valido que uma nova janela foi aberta


