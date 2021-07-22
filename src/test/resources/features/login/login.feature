Feature: Realizar el registro de reuniones en StarSharp
  Como un usuario de la empresa
  Quiero ingresar a la pagina https://serenity.is/demo/
  Para realizar el agendamiento de reuniones

  @LoginSuccessful
  Scenario: Realizar Login en la pagina
    Given que el usuario se registra
    When realiza el registro unidad de negocio
    Then el ingresa una nueva reunion

