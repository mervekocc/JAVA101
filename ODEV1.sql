ODEV 1
  --Film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.

SELECT title,description FROM film;

--Film tablosunda bulunan tüm sütunlardaki verileri film uzunluğu (length) 60 dan büyük VE 75 ten küçük olma koşullarıyla sıralayınız.

SELECT title,length FROM film
WHERE length >60 AND length <75;

--Film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99 VE replacement_cost 12.99 VEYA 28.99 olma koşullarıyla sıralayınız.

SELECT * FROM film
WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99) ;

--Customer tablosunda bulunan first_name sütunundaki değeri 'Mary' olan müşterinin last_name sütunundaki değeri nedir?

SELECT first_name, last_name FROM customer
WHERE first_name = 'Mary' ;  

--Film tablosundaki uzunluğu(length) 50 ten büyük OLMAYIP aynı zamanda rental_rate değeri 2.99 veya 4.99 OLMAYAN verileri sıralayınız.

SELECT * FROM film
WHERE length < 50 AND NOT (rental_rate = 2.99 OR rental_rate = 4.99) ;

Ödev 2
--Film tablosunda bulunan tüm sütunlardaki veriler yerine koyma maliyet değeri 12,99 dan büyük eşit ve 16,99 küçük olma kaydıyla sıralayınız

  SELECT * FROM film
  WHERE replacement_cost BETWEEN 12.99 AND 16.99;
--Aktör tablosunda bulunan ad_ad ve soyad sütunlarındaki veriler ad_adı 'Penelope' veya 'Nick' veya 'Ed' değerlerinin bulunmasıyla birlikte sıralayınız.

  SELECT first_name, last_name FROM actor
  WHERE first_name IN ('Penelope', 'Nick', 'Ed');
--Film tablosunda bulunan tüm sütunlardaki veriler kiralama oranı 0,99, 2,99, 4,99 VE değiştirme maliyeti 12,99, 15,99, 28,99 olma koşullarıyla sıralayınız.

  SELECT * FROM film
  WHERE rental_rate IN (0.99, 2.99, 4.99) AND replacement_cost IN (12.99, 15.99, 28.99);

Ödev 3
--Ülke tablosunda bulunan ülke sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.

  SELECT * FROM country
  WHERE country LIKE 'A%a';
--Ülke tablosunda bulunan ülke sütunundaki ülke isimlerinden en az 6 karakterden oluşur ve sonuç 'n' karakteri ile sonlananları sıralayınız.

  SELECT * FROM country
  WHERE country LIKE '%_____n';
--Film tablosunda bulunan başlık sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmemenizin 'T' karakterini içeren film isimlerini sıralayınız.

  SELECT * FROM film
  WHERE title ILIKE '%t%t%t%t%';
--Film tablosunda bulunan tüm sütunlardaki verilerden başlık 'C' karakteri ile başlayan ve uzunluk (uzunluk) 90 dan büyük olan ve kiralama_oranı 2,99 olan verileri sıralayınız.

  SELECT * FROM film
  WHERE title LIKE 'C%' AND length > 90 AND rental_rate = 2.99;

Ödev 4
--Film tablosunda bulunan değiştirme_maliyet sütununda bulunan birbirinden farklı değerleri sıralayınız.

  SELECT DISTINCT replacement_cost FROM film;
--Film tablosunda bulunan değiştirme_maliyet sütununda birbirinden farklı kaç tane veri vardır?

  SELECT COUNT(DISTINCT replacement_cost) FROM film;
--Film tablosunda bulunan film isimlerinde (başlık) kaç tanesini T karakteri ile başlar ve aynı zamanda derecelendirme 'G'ye göre değişir?

  SELECT COUNT(*) FROM film
  WHERE title LIKE 'T%' AND rating = 'G';
--Ülke tablosunda bulunan isimlerden (ülke) kaç parçadan 5 karakterden oluşur?

  SELECT COUNT(*) FROM country
  WHERE country LIKE '_____';
--Şehir tablosundaki şehir adlarının kaç tanesi 'R' veya r karakteri ile bitiyor?

  SELECT COUNT(*) from city
  WHERE city ILIKE '%R';
