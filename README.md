# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastruktorer.
Oppgaven er levert av følgende studenter:
* angje7063, angje7063@oslomet.no

## Arbeidsfordeling
Jobbet alene 

## Oppgavebeskrivelser

### Oppgave 1
I oppgave 1 gikk vi frem ved å først lage en sjekk for en tom liste.
Deretter en løkke som sammenligner posisjonen til i mot den neste posisjonen. 
Om if løkken kjører kaller den på hjelpe metoden change som bytter de to verdiene.
Henter siste verdi med a.length -1 for å være innenfor scopet, siden lengden regner absolutt verdien fra 0.

a) Det blir gjort n-1 sammenligninger, der hvert tall sammenlignes med det neste, utenom det første.

b) Når listen er sortert eller tilnærmet sortert kronologisk blir det færrest bytter. 

c) Når listen med tall er usortert eller synkende blir det flest bytter. 

d) For hvert par som sjekkes er sannsynligheten 1/2 for at de står i riktig posisjon, og man går igjennom arrayet n-1 ganger
som medfører (1/2)*(n-1) = (n-1)/2. 

### Oppgave 2
I oppgave 2 gikk vi frem ved å først gjøre if sjekken for å sjekke om tabellen er tom. En tellevariabel holder 
styr på antall unike siffer. 
Deretter laget jeg en løkke som sammenlignet det nåværende siffer med det neste sifferet
for å sjekke om tabellen er sortert. Dette må gjøres for hvert siffer siden, listen kan være
sortert i starten, men ikke lengre uti. Siden listen kan ha like siffer er jeg nødt til å kjøre en 
if statement til for å sjekke om det neste sifferet er større og dermed et nytt siffer. Dette legges til i 
count som deretter returneres. 

### Oppgave 3
Først gjør jeg sjekken om listen er tom. Oppretter deretter en telle variabel som teller unike verdier og
som starter på 1 siden den første verdien er unik. Så om en liste er to like verdier, vil den hoppe ut av loopene med en gang, 
men count gir riktig verdi. Jeg bruker en boolean til å holde styr på om verdiene har vært sett før. 
Hver enkelt verdi sammenlignes så igjennom en dobbel forløkke for å sjekke om den har vært sett før.
Verdien hopper utav løkken enten om den er unik og ikke har vært sett før, eller om den har vært sett før. 
Så nullstilles reoccurring til false og sammenligningen kjøres igjen. Så returneres count. 

### Oppgave 4
Først prøvde jeg med bubblesort, men det ble for sakte. For å være effektiv endte jeg opp med å bruke quicksort. 
Først skrev jeg de ulike Exceptionene. Deretter lager metoden partition som velger sifferet lengst til høyre
i intervallet som er valgt, (opptil men ikke, derav -1) og bruker det som pivot. 
Deretter sammenligner venstre side mot pivot og sorterer
Deretter kjøres sorter på venstre side av pivot helt til if statement til-fra <=1, da er det sortert.
Så kjøres det resterende intervallet på samme måte til samme if statement er nådd og rekursjonen stopper. 


### Oppgave 5
Her lagde jeg en variabel for posisjon til oddetall. En for løkke med et if statement  sjekker for oddetall, 
om det fantes et så byttes det slik at det blir en liste med tall med oddetall til venstre og partall til høyre. Deretter
Kjørte jeg sorter algoritmen fra oppgave 4 med variabelen som til verdi for oddetallene og fra verdi for partallene. 


### Oppgave 6
Rotate er en variabel for hvor mange posisjoner som skal roteres. Deretter laget jeg et if statement som sjekker om 
lengden er mindre enn 2, isåfall kan den ikke roteres. 
Et nytt array ble opprettet som er kopi av a med en metode som lagrer første posisjonen gitt av antall roteringer
For løkken flytter deretter hver posisjon en til høyre. For deretter å hente ut nullte posisjon fra 
hjelpe arrayet b. 

### Oppgave 8
a)
Her sjekket jeg først om begge listene var tomme. Den første while løkken legger
sammen annenhvert element fra listene og konkantinerer til stringen u. Når den ene listen er tom 
vil den neste løkken ta over. Her hopper den over den løkken som har en liste som er tom og går videre og legger til
resten av elementene i den andre. 

b)
Opprettet to variabler, en resultat og lengden på den lengste listen som blir det taket for løkken jobber mot.
En dobbel forløkke går deretter igjennom element for element og sammenligner nåværende i med lengden på den nøstede listen .
For deretter å konkantinerer til result som returneres til slutt. 

