

--Select: �al��t�rmak istedi�iniz kodu se�ersiniz.
--ANSII Standart�
--case  insensitive: b�y�k k���k harf duyars�zd�r.

Select ContactName Adi, CompanyName Sirketadi, City Sehir from Customers

Select * from Customers where City = 'Berlin'

Select * from Products where categoryId = 1 or categoryId=3

--case insensitive

Select * from Products where CategoryID=1 and UnitPrice>=10

Select * from Products order by ProductName

Select * from Products order by UnitPrice asc   --ascending: artan demektir.

Select * from Products order by UnitPrice desc   --descending: d��en demektir.

Select * from Products where CategoryID=1 order by UnitPrice desc

Select COUNT(*) Adet from Products where CategoryID=2

Select CategoryID, COUNT(*) Adet from Products group by CategoryID

--Kds de yo�un olarak kullan�lan sistemlerdir.

Select categoryId, count(*) from Products where UnitPrice>20
group by CategoryID having COUNT(*)<10   -- Birim fiyat� 20 den fazla olan �r�nleri kategoriId ye g�re grupla, onlardan da 10 dan az olanlar� g�ster

Select Products.ProductID, Products.ProductName, Products.UnitPrice,Categories.CategoryName
from Products inner join Categories
on Products.CategoryID=Categories.CategoryID  --�nner Join: ile iki tablodan istedi�imiz datalar� g�steriyoruz.
where Products.UnitPrice>10

--DTO(Data Transformation object): joinler DTO olarak kar��m�za ��k�yor.

--inner join[Order Details]: sadece e�le�en datalar� getirir.

Select * from Products P left join [Order Details] od
on P.ProductId = od.ProductID --Solda olup sa�da olmayanlar� da getir.

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID 
where o.CustomerID is null -- null sipari�lerde olmayan datalard�r.

select * from Orders o right join Customers c
on c.CustomerID = o.CustomerID 
where o.CustomerID is null

Select * from Products P inner join [Order Details] od
on P.ProductId = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID



