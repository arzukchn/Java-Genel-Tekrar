<h1>Generix Yapıları İle Kendi Sınıfımızı Yapmal</h1>

<hr>

<p>Java'da generic yapısını kullanarak verileri tuttuğumuz bir sınıf tasarlıyoruz. Sınıfın amacı içerisinde dinamik bir Array (Dizi) tutması ve veri tipini dinamik olarak alması. Bunun için generic bir sınıf oluşturulması gerekli.</p>

<p><b>NOT :</b> COLLECTION SINIFI KULLANILMAYACAKTIR ! KENDİ LİSTE SINIFIMIZI OLUŞTURMALIYIZ.</p>

<h6>ÖRNEKLER İLE ÖZELLİKLER:</h6>
<ul>
<li>Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmalı.</li>
<li>Sınıfa ait iki tür constructor metot bulunmalı</li>
<li>MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır.</li>
<li>MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır.</li>
<li>size() : dizideki eleman sayısını verir.</li>
<li>getCapacity() : dizinin kapasite değerini verir.</li>
<li>add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır.</li>
</ul>

