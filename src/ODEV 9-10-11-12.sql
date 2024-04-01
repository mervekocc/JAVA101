-- ODEV 9
--Şehir tablosu ile ülke tablosunda bulunan şehir (şehir) ve ülke (ülke) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

SELECT country, city FROM city
INNER JOIN country 
ON country.country_id = city.city_id; 
--Müşteri tablosu ile ödeme tablosunda bulunan ödeme_id ile müşteri tablosundaki ad ve soyad isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

SELECT customer.first_name, customer.last_name, payment.payment_id
FROM customer
INNER JOIN payment
ON customer.customer_id = payment.customer_id;
--Müşteri tablosu ile kiralama tablosunda bulunan rent_id ile müşteri tablosundaki ad ve soyad isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

SELECT customer.first_name, customer.last_name, rental.rental_id
FROM customer
INNER JOIN rental
ON customer.customer_id = rental.customer_id;

--ODEV 10
--Şehir tablosu ile ülke tablosunda bulunan şehir (şehir) ve ülke (ülke) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.

SELECT country, city FROM city
LEFT JOIN country 
ON country.country_id = city.country_id;

--Müşteri tablosu ile ödeme tablosunda bulunan ödeme_id ile müşteri tablosundaki ad ve soyad isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.

SELECT payment_id, first_name, last_name FROM payment
RIGHT JOIN customer 
ON payment.customer_id = customer.customer_id;

--Müşteri tablosu ile kiralama tablosunda bulunan rent_id ile müşteri tablosundaki ad ve soyad isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.

SELECT customer.first_name, customer.last_name, rental.rental_id
FROM customer
FULL JOIN rental 
ON customer.customer_id = rental.customer_id;

--ODEV 11
--Aktör ve müşteri tablolarında bulunan ad_isim sütunları için tüm verileri yapalım.

(SELECT first_name FROM customer)
UNION
(SELECT first_name FROM actor);
--Aktör ve müşteri tablolarında bulunan ad_isim sütunları için ulaşmaken verileri sıralayalım.

SELECT first_name FROM customer
INTERSECT
SELECT first_name FROM actor
--Aktör ve müşteri tablolarında bulunan ad_isim sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.

SELECT first_name FROM customer
EXCEPT
SELECT first_name FROM actor
--İlk 3 sorguyu tekrarlayan veriler için normaldir.

(SELECT first_name FROM customer)
UNION ALL
(SELECT first_name FROM actor);

SELECT first_name FROM customer
INTERSECT ALL
SELECT first_name FROM actor

SELECT first_name FROM customer
EXCEPT ALL
SELECT first_name FROM actor

--ODEV 12
--Film tablosunda film uzunluğu sütununda gösterilir. Uzunluğu ortalama uzunlukta film var mı?

SELECT length, 
(SELECT MAX(length) FROM film),
((SELECT MAX(length) FROM film)-length) 
AS fark
FROM film;
--Film tablosunda en yüksek kiralama oranına sahip kaç tane film vardır?

SELECT COUNT(rental_rate), 
(SELECT MAX(rental_rate)FROM film) 
FROM film
WHERE rental_rate >=(SELECT MAX(rental_rate)FROM film)
--Film tablosunda en düşük kiralama oranı ve en düşük yenileme maliyeti değerlerine sahip filmleri sıralayınız.

SELECT title, rental_rate, replacement_cost FROM film
WHERE rental_rate = ALL 
(
	SELECT MIN(rental_rate) FROM film
)
AND replacement_cost = ALL 
(
	SELECT MIN(replacement_cost) FROM film
); 
--Ödeme tablosunda en fazla sayıda alışveriş yapan müşterileri(müşterileri) sıralayınız.

SELECT payment.customer_id, customer.first_name, customer.last_name, count(payment.customer_id)  
FROM payment
INNER JOIN customer
ON customer.customer_id = payment.customer_id
GROUP BY payment.customer_id, customer.first_name, customer.last_name
ORDER BY COUNT(payment.customer_id) DESC;