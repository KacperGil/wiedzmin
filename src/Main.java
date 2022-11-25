import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("!!!WITAJ W GRZE WIEDŹMIN!!!");
        System.out.print("Podaj nick postaci: ");
        Scanner scanner=new Scanner(System.in);
        String nick=scanner.nextLine();
        System.out.print("Podaj klasę postaci: ");
        String clas=scanner.nextLine();
        System.out.print("Podaj punkty siły: ");
        int strength=scanner.nextInt();
        System.out.print("Podaj punkty many: ");
        int mana=scanner.nextInt();
        System.out.print("Jest to stara(true) czy nowa postać(false)?");
        boolean newold=scanner.nextBoolean();

        Wiedzmin wlasciwosci=new Wiedzmin(nick,clas, strength, mana, newold);

        wlasciwosci.setImie(nick);
        wlasciwosci.setKlasa(clas);
        wlasciwosci.setPunkty_sily(strength);
        wlasciwosci.setPunkty_many(mana);
        wlasciwosci.setNowa_stara(newold);

        System.out.println("Twoja postać wygląda następująco..");
        System.out.println(wlasciwosci.getImie());
        System.out.println(wlasciwosci.getKlasa());
        System.out.println(wlasciwosci.getPunkty_sily());
        System.out.println(wlasciwosci.getPunkty_many());
        if(wlasciwosci.getNowa_stara()==true){
            System.out.println("Stara postać");
        }else{
            System.out.println("Nowa postać");
        }

        System.out.println("Moc uderzenia: "+wlasciwosci.moc());



    }
}


