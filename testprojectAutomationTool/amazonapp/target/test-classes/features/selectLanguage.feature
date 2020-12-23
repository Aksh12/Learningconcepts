Feature: Select Your Language

  Scenario Outline: AUT text should be displayed in the selected language
    Given user launch the Amazon app for first time
    When user select "<enterLanguage>" language from the provided list
    Then AUT should be displayed in the selected "<displayedLanguage>"

    Examples: 
      | enterLanguage |displayedLanguage|
      | English       |Sign in to your account|
      | Hindi         |अपने अकाउंट में साइन इन करें|
