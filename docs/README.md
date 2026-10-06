# BDD = Behaviour Driven Development = Viselkedésvezérelt fejlesztés

A lényeg, hogy ne azt írjuk le elsősorban, hogyan működik a program belül, hanem azt, hogy mit kell csinálnia a felhasználó szempontjából.

Például ne így gondolkodjunk:

Meghívom a login() metódust, átadom neki a username-et, majd ellenőrzöm a response-t.

Hanem:

Ha a felhasználó helyes adatokkal jelentkezik be, akkor sikeresen be kell lépnie.

Ez már egy viselkedés.

# Given – When – Then

A BDD egyik legismertebb szerkezete:

Given → When → Then

Magyarul:

Adott → Amikor → Akkor

| Kulcsszó  | Jelentés                      |
| --------- | ----------------------------- |
| **Given** | kezdeti állapot / előfeltétel |
| **When**  | végrehajtott művelet          |
| **Then**  | elvárt eredmény               |

Például login:
Given the user is on the login page
When the user enters valid credentials
Then the user should be logged in

Magyarul:

Adott, hogy a felhasználó a bejelentkezési oldalon van

Amikor a felhasználó helyes adatokat ad meg

Akkor a felhasználó sikeresen bejelentkezik

Ez nagyon jól olvasható nem programozók számára is.

Given = állapot
When = cselekvés
Then = eredmény

# Mi az a Gherkin?

A Gherkin egy leíró nyelv, amellyel ezeket a BDD-s forgatókönyveket írjuk.

Tipikus fájl:

login.feature

Például:

Feature: User login

  Scenario: Successful login

    Given the user is on the login page
    When the user enters valid username and password
    Then the user should be logged in successfully

A fontos kulcsszavak:

Feature
Scenario
Given
When
Then
And
But

# Hasznos infók

Az Eclipseben ctrl+D -vel lehet törölni az adott sort. 

# pom.xml

	    <!-- Source: https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
		<dependency>
		    <groupId>io.rest-assured</groupId>
		    <artifactId>rest-assured</artifactId>
		    <version>5.5.6</version>
		    <scope>test</scope>
		</dependency>	

		<!-- Source: https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
		    <groupId>org.testng</groupId>
		    <artifactId>testng</artifactId>
		    <version>7.10.2</version>
		    <scope>test</scope>
		</dependency>

Ha nem tölti le a függőségeket, akkor főmenü Project-> Clean -> Clean

# Test NG telepítése

https://testng.org/-on találod az Eclipse plug-in-t, ami ide vezet:

https://github.com/testng-team/testng-eclipse/

A legfrissebb latest release-t linket másold ki.
https://testng.org/testng-eclipse-update-site/7.11.0

Majd az Eclipse-ben főmenü Help -> Install New Software -> Add 
Name: Test NG
A Location-höz másold be a linket.
Add gombra nyomj.

A jelölőnégyzetet kipipálod, amjd alul Next-re nyomj, Next -> Finish.

Tesztelendő alkalmazás:
https://dummyjson.com/docs/posts#posts-all