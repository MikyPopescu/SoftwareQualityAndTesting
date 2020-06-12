# Principii 

**_1. DRY - Don't Repeat Yourself_**
- Aplicabil cand se da **Copy/Paste** la bucati de cod

**_2. KISS - Keep It Simple and Stupid_**
- Metoda multifunctionala

**_3. YAGNI - You Ain't Gonna Need It_**
- Scrierea unor metode care nu sunt necesare
- derivat din KISS

**_4. SOLID_**

  **_4.1. Single Responsability_**
  - O clasa trebuie sa aiba o **singura responsabilitate** 
    
  **_4.2. Open-Close_** 
  - Clasele trebuie sa fie **deschise** pentru **extindere** (derivare) si **inchise** pentru **modificari**
    
  **_4.3. Liskov Substitution_**
  - Obiectele pot fi inlocuite oricand cu o instanta a claselor derivate, fara sa afecteze functionalitatea
  - <=> Design by Contract
    
 **_4.4. Interface Segregation_**
  - Mai **multe interfete specializabile** (,nu o singura interfata mamut)
    
  **_4.5. Dependency inversion_**
  - O clasa trebuie sa **depinda de abstractizari**, niciodata de obiecte concrete
  - **Programare prin interfete**
  - Aplicabilitate: Dependency Injection => cuplarea slaba a serviciilor de clienti
