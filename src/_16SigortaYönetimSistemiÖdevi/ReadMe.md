<h1>Ödev - Sigorta Yönetim Sistemi</h1>

<p>Sigorta firması için bir yazılım yaptığınızı düşünün. Sigorta firmasının "Bireysel" (Individual) ve "Kurumsal" (Enterprise) olmak üzere iki tip müşteri profili bulunmaktadır. Müşteri profili için "Account" isminde soyut sınıf (abstract class) tasarlayınız. Account sınıfı müşterinin sisteme giriş sonrasında tüm bilgilerinin tutulduğu hesap bilgisidir. "Account" sınıfı içinde "User" tipinde bir nesne referansı bulunur. (Aggeration ilişkisi olarak)</p>
<br>
<p>"User" sınıfı müşterinin kişi bilgilerini ifade eder. "User" sınıfında müşterinin</p>


<ul>
<li>isim (String),</li>
<li>soyisim (String),</li>
<li>email (String),</li>
<li>şifre (String),</li>
<li>meslek (String),</li>
<li>yaş (int),</li>
<li>adres listesi (ArrayList)</li>
<li>sisteme son giriş tarihi (Date)</li>
</ul>


<p>bilgileri bulunur. Ayrıca, "User" sınıfında ArrayList tipinde adreslerinin tutulduğu bir liste vardır. Adres bilgisi iki tiptir. Ev adresi ("HomeAddress") ve İş adresi ("BusinessAddress") olmak üzere iki tane sınıf tasarlayınız. Bu adres sınıfları "Address" isimli bir interface'den kalıtım alacaktır. Fakat, bu interface'de hangi fonksiyonların olması gerektiğine siz karar vereceksiniz.</p>


<p>Müşteri adreslerinin ekleyip çıkarılma sorumluluğunu üstlenmiş olan "AddressManager" isminde bir sınıf tasarlayınız. Bu sınıfın içinde "User" nesnesinin adres listesine eleman ekleme-çıkarma yapabilen iki tane static fonksiyon tanımlayınız. Bu fonksiyon isimlerini siz belirleyiniz.</p>


<p>"Account" sınıfında müşteri bilgilerini ekrana yazdıran "final" tipinde, değer döndürmeyen ve ismi "showUserInfo" bir fonksiyon tanımlayınız.</p>


<p>"Account" sınıfında müşterilerin yaptırdıkları sigortaları liste halinde saklayınız. Sigortayı temsil eden "Insurance" isminde bir soyut sınıf tasarlayınız. Bu soyut sınıf içinde</p>


<ul>
<li>sigortanın ismi (String),</li>
<li>sigortanın ücreti (double)</li>
<li>sigortanın başlangıç-bitiş tarihi (Date)</li>
</ul>

<p>gibi değişkenlere sahip olacaktır. Ayrıca "calculate" isminde soyut bir fonksiyon tanımlanacaktır. Bu soyut fonksiyon aşağıda kalıtım alınan sınıflarda doldurulacaktır.</p>

<p>Bu soyut sınıftan türeyen</p>

<ul>
<li>"HealthInsurance" (özel sağlık sigortasu),</li>
<li>"ResidenceInsurance" (konut sigortası),</li>
<li>"TravelInsurance" (seyahat sigortası),</li>
<li>"CarInsurance" (otomobil sigortası)</li>
</ul>


<p>4 tane alt sınıf tasarlayınız. Her alt sınıf "calculate" isimli soyut fonksiyonu override ederek, sigorta ücretini kendine göre hesaplayacaktır.</p>

<p>Yukarıdaki tanımları dikkate aldığımızda soyut sınıf olan "Account" sınıfında aşağıdakiler yer almalıdır.</p>


<ul>
<li>kullanıcının login olma durumu (AuthenticationStatus)</li>
<br>
<li>kullanıcı nesnesi (User)</li>
<br>
<li>kullanıcının yaptırmış olduğu sigortaların listesi (ArrayList)</li>
<br>
<li>AuthenticationStatus tipinde bir enum tanımlayınız. Enum içinde SUCCESS ve FAIL isminde iki tane sabit tanımlayın. SUCCESS login işlemi başarılı ise kullanılacaktır. FAIL ise login olmamışsa kullanılacaktır.</li>
<br>
<li>kullanıcının hesabına login olabilmesi için bir fonksiyon tanımlanacaktır. Bu fonksiyon email ve şifre bilgisi alacak ve gelen email şifre bilgisini User sınıfındaki email ve şifre ile kıyaslayacaktır. Eğer girilen bilgiler doğruysa giriş işlemi başarılı olacaktır. Ve kullanıcının login olma durumu SUCCESS'e çekilecektir. Giriş işlemi başarısız ise "InvalidAuthenticationException" tipinde bir hata fırlatacaktır. Bu hata sınıfını Exception isimli Java sınıfından kalıtım alarak sizin yazmanız gerekecektir.</li>
<br>
<li>kullanıcının adreslerine ekleme yapabileceği bir soyut olmayan fonksiyon tanımlanacaktır. kullanıcının adreslerinden çıkartma yapabileceği bir soyut olmayan fonksiyon tanımlanacaktır. kullanıcının login olma durumunu veren değer döndüren fonksiyon tanımlanacaktır.</li>
<br>
<li>kullanıcının sigorta poliçesi ekleyebilmesi için soyut (abstract) bir fonksiyon tanımlanacaktır. Bu soyut sınıf "Individual" ve "Enterprise" isimli alt sınıflarda override edilerek doldurulacaktır. Çünkü, bireysel ve kurumsal müşterilerin ekledikleri paketlerin fiyatlarına uygulanan kar marjı farklı olacaktır.</li>
</ul>


<p>"Individual" ve "Enterprise" sınıfları "Account" sınıfından kalıtım alacaktır.</p>

<p>AccountManager isminde bir sınıf tasarlayınız. Bu sınıf içinde TreeSet tipinde bir veri listesi tutsun. Oluşturduğunuz bireysel ve kurumsal hesapları bu listede saklayınız. bu sınıf içinde login isminde bir fonksiyon tanımlayınız. Bu fonksiyon dışarıdan verilen email ve şifre bilgisini alıp Account listesi üzerinde dolaşıp uygun bir giriş işlemi bulursa Account nesnesini çağrıldığı yere dönecektir. Bu fonksiyon Account nesnesi üzerindeki "login" olma fonksiyonunu çağıracaktır. Unutmayın bu fonksiyon "InvalidAuthenticationException" tipinde hata fırlatabiliyordu. Bu nedenle burada try-catch mekanizması kurmayı unutmayınız.</p>

<p>"Account" sınıfından nesneleri TreeSet içinde tutacağımız için "Comparable" interface'den kalıtım almış olmasına dikkat edin. Ayrıca, "Account" sınıfının "hashCode" ve "equals" fonksiyonlarını doldurmayı unutmayın.</p>

<p>Klavyeden email ve şifre bilgisini alan bir sınıf tasarlayınız. Klavyeden alınan email ve şifre bilgisi ile AccountManager sınıfındaki "login" fonksiyonunu çağırın. Eğer geçerli bir kullanıcı ile giriş yapmışsanız bu fonksiyon size Account tipinde bir nesne dönecektir.</p>