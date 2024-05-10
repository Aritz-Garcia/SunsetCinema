# Betebeharrak
Zinema areto baten aste osoko (astelehenetik - ingadera) programazioa gorde eta kudeatu dezakeen programa diseinatu eta programatu beharko dugu. Egun bakoitzak eduki ordu kopuru maximo bat izango du.
Egun guztiak 16:00-etan hasiko dira igortzen.
### Eguneko ordu maximoak
#### Astelehena: 5
#### Asteartena: 5
#### Asteazkena: 5
#### Osteguna: 6
#### Ostirala: 6
#### Larunbata: 8
#### Igandea: 8

## Erabiltzaileen erabilera
Erabiltzaileak zinemako langileak izango dira eta erabiltzaile pasahitza bidez logetuko dira sisteman lan egiteko.
Zinemako langileei askoz eroso eta errazago egiteko lan egitea interfaze grafiko egokiak diseinatu eta programan ezarri.
### 1.	ONGIETORRIA:
Lehenengo kasua ongietorriko agurra izango da. Lehenengo interfaze honetan empresaren logoa eta hasierako agurra agertu beharko dira. Hurrengo interfazera, LOGIN-era, pasatzeko erabiltzaileak interfaze honetako edozein puntutan klikatu beharko du.

### 2.	LOGIN:
Interfaze honetan erabiltzaile izen eta pasahitz egokiak eskatuko dira.
    a.	Hasiera botoia: Klikatzean, ONGIETORRIA interfazera bueltatuko gara, idatzitako parametro guztiak hasieratuz.
    b.	Login botoia: Sartutako izena eta pasahitza egiaztatuko ditu; benetazkoak balira hurrengo interfazera joango da erabiltzailea, EGUN AUKERAKETA. Kontrazko kasuan, parametroak berriz sartzeko aukera eskainiko zaio erabiltzaileari.
    c.	Erregistro botoia: Botoiak ERREGISTRO pantailara eramango du erabiltzailea.

### 3.	ERREGISTRO:
Interfaze hau erabiltzaile berri bat erregistratzeko gai izan beharko da. Erabiltzailearen izena, abizena, login-a, pasahitza, jaiotze data eta empresa kargua {Emplegatua, Zuzendari Lokala, Zuzendari Probintziala}. Konprobatu beharko da erabiltzailea jada sisteman ez dagoela, eta, erroreak sahiezteko, pasaitza bi aldiz sartzeko eskatuko da. 
    a.	Erregistro botoia: Erabiltzailea sisteman erregistratuko du.
    b.	Botón login: Klikatzean, LOGIN interfazera bueltatuko gara, idatzitako parametro guztiak hasieratuz.

### 4.	EGUN AUKERAKETA:
Pantaila honetan kartelerako egun bat hautatu ahalko da. Egun bakoitzerako atxikituta dituen edukiak, eduki kopurua eta haien bataz-besteko iraunpena; egun horrek izango duen soberako denborarekin batera. Datu hauek soilik agertuko dira haiek dituzten egunetan.
    a.	Hasiera botoia: Klikatzean, ONGIETORRIA interfazera bueltatuko gara, idatzitako parametro guztiak hasieratuz.
    b.	Kartelera: Aukeratutako eguna balioztatuko dugu eta hurari dagokion edukia programatzeko EDUKIAK interfazera joango gara.
    c.	Asteko Laburpena: Botoiak ASTEKO LABURPENA, aste osoko edukiak erakutsiko dituen interfazea.
    d.	Balioztatu: BALIOZTATU interfazea erakutsiko duen botoia.

### 5.	EDUKIAK:
Aurrez aurretik EGUN AUKERAKETA interfazean hautatutako egunaren barruan edukia sartzeko balio digun interfazea da. Edukiak zerrenda batetik aukeratu ahalko dira; hala nola soilik soberako denboraren barnean sartu daitezkeen edukiak ahalko dira aukeratu. 
Honakoak dira interfazeak eskainiko dituen aukerak:
    a.	Eduki edizioa: Eduki bat zerrendatik hautatu ondoren, hurrengo aldaketak egin ahal dizkiogu:
        I.   Editatu: Eduki baten izenburua eta transmisio-denbora modifikatzeko balio du.
        II.  Ezabatu: Sistematik eduki bat ezabatu. 
        III. Berria: Errenkada berria aterako da zerrendan; bere datu hutsak eduki informazio berriz bete daitezkeenak. 
        IV.	 Leheneratu: Edozein aldaketa indargabetuko da. 
        V.	 Balioztatu: Aldaketak gordeko ditu eta eguneko kartelera bueltatko da.

    b.	Gehitu: Eduki bat aukeratzean eta gehi autatzean, eduki hau, automatikoki, aukeratutako eguneko denbora-tarte libre gertuenean gordeko da. Prozesua bukatzean egun hortako soberan dagoen denbora eguneratko da.

    c.	Eguneko labupena: EGUNEKO LABURPENA interfazera bidaltzen du. Botoi hau ahalbidetzeko eguneko ordu eskuragarri guztiak beteta egon behar dira.

### 6.	EGUNEKO LABURPENA:
Interfaze honetan aurrez-aurretik hautatutako egunaren eduki multzoa erakutsiko da, bere hasiera eta amaiera ordu estimatuekin batera.
    a.	Edukia: Eduki multzoko eduki zehatza hautatzean, bere informazio guztia erakutsiko da.
    b.	Balioztatu: Eguneko kartelera balioztatzean EGUN AUKERAKETA interfazera bueltatuko da sistema.

### 7.	ASTEKO LABURPENA:
Aste osoko edukiak erakutsiko ditu, haien izenburua eta hasiera/amaiera denborak erakutsiz.
a.	Filma: Hautatutako edukiaren informazio guztia erakutsiko da.
b.	Egun aukeraketa: EGUN AUKERAKETA interfazera bueltatzeko botoia.

### 8.	BALIOZTATU:
Interfaze honetan kartelerako aldakuntzen aldaketa egokiaz notifikatuko zaio erabiltzaileari, eta LOGIN interfazera bueltaraziko du.

## Datuen kudeaketa
Datuak irauteko fitxategietan gordeko ditugu. Beren idazkera, egitura eta irakurketa programatu eta diseinatu beharko dugu.