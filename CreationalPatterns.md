### 1. Singleton  :one:

  _-Problema:_ 
  
  Se doreste **crearea unei singure instante** pentru o clasa prin care sa fie gestionata o resursa intr-un mod **centralizat**.
  
  [Mai multe explicatii](https://www.youtube.com/watch?v=hUE_j6q0LTQ)

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
  
   Se doreste **crearea unor obiecte complexe**( = cu multe atribute) printr-un mecanism independent (flexibil) de procesul de realizare al obiectelor. 
  
   
  [Mai multe explicatii](https://www.youtube.com/watch?v=KbIdk5BRn0w)

 _-Diagrama UML:_
 
 ![img](https://github.com/MikyPopescu/SoftwareQualityAndTesting/blob/master/Documentation/UML_Diagrams/2_Builder.png)

_-Componente:_


_-Scenarii:_
* Crearea in mod **structurat, incremental** de obiecte complexe
* Crearea unui produs cu foarte **multe campuri**
 

_-Avantaje:_


_-Dezavantaje:_

  --- 
  
### 3. Factory  :factory:
 _-Problema:_ 
  Se doreste implementarea unui mecanism centralizat prin care **crearea** obiectelor este **transparenta** pentru client 
  
 ### 3.1 Simple Factory

 _-Diagrama UML:_
 
  ![img](https://github.com/MikyPopescu/SoftwareQualityAndTesting/blob/master/Documentation/UML_Diagrams/3_1_Simple_Factory.png)


_-Componente:_

_-Scenarii:_
 * Generator de documente 
 * Generator de caractere intr-un joc (caracter negativ, caracter pozitiv)

_-Avantaje:_


_-Dezavantaje:_

  --- 

### 4. Prototype  :dancers:
 _-Problema:_ 
  
 Crearea obiectelor este costisitoare, ia mult timp

 _-Diagrama UML:_
 
 ![img](https://github.com/MikyPopescu/SoftwareQualityAndTesting/blob/master/Documentation/UML_Diagrams/4_Prototype.png)


_-Componente:_

_-Scenarii:_
 * ACME Inc. dorește să dezvolte un joc 3D pentru dispozitive Android utilizând un enginepropriu. Cele 2 modele 3D pentru **caractere sunt destul de complexe și generarea lor are impact asupra timpului de procesare și implicit asupra duratei de viață a acumulatorului**. Același model este utilizat de mai multe ori pentru a popula o scena cu personaje. Trebuie găsită o soluție eficientă prin care scenele să fie încărcate rapid.

_-Avantaje:_
* Crearea rapida de obiecte prin clonare

_-Dezavantaje:_
* Atentie la obiecte care partajeaza aceleasi resurse (deep copy)
 
