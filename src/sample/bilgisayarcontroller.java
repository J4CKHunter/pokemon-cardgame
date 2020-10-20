package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
public class bilgisayarcontroller {
    @FXML
    private Label skor1;

    @FXML
    private Label skor2;

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
    private Label bilgisayar2kazandı;

    @FXML
    private Label bilgisayar1kazandı;

    @FXML
    private Label beraberlik;
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
    private Button gonder3;

    @FXML
    private Label alıcıhasar;

    @FXML
    private Label alıcıpokemon;
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

    BilgisayarOyuncusu bilgisayar=new BilgisayarOyuncusu();
    InsanOyuncusu insan=new InsanOyuncusu();
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

    ArrayList<Pokemon> dizi=new ArrayList<Pokemon>(10);
    Random rand=new Random();
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

        System.out.println("Bilgisayar1 dagıtılan kartlar:");
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

        System.out.println("\nBilgisayar2'e dagıtılan kartlar:");
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
dorduncu.setVisible(true);
besinci.setVisible(false);
altıncı.setVisible(false);
yedinci.setVisible(false);
sekizinci.setVisible(false);
dokuzuncu.setVisible(false);
onuncu.setVisible(false);
    }
    int j=0;

    @FXML
    void dorduncu(ActionEvent event) {
        Pokemon temp1=new Pokemon();
        Pokemon temp2=new Pokemon();
        temp1=bilgisayar.kartSec();
        temp2=insan.kartSec();
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
        System.out.println("\nBilgisayar2da kalan kartlar:");
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
    }
    @FXML
    void besinci(ActionEvent event) {
        kartDagit(bilgisayar,dizi,1,rand);
        kartDagit(insan,dizi,1,rand);
int i=0;
        System.out.println("\nBilgisayar1a dagıtılan kartlar:");
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
        System.out.println("\nBilgisayar2a dagıtılan kartlar:");
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
        altıncı.setVisible(true);
        yedinci.setVisible(false);
        sekizinci.setVisible(false);
        dokuzuncu.setVisible(false);
        onuncu.setVisible(false);
    }
    @FXML
    void altıncı(ActionEvent event) {
        Pokemon temp1=new Pokemon();
        Pokemon temp2=new Pokemon();
        temp1=bilgisayar.kartSec();
        temp2=insan.kartSec();
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
        System.out.println("\nBilgisayar2da kalan kartlar:");
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
    }
    @FXML
    void yedinci(ActionEvent event) {
        kartDagit(bilgisayar,dizi,1,rand);
        kartDagit(insan,dizi,1,rand);
        int i=0;
        System.out.println("\nBilgisayar1a dagıtılan kartlar:");
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
        System.out.println("\nBilgisayar2a dagıtılan kartlar:");
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
        sekizinci.setVisible(true);
        dokuzuncu.setVisible(false);
        onuncu.setVisible(false);
    }
    @FXML
    void sekizinci(ActionEvent event) {
        Pokemon temp1=new Pokemon();
        Pokemon temp2=new Pokemon();
        temp1=bilgisayar.kartSec();
        temp2=insan.kartSec();
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
        kalankartsayisi.setText(String.valueOf(j));
        System.out.println("\nBilgisayar2da kalan kartlar:");
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
        dokuzuncu.setVisible(true);
        onuncu.setVisible(false);
    }
    @FXML
    void dokuzuncu(ActionEvent event) {
        Pokemon temp1=new Pokemon();
        Pokemon temp2=new Pokemon();
        temp1=bilgisayar.kartSec();
        temp2=insan.kartSec();
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
        kalankartsayisi.setText(String.valueOf(j));
        System.out.println("\nBilgisayar2da kalan kartlar:");
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
        onuncu.setVisible(true);
    }

    @FXML
    void onuncu(ActionEvent event) {
        Pokemon temp1=new Pokemon();
        Pokemon temp2=new Pokemon();
        temp1=bilgisayar.kartSec();
        temp2=insan.kartSec();
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
       // String.valueOf(bilgisayar.getSkor());
if(Integer.parseInt(skor1.getText())==Integer.parseInt(skor2.getText()))
{
    System.out.println("berabere bitti");
    bilgisayar1kazandı.setVisible(false);
    bilgisayar2kazandı.setVisible(false);
    beraberlik.setVisible(true);
}
        if(Integer.parseInt(skor1.getText())>Integer.parseInt(skor2.getText()))
        {
            System.out.println("Bilgisayar 1 kazandı");
            bilgisayar1kazandı.setVisible(true);
            bilgisayar2kazandı.setVisible(false);
            beraberlik.setVisible(false);
        }
        if(Integer.parseInt(skor1.getText())<Integer.parseInt(skor2.getText()))
        {
            System.out.println("Bilgisayar 2 Kazandı");
            bilgisayar1kazandı.setVisible(false);
            bilgisayar2kazandı.setVisible(true);
            beraberlik.setVisible(false);
        }
        onuncu.setVisible(false);
        }
    @FXML
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
