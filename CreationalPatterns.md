### 1. Singleton  :one:

  _-Problema:_ 
  
  Se doreste **crearea unei singure instante** pentru o clasa prin care sa fie gestionata o resursa intr-un mod **centralizat**

 _-Diagrama UML:_
 
 ![img](https://github.com/MikyPopescu/SoftwareQualityAndTesting/blob/master/Documentation/UML_Diagrams/1_Singleton.png)

_-Componente:_
 * O clasa responsabila de **crearea unui singur obiect** `Singleton`
 * Constructor **privat** `private Singleton()`
 * Atribut static, privat, de tipul clasei care reprezinta instanta unica `private static Singleton instance`
 * Metoda publica ce da accces la instanta unica `Singleton getInstance()`
 * Instanta unica este creata la primul apel al metodei

_-Scenarii:_
 * Conexiune unica la baza de date
 * Gestiune unica fisiere
 * Gestiune unica conexiune la retea
 * Gestiune unica preferinte pe platforma Android (SharedPreferences)
 * Gestiune centralizata a accesului la anumite resurse utilizate de solutie
 * Gestiune unica a unor obiecte costisitoare

_-Avantaje:_
 * **Gestiune centralizata** a unei resurse printr-o **instanta unica**
 * Controlul strict al **instantierii** unei clase - o **singura data**
 * **NU** permite duplicarea instantelor
 * Usor de implementat
 * **Lazy instantiation** - obiectul este creat atunci cand este nevoie de el

_-Dezavantaje:_
  * Probleme de sincronizare
  * Poate afecta performanta
  
  --- 
  
### 2. Builder  :muscle:
 _-Problema:_ 
  
 

 _-Diagrama UML:_
 


_-Componente:_

_-Scenarii:_
 

_-Avantaje:_


_-Dezavantaje:_
 
