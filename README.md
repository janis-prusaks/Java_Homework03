# Java_Homework03
Riga Coding School mājasdarbs. Pēc nodošanas nav labots,

šeit pasniedzēja komentārs par SortArray:
"Pa lielam viss ok, tikai pietrūkst pārbaudes uz lietotāja ievadīto skaitli. Ir iespējams ievadīt skaitli, kas nav robežās no 20 līdz 40."

šeit pasniedzēja komentārs par SortArray2D:
"int randomIntArr = rand.nextInt(40) + 10;
Šis uzģenerē skaitli robežās no 10 līdz 49, jo rand.NextInt(40) ģenerē līdz 40 neieskaitot, tātad līdz 39.
Nav nepieciešams veidot vēl vienu Random kalses objektu. Pietiek ar vienu, kuru varam izmantot atkārtoti, lai ģenerētu skaitļus.
Atsaucoties uz:
Random rand...
Random randInt...
randInt.nextInt(899) + 100;
ģenerē skaitli robežās no 100 līdz 998
Efektīvāk būtu masīva rindu vidējās vērtības kaut kur pieglabāt (kādā jaunā masīvā), jo šobrīd algoritms vietā, kur ir
while (avrgValueOfArray(array[r]) > avrgValueOfArray(array[r+1]))...
katrā iterācijā veic rindas vidējās vērtības aprēķinu... līdz ar to sanāk, ka programma vienai reizei šo vērtību rēķina vairākas reizes (liekas darbības)"
