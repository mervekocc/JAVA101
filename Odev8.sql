--Ödev 8
--Test veritabanınızda çalışanın kayıtlı sütun bilgilerini id(INTEGER), isim VARCHAR(50), doğum günü DATE, e-posta VARCHAR(100) olan bir tablo oluşturalım.

  CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthday DATE DEFAULT CURRENT_DATE,
    email VARCHAR(100);

--Oluşturduğumuz çalışan tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

insert into employee (name, birthday, email) values ('Maurits', '1994-02-27', 'mhartwell0@cdc.gov');
insert into employee (name, birthday, email) values ('Taite', '1963-06-04', 'tpipkin1@ebay.com');
...
insert into employee (name, birthday, email) values ('Catlin', null, 'cwythill1d@samsung.com');

--Sütunların ona göre diğer sütunlarını güncelleyecek 5 adet GÜNCELLEME işlemi yapılabilir.

UPDATE employee
SET name = 'updated',
    birthday = '1555-05-15',
    email = 'updated@email.com
WHERE id = 1;

UPDATE employee
SET name = 'updated1',
    birthday = '1555-05-15',
    email = 'updated1@email.com
WHERE name LIKE '%a';

UPDATE employee
SET name = 'updated2',
    birthday = '1555-05-15',
    email = 'updated2@email.com
WHERE email IS NULL;

UPDATE employee
SET name = 'updated3',
    birthday = '1555-05-15',
    email = 'updated3@email.com
WHERE id > 30;

UPDATE employee
SET name = 'updated4',
    birthday = '1555-05-15',
    email = 'updated4@email.com
WHERE name ILIKE '%__a%' AND email IS NOT NULL;

--Sütunların her birine göre ilgili veri tabanında 5 adet SİLME işlemi yapılabilir.

DELETE FROM employee
WHERE id = 1;

DELETE FROM employee
WHERE name LIKE '%a';

DELETE FROM employee
WHERE email IS NULL;

DELETE FROM employee
WHERE id > 30;

DELETE FROM employee
WHERE name ILIKE '%__a%' AND email IS NOT NULL;