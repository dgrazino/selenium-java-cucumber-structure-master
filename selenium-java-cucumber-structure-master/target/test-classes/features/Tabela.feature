#language: pt
#encoding: utf-8
#@run
Funcionalidade: Pesquisa

  Contexto:
    Dado que acesso o site

  @run
   Esquema do Cenário: Preencher Formulario com 12 registros
    Quando insiro todos os registros na tabela: "<firstname>", "<lastname>", "<email>", "<idade>", "<salario>", "<departamento>"
    Então Valido o numero de registros da minha tabela



    Exemplos:
      | firstname | lastname    | email                         | idade   | salario   | departamento    |
      | 'John'    | 'Doe'       | 'john.doe@example.com'        | '25'    | '50000'   | 'IT'            |
      | 'Jane'    | 'Smith'     | 'jane.smith@example.com'      | '30'    | '60000'   | Sal'es          |
      | 'Bob'     | 'Johnson'   | 'bob.johnson@example.com'     | '28'    | '55000'   | 'HR'            |
      | 'Alice'   | 'Williams'  | 'alice.williams@example.com'  | '35'    | '70000'   | 'Finance'       |
      | 'Greg'    | 'Doe'       | 'john.doe@example.com'        | '25'    | '50000'   | 'IT'            |
      | 'Mary'    | 'Smith'     | 'jane.smith@example.com'      | '30'    | '60000'   | 'Sales'         |
      | 'Jane'    | 'Johnson'   | 'bob.johnson@example.com'     | '28'    | '55000'   | 'HR'            |
      | 'Petter'  | 'Williams'  | 'alice.williams@example.com'  | '35'    | '70000'   | 'Finance'       |
      | 'Dominiq' | 'Doe'       | 'john.doe@example.com'        | '25'    | '50000'   | 'IT'            |
      | 'Solemar' | 'Smith'     | 'jane.smith@example.com'      | '30'    | '60000'   | 'Sales'         |
      | 'Aroldo'  | 'Johnson'   | 'bob.johnson@example.com'     | '28'    | '55000'   | 'HR'            |
      | 'Pamela'  | 'Williams'  | 'alice.williams@example.com'  | '35'    | '70000'   | 'Finance'       |
