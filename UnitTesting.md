- Metoda simpla si rapida de testare a codului sursa de catre programatori

## C.O.R.R.E.C.T.

* Conformance 
  - Pentru valori de intrare corecte ma astept la rezultate corecte
  - Pentru valori de intrare gresite ma astept la rezultate gresite
  - Are sens pentru orice functie
* Ordering
  - Ordinea valorilor influenteaza algoritmul?
  - Are sens doar pe colectii (min, max, sortari, cautari)
* Range
  - Este valoarea intre limitele acceptate (din specificatii)?
  - Are sens la atribuire
* Reference
  - Codul refera componente externe?
  - Are sens unde apare shallow copy
* Existence
  - Valoarea exista? Pentru 0, null => Fortez o exceptie
* Cardinality
  - Setul contine suficiente valori? (0-1-n)
  - Are sens pe siruri de valori
* Time
  - Se intampla totul in ordine?
  - Are sens pentru criteriile de performanta (specificatii)
----

## RIGHT B.I.C.E.P.
* Right
  - Pentru valori de intrare corecte ma astept la rezultate corecte 
* Boundary
  - Ce se intampla la capetele intervalului (specificatii)
* Inverse Relation
  - Verifica opusul situatiei (x/y=z <=> z*y=x)
* Cross check
  - Verific rezultatele si prin alte metode (verific o quick sort prin bubble sort)
* Error Condition
  - Fortarea erorilor in metoda (valori inafara lui Boundary)
* Performance
  - Performanta in resurse folosite si timp de executie
