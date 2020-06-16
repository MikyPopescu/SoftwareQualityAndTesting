### 1. Adapter :electric_plug:
 _-Problema:_ 
  
   Trebuie sa adaptam clasa existenta la altceva.
  

 _-Diagrama UML:_
 
 ![img](https://github.com/MikyPopescu/SoftwareQualityAndTesting/blob/master/Documentation/UML_Diagrams/5_Adapter.png)

_-Componente:_


_-Scenarii:_
* ACME Inc. dorește să cumpere un **nou framework** pentru serviciile din back-end. 
Interfața pentru aceste servicii gestionează datele prin intermediul obiectelor de tip ACME, 
iar noul framework procesează datele prin intermediul obiectelor de tip MICRO. Programatorii
companiei trebuie sa găsească o soluție de a integra cele doua framework-uri fără a le modifica.
* Adaptor de priza
* Sistem de alerte de un anumit tip text si vreau un alt sistem cu alt tip de alerte tot text

_-Avantaje:_
* Clasele existente nu se modifica

_-Dezavantaje:_
* Adaptorul de clase poate face derivare multipla
  --- 
  
  ### 2. Decorator  :boy: -> :santa:
 _-Problema:_ 
  
   **Decoarea** sau extinderea statica sau la **run-time** a functionalitatii sau starii unor obiecte
  

 _-Diagrama UML:_
 
 ![img](https://github.com/MikyPopescu/SoftwareQualityAndTesting/blob/master/Documentation/UML_Diagrams/6_Decorator.png)

_-Componente:_


_-Scenarii:_
* Copil in costum de batman => devine batman

_-Avantaje:_
* 

_-Dezavantaje:_
* 

  --- 
  
 ### 3. Facade :iphone:
 _-Problema:_ 
  
   Oferirea unei interfete simplificate pentru o clasa foarte complexa.
  

 _-Diagrama UML:_
 
 ![img](https://github.com/MikyPopescu/SoftwareQualityAndTesting/blob/master/Documentation/UML_Diagrams/7_Facade.png)

_-Componente:_


_-Scenarii:_
* ACME Inc. dezvoltă o soluție software pentru managementul unei locuințe inteligente.
Includerea în framework a tuturor componentelor controlabile dintr-o astfel de locuință 
(ferestre, încălzire, alarma, etc) a generat un **număr mare de clase**. Departamentul care dezvolta **interfața** Web a 
soluției **oferă un set minim de funcții** ce pot fi controlate de la distanta. Deși funcționalitatea este simpla, 
numărul mare de clase ce se instanțiazăși a metodelor apelate îngreunează dezvoltarea si testarea.
In acest sens, o **interfață mai simpla** ar ajuta acest departament.
* Telecomanda pentru copii

_-Avantaje:_
* Ascunde complexitatea problemei reale
* Framework-ul nu se rescrie
* Least Knowledge

_-Dezavantaje:_
* 

  --- 
  
 ### 4. Proxy  :exclamation:
 _-Problema:_ 
  
 Se doreste adaugarea unui filtru suplimentar/ unei verificari aditionale pentru .....
 Se sugereaza sa vin cu ceva in plus, aplicatia ruleaza, se adauga o componenta noua fara sa afecteze aplicatia
 Nu face treaba unui obiect, ci il completeaza
  

 _-Diagrama UML:_
 
 ![img](https://github.com/MikyPopescu/SoftwareQualityAndTesting/blob/master/Documentation/UML_Diagrams/10_Proxy.png)

_-Componente:_


_-Scenarii:_
* Secretara
* Firewall
* Filtru aditional de verificare la Login


_-Avantaje:_


_-Dezavantaje:_
* 

  --- 
  
   ### 5. Composite   :deciduous_tree:
 _-Problema:_ 
  
Relatii ierarhice/ structuri arborescente/ organigrama/ Meniuri (categorii subcategorii)
  

 _-Diagrama UML:_
 
 ![img](https://github.com/MikyPopescu/SoftwareQualityAndTesting/blob/master/Documentation/UML_Diagrams/8_Composite.png)

_-Componente:_


_-Scenarii:_
* ACME Inc. dezvoltă o soluție software pentru managementul resurselor umane dintr-o companie.
Soluția trebuie să ofere un mecanism unitar care să centralizeze angajații companiei și care să țină cont de:
•relațiile ierarhice
•apartenența angajaților la un departament
•rolurile diferite ale angajaților
•setul comun de funcții pe care un angajat le poate îndeplini


_-Avantaje:_


_-Dezavantaje:_
* 

  --- 
  
  ### 6. Flyweight   :leaves:
 _-Problema:_ 
  
Relatii ierarhice/ structuri arborescente/ organigrama/ Meniuri (categorii subcategorii)
  

 _-Diagrama UML:_
 
 ![img](https://github.com/MikyPopescu/SoftwareQualityAndTesting/blob/master/Documentation/UML_Diagrams/9_Flyweight.png)

_-Componente:_


_-Scenarii:_



_-Avantaje:_


_-Dezavantaje:_
* 
