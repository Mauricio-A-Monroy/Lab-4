# **Laboratorio 4**
## **Parte I**
1. 
Imagen del fork creado a partir del repositorio original
![image](https://github.com/Mauricio-A-Monroy/Lab-4/assets/99145156/6390b47c-094f-461a-8812-2cdb432d19d6)
https://github.com/andreec2/DependencyInjectionHangman.git

Una vez creado esto, utilizamos el siguiente comando para descargar el repositorio:
``````
mvn clone
``````
![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/c34e491b-7a2d-4605-9fdf-b9aec575ffba)


2. 
Cascarones del modelo presentado
- Clase GameScore

![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/3155d1cb-42bb-4435-aa9d-3e88192f1c4a)




- Clase OriginalScore
  
![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/8c04bac8-f585-45a6-a4b3-f14fd830128a)




  
- Clase BonusScore
  
![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/d4cec449-62c4-4f9d-8521-1ef4fb3f6087)



  
- Clase PowerScore
  
![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/8fba6d67-ae76-423d-8ad4-a620e7e515a1)



3.
Especificación de los métodos calculateScore
- Clase OriginalScore
  
![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/ef8165c8-f4d1-4c89-98a5-1a653305ba17)




  
- Clase BonusScore
  
![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/eca8e1c7-b266-4299-81d3-41e7a1abc954)




  
- Clase PowerScore
  
![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/23dd0dc3-8319-4403-a5da-da41c4289380)



4. 
Commit de los cambios realizados

![image](https://github.com/Mauricio-A-Monroy/Lab-4/assets/111905757/c181d28d-d4ae-46c9-8623-65008a69e688)

5.
Cambio en el archivo pom.xml

![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/ebe01ca3-a65e-4bc8-b6f1-808d187209c7)


6.
Clases de equivalencia y condiciones de frontera

- Clase OriginalScore
  
![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/c6a223a0-3b5d-42fb-854a-1582fe4edba3)


- Clase BonusScore

![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/ad03112b-97eb-473b-80ba-fc30cbb50f75)

- Clase PowerScore

![image](https://github.com/Mauricio-A-Monroy/lab-4/assets/111905757/12ffaf07-04f8-4c36-94af-f9c702ea4f41)

7.
Pruebas de unidad usando JUnit

- Clase OriginalScore
``````
@Test
    public void shouldReturnOneHundredForTheInitialScore() throws GameScoreExceptions{
        int ans = originalScore.calculateScore(0,0);
        assertEquals(100, ans);
    }

    @Test
    public void shouldReturnEightyForTwoIncorrectLetters() throws GameScoreExceptions{
        int ans = originalScore.calculateScore(0,2);
        assertEquals(80, ans);
    }

    @Test
    public void shouldReturnZeroForTenIncorrectLetters() throws GameScoreExceptions{
        int ans = originalScore.calculateScore(0,10);
        assertEquals(0, ans);
    }

    @Test
    public void shouldThrowExceptionForNegativeScore() throws GameScoreExceptions{
        try{
            int ans = originalScore.calculateScore(0,11);
        } catch (GameScoreExceptions e){
            assertEquals(GameScoreExceptions.NEGATIVE_SCORE, e.getMessage());
        };

    }
``````

- Clase BonusScore
``````
    @Test
    public void shouldReturnZeroForTheInitialScore() throws GameScoreExceptions{
        int ans = bonusScore.calculateScore(0,0);
        assertEquals(0, ans);
    }

    @Test
    public void shouldReturnThirtyForThreeCorrectLetters() throws GameScoreExceptions{
        int ans = bonusScore.calculateScore(3,0);
        assertEquals(30, ans);
    }

    @Test
    public void shouldReturnFiveteenForTwoCorrectLettersAndOneIncorrectLatter() throws GameScoreExceptions{
        int ans = bonusScore.calculateScore(2,1);
        assertEquals(15, ans);
    }

    @Test
    public void shouldReturnZeroForOneCorrectLettersAndTwoIncorrectLatter() throws GameScoreExceptions{
        int ans = bonusScore.calculateScore(1,2);
        assertEquals(15, ans);
    }

    @Test
    public void shouldThrowExceptionForNegativeScoreInBonusScore() throws GameScoreExceptions{
        try{
            int ans = bonusScore.calculateScore(0,1);
        } catch (GameScoreExceptions e){
            assertEquals(GameScoreExceptions.NEGATIVE_SCORE, e.getMessage());
        };
    }
``````
- Clase PowerScore
``````
@Test
    public void shouldReturnZeroForTheInitialScoreInPowerScore() throws GameScoreExceptions{
        int ans = powerScore.calculateScore(0,0);
        assertEquals(0, ans);
    }

    @Test
    public void shouldReturnThirtyForTwoCorrectLetters() throws GameScoreExceptions{
        int ans = powerScore.calculateScore(2,0);
        assertEquals(30, ans);
    }

    @Test
    public void shouldReturnTwntytwoForTwoCorrectLettersAndOneIncorrectLatter() throws GameScoreExceptions{
        int ans = powerScore.calculateScore(2,1);
        assertEquals(22, ans);
    }
``````

