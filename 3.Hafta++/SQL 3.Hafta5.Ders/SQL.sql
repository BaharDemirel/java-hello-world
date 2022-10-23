

--Select: Çalýþtýrmak istediðiniz kodu seçersiniz.
--ANSII Standartý
--case  insensitive: büyük küçük harf duyarsýzdýr.

Select ContactName Adi, CompanyName Sirketadi, City Sehir from Customers

Select * from Customers where City = 'Berlin'

Select * from Products where categoryId = 1 or categoryId=3

--case insensitive

Select * from Products where CategoryID=1 and UnitPrice>=10

Select * from Products order by ProductName

Select * from Products order by UnitPrice asc   --ascending: artan demektir.

Select * from Products order by UnitPrice desc   --descending: düþen demektir.

Select * from Products where CategoryID=1 order by UnitPrice desc

Select COUNT(*) Adet from Products where CategoryID=2

Select CategoryID, COUNT(*) Adet from Products group by CategoryID

--Kds de yoðun olarak kullanýlan sistemlerdir.

Select categoryId, count(*) from Products where UnitPrice>20
group by CategoryID having COUNT(*)<10   -- Birim fiyatý 20 den fazla olan ürünleri kategoriId ye göre grupla, onlardan da 10 dan az olanlarý göster

Select Products.ProductID, Products.ProductName, Products.UnitPrice,Categories.CategoryName
from Products inner join Categories
on Products.CategoryID=Categories.CategoryID  --Ýnner Join: ile iki tablodan istediðimiz datalarý gösteriyoruz.
where Products.UnitPrice>10

--DTO(Data Transformation object): joinler DTO olarak karþýmýza çýkýyor.

--inner join[Order Details]: sadece eþleþen datalarý getirir.

Select * from Products P left join [Order Details] od
on P.ProductId = od.ProductID --Solda olup saðda olmayanlarý da getir.

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID 
where o.CustomerID is null -- null sipariþlerde olmayan datalardýr.

select * from Orders o right join Customers c
on c.CustomerID = o.CustomerID 
where o.CustomerID is null

Select * from Products P inner join [Order Details] od
on P.ProductId = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID



