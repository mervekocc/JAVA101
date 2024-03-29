--Ödev 8
--Test veritabanınızda çalışanın kayıtlı sütun bilgilerini id(INTEGER), isim VARCHAR(50), doğum günü DATE, e-posta VARCHAR(100) olan bir tablo oluşturalım.

  CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthday DATE DEFAULT CURRENT_DATE,
    email VARCHAR(100);

--Oluşturduğumuz çalışan tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

insert into employee (name, birthday, email) values ('Hastie', '1998/03/31', 'htoretta0@jigsy.com');
insert into employee (name, birthday, email) values ('Trescha', '1969/09/30', 'ttheml1@clickbank.net');
insert into employee (name, birthday, email) values ('Fayth', '1970/07/25', 'fbrayson2@topsy.com');
insert into employee (name, birthday, email) values ('Karilynn', '1998/09/06', 'ksawley3@smugmug.com');
insert into employee (name, birthday, email) values ('Coral', '2015/05/23', 'cmccollum4@over-blog.com');
insert into employee (name, birthday, email) values ('Gareth', '1997/08/06', 'gstorrar5@gov.uk');
insert into employee (name, birthday, email) values ('Anastassia', '1965/06/27', 'aroller6@wikipedia.org');
insert into employee (name, birthday, email) values ('Glynn', '1999/03/06', 'gjoiris7@cdc.gov');
insert into employee (name, birthday, email) values ('Che', '1977/01/08', 'cwillcocks8@blogtalkradio.com');
insert into employee (name, birthday, email) values ('Shermy', '1973/06/09', 'sbalfe9@people.com.cn');
insert into employee (name, birthday, email) values ('Thebault', '2016/02/28', 'tgrigorkina@ftc.gov');
insert into employee (name, birthday, email) values ('Adelind', '1991/01/22', 'aahreniusb@wired.com');
insert into employee (name, birthday, email) values ('Anthony', '2022/09/03', 'apovelec@whitehouse.gov');
insert into employee (name, birthday, email) values ('Katrinka', '1961/06/13', 'kdunniomd@g.co');
insert into employee (name, birthday, email) values ('Rory', '1999/08/26', 'rlutene@about.me');
insert into employee (name, birthday, email) values ('Stephannie', '1973/12/26', 'sgonzalezf@yandex.ru');
insert into employee (name, birthday, email) values ('Inigo', '1989/02/23', 'iparnallg@webeden.co.uk');
insert into employee (name, birthday, email) values ('Reagan', '1996/06/21', 'rwaslingh@dagondesign.com');
insert into employee (name, birthday, email) values ('Dreddy', '1983/04/16', 'dmarsyi@purevolume.com');
insert into employee (name, birthday, email) values ('Jeremy', '1974/04/21', 'jgroartyj@tamu.edu');
insert into employee (name, birthday, email) values ('Ula', '1967/10/07', 'ucastillouk@youku.com');
insert into employee (name, birthday, email) values ('Berny', '1989/04/17', 'bmcenteggartl@so-net.ne.jp');
insert into employee (name, birthday, email) values ('Linette', '1964/03/07', 'llightollerm@virginia.edu');
insert into employee (name, birthday, email) values ('Donetta', '2006/06/15', 'dsherviln@ezinearticles.com');
insert into employee (name, birthday, email) values ('Fredek', '1971/01/14', 'ffassbendero@newsvine.com');
insert into employee (name, birthday, email) values ('Steffane', '2009/08/22', 'scowardp@google.it');
insert into employee (name, birthday, email) values ('Roxane', '1970/06/26', 'rwykesq@indiegogo.com');
insert into employee (name, birthday, email) values ('Karly', '1970/09/10', 'khowatr@barnesandnoble.com');
insert into employee (name, birthday, email) values ('Inness', '1966/06/20', 'iforlongs@examiner.com');
insert into employee (name, birthday, email) values ('Mindy', '1990/01/01', 'mveregant@drupal.org');
insert into employee (name, birthday, email) values ('Susanne', '2014/11/12', 'smcamishu@delicious.com');
insert into employee (name, birthday, email) values ('Ardelis', '1981/01/05', 'asaldlerv@cbc.ca');
insert into employee (name, birthday, email) values ('Henryetta', '1975/06/16', 'hfigliovanniw@deliciousdays.com');
insert into employee (name, birthday, email) values ('Kristine', '1967/11/27', 'keatockx@huffingtonpost.com');
insert into employee (name, birthday, email) values ('Rik', '2023/12/02', 'rbrunelliy@sourceforge.net');
insert into employee (name, birthday, email) values ('Ariella', '1976/07/24', 'agratrixz@tripadvisor.com');
insert into employee (name, birthday, email) values ('Malia', '2019/03/08', 'mshrawley10@wired.com');
insert into employee (name, birthday, email) values ('Analise', '2015/06/02', 'alawes11@nifty.com');
insert into employee (name, birthday, email) values ('Reuven', '1974/05/26', 'rmorais12@microsoft.com');
insert into employee (name, birthday, email) values ('Adrianna', '2023/11/24', 'aeveque13@newyorker.com');
insert into employee (name, birthday, email) values ('Lilla', '2007/03/09', 'lsutheran14@intel.com');
insert into employee (name, birthday, email) values ('Charlot', '2023/10/13', 'ctreweke15@princeton.edu');
insert into employee (name, birthday, email) values ('Dodie', '1994/03/01', 'dheinsh16@seattletimes.com');
insert into employee (name, birthday, email) values ('Anderea', '1962/05/16', 'aprangley17@people.com.cn');
insert into employee (name, birthday, email) values ('Corliss', '1986/06/26', 'cjenks18@reddit.com');
insert into employee (name, birthday, email) values ('Neil', '1977/02/22', 'nmoughton19@cmu.edu');
insert into employee (name, birthday, email) values ('Sibella', '1986/03/08', 'sbraferton1a@apache.org');
insert into employee (name, birthday, email) values ('Katleen', '1994/03/07', 'krielly1b@twitter.com');
insert into employee (name, birthday, email) values ('Yolanthe', '1987/05/03', 'ypratten1c@desdev.cn');
insert into employee (name, birthday, email) values ('Susann', '2005/04/05', 'sgodsell1d@vinaora.com');
insert into employee (name, birthday, email) values ('Scott', '2002/11/22', 'sdaulby1e@gizmodo.com');
insert into employee (name, birthday, email) values ('Standford', '1964/12/23', 'smuge1f@shareasale.com');
insert into employee (name, birthday, email) values ('Brittney', '1975/09/14', 'bkittless1g@discovery.com');
insert into employee (name, birthday, email) values ('Flossi', '2004/05/24', 'fjelliman1h@dailymail.co.uk');
insert into employee (name, birthday, email) values ('Gearard', '2005/04/21', 'gmorgen1i@quantcast.com');
insert into employee (name, birthday, email) values ('Rab', '1994/06/07', 'rhouseago1j@e-recht24.de');
insert into employee (name, birthday, email) values ('Adriaens', '2006/08/21', 'adaltry1k@columbia.edu');
insert into employee (name, birthday, email) values ('Kippie', '2007/05/29', 'kseys1l@wisc.edu');
insert into employee (name, birthday, email) values ('Dorette', '2003/10/09', 'dmarklow1m@google.com.hk');
insert into employee (name, birthday, email) values ('Pace', '1960/05/08', 'prhys1n@amazon.co.uk');

--Sütunların ona göre diğer sütunlarını güncelleyecek 5 adet GÜNCELLEME işlemi yapılabilir.

UPDATE employee SET name = 'Caner' WHERE id = 18;
UPDATE employee SET name = '10.05.1996' WHERE id = 3;
UPDATE employee SET birthday = '04.01.2000' WHERE id = 7;
UPDATE employee SET birthday = 'Melike' WHERE id = 8;
UPDATE employee SET email = 'cef@ascı.com' WHERE id = 22;

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
