package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Random;


import java.util.ArrayList;
import java.util.UUID;

public class oyuncucontroller {
    private Main mainApp;
    @FXML
    private Label saldir4;

    @FXML
    private Label pokemon4;

    @FXML
    private Label saldir5;

    @FXML
    private Label pokemon5;

    @FXML
    private Label saldir6;

    @FXML
    private Label pokemon6;

    @FXML
    private Label alıcıhasaraı;

    @FXML
    private Label alıcıpokemonaı;
    @FXML
    public Label kalankartsayisi;
    @FXML
    private Label saldiri1;

    @FXML
    private Label pokemon1;

    @FXML
    private Button gonder1;

    @FXML
    private Label saldir2;

    @FXML
    private Label pokemon2;

    @FXML
    private Button gonder2;
    @FXML
    private Label saldir3;

    @FXML
    private Label pokemon3;
    @FXML
    private Label beraberlik;
    @FXML
    private Label bilgisayarkazandı;
    @FXML
    private Label oyuncukazandı;
    @FXML
    private Button gonder3;

    @FXML
    private Label alıcıhasar;

    @FXML
    private Label alıcıpokemon;
    @FXML
    private Button baslat;
    @FXML
    private Label skor1;

    @FXML
    private Label skor2;
    @FXML
    private Button birinci;

    @FXML
    private Button ikinci;

    @FXML
    private Button ucuncu;

    @FXML
    private Button dorduncu;

    @FXML
    private Button besinci;
    @FXML
    private Button altıncı;

    @FXML
    private Button yedinci;

    @FXML
    private Button sekizinci;
    @FXML
    private Button dokuzuncu;

    @FXML
    private Button onuncu;
    @FXML
    private Button onaylabtn;

    @FXML
    private TextField isimgirmeyeri;

    @FXML
    private Label isimgiriniz;
    @FXML
    private Label idyeri;
    @FXML
    private Label oyuncuisim;
    @FXML
    private Label kazandıisim;
    @FXML
    private CheckBox check;
    @FXML
    private Pane kapat2;
    @FXML
    private Pane kapatbir;
    @FXML
    private Pane kapat3;
    int a=0;
    String name="Belirlemediniz";
    String uniqueID = UUID.randomUUID().toString();
    BilgisayarOyuncusu bilgisayar=new BilgisayarOyuncusu();
    InsanOyuncusu insan=new InsanOyuncusu(uniqueID,name,0);

    Pikachu pika=new Pikachu("Pikachu","Elektrik");
    Bulbasaur bul=new Bulbasaur("Bulbasaur","Çim");
    Charmander charm=new Charmander("Charmander","Ateş");
    Squirtle sqtrl=new Squirtle("Squirtle","Su");
    Zubat zubat=new Zubat("Zubat","Hava");
    Psyduck duck=new Psyduck("Psyduck","Su");
    Snorlax lax=new Snorlax("Snorlax","Normal");
    Butterfree butter=new Butterfree("Butterfree","Hava");
    Jigglypuff puff=new Jigglypuff("Jigglypuff","Ses");
    Meowth meow= new Meowth("Meowth","Normal");
    Random rand=new Random();
    ArrayList<Pokemon> dizi=new ArrayList<Pokemon>(10);
    @FXML
    void onayla(ActionEvent event) {
       idyeri.setText(uniqueID);
        name=isimgirmeyeri.getText();
        oyuncuisim.setText(name);
        System.out.println("Oyuncunun ismi: "+name);
        System.out.println("Oyuncunu id'si: "+uniqueID);
        kazandıisim.setText(name);
onaylabtn.setVisible(false);
isimgiriniz.setVisible(false);
isimgirmeyeri.setVisible(false);
ucuncu.setVisible(true);
check.setVisible(false);
if(check.isSelected()== true)
{
kapatbir.setVisible(false);
kapat2.setVisible(false);
kapat3.setVisible(false);
}
    }
    @FXML
    void ucuncu(ActionEvent event) {
        dizi.add(pika);
        dizi.add(bul);
        dizi.add(charm);
        dizi.add(sqtrl);
        dizi.add(zubat);
        dizi.add(duck);
        dizi.add(lax);
        dizi.add(butter);
        dizi.add(puff);
        dizi.add(meow);

        kartDagit(bilgisayar,dizi,3,rand);
        kartDagit(insan,dizi,3,rand);

        System.out.println("Bilgisayara dagıtılan kartlar:");
        int i=0;
        for (Pokemon x : bilgisayar.kartListesi) {

            // oyuncu.kartgonder(x.getPokemonAdi());
            if(i==0){
                pokemon4.setText(x.getPokemonAdi());
                saldir4.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==1)
            {
                pokemon5.setText(x.getPokemonAdi());
                saldir5.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==2)
            {
                pokemon6.setText(x.getPokemonAdi());
                saldir6.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            System.out.println(x.getPokemonAdi());
            i++;
        }

        System.out.println("\ninsana dagıtılan kartlar:");
        i=0;
        for (Pokemon x : insan.kartListesi) {
            if(i==0){
                pokemon1.setText(x.getPokemonAdi());
                saldiri1.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==1)
            {
                pokemon2.setText(x.getPokemonAdi());
                saldir2.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==2)
            {
                pokemon3.setText(x.getPokemonAdi());
                saldir3.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            i++;
            System.out.println(x.getPokemonAdi());
        }
        i=0;
        System.out.println("\nDağıtılmayan kartlar:");
        for (Pokemon pokemon : dizi) {
            System.out.println(pokemon.getPokemonAdi());
            i++;
        }
        kalankartsayisi.setText(String.valueOf(i));
        ucuncu.setVisible(false);
        dorduncu.setVisible(false);
        besinci.setVisible(false);
        altıncı.setVisible(false);
        yedinci.setVisible(false);
        sekizinci.setVisible(false);
        dokuzuncu.setVisible(false);
        onuncu.setVisible(false);
        gonder1.setVisible(true);
        gonder2.setVisible(true);
        gonder3.setVisible(true);
    }
    int j=0;
    @FXML
    void dorduncu(ActionEvent event) {
        Pokemon temp1=new Pokemon();
        Pokemon temp2=new Pokemon();
        temp1=bilgisayar.kartSec();
        temp2=insan.kartal(a,kontrol);
        System.out.println("\nBilgisayarın seçtiği:\n"+temp1.getPokemonAdi());
        System.out.println("\ninsanın seçtiği:\n"+temp2.getPokemonAdi());
        //temp2=insan.kartSec();
        alıcıpokemonaı.setText(temp1.getPokemonAdi());
        alıcıhasaraı.setText(String.valueOf(temp1.hasarPuaniDondur()));
        alıcıpokemon.setText(temp2.getPokemonAdi());
        alıcıhasar.setText(String.valueOf(temp2.hasarPuaniDondur()));
        kartFight(bilgisayar,temp1,insan,temp2);

        System.out.println("\nBilgisayarın Skoru:"+bilgisayar.getSkor());
        skor1.setText(String.valueOf(bilgisayar.getSkor()));
        System.out.println("insanın Skoru:"+insan.getSkor());
        skor2.setText(String.valueOf(insan.getSkor()));
        System.out.println("\nBilgisayarda kalan kartlar:");
        j=0;
        for (Pokemon x : bilgisayar.kartListesi) {
            System.out.println(x.getPokemonAdi());
            if(pokemon1.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon1.setText("");
                saldiri1.setText("");
            }
            if(pokemon2.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon2.setText("");
                saldir2.setText("");
            }
            if(pokemon3.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon3.setText("");
                saldir3.setText("");
            }
        }
        //kalankartsayisi.setText(String.valueOf(j));
        System.out.println("\ninsanda kalan kartlar: ");
        for (Pokemon x : insan.kartListesi) {
            System.out.println(x.getPokemonAdi());
            if(pokemon4.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon4.setText("");
                saldir4.setText("");
            }
            if(pokemon5.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon5.setText("");
                saldir5.setText("");
            }
            if(pokemon6.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon6.setText("");
                saldir6.setText("");
            }
        }
        dorduncu.setVisible(false);
        besinci.setVisible(true);
        altıncı.setVisible(false);
        yedinci.setVisible(false);
        sekizinci.setVisible(false);
        dokuzuncu.setVisible(false);
        onuncu.setVisible(false);
        gonder1.setVisible(false);
        gonder2.setVisible(false);
        gonder3.setVisible(false);
    }
    @FXML
    void besinci(ActionEvent event) {
        kartDagit(bilgisayar,dizi,1,rand);
        kartDagit(insan,dizi,1,rand);
        int i=0;
        System.out.println("\nBilgisayara dagıtılan kartlar:");
        for (Pokemon x : bilgisayar.kartListesi) {
            if(i==0){
                pokemon4.setText(x.getPokemonAdi());
                saldir4.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==1)
            {
                pokemon5.setText(x.getPokemonAdi());
                saldir5.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==2)
            {
                pokemon6.setText(x.getPokemonAdi());
                saldir6.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            i++;
            System.out.println(x.getPokemonAdi());
        }
        i=0;
        System.out.println("\nİnsana dagıtılan kartlar:");
        for (Pokemon x : insan.kartListesi) {
            if(i==0){
                pokemon1.setText(x.getPokemonAdi());
                saldiri1.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==1)
            {
                pokemon2.setText(x.getPokemonAdi());
                saldir2.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==2)
            {
                pokemon3.setText(x.getPokemonAdi());
                saldir3.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            i++;
            System.out.println(x.getPokemonAdi());
        }
        i=0;
        System.out.println("\nDağıtılmayan kartlar:");
        for (Pokemon pokemon : dizi) {
            System.out.println(pokemon.getPokemonAdi());
            i++;
        }
        kalankartsayisi.setText(String.valueOf(i));
        alıcıpokemonaı.setText("");
        alıcıhasaraı.setText("");
        alıcıpokemon.setText("");
        alıcıhasar.setText("");
        besinci.setVisible(false);
        altıncı.setVisible(false);
        yedinci.setVisible(false);
        sekizinci.setVisible(false);
        dokuzuncu.setVisible(false);
        onuncu.setVisible(false);
        gonder1.setVisible(true);
        gonder2.setVisible(true);
        gonder3.setVisible(true);
    }
    @FXML
    void altıncı(ActionEvent event) {
        Pokemon temp1=new Pokemon();
        Pokemon temp2=new Pokemon();
        temp1=bilgisayar.kartSec();
        temp2=insan.kartal(a,kontrol);
        System.out.println("\nBilgisayarın seçtiği:\n "+temp1.getPokemonAdi());
        System.out.println("\ninsanın seçtiği:\n "+temp2.getPokemonAdi());
        //temp2=insan.kartSec();
        alıcıpokemonaı.setText(temp1.getPokemonAdi());
        alıcıhasaraı.setText(String.valueOf(temp1.hasarPuaniDondur()));
        alıcıpokemon.setText(temp2.getPokemonAdi());
        alıcıhasar.setText(String.valueOf(temp2.hasarPuaniDondur()));
        kartFight(bilgisayar,temp1,insan,temp2);

        System.out.println("\nBilgisayarın Skoru:"+bilgisayar.getSkor());
        skor1.setText(String.valueOf(bilgisayar.getSkor()));
        System.out.println("İnsanın Skoru:"+insan.getSkor());
        skor2.setText(String.valueOf(insan.getSkor()));
        System.out.println("\nBilgisayarda kalan kartlar:");
        j=0;
        for (Pokemon x : bilgisayar.kartListesi) {
            System.out.println(x.getPokemonAdi());
            if(pokemon1.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon1.setText("");
                saldiri1.setText("");
            }
            if(pokemon2.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon2.setText("");
                saldir2.setText("");
            }
            if(pokemon3.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon3.setText("");
                saldir3.setText("");
            }
        }
        //kalankartsayisi.setText(String.valueOf(j));
        System.out.println("\nİnsanda kalan kartlar:");
        for (Pokemon x : insan.kartListesi) {
            System.out.println(x.getPokemonAdi());
            if(pokemon4.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon4.setText("");
                saldir4.setText("");
            }
            if(pokemon5.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon5.setText("");
                saldir5.setText("");
            }
            if(pokemon6.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon6.setText("");
                saldir6.setText("");
            }
        }
        altıncı.setVisible(false);
        yedinci.setVisible(true);
        sekizinci.setVisible(false);
        dokuzuncu.setVisible(false);
        onuncu.setVisible(false);
        gonder1.setVisible(false);
        gonder2.setVisible(false);
        gonder3.setVisible(false);
    }
    @FXML
    void yedinci(ActionEvent event) {
        kartDagit(bilgisayar,dizi,1,rand);
        kartDagit(insan,dizi,1,rand);
        int i=0;
        System.out.println("\nBilgisayara dagıtılan kartlar:");
        for (Pokemon x : bilgisayar.kartListesi) {
            if(i==0){
                pokemon4.setText(x.getPokemonAdi());
                saldir4.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==1)
            {
                pokemon5.setText(x.getPokemonAdi());
                saldir5.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==2)
            {
                pokemon6.setText(x.getPokemonAdi());
                saldir6.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            i++;
            System.out.println(x.getPokemonAdi());
        }
        i=0;
        System.out.println("\nİnsana dagıtılan kartlar:");
        for (Pokemon x : insan.kartListesi) {
            if(i==0){
                pokemon1.setText(x.getPokemonAdi());
                saldiri1.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==1)
            {
                pokemon2.setText(x.getPokemonAdi());
                saldir2.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            if(i==2)
            {
                pokemon3.setText(x.getPokemonAdi());
                saldir3.setText(String.valueOf(x.hasarPuaniDondur()));
            }
            i++;
            System.out.println(x.getPokemonAdi());
        }
        i=0;
        System.out.println("\nDağıtılmayan kartlar:");
        for (Pokemon pokemon : dizi) {
            System.out.println(pokemon.getPokemonAdi());
            i++;
        }
        kalankartsayisi.setText(String.valueOf(i));
        alıcıpokemonaı.setText("");
        alıcıhasaraı.setText("");
        alıcıpokemon.setText("");
        alıcıhasar.setText("");
        yedinci.setVisible(false);
        sekizinci.setVisible(false);
        dokuzuncu.setVisible(false);
        onuncu.setVisible(false);
        gonder1.setVisible(true);
        gonder2.setVisible(true);
        gonder3.setVisible(true);
    }
    @FXML
    void sekizinci(ActionEvent event) {
        Pokemon temp1=new Pokemon();
        Pokemon temp2=new Pokemon();
        temp1=bilgisayar.kartSec();
        temp2=insan.kartal(a,kontrol);
        System.out.println("\nBilgisayarın seçtiği:\n"+temp1.getPokemonAdi());
        System.out.println("\ninsanın seçtiği:\n"+temp2.getPokemonAdi());
        //temp2=insan.kartSec();
        alıcıpokemonaı.setText(temp1.getPokemonAdi());
        alıcıhasaraı.setText(String.valueOf(temp1.hasarPuaniDondur()));
        alıcıpokemon.setText(temp2.getPokemonAdi());
        alıcıhasar.setText(String.valueOf(temp2.hasarPuaniDondur()));
        kartFight(bilgisayar,temp1,insan,temp2);

        System.out.println("\nBilgisayar1 Skoru:"+bilgisayar.getSkor());
        skor1.setText(String.valueOf(bilgisayar.getSkor()));
        System.out.println("Bilgisayar2 Skoru:"+insan.getSkor());
        skor2.setText(String.valueOf(insan.getSkor()));
        System.out.println("\nBilgisayar1da kalan kartlar:");
        j=0;
        for (Pokemon x : bilgisayar.kartListesi) {
            System.out.println(x.getPokemonAdi());
            if(pokemon1.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon1.setText("");
                saldiri1.setText("");
            }
            if(pokemon2.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon2.setText("");
                saldir2.setText("");
            }
            if(pokemon3.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon3.setText("");
                saldir3.setText("");
            }
        }
        //kalankartsayisi.setText(String.valueOf(j));
        System.out.println("\nİnsanda kalan kartlar:");
        for (Pokemon x : insan.kartListesi) {
            System.out.println(x.getPokemonAdi());
            if(pokemon4.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon4.setText("");
                saldir4.setText("");
            }
            if(pokemon5.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon5.setText("");
                saldir5.setText("");
            }
            if(pokemon6.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon6.setText("");
                saldir6.setText("");
            }
        }
        sekizinci.setVisible(false);
        dokuzuncu.setVisible(false);
        onuncu.setVisible(false);
        gonder1.setVisible(true);
        gonder2.setVisible(true);
        gonder3.setVisible(true);
    }
    @FXML
    void dokuzuncu(ActionEvent event) {
        Pokemon temp1=new Pokemon();
        Pokemon temp2=new Pokemon();
        temp1=bilgisayar.kartSec();
        temp2=insan.kartal(a,kontrol);
        System.out.println("\nBilgisayarın seçtiği\n"+temp1.getPokemonAdi());
        System.out.println("\ninsanın seçtiği\n"+temp2.getPokemonAdi());
        //temp2=insan.kartSec();
        alıcıpokemonaı.setText(temp1.getPokemonAdi());
        alıcıhasaraı.setText(String.valueOf(temp1.hasarPuaniDondur()));
        alıcıpokemon.setText(temp2.getPokemonAdi());
        alıcıhasar.setText(String.valueOf(temp2.hasarPuaniDondur()));
        kartFight(bilgisayar,temp1,insan,temp2);

        System.out.println("\nBilgisayar Skoru:"+bilgisayar.getSkor());
        skor1.setText(String.valueOf(bilgisayar.getSkor()));
        System.out.println("İnsan Skoru:"+insan.getSkor());
        skor2.setText(String.valueOf(insan.getSkor()));
        System.out.println("\nBilgisayarda kalan kartlar:");
        j=0;
        for (Pokemon x : bilgisayar.kartListesi) {
            System.out.println(x.getPokemonAdi());
            if(pokemon1.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon1.setText("");
                saldiri1.setText("");
            }
            if(pokemon2.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon2.setText("");
                saldir2.setText("");
            }
            if(pokemon3.getText().equals(temp2.getPokemonAdi()))
            {
                pokemon3.setText("");
                saldir3.setText("");
            }
        }
        //kalankartsayisi.setText(String.valueOf(j));
        System.out.println("\nİnsanda kalan kartlar:");
        for (Pokemon x : insan.kartListesi) {
            System.out.println(x.getPokemonAdi());
            if(pokemon4.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon4.setText("");
                saldir4.setText("");
            }
            if(pokemon5.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon5.setText("");
                saldir5.setText("");
            }
            if(pokemon6.getText().equals(temp1.getPokemonAdi()))
            {
                pokemon6.setText("");
                saldir6.setText("");
            }
        }
        dokuzuncu.setVisible(false);
        onuncu.setVisible(false);
        gonder1.setVisible(true);
        gonder2.setVisible(true);
        gonder3.setVisible(true);
    }
int kontrol;
    @FXML
    void onuncu(ActionEvent event) {
        Pokemon temp1=new Pokemon();
        Pokemon temp2=new Pokemon();
        temp1=bilgisayar.kartSec();
        temp2=insan.kartSec();
        System.out.println("\nBilgisayarın seçtiği\n"+temp1.getPokemonAdi());
        System.out.println("\ninsanın seçtiği\n"+temp2.getPokemonAdi());
        alıcıpokemonaı.setText(temp1.getPokemonAdi());
        alıcıhasaraı.setText(String.valueOf(temp1.hasarPuaniDondur()));
        alıcıpokemon.setText(temp2.getPokemonAdi());
        alıcıhasar.setText(String.valueOf(temp2.hasarPuaniDondur()));
        kartFight(bilgisayar,temp1,insan,temp2);

        System.out.println("\nBilgisayar Skoru:"+bilgisayar.getSkor());
        skor1.setText(String.valueOf(bilgisayar.getSkor()));
        System.out.println("İnsanın Skoru:"+insan.getSkor());
        skor2.setText(String.valueOf(insan.getSkor()));
        System.out.println("\nBilgisayarda kalan kartlar:");
        j=0;
        if(pokemon1.getText().equals(temp2.getPokemonAdi()))
        {
            pokemon1.setText("");
            saldiri1.setText("");
        }
        if(pokemon2.getText().equals(temp2.getPokemonAdi()))
        {
            pokemon2.setText("");
            saldir2.setText("");
        }
        if(pokemon3.getText().equals(temp2.getPokemonAdi()))
        {
            pokemon3.setText("");
            saldir3.setText("");
        }
        if(pokemon4.getText().equals(temp1.getPokemonAdi()))
        {
            pokemon4.setText("");
            saldir4.setText("");
        }
        if(pokemon5.getText().equals(temp1.getPokemonAdi()))
        {
            pokemon5.setText("");
            saldir5.setText("");
        }
        if(pokemon6.getText().equals(temp1.getPokemonAdi()))
        {
            pokemon6.setText("");
            saldir6.setText("");
        }
        if(Integer.parseInt(skor1.getText())==Integer.parseInt(skor2.getText()))
        {
            System.out.println("berabere bitti");
            bilgisayarkazandı.setVisible(false);
            oyuncukazandı.setVisible(false);
            beraberlik.setVisible(true);
            kazandıisim.setVisible(false);
        }
        if(Integer.parseInt(skor1.getText())>Integer.parseInt(skor2.getText()))
        {
            System.out.println("Bilgisayar kazandı");
            bilgisayarkazandı.setVisible(true);
            oyuncukazandı.setVisible(false);
            beraberlik.setVisible(false);
            kazandıisim.setVisible(false);
        }
        if(Integer.parseInt(skor1.getText())<Integer.parseInt(skor2.getText()))
        {
            System.out.println(name+" Kazandı");
            bilgisayarkazandı.setVisible(false);
            oyuncukazandı.setVisible(true);
            beraberlik.setVisible(false);
            kazandıisim.setVisible(true);
        }
        onuncu.setVisible(false);
        gonder1.setVisible(false);
        gonder2.setVisible(false);
        gonder3.setVisible(false);
    }
    int Melih =0;
    int erdem=0;

    @FXML
    void gonder1at(ActionEvent event) {
a=1;
if(Melih==0)
{
    dorduncu.setVisible(true);
}
        if(Melih==1)
        {
            altıncı.setVisible(true);
        }
        if(Melih==2)
        {
            sekizinci.setVisible(true);
        }
        if(Melih==3)
        {
            dokuzuncu.setVisible(true);

        }
        if(Melih==4)
        {
            onuncu.setVisible(true);
        }
        Melih++;
        gonder1.setVisible(false);
        gonder2.setVisible(false);
        gonder3.setVisible(false);
        erdem++;
        if(erdem==3)
        {
            kontrol=1;
            erdem=0;
        }
      //  System.out.println(erdem);
    }

    @FXML
    void gonder2at(ActionEvent event) {
        a=2;
        if(Melih==0)
        {
            dorduncu.setVisible(true);
        }
        if(Melih==1)
        {
            altıncı.setVisible(true);
        }
        if(Melih==2)
        {
            sekizinci.setVisible(true);

        }
        if(Melih==3)
        {
            dokuzuncu.setVisible(true);

        }
        if(Melih==4)
        {
            onuncu.setVisible(true);

        }
        Melih++;
        gonder1.setVisible(false);
        gonder2.setVisible(false);
        gonder3.setVisible(false);
        erdem++;
        if(erdem==3)
        {
            kontrol=2;
            erdem=0;
        }
       // System.out.println(erdem);
    }

    @FXML
    void gonder3at(ActionEvent event) {
        a=3;
        if(Melih==0)
        {
            dorduncu.setVisible(true);
        }
        if(Melih==1)
        {
            altıncı.setVisible(true);
        }
        if(Melih==2)
        {
            sekizinci.setVisible(true);

        }
        if(Melih==3)
        {
            dokuzuncu.setVisible(true);

        }
        if(Melih==4)
        {
            onuncu.setVisible(true);

        }
        gonder1.setVisible(false);
        gonder2.setVisible(false);
        gonder3.setVisible(false);
        Melih++;
        erdem++;
        if(erdem==3)
        {
            kontrol=3;
            erdem=0;
        }
        //System.out.println(erdem);
    }
    public static void kartDagit(Oyuncu oyuncu,ArrayList<Pokemon> dizi,int kartSayisi,Random rand){
        int randomSayi=rand.nextInt(dizi.size());
        if(dizi.size()==1){
            oyuncu.kartListesi.add(dizi.get(0));
            dizi.remove(0);
        }
        else {
            for(int i=0;i<kartSayisi;i++){
                oyuncu.kartListesi.add(dizi.get(randomSayi));
                dizi.remove(randomSayi);
                randomSayi=rand.nextInt(dizi.size());
            }
        }
    }

    public static void kartFight(Oyuncu bilgisayar,Pokemon kart1,Oyuncu insan,Pokemon kart2){
        if(kart1.hasarPuaniDondur()>kart2.hasarPuaniDondur()){
            bilgisayar.setSkor(bilgisayar.getSkor()+5);
        }

        else if(kart1.hasarPuaniDondur()<kart2.hasarPuaniDondur()){
            insan.setSkor(insan.getSkor()+5);
        }
        else{
            bilgisayar.setSkor(bilgisayar.getSkor()+5);
            insan.setSkor(insan.getSkor()+5);
        }
    }
}
